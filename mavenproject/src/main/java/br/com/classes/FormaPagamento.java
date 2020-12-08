package br.com.classes;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "formapagamento")
public class FormaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idformaPagamento;
    private String descricao;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Venda> vendas;

    public FormaPagamento() {
    }

    public FormaPagamento(int idformaPagamento, String descricao, List<Venda> vendas) {
        this.idformaPagamento = idformaPagamento;
        this.descricao = descricao;
        this.vendas = vendas;
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

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

}
