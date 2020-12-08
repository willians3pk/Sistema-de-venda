
package br.com.classes;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name =  "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idcliente;
    private Date clienteDesde;
    private Long limiteCredito;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Venda> vendas;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Pessoa> pessoas;

    public Cliente() {
    }

    public Cliente(int idcliente, Date clienteDesde, Long limiteCredito, List<Venda> vendas, List<Pessoa> pessoas) {
        this.idcliente = idcliente;
        this.clienteDesde = clienteDesde;
        this.limiteCredito = limiteCredito;
        this.vendas = vendas;
        this.pessoas = pessoas;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public Date getClienteDesde() {
        return clienteDesde;
    }

    public void setClienteDesde(Date clienteDesde) {
        this.clienteDesde = clienteDesde;
    }

    public Long getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Long limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    
}
