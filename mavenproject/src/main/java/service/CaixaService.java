package service;

import model.dao.Conexao;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Parcelas;
import model.Venda;
import model.dao.CaixaDAO;
import model.Caixa;

public class CaixaService {

    public static boolean RegistrarDevolucao(Integer id, String valor, String MotivoDevolucao) {

        try {
            if (id == null) {
                JOptionPane.showMessageDialog(null, "Por Favor Digite o Codigo da Venda!");
            } else if (valor.equals("")) {
                JOptionPane.showMessageDialog(null, "Por Favor Digite o Valor Estornado da Venda!");
            } else if (MotivoDevolucao.equals("")) {
                JOptionPane.showMessageDialog(null, "Por Favor Escreva o Motivo da Devolução da Venda!");
            } else {
                Venda venda = BuscaVendaPorId(id);
                Caixa devolucao = new Caixa();
                CaixaDAO DAO = new CaixaDAO();
                if (venda.isStatus()) {
                    devolucao.setVenda(venda);
                    devolucao.setDescricaoMovito(MotivoDevolucao);
                    devolucao.setDevolucaoCliente(Double.parseDouble(valor.replace(",", ".").replace("R$", "")));
                    devolucao.setData(new Date());

                    if (ValidarDevolucao(devolucao)) {
                        // devolucao valida
                        DAO.save(devolucao);
                        VendaService.CancelarVenda(venda.getIdvenda());
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Nao Foi possivel fazer a Devolucao, valor em caixa " + "R$ " + ValorLiquido() + " Menor\n"
                                + "que o Valor a ser Devolvido!");
                    }
                }else{JOptionPane.showMessageDialog(null, "ESSA VENDA JA ESTÁ CANCELADA!");}
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Logger.getLogger(CaixaService.class.getName()).log(Level.ALL, null, e.getMessage());
        }
        return false;
    }

    public static List<Caixa> ConsultarDespesasPorData(String dataConsulta) {

        if (!dataConsulta.toString().isEmpty()) {
            Conexao DAO = new Conexao();
            return DAO.ListaCaixaPorData(dataConsulta);
        } else {
            JOptionPane.showMessageDialog(null, "Digite a Data da Pesquisa!");
        }

        return null;
    }

    public static boolean ValidarDevolucao(Caixa devolucao) {
        if (devolucao.getDevolucaoCliente() > ValorLiquido()) {
            return false;
        } else {
            return true;
        }
    }

    public static double ValoresPagoDaVenda(Integer id) {

        try {
            Venda venda = BuscaVendaPorId(id);
            if (venda.FormaPagamento().equals("A PRAZO")) {
                return venda.getParcelas().get(0).getValor();
            } else if (venda.FormaPagamento().equals("PARCELADO")) {
                double x = 0;
                double y = 0;
                double parcelasPagas = 0;
                for (Parcelas parcela : venda.getParcelas()) {
                    if (parcela.isStatus()) {
                        if (parcela.getPago().getDescricao().equals("PAGO")) {
                            x = parcela.getValor();
                            y = parcelasPagas + x;
                            parcelasPagas = y;
                        }
                    }
                    return parcelasPagas + venda.getValor_pago() + venda.getAcrescimo();
                }
            } else {
                // caso nao tenha nenhuma parcela paga retorna o valor da entrada mais o acrescimo;
                return venda.getValor_pago() + venda.getAcrescimo();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Logger.getLogger(CaixaService.class.getName()).log(Level.WARNING.SEVERE, null, e.getMessage());
        }

        return 0;
    }

    public static Venda BuscaVendaPorId(Integer id) {
        CaixaDAO DAO = new CaixaDAO();
        Venda venda = DAO.getVenda(id);
        return venda;
    }

    public static double ValorTotalDevolucao() {

        return 0;
    }

    public static double ValorTotalEntradas() {
        CaixaDAO DAO = new CaixaDAO();
        double entradasNoCaixa = DAO.entradaCaixa() - ValorTotalVendasCanceladas();
        if (entradasNoCaixa != 0) {
            return entradasNoCaixa;
        }
        return 0;
    }

    public static double ValorTotalVendasCanceladas() {
        CaixaDAO DAO = new CaixaDAO();
        if (DAO.entradasCanceladas() != 0) {
            return DAO.entradasCanceladas();
        }
        return 0;
    }

    public static double ValorParcelasPagas() {
        CaixaDAO DAO = new CaixaDAO();
        if (DAO.parcelasPagas() != 0) {
            return DAO.parcelasPagas();
        }
        return 0;
    }

    public static double ValorParcelasPendentes() {
        CaixaDAO DAO = new CaixaDAO();
        if (DAO.parcelasPendente() != 0) {
            return DAO.parcelasPendente();
        }
        return 0;
    }

    public static double ValorLiquido() {
        double Despesatotal = DespesaService.ValorTotalDespesas();
        double valorLiquido = ValorTotalEntradas() - ValorParcelasPendentes() - Despesatotal;
        if (valorLiquido != 0) {
            return valorLiquido;
        }
        return 0;
    }

}
