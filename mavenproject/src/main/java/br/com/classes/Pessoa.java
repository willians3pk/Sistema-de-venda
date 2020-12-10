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

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Pessoa", unique = true, nullable = false)
    private int idpessoa;
    
    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Cod_Endereco")
    private Endereco endereco;
    
    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Cod_Cliente")
    private Cliente cliente;
    
    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Cod_Usuario")
    private Usuario usuario;
    
//    @Column(name = "Nome", length = 65)
    private String nome;
    
//    @Column(name = "CPF")
    private Long cpf;
    
//    @Column(name = "E-Mail", length = 45)
    private String email;
    
//    @Column(name = "Status", nullable = false)
    private boolean status;
    
//    @Temporal(TemporalType.DATE)
//    @Column(name = "Data_Nascimento", length = 10)
    private Date dataNascimento;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<NumeroContato> numeroContatos;

    public Pessoa() {
    }

    public Pessoa(int idpessoa, Endereco endereco, Cliente cliente, Usuario usuario, String nome, Long cpf, String email, boolean status, Date dataNascimento, List<NumeroContato> numeroContatos) {
        this.idpessoa = idpessoa;
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

    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
