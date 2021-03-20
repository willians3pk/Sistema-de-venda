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
import model.Caixa;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class CaixaDAO {

    private Session session;
    private Transaction tx;

    public CaixaDAO() {
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
    }

    public void save(Object objeto) {
        try {
            session.save(objeto);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!\n" + e);
        } finally {
            session.close();
        }
    }

    public void persist(Object obj) {
        try {
            session.persist(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Erro ao persistir" + e);
            JOptionPane.showMessageDialog(null, "-----Erro!----\n" + e);
        } finally {
            session.close();
        }
    }

    public void update(Object objeto) {
        try {
            session.update(objeto);
            tx.commit();
//            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erro ao Atualizar na Base de Dados!");
        } finally {
            session.close();
        }
    }

    public void save_update(Object obj) {
        try {
            session.saveOrUpdate(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Erro " + e);
            System.out.println("Erro ao salvar e atualizar!");
        } finally {
            session.close();
        }
    }

    public void delete(Object obj) {
        try {

            session.delete(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!\n" + e);
        } finally {
            session.close();
        }
    }

    public void merge(Object obj) {
        try {
            session.merge(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!\n" + e);
        } finally {
            session.close();
        }
    }

    public void refresh(Object obj) {
        try {
            session.refresh(obj);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!\n" + e);
        } finally {
            session.close();
        }
    }

    public List<Caixa> ListaTodoCaixa() {
        List<Caixa> list = null;
        try {
            list = (List<Caixa>) session.createQuery("FROM Caixa").list();
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

    public List<Caixa> ListaCaixaPorData(String data) {
        List<Caixa> list = null;
        try {
            String hql = "from Caixa where data BETWEEN ('" + data + "')" + "and" + "('" + data + "')";
            list = (List<Caixa>) session.createQuery(hql).list();
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

//    public double saidaCaixa() {
//        Query query = session.createQuery("SELECT SUM(saidaDespesas) FROM Caixa");
//        double saidaCaixa = (double) query.list().get(0);
//        return saidaCaixa;
//
//    }

    public double entradaCaixa() {
        Query query = session.createQuery("SELECT SUM(entradaDinheiro) FROM Caixa");
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
            if (parcela.getPago().equals(Estado.PENDENTE) && parcela.isStatus()) {
                x = parcela.getValor();
                y = parcelasPendentes + x;
                parcelasPendentes = y;
            }
        }
        return parcelasPendentes;
    }

    public Venda getVenda(Integer id) {
        try {
            Venda venda = (Venda) session.get(Venda.class, id);
            return venda;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Venda Não Encontrada!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }
}
