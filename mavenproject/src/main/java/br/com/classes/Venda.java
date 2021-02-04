package br.com.classes;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Venda", unique = true, nullable = false)
    private int idvenda;

    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Cod_Cliente")
    private Cliente cliente;

    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade({CascadeType.ALL})
    private List<FormaPagamento> formaPagamento;

    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Cod_Usuario")
    private Usuario usuario;

//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "Data_Venda", length = 19)
    private Date dataVenda;
    
//    @Column(name = "Codigo_Venda", nullable = false)
    private int codigoVenda;
    
//    @Column(name = "Descricao", length = 200)
    private String descricao;
    
//    @Column(name = "Status")
    private boolean status;
    
//    @Column(name = "ValorTotal", precision = 10, scale = 0)
    private Long valorTotal;

    private String faturas;
    
    private double taxa_juros;
    
    public Venda() {
    }

    public Venda(int idvenda, Cliente cliente, List<FormaPagamento> formaPagamento, Usuario usuario, Date dataVenda, int codigoVenda, String descricao, boolean status, Long valorTotal, String faturas, double taxa_juros) {
        this.idvenda = idvenda;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.usuario = usuario;
        this.dataVenda = dataVenda;
        this.codigoVenda = codigoVenda;
        this.descricao = descricao;
        this.status = status;
        this.valorTotal = valorTotal;
        this.faturas = faturas;
        this.taxa_juros = taxa_juros;
    }


    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(List<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFaturas() {
        return faturas;
    }

    public void setFaturas(String faturas) {
        this.faturas = faturas;
    }

    public double getTaxa_juros() {
        return taxa_juros;
    }

    public void setTaxa_juros(double taxa_juros) {
        this.taxa_juros = taxa_juros;
    }

    
}
