/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systema.conexao;

import com.systema.projetows.Fornecedor;
import com.systema.projetows.Items;
import com.systema.projetows.ItensVenda;
import com.systema.projetows.NumeroContato;
import com.systema.projetows.Pessoa;
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
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso! ao persistir");
        } catch (Exception e) {
            System.out.println("Erro ao persistir" + e);
            JOptionPane.showMessageDialog(null, "-----Erro!----");
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

    public List<Pessoa> list_Pessoa() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Pessoa> list = null;

        try {
            list = (List<Pessoa>) session.createQuery("from Pessoa").list();
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

    public List<NumeroContato> list_Contatos() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<NumeroContato> list = null;

        try {
            list = (List<NumeroContato>) session.createQuery("from NumeroContato").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista de Contatos Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }

        public List<ItensVenda> list_ItemsVenda() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<ItensVenda> list = null;

        try {
            list = (List<ItensVenda>) session.createQuery("from ItensVenda").list();
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
