/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.NewHibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import model.Estado;
import model.Parcelas;
import model.Venda;
import model.movimentacao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class movimentacaoDAO {
    
    private Session session;
    private Transaction tx;
    
    public List<movimentacao> ListaTodoCaixa() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<movimentacao> list = null;

        try {
            list = (List<movimentacao>) session.createQuery("FROM movimentacao").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }

    public List<movimentacao> ListaCaixaPorData(String data) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<movimentacao> list = null;

        try {
            String hql = "from movimentacao where data BETWEEN ('" + data + "')" + "and" + "('" + data + "')";
            list = (List<movimentacao>) session.createQuery(hql).list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }
    
    public double saidaCaixa() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Query query = session.createQuery("SELECT SUM(saidaDespesas) FROM movimentacao");
        double saidaCaixa = (double) query.list().get(0);
        return saidaCaixa;

    }

    public double entradaCaixa() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Query query = session.createQuery("SELECT SUM(entradaDinheiro) FROM movimentacao");
        double entradaCaixa = (double) query.list().get(0);
        return entradaCaixa;

    }

    public double entradasCanceladas() {
        Conexao dao = new Conexao();
        List<Venda> vendas = dao.listavendas();
        double x = 0;
        double y = 0;
        double entradasCanceladas = 0;

        for (Venda venda : vendas) {
            if (!venda.isStatus()) {
                x = venda.getValorTotal();
                y = entradasCanceladas + x;
                entradasCanceladas = y;
            }
        }

        return entradasCanceladas;
    }

    public double parcelasPagas() {
        Conexao dao = new Conexao();
        List<Parcelas> parcelas = dao.Parcelas();
        double x = 0;
        double y = 0;
        double parcelasPagas = 0;
        for (Parcelas parcela : parcelas) {
            if (parcela.getPago().equals(Estado.PAGO)) {
                x = parcela.getValor();
                y = parcelasPagas + x;
                parcelasPagas = y;
            }
        }
        return parcelasPagas;
    }
    
    public double parcelasPendente() {
        Conexao dao = new Conexao();
        List<Parcelas> parcelas = dao.Parcelas();
        double x = 0;
        double y = 0;
        double parcelasPendentes = 0;
        for (Parcelas parcela : parcelas) {
            if (parcela.getPago().equals(Estado.PENDENTE)&&parcela.isStatus()) {
                x = parcela.getValor();
                y = parcelasPendentes + x;
                parcelasPendentes = y;
            }
        }
        return parcelasPendentes;
    }
}
