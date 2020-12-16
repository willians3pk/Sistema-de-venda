package br.com.classes;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario")
public class Usuario extends Pessoa{

    private Date dataEmissao;
    private Date dataDemissao;
    private int previlegios;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Venda> vendas;
    
    public Usuario() {
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public int getPrevilegios() {
        return previlegios;
    }

    public void setPrevilegios(int previlegios) {
        this.previlegios = previlegios;
    }

    public List<Venda> getVenda() {
        return vendas;
    }

    public void setVenda(List<Venda> venda) {
        this.vendas = venda;
    }
    
}
