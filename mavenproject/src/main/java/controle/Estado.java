/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

/**
 *
 * @author user
 */
public enum Estado {
    
    PAGO("CANCELADO"),
    CANCELADO("PAGO"),
    ANDAMENTO("ANDAMENTO");
    
    private String descricao;
    
    Estado(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
     
}
