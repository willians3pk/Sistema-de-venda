package com.system.sistemamaven;
// Generated 28/09/2020 12:30:31 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="bancoSistemaVenda"
)
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private Date dataEmissao;
     private Date dataDemissao;
     private Integer previlegios;
     private Boolean status;
     private Set pessoas = new HashSet(0);
     private Set vendas = new HashSet(0);

    public Usuario() {
    }

    public Usuario(Date dataEmissao, Date dataDemissao, Integer previlegios, Boolean status, Set pessoas, Set vendas) {
       this.dataEmissao = dataEmissao;
       this.dataDemissao = dataDemissao;
       this.previlegios = previlegios;
       this.status = status;
       this.pessoas = pessoas;
       this.vendas = vendas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idusuario", unique=true, nullable=false)
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_emissao", length=10)
    public Date getDataEmissao() {
        return this.dataEmissao;
    }
    
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="data_demissao", length=10)
    public Date getDataDemissao() {
        return this.dataDemissao;
    }
    
    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    
    @Column(name="previlegios")
    public Integer getPrevilegios() {
        return this.previlegios;
    }
    
    public void setPrevilegios(Integer previlegios) {
        this.previlegios = previlegios;
    }

    
    @Column(name="status")
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Set pessoas) {
        this.pessoas = pessoas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }




}

