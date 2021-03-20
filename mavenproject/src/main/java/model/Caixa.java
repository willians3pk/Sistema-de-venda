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
    private double devolucaoCliente;
    private String descricaoMovito;
    private Date   data;
    
    @OneToOne
    private Venda venda;

    public Caixa() {
    }

    public Caixa(Integer id, double entradaDinheiro, double devolucaoCliente, String descricaoMovito, Date data, Venda venda) {
        this.id = id;
        this.entradaDinheiro = entradaDinheiro;
        this.devolucaoCliente = devolucaoCliente;
        this.descricaoMovito = descricaoMovito;
        this.data = data;
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

    public double getDevolucaoCliente() {
        return devolucaoCliente;
    }

    public void setDevolucaoCliente(double devolucaoCliente) {
        this.devolucaoCliente = devolucaoCliente;
    }

    public String getDescricaoMovito() {
        return descricaoMovito;
    }

    public void setDescricaoMovito(String descricaoMovito) {
        this.descricaoMovito = descricaoMovito;
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
