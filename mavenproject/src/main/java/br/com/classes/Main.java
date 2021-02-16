

package br.com.classes;

import br.com.conexao.Conexao;
import br.com.telas.MainScreen;
import java.util.ArrayList;
import java.util.List;

public class Main {

    
    public static void main(String[] args) {
       
        Conexao connect = new Conexao();
        
            FormaPagamento formapagamento = new FormaPagamento();
            formapagamento.setDescricao("DINHEIRO A VISTA");
            connect.save(formapagamento);
            FormaPagamento formapagamento1 = new FormaPagamento();
            formapagamento1.setDescricao("CARTÃO DE DEBITO");
            connect.save(formapagamento1);
            FormaPagamento formapagamento2 = new FormaPagamento();
            formapagamento2.setDescricao("CARTÃO DE CREDITO");
            connect.save(formapagamento2);
            FormaPagamento formapagamento3 = new FormaPagamento();
            formapagamento3.setDescricao("A PRAZO");
            connect.save(formapagamento3);
            FormaPagamento formapagamento4 = new FormaPagamento();
            formapagamento4.setDescricao("TRANSFERENCIA");
            connect.save(formapagamento4);
            FormaPagamento formapagamento5 = new FormaPagamento();
            formapagamento5.setDescricao("PARCELADO");
            connect.save(formapagamento5);
            
            new MainScreen().setVisible(true);
        
    }
    
}
