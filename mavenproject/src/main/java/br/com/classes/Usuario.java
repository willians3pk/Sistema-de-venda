package br.com.classes;

import java.util.Date;
import java.util.List;
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
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Usuario", unique = true, nullable = false)
    private int idusuario;

//    @Temporal(TemporalType.DATE)
//    @Column(name = "Data_Emissao", length = 10)
    private Date dataEmissao;
//    @Temporal(TemporalType.DATE)
//    @Column(name = "Data_Demissao", length = 10)
    private Date dataDemissao;
    
//    @Column(name="Previlegios")
    private int previlegios;
    
//    @Column(name="Status")
    private boolean status;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Venda> venda;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Pessoa> pessoa;

    public Usuario() {
    }

    public Usuario(int idusuario, Date dataEmissao, Date dataDemissao, int previlegios, Boolean status, List<Venda> venda, List<Pessoa> pessoa) {
        this.idusuario = idusuario;
        this.dataEmissao = dataEmissao;
        this.dataDemissao = dataDemissao;
        this.previlegios = previlegios;
        this.status = status;
        this.venda = venda;
        this.pessoa = pessoa;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Venda> getVenda() {
        return venda;
    }

    public void setVenda(List<Venda> venda) {
        this.venda = venda;
    }

    public List<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

}
