

package br.com.classes;

import br.com.conexao.Conexao;


public class Main {

    
    public static void main(String[] args) {
       
        
        Conexao connect = new Conexao();
        Pessoa client = new Pessoa();
        client = null;
        client = connect.list_Cliente().get(0);
        System.out.println(client.getNome());
        
    }
    
}
