

package br.com.classes;

import br.com.conexao.Conexao;


public class Main {

    
    public static void main(String[] args) {
       
        Fornecedor  forn = new Fornecedor();
        Conexao connect = new Conexao();
        
        forn.setNome("MariaDB");
        connect.save(forn);
        
    }
    
}
