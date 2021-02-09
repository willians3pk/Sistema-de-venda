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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Produto", unique = true, nullable = false)
    private Integer idProduto;

    @OneToOne(fetch = FetchType.EAGER)
    private Fornecedor fornecedor;
    private String nome;
    private double valor_compra;
    private double valor_venda;
    private double valor_total;
    private boolean status;
    private boolean excluido;
    private String tamanho;
    private String apelido;
    private int qnt;
    private String descricao;
    private Date dataEntrega;

    @OneToMany(fetch = FetchType.EAGER)
    private List<ItensVenda> itensVendas;

    public Produto() {
    }

    public Produto(Integer idProduto, Fornecedor fornecedor, String nome, double valor_compra, double valor_venda, double valor_total, boolean status, boolean excluido, String tamanho, String apelido, int qnt, String descricao, Date dataEntrega, List<ItensVenda> itensVendas) {
        this.idProduto = idProduto;
        this.fornecedor = fornecedor;
        this.nome = nome;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.valor_total = valor_total;
        this.status = status;
        this.excluido = excluido;
        this.tamanho = tamanho;
        this.apelido = apelido;
        this.qnt = qnt;
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<ItensVenda> getItensVendas() {
        return itensVendas;
    }

    public void setItensVendas(List<ItensVenda> itensVendas) {
        this.itensVendas = itensVendas;
    }

    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------------------"
                + "\nDescrição:      " + "    Apelido:       " + "     Qnt:     " + "    valor unitario:\n"
                + this.nome + "            " + this.apelido + "                   " + this.qnt + "            " + this.valor_venda / 100;

    }
}
