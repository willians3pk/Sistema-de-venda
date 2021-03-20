/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.NewHibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Despesa;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class DespesaDAO {

    private Session session;
    private Transaction tx;

    public DespesaDAO() {
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
    }

    public List<Despesa> ListaDespesaPorData(String data) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Despesa> list = null;

        try {
            String hql = "from Despesa where data BETWEEN ('" + data + "')" + "and" + "('" + data + "')";
            list = (List<Despesa>) session.createQuery(hql).list();
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

    public List<Despesa> ListaTodasDespesa() {
        List<Despesa> list = null;
        try {
            list = (List<Despesa>) session.createQuery("FROM Despesa").list();
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
        Query query = session.createQuery("SELECT SUM(saidaDespesas) FROM Despesa");
        Logger.getLogger(DespesaDAO.class.getName()).log(Level.WARNING.SEVERE, null, query.list().get(0));
        if (query.list().get(0) != null) {
            double saidaCaixa = (double) query.list().get(0);
            return saidaCaixa;
        }
        return 0;
    }
}
