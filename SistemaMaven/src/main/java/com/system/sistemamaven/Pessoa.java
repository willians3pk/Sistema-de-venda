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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pessoa generated by hbm2java
 */
@Entity
@Table(name = "pessoa",
         catalog = "bancoSistemaVenda"
)
public class Pessoa implements java.io.Serializable {

    private Integer idpessoa;
    private Endereco endereco;
    private Cliente cliente;
    private Usuario usuario;
    private String nome;
    private Integer cpf;
    private String sexo;
    private String email;
    private boolean status;
    private Date dataNascimento;
    private Set numeroContatos = new HashSet(0);

    public Pessoa() {
    }

    public Pessoa(Endereco endereco, Cliente cliente, Usuario usuario, String nome, Integer cpf, String email, boolean status, Date dataNascimento, Set numeroContatos) {
        this.endereco = endereco;
        this.cliente = cliente;
        this.usuario = usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.status = status;
        this.dataNascimento = dataNascimento;
        this.numeroContatos = numeroContatos;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "idpessoa", unique = true, nullable = false)
    public Integer getIdpessoa() {
        return this.idpessoa;
    }

    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_id")
    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Column(name = "nome", length = 65)
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Column(name = "cpf")
    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    @Column(name = "email", length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "status", nullable = false)
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento", length = 10)
    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
    public Set getNumeroContatos() {
        return this.numeroContatos;
    }

    public void setNumeroContatos(Set numeroContatos) {
        this.numeroContatos = numeroContatos;
    }

}
