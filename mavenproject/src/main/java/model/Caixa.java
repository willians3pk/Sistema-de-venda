
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="caixa")
public class Caixa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Caixa", unique = true, nullable = false)
    private Integer id;
    private double entradaDinheiro;
    private double entradaCartao;
    private double entradaTransferencia;
    private double entradaAprazo;
    private double entradaParcelado;
    private double saidaDespesas;
    private String observacao;

    public Caixa() {
    }

    public Caixa(Integer id, double entradaDinheiro, double entradaCartao, double entradaAprazo, double entradaParcelado, double saidaDespesas, String observacao) {
        this.id = id;
        this.entradaDinheiro = entradaDinheiro;
        this.entradaCartao = entradaCartao;
        this.entradaAprazo = entradaAprazo;
        this.entradaParcelado = entradaParcelado;
        this.saidaDespesas = saidaDespesas;
        this.observacao = observacao;
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

    public double getEntradaCartao() {
        return entradaCartao;
    }

    public void setEntradaCartao(double entradaCartao) {
        this.entradaCartao = entradaCartao;
    }

    public double getEntradaTransferencia() {
        return entradaTransferencia;
    }

    public void setEntradaTransferencia(double entradaTransferencia) {
        this.entradaTransferencia = entradaTransferencia;
    }

    public double getEntradaAprazo() {
        return entradaAprazo;
    }

    public void setEntradaAprazo(double entradaAprazo) {
        this.entradaAprazo = entradaAprazo;
    }

    public double getEntradaParcelado() {
        return entradaParcelado;
    }

    public void setEntradaParcelado(double entradaParcelado) {
        this.entradaParcelado = entradaParcelado;
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
    
}
