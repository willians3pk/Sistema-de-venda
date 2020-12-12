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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "numerocontato")
public class NumeroContato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Cod_NumeroContato", unique=true, nullable=false)
    private int idNumeroContato;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.PERSIST})
    private Fornecedor fornecedor;
    
    @OneToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.PERSIST})
    private Pessoa pessoa;
    
//    @Column(name="DDD")
    private int ddd;
    
//    @Column(name="Fone")
    private int fone;
    
//    @Column(name="CPF")
    private Long cpf;

    public NumeroContato() {
    }

    public NumeroContato(int idNumeroContato, Fornecedor fornecedor, Pessoa pessoa, int ddd, int fone, Long cpf) {
        this.idNumeroContato = idNumeroContato;
        this.fornecedor = fornecedor;
        this.pessoa = pessoa;
        this.ddd = ddd;
        this.fone = fone;
        this.cpf = cpf;
    }

    public int getIdNumeroContato() {
        return idNumeroContato;
    }

    public void setIdNumeroContato(int idNumeroContato) {
        this.idNumeroContato = idNumeroContato;
    }
    
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

}
