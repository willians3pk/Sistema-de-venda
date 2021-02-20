/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.conexao;

import br.com.classes.Fornecedor;
import br.com.classes.Produto;
import br.com.classes.Cliente;
import br.com.classes.Endereco;
import br.com.classes.FormaPagamento;
import br.com.classes.ItensVenda;
import br.com.classes.NumeroContato;
import br.com.classes.Pessoa;
import br.com.classes.Venda;
import java.util.ArrayList;
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
        } catch (Exception e) {
            System.out.println("Erro " + e);
            JOptionPane.showMessageDialog(null, "Erro!");
        } finally {
            session.close();
        }
    }

    public List<Produto> productBook() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Produto> list = null;

        try {
            list = (List<Produto>) session.createQuery("from Produto").list();
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
        String sql = "FROM Fornecedor upper";
        try {
            list = (List<Fornecedor>) session.createQuery(sql).list();
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

    public List<Endereco> list_Endereco() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Endereco> list = null;

        try {
            list = (List<Endereco>) session.createQuery("from ItensVenda").list();
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

    public List<Cliente> list_Cliente() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Cliente> list = null;
        String sql = "from Pessoa where DTYPE = 'Cliente'";
        try {
            list = (List<Cliente>) session.createQuery(sql).list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }

    public List<FormaPagamento> listFormPagamento() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<FormaPagamento> list = null;
        String sql = "from FormaPagamento";
        try {
            list = (List<FormaPagamento>) session.createQuery(sql).list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;

    }

    public List<Venda> lista_Vendas() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Venda> list = null;

        try {
            list = (List<Venda>) session.createQuery("from Venda").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista de Venda Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }

    public List<Cliente> filtrarPorNome(String nome) {
        // cria nova lista
        List<Cliente> clientesFiltrados = new ArrayList<>();
        // se o valor do textfield está vazia
        if (nome.isEmpty()) {
            // adiciona todos os elementos daquela lista que sugeri para transformar em atributo
            clientesFiltrados.addAll(this.list_Cliente());
        } else {
            for (int i = 0; i < this.list_Cliente().size(); i++) {
                Cliente c = this.list_Cliente().get(i);
                // se nome do cliente começa com o valor do textfield
                if (c.getNome().startsWith(nome) && c.isStatus()) {
                    clientesFiltrados.add(c);
                }
            }
        }
        return clientesFiltrados;
    }
}
