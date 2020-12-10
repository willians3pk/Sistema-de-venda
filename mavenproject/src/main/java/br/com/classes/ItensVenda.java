package br.com.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itensvenda")
public class ItensVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Cod_ItensVenda", unique=true, nullable=false)
    private int iditensVenda;
    
    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="Cod_Produto")
    private Produto items;
    
    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="Cod_Venda")
    private Venda venda;
    
//    @Column(name="Qnt")
    private int qnt;
    
//    @Column(name="Status")
    private boolean status;

    public ItensVenda() {
    }

    public ItensVenda(int iditensVenda, Produto items, Venda venda, int qnt, boolean status) {
        this.iditensVenda = iditensVenda;
        this.items = items;
        this.venda = venda;
        this.qnt = qnt;
        this.status = status;
    }

    public int getIditensVenda() {
        return iditensVenda;
    }

    public void setIditensVenda(int iditensVenda) {
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

}
