/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.conexao;

import com.system.sistemamaven.Fornecedor;
import com.system.sistemamaven.Items;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author willian
 */
public class Conexao {

    private Session session;
    private Transaction tx;

    public void save(Object objeto) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

        try {
            session.save(objeto);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar na Base de Dados!");
        } finally {
            session.close();
        }
    }

    public void persist(Object obj) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

        try {
            session.persist(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            session.close();
        }
    }

    public void update(Object objeto) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

        try {
            session.update(objeto);
            tx.commit();
//            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao Atualizar no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar na Base de Dados!");
        } finally {
            session.close();
        }
    }

    public void save_update(Object obj) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

        try {
            session.saveOrUpdate(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            session.close();
        }
    }

    public void delete(Object obj) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

        try {

            session.delete(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            session.close();
        }
    }

    public void merge(Object obj) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

        try {
            session.merge(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            session.close();
        }
    }

    public void refresh(Object obj) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

        try {
            session.refresh(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            session.close();
        }
    }

    public List<Items> list_Items() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Items> list = null;

        try {
            list = (List<Items>) session.createQuery("from Items").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }

    public List<Fornecedor> list_Fornecedores() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Fornecedor> list = null;

        try {
            list = (List<Fornecedor>) session.createQuery("from Fornecedor").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }

}
