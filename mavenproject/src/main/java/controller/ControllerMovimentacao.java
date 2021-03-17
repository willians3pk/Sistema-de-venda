package controller;

import model.dao.Conexao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.movimentacao;

public class ControllerMovimentacao {

    public static movimentacao RegistroDespesas(String tipo, String Data, String valor, String descricaoMotivo) throws ParseException {

        if (Data.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite a Data da Despesa!");
        } else if (descricaoMotivo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o Motivo da Despesa");
        } else if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o Valor da Despesas!");
        } else if (tipo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escolha o Tipo da Despesa!");
        } else {

            movimentacao Despesas = new movimentacao();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Despesas.setData(formato.parse(Data));
            Despesas.setDescricaoDespesa(descricaoMotivo);
            Despesas.setSaidaDespesas(Double.parseDouble(valor.replace(",", ".")));
            Despesas.setTipo(tipo);

            Conexao DAO = new Conexao();
            DAO.save(Despesas);
            return Despesas;
        }

        return null;
    }

    public static List<movimentacao> ConsultarDespesasPorData(String dataConsulta) {

        if (!dataConsulta.toString().isEmpty()) {
            Conexao DAO = new Conexao();
            return DAO.ListaCaixaPorData(dataConsulta);
        } else {
            JOptionPane.showMessageDialog(null, "Digite a Data da Pesquisa!");
        }

        return null;
    }

    public static DefaultTableModel PrencherTableDespesas(JTable table, String dataConsulta) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List<movimentacao> despesas = ConsultarDespesasPorData(dataConsulta);
        DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();

        tabelaModel.setNumRows(0);
        for (movimentacao despesa : despesas) {
            if (despesa.getSaidaDespesas() != 0) {
                tabelaModel.addRow(new Object[]{
                    despesa.getId(),
                    formato.format(despesa.getData()),
                    "R$ " + despesa.getSaidaDespesas(),
                    despesa.getTipo(),
                    despesa.getDescricaoDespesa()
                });
            }
        }
        return tabelaModel;
    }

    public static DefaultTableModel CarregarTodasDespesas(JTable table) {

        Conexao dao = new Conexao();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List<movimentacao> despesas = dao.ListaTodoCaixa();
        DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();

        tabelaModel.setNumRows(0);
        for (movimentacao despesa : despesas) {
            if (despesa.getSaidaDespesas() != 0) {
                tabelaModel.addRow(new Object[]{
                    despesa.getId(),
                    formato.format(despesa.getData()),
                    "R$ " + despesa.getSaidaDespesas(),
                    despesa.getTipo(),
                    despesa.getDescricaoDespesa()
                });
            }

        }
        return tabelaModel;

    }

    public static double ValorTotalDespesas() {
        Conexao DAO = new Conexao();
        return DAO.saidaCaixa();
    }

    public static double ValorTotalEntradas() {
        Conexao DAO = new Conexao();
        double entradasNoCaixa = DAO.entradaCaixa() - ValorTotalVendasCanceladas();
        return entradasNoCaixa;
    }

    public static double ValorTotalVendasCanceladas() {
        Conexao DAO = new Conexao();
        return DAO.entradasCanceladas();
    }

    public static double ValorParcelasPagas() {
        Conexao DAO = new Conexao();
        return DAO.parcelasPagas();
    }

    public static double ValorParcelasPendentes() {
        Conexao DAO = new Conexao();
        return DAO.parcelasPendente();
    }

    public static double ValorLiquido() {
        double valorLiquido = ValorTotalEntradas() - ValorParcelasPendentes();
        return valorLiquido;
    }

}
