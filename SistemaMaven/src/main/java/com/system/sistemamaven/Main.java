/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.sistemamaven;

import com.system.conexao.Conexao;
import com.system.telas.TelaPrincipal;

/**
 *
 * @author willian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        
//        Conexao banco = new Conexao();
//
//        Fornecedor f = banco.list_Fornecedores().get(0);
//        System.out.println(f.endereco().getCep());
        
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome("VITORIA SILVA DE ALMEIDA");
//        pessoa.setCpf(883998398);
//        pessoa.setEmail("vitoria.silva@outlook.com");
//        pessoa.setDataNascimento(new Date(22072000));
//        
//        Endereco end = new Endereco();
//        end.setRua("Avenda Industrial");
//        end.setCidade("IMPERATRIZ");
//        end.setCep(65919230);
//        end.setComplemento("");
//        end.setNumeroCasa(713);
////        end.setPessoas(pessoas);
//        pessoa.setEndereco(end);
//        
//        Conexao banco = new Conexao();
//        banco.save(end);
//        banco.save(pessoa);
    }

}
