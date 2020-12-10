package br.com.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Cod_endereco", unique=true, nullable=false)
    private int idEndereco;
    
//    @Column(name="Rua", length=65)
    private String rua;
    
//    @Column(name="Cep")
    private int cep;
    
//    @Column(name="Bairro", length=65)
    private String bairro;
    
//    @Column(name="Numero_casa")
    private int numeroCasa;
    
//    @Column(name="Complemento", leng/th=100)
    private String complemento;
    
//    @Column(name="Estado_uf", length=65)
    private String estadoUf;
    
//    @Column(name="Cidade", length=65)
    private String cidade;
    
    @OneToOne(fetch = FetchType.EAGER)
    private Fornecedor fornecedors;
    
    @OneToOne(fetch = FetchType.EAGER)
    private Pessoa pessoas;

    public Endereco() {
    }

    public Endereco(int idEndereco, String rua, int cep, String bairro, int numeroCasa, String complemento, String estadoUf, String cidade, Fornecedor fornecedors, Pessoa pessoas) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.cep = cep;
        this.bairro = bairro;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.estadoUf = estadoUf;
        this.cidade = cidade;
        this.fornecedors = fornecedors;
        this.pessoas = pessoas;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstadoUf() {
        return estadoUf;
    }

    public void setEstadoUf(String estadoUf) {
        this.estadoUf = estadoUf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Fornecedor getFornecedors() {
        return fornecedors;
    }

    public void setFornecedors(Fornecedor fornecedors) {
        this.fornecedors = fornecedors;
    }

    public Pessoa getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa pessoas) {
        this.pessoas = pessoas;
    }

}
