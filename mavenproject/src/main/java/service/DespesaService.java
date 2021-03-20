/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Despesa;
import model.dao.Conexao;
import model.dao.DespesaDAO;
import static service.CaixaService.ValorLiquido;

/**
 *
 * @author user
 */
public class DespesaService {
    
    public static Despesa RegistroDespesas(String tipo, String Data, String valor, String descricaoMotivo) throws ParseException {

        if (Data.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite a Data da Despesa!");
        } else if (descricaoMotivo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o Motivo da Despesa");
        } else if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite o Valor da Despesas!");
        } else if (tipo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Escolha o Tipo da Despesa!");
        } else {

            Despesa despesa = new Despesa();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            despesa.setData(formato.parse(Data));
            despesa.setDescricaoDespesa(descricaoMotivo);
            despesa.setSaidaDespesas(Double.parseDouble(valor.replace(",", ".")));
            despesa.setTipo(tipo);

            if (ValidarDespesa(despesa)) {
                Conexao DAO = new Conexao();
                DAO.save(despesa);
                return despesa;
            } else {
                JOptionPane.showMessageDialog(null, "Nao Foi possivel REGISTRAR DESPESA, valor em caixa " + "R$ " + ValorLiquido() + " Menor\n"
                        + "que o Valor a ser retirado pra DESPESA!");
            }
        }

        return null;
    }
    
    public static boolean ValidarDespesa(Despesa despesa) {
        if (despesa.getSaidaDespesas() > ValorLiquido()) {
            return false;
        } else if (despesa.getSaidaDespesas() < ValorLiquido()) {
            return true;
        }
        return false;
    }
    
    public static List<Despesa> ConsultarDespesasPorData(String dataConsulta) {

        if (!dataConsulta.toString().isEmpty()) {
            DespesaDAO DAO = new DespesaDAO();
            return DAO.ListaDespesaPorData(dataConsulta);
        } else {
            JOptionPane.showMessageDialog(null, "Digite a Data da Pesquisa!");
        }

        return null;
    }
    
    public static DefaultTableModel PrencherTableDespesas(JTable table, String dataConsulta) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List<Despesa> despesas = ConsultarDespesasPorData(dataConsulta);
        DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();

        tabelaModel.setNumRows(0);
        for (Despesa despesa : despesas) {
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

        DespesaDAO dao = new DespesaDAO();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        List<Despesa> despesas = dao.ListaTodasDespesa();
        DefaultTableModel tabelaModel = (DefaultTableModel) table.getModel();

        tabelaModel.setNumRows(0);
        for (Despesa despesa : despesas) {
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
        DespesaDAO DAO = new DespesaDAO();
        if(DAO.saidaCaixa() != 0)
            return DAO.saidaCaixa();
        return 0;
    }
}
