package com.system.sistemamaven;
// Generated 28/09/2020 12:30:31 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Venda generated by hbm2java
 */
@Entity
@Table(name = "venda",
         catalog = "bancoSistemaVenda"
)
public class Venda implements java.io.Serializable {

    private Integer idvenda;
    private Cliente cliente;
    private Set<FormaPagamento> formaPagamento;
    private Usuario usuario;
    private Date dataVenda;
    private int codigoVenda;
    private String descricao;
    private Boolean status;
    private Long valorTotal;
    private Set itensVendas = new HashSet(0);

    public Venda() {
    }

    public Venda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Venda(Cliente cliente, Set<FormaPagamento> formaPagamento, Usuario usuario, Date dataVenda, int codigoVenda, String descricao, Boolean status, Long valorTotal, Set itensVendas) {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.usuario = usuario;
        this.dataVenda = dataVenda;
        this.codigoVenda = codigoVenda;
        this.descricao = descricao;
        this.status = status;
        this.valorTotal = valorTotal;
        this.itensVendas = itensVendas;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idvenda", unique = true, nullable = false)
    public Integer getIdvenda() {
        return this.idvenda;
    }

    public void setIdvenda(Integer idvenda) {
        this.idvenda = idvenda;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "venda")
//    @JoinColumn(name = "forma_pagamento_id")
    public Set<FormaPagamento> getFormaPagamento() {
        return this.formaPagamento;
    }

    public void setFormaPagamento(Set<FormaPagamento> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_venda", length = 19)
    public Date getDataVenda() {
        return this.dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Column(name = "codigo_venda", nullable = false)
    public int getCodigoVenda() {
        return this.codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    @Column(name = "descricao", length = 200)
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Column(name = "status")
    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Column(name = "valorTotal", precision = 10, scale = 0)
    public Long getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "venda")
    public Set getItensVendas() {
        return this.itensVendas;
    }

    public void setItensVendas(Set itensVendas) {
        this.itensVendas = itensVendas;
    }

}
