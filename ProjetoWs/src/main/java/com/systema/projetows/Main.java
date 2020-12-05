/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systema.projetows;
//
//import com.system.telas.TelaPrincipal;

import com.systema.conexao.Conexao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author willian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        TelaPrincipal tela = new TelaPrincipal();
//        tela.setVisible(true);
//        Conexao banco = new Conexao();
//        Pessoa pessoa = banco.list_Pessoa().get(0);
//        List<NumeroContato> numeroContatos = new ArrayList<>();
//        pessoa.setNumeroContatos(numeroContatos);
//        List<NumeroContato> lista = pessoa.FiltrodeContatos(banco.list_Contatos());
//        
//        System.out.println("Tamanho da lista "+lista.size());
//        for (int i = 0; i < pessoa.getNumeroContatos().size(); i++) {
//            System.out.println("DDD "+pessoa.getNumeroContatos().get(i).getDdd());
//        }
//        NumeroContato numeroContato = pessoa.Contato(banco.list_Contatos());
//        System.out.println(numeroContato.getFone());
//        Conexao banco = new Conexao();
//        Pessoa pessoa = banco.list_Pessoa().get(0);
//        NumeroContato contato = banco.list_Contatos().get(0);
//        int idPessoa = contato.getPessoa().getIdpessoa();
//        if(pessoa.getIdpessoa() == idPessoa){
//          System.out.println(contato.getFone());  
//        }
//        Conexao banco = new Conexao();
//        Pessoa pessoa = banco.list_Pessoa().get(0);
//        NumeroContato contato = banco.list_Contatos().get(0);
//        List<NumeroContato> contatos = new ArrayList<>();
//        pessoa.setNumeroContatos(contatos);
//        pessoa.getNumeroContatos().add(contato);
//        
//        banco.update(pessoa);
//        banco.update(contato);
//        Conexao banco = new Conexao();
//        Pessoa pessoa = banco.list_Pessoa().get(0);
//
//        NumeroContato numero = new NumeroContato();
//        numero.setDdd(88);
//        numero.setFone(909088882);
//        numero.setPessoa(pessoa);
//        numero.setCpf(pessoa.getCpf());
//        
//        banco.save(numero);
//        banco.update(pessoa);
//        Long cpf = Long.parseLong("33344488809");
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome("CARLOS LEANDRO COELHO ANDRADE");
//        pessoa.setCpf(cpf);
//        pessoa.setEmail("leandroandrad@outlook.com");
//        pessoa.setDataNascimento(new Date(22072000));
//        
//        Endereco end = new Endereco();
//        end.setRua("Beira Rio");
//        end.setCidade("IMPERATRIZ");
//        end.setCep(65919230);
//        end.setComplemento("------------");
//        end.setNumeroCasa(2567);
//        end.setPessoas(pessoa);
//        pessoa.setEndereco(end);
//        
//        Conexao banco = new Conexao();
//        banco.save(end);
//        banco.save(pessoa);
//        Conexao banco = new Conexao();
//        FormaPagamento pagamento = new FormaPagamento();
//        pagamento.setDescricao("A VISTA");
        Conexao banco = new Conexao();
        Items item = new Items();
        item.setCodigo(Long.parseLong("2"));
        item.setExcluido(false);
        item.setStatus(true);
        item.setDescricao("feijao");
        item.setValor_venda(Long.parseLong("15"));
        banco.save(item);

//        Conexao banco = new Conexao();
//        Venda venda = new Venda();
//
//        List<ItensVenda> list = new ArrayList<>();
//        List<Items> CarrinhoVenda = new ArrayList<>();
//
//        Items item = new Items();
//        Items item1 = new Items();
//        item = banco.list_Items().get(0);
//        item1 = banco.list_Items().get(1);
//
//        CarrinhoVenda.add(item);
//        CarrinhoVenda.add(item1);
//
//        venda.setItensVendas(list);
//        for (int i = 0; i < CarrinhoVenda.size(); i++) {
//            ItensVenda itensdavenda = new ItensVenda();
//            itensdavenda.setItems(CarrinhoVenda.get(i));
//            banco.persist(itensdavenda); // persistindo o objeto no banco de dados
//            venda.getItensVendas().add(itensdavenda);
//        }
//
//        venda.setCodigoVenda(0000005);
//        venda.setDataVenda(new Date());
//
//        banco.save(venda); // salva a venda no banco de dados
//        for (int i = 0; i < banco.list_ItemsVenda().size(); i++) {
//            ItensVenda itemdaVenda = new ItensVenda();
//            itemdaVenda = banco.list_ItemsVenda().get(i); // pega o itemVenda do banco de dados e armazena em uma variavel.
//
//            
//            /*ESSA COMANDO ATUALIZA OS ITENSVENDA COLOCANDO O ID DA VENDA EM CADA ITEM
//            ELE COMPARA O ID_ITENSVENDA DA TABELA DO BANCO DE DADOS COM OS ID_ITENSVENDA DA VENDA*/
//            
//            for (int j = 0; j < venda.getItensVendas().size(); j++) {
//                if (banco.list_ItemsVenda().get(i).getIditensVenda() == (venda.getItensVendas().get(j).getIditensVenda())) {
//                    itemdaVenda.setVenda(venda); // depois que a venda for salva no banco de dados ela é adicionad ao itensdavenda
//                    itemdaVenda.setVenda(venda);
//                    banco.update(itemdaVenda);// depois podemos fazer o upgrade
//                } else {
//                    System.out.println(false);
//                }
//
//            }
//
//        }
//
    }

}
