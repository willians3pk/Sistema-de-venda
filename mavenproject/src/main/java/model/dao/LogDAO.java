/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.NewHibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class LogDAO {

    private static Session session = NewHibernateUtil.getSessionFactory().openSession();
    private static Transaction tx = session.beginTransaction();

    public static void save(Object objeto) {
        
        try {
            session.save(objeto);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Erro " + e);
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
        } finally {
            session.close();
        }
    }
}
