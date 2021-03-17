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
@Table(name = "movimentacao")
public class movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Caixa", unique = true, nullable = false)
    private Integer id;
    private double entradaDinheiro;
    private double saidaDespesas;
    private double devolucaoCliente;
    private String descricaoMovito;
    private Date   data;
    private String descricaoDespesa;
    private String tipo;
    
    @OneToOne
    private Venda venda;

    public movimentacao() {
    }

    public movimentacao(Integer id, double entradaDinheiro, double saidaDespesas, double devolucaoCliente, String descricaoMovito, Date data, String descricaoDespesa, String tipo, Venda venda) {
        this.id = id;
        this.entradaDinheiro = entradaDinheiro;
        this.saidaDespesas = saidaDespesas;
        this.devolucaoCliente = devolucaoCliente;
        this.descricaoMovito = descricaoMovito;
        this.data = data;
        this.descricaoDespesa = descricaoDespesa;
        this.tipo = tipo;
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

    public String getDescricaoDespesa() {
        return descricaoDespesa;
    }

    public void setDescricaoDespesa(String descricaoDespesa) {
        this.descricaoDespesa = descricaoDespesa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
