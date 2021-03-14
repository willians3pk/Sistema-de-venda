package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "caixa")
public class Caixa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Caixa", unique = true, nullable = false)
    private Integer id;
    private double entradaDinheiro;
    private double saidaDespesas;
    private Date   data;
    private String observacao;
    private String tipo;
    
    @OneToOne
    private Venda venda;

    public Caixa() {
    }

    public Caixa(Integer id, double entradaDinheiro, double saidaDespesas, String observacao, Venda venda) {
        this.id = id;
        this.entradaDinheiro = entradaDinheiro;
        this.saidaDespesas = saidaDespesas;
        this.observacao = observacao;
        this.venda = venda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getEntradaDinheiro() {
        return entradaDinheiro;
    }

    public void setEntradaDinheiro(double entradaDinheiro) {
        this.entradaDinheiro = entradaDinheiro;
    }

    public double getSaidaDespesas() {
        return saidaDespesas;
    }

    public void setSaidaDespesas(double saidaDespesas) {
        this.saidaDespesas = saidaDespesas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
