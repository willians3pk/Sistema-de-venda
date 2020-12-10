package br.com.classes;

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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Fornecedor", unique = true, nullable = false)
    private int idFornecedor;
    
    @OneToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST,CascadeType.SAVE_UPDATE})
//    @JoinColumn(name = "FK")
    private Endereco endereco;
    
//    @Column(name = "Nome", length = 65)
    private String nome;
    
//    @Column(name = "CNPJ")
    private Long cnpj;
    
//    @Column(name = "CPF")
    private Long cpf;
    
//    @Column(name = "E-mail", length = 45)
    private String email;
    
//    @Column(name = "Home-page", length = 45)
    private String homePage;
    
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST,CascadeType.SAVE_UPDATE})
    private List<Produto> list_Produto;
    
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST,CascadeType.SAVE_UPDATE})
    private List<NumeroContato> contatos;

    public Fornecedor() {
    }

    public Fornecedor(int idFornecedor, Endereco endereco, String nome, Long cnpj, Long cpf, String email, String homePage, List<Produto> list_Produto, List<NumeroContato> contatos) {
        this.idFornecedor = idFornecedor;
        this.endereco = endereco;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.email = email;
        this.homePage = homePage;
        this.list_Produto = list_Produto;
        this.contatos = contatos;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
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

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
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

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public List<Produto> getList_Produto() {
        return list_Produto;
    }

    public void setList_Produto(List<Produto> list_Produto) {
        this.list_Produto = list_Produto;
    }

    public List<NumeroContato> getContatos() {
        return contatos;
    }

    public void setContatos(List<NumeroContato> contatos) {
        this.contatos = contatos;
    }

}
