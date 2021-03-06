package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Produto", unique = true, nullable = false)
    private Integer idProduto;

    @OneToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    private Fornecedor fornecedor;
    private String item;
    private double valor_compra;
    private double valor_venda;
    private double valor_total;
    private boolean status;
    private String tamanho;
    private String cor;
    private String apelido;
    private String categoria;
    private int qnt;
    private String descricao;
    private Date dataEntrega;
    private Date dataRegistro;

    @OneToMany(fetch = FetchType.EAGER)
    private List<ItensVenda> itensVendas;

    public Produto() {
        itensVendas = new ArrayList<ItensVenda>();
    }

    public Produto(Integer idProduto, Fornecedor fornecedor, String nome, double valor_compra, double valor_venda, double valor_total, boolean status, String tamanho, String apelido, int qnt, String descricao, Date dataEntrega, Date dataRegistro, List<ItensVenda> itensVendas) {
        this.idProduto = idProduto;
        this.fornecedor = fornecedor;
        this.item = nome;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.valor_total = valor_total;
        this.status = status;
        this.tamanho = tamanho;
        this.apelido = apelido;
        this.qnt = qnt;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.dataRegistro = dataRegistro;
        this.itensVendas = itensVendas;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return item;
    }

    public void setNome(String nome) {
        this.item = nome;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public List<ItensVenda> getItensVendas() {
        return itensVendas;
    }

    public void setItensVendas(List<ItensVenda> itensVendas) {
        this.itensVendas = itensVendas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
