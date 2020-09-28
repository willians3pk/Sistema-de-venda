package com.system.sistemamaven;
// Generated 28/09/2020 12:30:31 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Items generated by hbm2java
 */
@Entity
@Table(name = "items",
         catalog = "bancoSistemaVenda"
)
public class Items implements java.io.Serializable {

    private Integer iditem;
    private Fornecedor fornecedor;
    private String item;
    private Long valor_compra;
    private Long valor_venda;
    private boolean status;
    private Long peso;
    private int codigo;
    private Integer qnt;
    private String descricao;
    private Set itensVendas = new HashSet(0);

    public Items() {
    }

    public Items(boolean status, int codigo) {
        this.status = status;
        this.codigo = codigo;
    }

    public Items(Fornecedor fornecedor, String item, Long valor, boolean status, Long peso, int codigo, Integer qnt, String descricao, Set itensVendas) {
        this.fornecedor = fornecedor;
        this.item = item;
        this.valor_compra = valor;
        this.status = status;
        this.peso = peso;
        this.codigo = codigo;
        this.qnt = qnt;
        this.descricao = descricao;
        this.itensVendas = itensVendas;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "iditem", unique = true, nullable = false)
    public Integer getIditem() {
        return this.iditem;
    }

    public void setIditem(Integer iditem) {
        this.iditem = iditem;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fornecedor_id")
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Column(name = "item", length = 45)
    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Column(name = "valor_compra", precision = 10, scale = 0)
    public Long getValor_compra() {
        return this.valor_compra;
    }

    public void setValor_compra(Long valor_compra) {
        this.valor_compra = valor_compra;
    }

    @Column(name = "valor_venda", precision = 10, scale = 0)
    public Long getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Long valor_venda) {
        this.valor_venda = valor_venda;
    }

    @Column(name = "status", nullable = false)
    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Column(name = "peso", precision = 10, scale = 0)
    public Long getPeso() {
        return this.peso;
    }

    public void setPeso(Long peso) {
        this.peso = peso;
    }

    @Column(name = "codigo", nullable = false)
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Column(name = "qnt")
    public Integer getQnt() {
        return this.qnt;
    }

    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }

    @Column(name = "descricao", length = 200)
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "items")
    public Set getItensVendas() {
        return this.itensVendas;
    }

    public void setItensVendas(Set itensVendas) {
        this.itensVendas = itensVendas;
    }

}
