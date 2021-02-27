package controle;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa{
    
    private Date clienteDesde;
    private Long limiteCredito;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Venda> vendas;
        
    public Cliente() {
    }

    public Cliente(Date clienteDesde, Long limiteCredito, List<Venda> vendas) {
        this.clienteDesde = clienteDesde;
        this.limiteCredito = limiteCredito;
        this.vendas = vendas;
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

    // -------------------------------------
    
    public void removerVenda(Venda venda){
        this.getVendas().remove(venda);
    }
    
    
}
