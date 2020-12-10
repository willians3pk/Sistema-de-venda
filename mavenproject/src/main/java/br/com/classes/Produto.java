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
//    @JoinColumn(name = "Cod_Fornecedor")
    private Fornecedor fornecedor;

//    @Column(name = "item", length = 45)
    private String nome;

//    @Column(name = "valor_compra", precision = 10, scale = 0)
    private Long valor_compra;

//    @Column(name = "valor_venda", precision = 10, scale = 0)
    private Long valor_venda;

//    @Column(name = "valor_total", precision = 10, scale = 0)
    private Long valor_total;

//    @Column(name = "Status", nullable = false)
    private boolean status;

//    @Column(name = "Excluido", nullable = false)
    private boolean excluido;

//    @Column(name = "Tamanho", length = 45)
    private String tamanho;

//    @Column(name = "CodigoBarra", nullable = false)
    private Long codigo;

//    @Column(name = "Qnt")
    private int qnt;

//    @Column(name = "Descricao", length = 200)
    private String descricao;

//    @Temporal(TemporalType.DATE)
//    @Column(name = "Entrega_Produto", length = 10)
    private Date dataEntrega;

    @OneToMany(fetch = FetchType.EAGER)
    private List<ItensVenda> itensVendas;

    public Produto() {
    }

    public Produto(Integer idProduto, Fornecedor fornecedor, String nome, Long valor_compra, Long valor_venda, Long valor_total, boolean status, boolean excluido, String tamanho, Long codigo, int qnt, String descricao, Date dataEntrega, List<ItensVenda> itensVendas) {
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

    public Long getValor_total() {
        return valor_total;
    }

    public void setValor_total(Long valor_total) {
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

    @Override
    public String toString() {
        return "--------------------------------------------------------------------------------------"
                + "\nDescrição:      " + "    Codigo:       " + "     Qnt:     " + "    valor unitario:\n"
                + this.nome + "            " + this.codigo + "                   " + this.qnt + "            " + this.valor_venda / 100;

    }
}
