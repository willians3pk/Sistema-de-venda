package com.system.sistemamaven;
// Generated 28/09/2020 12:30:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Fornecedor generated by hbm2java
 */
@Entity
@Table(name="Fornecedor"
    ,catalog="bancoSistemaVenda"
)
public class Fornecedor  implements java.io.Serializable {


     private Integer idFornecedor;
     private Endereco endereco;
     private String nome;
     private Long cnpj;
     private Long cpf;
     private String email;
     private String homePage;
     private Set itemses = new HashSet(0);
     private Set numeroContatos = new HashSet(0);

    public Fornecedor() {
    }

    public Fornecedor(Endereco endereco, String nome, Long cnpj, Long cpf, String email, String homePage, Set itemses, Set numeroContatos) {
       this.endereco = endereco;
       this.nome = nome;
       this.cnpj = cnpj;
       this.cpf = cpf;
       this.email = email;
       this.homePage = homePage;
       this.itemses = itemses;
       this.numeroContatos = numeroContatos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idFornecedor", unique=true, nullable=false)
    public Integer getIdFornecedor() {
        return this.idFornecedor;
    }
    
    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="endereco_id")
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    @Column(name="nome", length=65)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="cnpj")
    public Long getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    
    @Column(name="cpf")
    public Long getCpf() {
        return this.cpf;
    }
    
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="home-page", length=45)
    public String getHomePage() {
        return this.homePage;
    }
    
    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="fornecedor")
    public Set getItemses() {
        return this.itemses;
    }
    
    public void setItemses(Set itemses) {
        this.itemses = itemses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="fornecedor")
    public Set getNumeroContatos() {
        return this.numeroContatos;
    }
    
    public void setNumeroContatos(Set numeroContatos) {
        this.numeroContatos = numeroContatos;
    }




}


