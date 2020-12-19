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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Pessoa", unique = true, nullable = false)
    private Integer idpessoa;
    
    @OneToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.PERSIST})
    private Endereco endereco;
    private String nome;
    private Long cpf;
    private String email;
    private boolean status;
    private Date dataNascimento;
    
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.SAVE_UPDATE, CascadeType.PERSIST})
    private List<NumeroContato> numeroContatos;

    public Pessoa() {
    }

    public Pessoa(Integer idpessoa, Endereco endereco, String nome, Long cpf, String email, boolean status, Date dataNascimento, List<NumeroContato> numeroContatos) {
        this.idpessoa = idpessoa;
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.status = status;
        this.dataNascimento = dataNascimento;
        this.numeroContatos = numeroContatos;
    }

    public Integer getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<NumeroContato> getNumeroContatos() {
        return numeroContatos;
    }

    public void setNumeroContatos(List<NumeroContato> numeroContatos) {
        this.numeroContatos = numeroContatos;
    }
    
}
