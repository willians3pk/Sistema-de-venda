package com.systema.projetows;
// Generated 28/09/2020 12:30:31 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * NumeroContato generated by hbm2java
 */
@Entity
@Table(name="Numero_contato"
    ,catalog="SistemaVendas"
)
public class NumeroContato  implements java.io.Serializable {


     private Integer idNumeroContato;
     private Fornecedor fornecedor;
     private Pessoa pessoa;
     private int ddd;
     private int fone;
     private Long cpf;

    public NumeroContato() {
    }

    public NumeroContato(Fornecedor fornecedor, Pessoa pessoa, int ddd, int fone, Long cpf) {
       this.fornecedor = fornecedor;
       this.pessoa = pessoa;
       this.ddd = ddd;
       this.fone = fone;
       this.cpf = cpf;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idNumero_contato", unique=true, nullable=false)
    public Integer getIdNumeroContato() {
        return this.idNumeroContato;
    }
    
    public void setIdNumeroContato(Integer idNumeroContato) {
        this.idNumeroContato = idNumeroContato;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fornecedor_id")
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pessoa_id")
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    @Column(name="ddd")
    public int getDdd() {
        return this.ddd;
    }
    
    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    
    @Column(name="fone")
    public int getFone() {
        return this.fone;
    }
    
    public void setFone(int fone) {
        this.fone = fone;
    }

    
    @Column(name="cpf")
    public Long getCpf() {
        return this.cpf;
    }
    
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

}

