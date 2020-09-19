
package com.system.classe;

import com.system.sitemadevendas.Venda;
import java.util.List;

public class Cliente extends Pessoa{

    private int Id_cliente;
    private List<Venda> compra;
    
    public Cliente() {
    }

    public Cliente(int Id_cliente, List<Venda> compra) {
        this.Id_cliente = Id_cliente;
        this.compra = compra;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public List<Venda> getCompra() {
        return compra;
    }

    public void setCompra(List<Venda> compra) {
        this.compra = compra;
    }
    
}
