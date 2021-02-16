package br.com.classes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formapagamento")
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Cod_FormaPagamento", unique = true, nullable = false)
    private int idformaPagamento;
    
//    @Column(name = "Descricao", length = 45)
    private String descricao;
    
//    @ManyToMany(fetch = FetchType.LAZY)
//    @Cascade({CascadeType.ALL})
//    private List<Venda> vendas;

    public FormaPagamento() {
        
    }

    public FormaPagamento(int idformaPagamento, String descricao) {
        this.idformaPagamento = idformaPagamento;
        this.descricao = descricao;
    }

    public int getIdformaPagamento() {
        return idformaPagamento;
    }

    public void setIdformaPagamento(int idformaPagamento) {
        this.idformaPagamento = idformaPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
