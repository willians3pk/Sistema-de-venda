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
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProduto;
    @OneToOne(fetch = FetchType.EAGER)
    private Fornecedor fornecedor;
    
    private String nome;
    private Long valor_compra;
    private Long valor_venda;
    private int valor_total;
    private boolean status;
    private boolean excluido;
    private String tamanho;
    private Long codigo;
    private int qnt;
    private String descricao;
    private Date dataEntrega;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<ItensVenda> itensVendas;

    public Produto() {
    }

    public Produto(int idProduto, Fornecedor fornecedor, String nome, Long valor_compra, Long valor_venda, int valor_total, boolean status, boolean excluido, String tamanho, Long codigo, int qnt, String descricao, Date dataEntrega, List<ItensVenda> itensVendas) {
        this.idProduto = idProduto;
        this.fornecedor = fornecedor;
        this.nome = nome;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.valor_total = valor_total;
        this.status = status;
        this.excluido = excluido;
        this.tamanho = tamanho;
        this.codigo = codigo;
        this.qnt = qnt;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.itensVendas = itensVendas;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Long valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Long getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Long valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isExcluido() {
        return excluido;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public List<ItensVenda> getItensVendas() {
        return itensVendas;
    }

    public void setItensVendas(List<ItensVenda> itensVendas) {
        this.itensVendas = itensVendas;
    }

}
