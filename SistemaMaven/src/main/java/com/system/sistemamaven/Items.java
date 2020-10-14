package com.system.sistemamaven;
// Generated 28/09/2020 12:30:31 by Hibernate Tools 4.3.1

import com.system.conexao.Conexao;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    private float valor_compra;
    private float valor_venda;
    private float valor_total;
    private boolean status;
    private boolean excluido;
    private String tamanho;
    private Long codigo;
    private int qnt;
    private String descricao;
    private Set itensVendas = new HashSet(0);

    public Items() {
    }

    public Items(boolean status, Long codigo) {
        this.status = status;
        this.codigo = codigo;
    }

    public Items(Integer iditem, Fornecedor fornecedor, String item, float valor_compra, float valor_venda, float valor_total, boolean status, boolean excluido, String tamanho, Long codigo, int qnt, String descricao) {
        this.iditem = iditem;
        this.fornecedor = fornecedor;
        this.item = item;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.valor_total = valor_total;
        this.status = status;
        this.excluido = excluido;
        this.tamanho = tamanho;
        this.codigo = codigo;
        this.qnt = qnt;
        this.descricao = descricao;
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

    @ManyToOne(fetch = FetchType.EAGER)
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
    public float getValor_compra() {
        return this.valor_compra;
    }

    public void setValor_compra(float valor_compra) {
        this.valor_compra = valor_compra;
    }

    @Column(name = "valor_venda", precision = 10, scale = 0)
    public float getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }

    @Column(name = "valor_total", precision = 10, scale = 0)
    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    @Column(name = "status", nullable = false)
    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Column(name = "excluido", nullable = false)
    public boolean isExcluido() {
        return excluido;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

    @Column(name = "tamanho", length = 45)
    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Column(name = "codigo", nullable = false)
    public Long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Column(name = "qnt")
    public int getQnt() {
        return this.qnt;
    }

    public void setQnt(int qnt) {
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

    @Override
    public String toString() {
        return "--------------------------------------------------------------------------------------"
                    + "\nDescrição:      " + "    Codigo:       " + "     Qnt:     " + "    valor unitario:\n"
                    + this.item + "            " + this.codigo + "                   " + this.qnt + "            " + this.valor_venda / 100;
                
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

//  ----- METODOS ESPECIFICOS DA CLASSE ITEMS --------
    
    public Fornecedor fornecedor() {
        Conexao banco = new Conexao();
        Fornecedor forn = null;
        for (Fornecedor fornecedor : banco.list_Fornecedores()) { // PEGA O FORNECEDOR DO ITEM;
            if (fornecedor.getIdFornecedor() == this.fornecedor.getIdFornecedor()) {
                forn = fornecedor;
                return forn;
            }
        }
        return null;
    }
}
