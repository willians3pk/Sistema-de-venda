/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Estado;
import model.ItensVenda;
import model.Parcelas;
import model.Produto;
import model.Venda;
import model.dao.Conexao;
import model.dao.VendaDAO;
import view.TelaLoading;

/**
 *
 * @author user
 */
public class VendaService {

    public static void CancelarVenda(Integer codigo) {
        final TelaLoading carregando = new TelaLoading();
        carregando.setVisible(true);
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Integer id = codigo;
                    Conexao banco = new Conexao();
                    Venda venda = banco.getVenda(id);
                    venda.setEstado(Estado.CANCELADO);
                    venda.setStatus(false);
                    for (Parcelas parcela : venda.getParcelas()) {
                        parcela.setStatus(false);
                    }
                    banco.update(venda);
                    // ESTORNA OS ITENS DA VENDA CANCELADA PARA O ESTOQUE
                    for (ItensVenda listaIten : venda.listaItens()) {
                        Produto produto = banco.getProduto(listaIten.getItems().getIdProduto());
                        produto.setQnt(listaIten.getQnt() + produto.getQnt());
                        produto.setDataRegistro(new Date());
                        banco.update(produto);
                    }
                    JOptionPane.showMessageDialog(null, "Venda Cancelada, os Itens da Venda Foram Estornado Para o Estoque");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                carregando.dispose();
            }

        };
        t.start();

    }

    public static double ValorTodasVendasCanceladas() {
        VendaDAO dao = new VendaDAO();
        List<Venda> VendaAll = dao.lista_Vendas();
        for (Venda venda : VendaAll) {
            if (!venda.isStatus()) {
                
            }
        }
        return 0;
    }

    public static double RetornaValorParcelasPendente(Venda venda) {
        double x = 0;
        double y = 0;
        double parcelasPendentes = 0;
        for (Parcelas parcela : venda.getParcelas()) {
            if (parcela.getPago().equals(Estado.PENDENTE) && parcela.isStatus()) {
                x = parcela.getValor();
                y = parcelasPendentes + x;
                parcelasPendentes = y;
            }
        }
        return parcelasPendentes;
    }

    public static double RetornaValorTodasParcelas(Venda venda) {
        
        double x = 0;
        double y = 0;
        double TotalParcela = 0;
        
        for (Parcelas parcela : venda.getParcelas()) {
            x = parcela.getValor();
            y = TotalParcela + x;
            TotalParcela = y;
        }
        return TotalParcela;
    }
}
