package br.com.classes;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venda")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idvenda;

    @OneToOne(fetch = FetchType.EAGER)
    private Cliente cliente;
    @OneToMany(fetch = FetchType.EAGER)
    private List<FormaPagamento> formaPagamento;
    @OneToOne(fetch = FetchType.EAGER)
    private Usuario usuario;
    
    private Date dataVenda;
    private int codigoVenda;
    private String descricao;
    private boolean status;
    private Long valorTotal;

    public Venda() {
    }

    public Venda(int idvenda, Cliente cliente, List<FormaPagamento> formaPagamento, Usuario usuario, Date dataVenda, int codigoVenda, String descricao, boolean status, Long valorTotal) {
        this.idvenda = idvenda;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.usuario = usuario;
        this.dataVenda = dataVenda;
        this.codigoVenda = codigoVenda;
        this.descricao = descricao;
        this.status = status;
        this.valorTotal = valorTotal;
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

}
