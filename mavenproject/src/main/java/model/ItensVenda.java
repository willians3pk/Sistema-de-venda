package model;

import model.dao.Conexao;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "itensvenda")
public class ItensVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Cod_ItensVenda", unique=true, nullable=false)
    private Integer iditensVenda;
    @ManyToOne(fetch = FetchType.EAGER)
    private Produto items;    
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE})
    private Venda venda;
    
    private int qnt;
    
    private boolean status;
    private Date dataEmissao;

    public ItensVenda() {
    }

    public ItensVenda(int iditensVenda, Produto items, Venda venda, int qnt, boolean status) {
        this.iditensVenda = iditensVenda;
        this.items = items;
        this.venda = venda;
        this.qnt = qnt;
        this.status = status;
    }

    public Integer getIditensVenda() {
        return iditensVenda;
    }

    public void setIditensVenda(Integer iditensVenda) {
        this.iditensVenda = iditensVenda;
    }

    public Produto getItems() {
        return items;
    }

    public void setItems(Produto items) {
        this.items = items;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    //------------------------------------------------
    
    public double valortotal(){
        return this.getItems().getValor_venda() * this.getQnt();
    }

}
