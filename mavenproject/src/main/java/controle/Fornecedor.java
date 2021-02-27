package controle;

import conexao.Conexao;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Integer idFornecedor;
    private String nome;
    private Long cnpj;
    private Long cpf;
    private String email;
    private String homePage;
    private Date dataCadastro;
    private Long contato;
    
    @OneToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST, CascadeType.SAVE_UPDATE})
    private Endereco endereco;

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST, CascadeType.SAVE_UPDATE})
    private List<Produto> list_Produto;

//    @OneToMany(fetch = FetchType.EAGER)
//    @Cascade({CascadeType.PERSIST, CascadeType.SAVE_UPDATE})
//    private List<NumeroContato> contatos;

    public Fornecedor() {
        
    }

    public Fornecedor(Integer idFornecedor, String nome, Long cnpj, Long cpf, String email, String homePage, Date dataCadastro, Endereco endereco, List<Produto> list_Produto) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.email = email;
        this.homePage = homePage;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
        this.list_Produto = list_Produto;
    }   

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
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

    public Long getContato() {
        return contato;
    }

    public void setContato(Long contato) {
        this.contato = contato;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    // -----------------------------------------------
    
    public void adicionarProduto(Produto produto) {
        this.list_Produto.add(produto);
    }

    public void removeItem(Produto produto){
        this.getList_Produto().remove(produto);
    }
    
}
