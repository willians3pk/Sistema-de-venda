/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavarejos;

import Classes.Endereco;
import Classes.Pessoa;
import ConexaoDAO.Conexao;
import java.util.Date;

/**
 *
 * @author willian
 */
public class SistemaVarejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("PAMELA PEREIRA MARINHO");
        pessoa.setCpf(666888999);
        pessoa.setEmail("pam.marinho@outlook.com");
        pessoa.setDataNascimento(new Date(22011995));
        
                
        Endereco end = new Endereco();
        end.setRua("EUDES PIRES");
        end.setCidade("IMPERATRIZ");
        end.setCep(65919005);
        end.setComplemento("");
        end.setNumeroCasa(292);
//        end.setPessoas(pessoas);
        pessoa.setEndereco(end);
        
        Conexao banco = new Conexao();
        banco.save(end);
        banco.save(pessoa);
    }
    
}
