
package br.com.classes;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "parcelas")
public class Parcelas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_parcela", unique = true, nullable = false)    
    private int idParcela;
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.ALL})
    private Venda venda;
    private int parcela;
    private double valor;
    private boolean status;
    private Date data;

    public Parcelas() {
    }

    public Parcelas(int idParcela, Venda venda, int parcela, double valor, boolean status, Date data) {
        this.idParcela = idParcela;
        this.venda = venda;
        this.parcela = parcela;
        this.valor = valor;
        this.status = status;
        this.data = data;
    }

    public int getIdParcela() {
        return idParcela;
    }

    public void setIdParcela(int idParcela) {
        this.idParcela = idParcela;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
