package model;

import conexao.Conexao;
import conexao.NewHibernateUtil;
import view.MainScreen;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.mapping.Set;

public class Main {

    public static void main(String[] args) {
//       
        Conexao connect = new Conexao();
//        
//            FormaPagamento formapagamento = new FormaPagamento();
//            formapagamento.setDescricao("DINHEIRO A VISTA");
//            connect.save(formapagamento);
//            FormaPagamento formapagamento1 = new FormaPagamento();
//            formapagamento1.setDescricao("CARTÃO DE DEBITO");
//            connect.save(formapagamento1);
//            FormaPagamento formapagamento2 = new FormaPagamento();
//            formapagamento2.setDescricao("CARTÃO DE CREDITO");
//            connect.save(formapagamento2);
//            FormaPagamento formapagamento3 = new FormaPagamento();
//            formapagamento3.setDescricao("A PRAZO");
//            connect.save(formapagamento3);
//            FormaPagamento formapagamento4 = new FormaPagamento();
//            formapagamento4.setDescricao("TRANSFERENCIA");
//            connect.save(formapagamento4);
//            FormaPagamento formapagamento5 = new FormaPagamento();
//            formapagamento5.setDescricao("PARCELADO");
//            connect.save(formapagamento5);
//            
//            Cliente c0 = new Cliente();
//            Endereco e0 =  new Endereco();
//            c0.setNome("willian silva de almeida");
//            c0.setStatus(true);
//            c0.setEndereco(e0);
//            connect.save(c0);
//            
//            Cliente c1 = new Cliente();
//            Endereco e1 =  new Endereco();
//            c1.setNome("Pamela marinho da silva");
//            c1.setStatus(true);
//            c1.setEndereco(e1);
//            connect.save(c1);
//            
//            Cliente c2 = new Cliente();
//            Endereco e2 =  new Endereco();
//            c2.setNome("Marcones dos santos");
//            c2.setStatus(true);
//            c2.setEndereco(e2);
//            connect.save(c2);
//            
//            Cliente c3 = new Cliente();
//            Endereco e3 =  new Endereco();
//            c3.setNome("Maria Oliveira");
//            c3.setStatus(true);
//            c3.setEndereco(e3);
//            connect.save(c3);
//            
//            Cliente c4 = new Cliente();
//            Endereco e4 =  new Endereco();
//            c4.setNome("jeremias");
//            c4.setStatus(true);
//            c4.setEndereco(e4);
//            connect.save(c4);
////            
//            new MainScreen().setVisible(true);

//        Session session = NewHibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();

////        String hql = "FROM Venda as v INNER JOIN v.itens";
//        String sql = "FROM Produto as v INNER JOIN v.fornecedor";
//        List<Object[]> query = (List<Object[]>) session.createQuery(sql).list();
//
//        for (Object[] objects : query) {
//            Produto produto = (Produto) objects[0];
//            Fornecedor fornecedor = (Fornecedor) objects[1];
//            if (fornecedor.getIdFornecedor().equals(1)) {
//                System.out.println(fornecedor.getNome() + "----" + produto.getNome());
//            }
//
//        }
//
//        Venda venda = (Venda) connect.getVenda(2);
//        Estado estado = Estado.CANCELADO;
//        venda.setEstado(estado);
//        connect.update(venda);
//        HashSet<ItensVenda> list = new HashSet();
//                
//        for (ItensVenda iten : venda.getItens()) {
//            list.add(iten);
//        }
////        list = Collections.singleton(new HashSet(list));
//        
//        for (ItensVenda object : list) {
//            System.out.println(object.getIditensVenda());
//            
//        }
//        
    }

}
