/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.NewHibernateUtil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Venda;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class VendaDAO {

    private Session session;
    private Transaction tx;

    public VendaDAO() {
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
    }

    public List<Venda> lista_Vendas() {
        try {
            List<Venda> list = session.createQuery("from Venda").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.ALL, null, e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            session.close();
        }
        return null;
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
