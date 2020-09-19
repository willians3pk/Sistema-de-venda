
package com.system.classe;

import com.system.sitemadevendas.Venda;
import java.util.List;

public class Vendedor extends Pessoa{
    
    private int Id_vendedor;
    private double comissao;
    private double desconto_vendedor;
    private List<Venda>   venda;

    public Vendedor() {
    }

    public Vendedor(int Id_vendedor, double comissao) {
        this.Id_vendedor = Id_vendedor;
        this.comissao = comissao;
    }

    public int getId_vendedor() {
        return Id_vendedor;
    }

    public void setId_vendedor(int Id_vendedor) {
        this.Id_vendedor = Id_vendedor;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getDesconto_vendedor() {
        return desconto_vendedor;
    }

    public void setDesconto_vendedor(double desconto_vendedor) {
        this.desconto_vendedor = desconto_vendedor;
    }

    public List<Venda> getVenda() {
        return venda;
    }

    public void setVenda(List<Venda> venda) {
        this.venda = venda;
    }
    
}
