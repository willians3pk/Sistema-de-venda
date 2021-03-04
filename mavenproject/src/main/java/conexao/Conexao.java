/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import br.com.configuracao.Categoria;
import controle.Fornecedor;
import controle.Produto;
import controle.Cliente;
import controle.Endereco;
import controle.FormaPagamento;
import controle.ItensVenda;
import controle.Pessoa;
import controle.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
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

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

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

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

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

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

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

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

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

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

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

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

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

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

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
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }

    public List<Produto> produtosOrdenados() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Produto> list = null;

        try {
            list = (List<Produto>) session.createQuery("from Produto p ORDER BY p.nome").list();
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

    public List<Fornecedor> list_Fornecedores() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Fornecedor> list = null;
        String sql = "FROM Fornecedor";
        try {
            list = (List<Fornecedor>) session.createQuery(sql).list();
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
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
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
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
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
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
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
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
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
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
        } finally {
            session.close();
        }
        return null;

    }

    public List<Venda> lista_Vendas() {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();

        try {
            List<Venda> list = session.createQuery("from Venda").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista de Venda Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }

    public List<Cliente> filtrarPorNome(String nome) {
        // cria nova lista
        List<Cliente> clientesCadastrados = new ArrayList<>();
        // se o valor do textfield está vazia
        if (nome.isEmpty()) {
            // adiciona todos os elementos daquela lista que sugeri para transformar em atributo
            clientesCadastrados.addAll(this.list_Cliente());
        } else {
            for (int i = 0; i < this.list_Cliente().size(); i++) {
                Cliente p = this.list_Cliente().get(i);
                // se nome do cliente começa com o valor do textfield
                if (p.getNome().startsWith(nome) && p.isStatus()) {
                    clientesCadastrados.add(p);
                }
            }
        }
        return clientesCadastrados;
    }

    public List<Produto> filtrarProdutoNome(String nome) {
        // cria nova lista
        List<Produto> produtosFiltrados = new ArrayList<>();
        // se o valor do textfield está vazia
        if (nome.isEmpty()) {
            // adiciona todos os elementos daquela lista que sugeri para transformar em atributo
            produtosFiltrados.addAll(this.productBook());
        } else {
            for (int i = 0; i < this.productBook().size(); i++) {
                Produto p = this.productBook().get(i);
                // se nome do produto começa com o valor do textfield
                if (p.getNome().startsWith(nome) && p.isStatus()) {
                    produtosFiltrados.add(p);
                }
            }
        }
        return produtosFiltrados;
    }

    public List<Produto> filtrarProdutoDesativado(String nome) {
        // cria nova lista
        List<Produto> produtosFiltrados = new ArrayList<>();
        // se o valor do textfield está vazia
        if (nome.isEmpty()) {
            // adiciona todos os elementos daquela lista que sugeri para transformar em atributo
            produtosFiltrados.addAll(this.productBook());
        } else {
            for (int i = 0; i < this.productBook().size(); i++) {
                Produto p = this.productBook().get(i);
                // se nome do produto começa com o valor do textfield
                if (p.getNome().startsWith(nome) && !p.isStatus()) {
                    produtosFiltrados.add(p);
                }
            }
        }
        return produtosFiltrados;
    }

    public Venda getVenda(Integer id) {
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
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

    public Fornecedor getFornecedor(int id) {
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        try {
            Fornecedor forncedor = (Fornecedor) session.get(Fornecedor.class, id);
            return forncedor;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Forncedor Não Encontrada!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }

    public List<Venda> filtraDatas(String dataInicio, String dataFim) {
        try {
            Session session = NewHibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            String hql = "from Venda where dataVenda BETWEEN ('" + dataInicio + "')" + "and" + "('" + dataFim + "')";
            Query query = session.createQuery(hql);
            List<Venda> results = query.list();
            return results;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Venda Não Encontrada!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }

    public Produto getProduto(Integer id) {
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        try {
            Produto produto = (Produto) session.get(Produto.class, id);
            return produto;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Produto Não Encontrada!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }

    public static final List<Categoria> lista_Categoria() {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            List<Categoria> list = session.createQuery("from Categoria").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista de Categoria Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!\n" + e);
        } finally {
            session.close();
        }
        return null;
    }
    
}
