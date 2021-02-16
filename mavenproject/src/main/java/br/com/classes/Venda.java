package br.com.classes;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
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
    private Cliente cliente;
    @OneToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade({CascadeType.ALL})
    private List<FormaPagamento> formaPagamento;
    
    private int codigoVenda;
    private Date dataVenda;
    private boolean status;
    private double taxa_juros;
    private double valor_pago;
    private double valorTotal;
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    private List<Parcelas> parcelas;
    private Date prazo;
    private String descricao;

    private double troco;

    public Venda() {

    }

    public Venda(int idvenda, Cliente cliente, Usuario usuario, List<FormaPagamento> formaPagamento, int codigoVenda, Date dataVenda, boolean status, double taxa_juros, double valor_pago, double valorTotal, List<Parcelas> parcelas, String descricao, double troco) {
        this.idvenda = idvenda;
        this.cliente = cliente;
        this.usuario = usuario;
        this.formaPagamento = formaPagamento;
        this.codigoVenda = codigoVenda;
        this.dataVenda = dataVenda;
        this.status = status;
        this.taxa_juros = taxa_juros;
        this.valor_pago = valor_pago;
        this.valorTotal = valorTotal;
        this.parcelas = parcelas;
        this.descricao = descricao;
        this.troco = troco;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<FormaPagamento> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(List<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getTaxa_juros() {
        return taxa_juros;
    }

    public void setTaxa_juros(double taxa_juros) {
        this.taxa_juros = taxa_juros;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcelas> parcelas) {
        this.parcelas = parcelas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

}
