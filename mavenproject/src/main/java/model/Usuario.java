package model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Pessoa", unique = true, nullable = false)
    private Integer id;
    private Date dataEmissao;
    private Date dataDemissao;
    private int previlegios;
    private String login;
    private String senha;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Venda> vendas;
    
    public Usuario() {
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public int getPrevilegios() {
        return previlegios;
    }

    public void setPrevilegios(int previlegios) {
        this.previlegios = previlegios;
    }

    public List<Venda> getVenda() {
        return vendas;
    }

    public void setVenda(List<Venda> venda) {
        this.vendas = venda;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
