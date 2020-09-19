
package com.system.sitemadevendas;

import com.system.classe.Cliente;
import com.system.classe.Vendedor;
import java.util.Date;
import java.util.List;

public class Venda {
    
    private int     Id_venda;
    private String  valorVenda;
    private Date    data;
    private List<Vendedor> vendedor;
    private List<ItemVenda> item_venda;
    private Cliente cliente;
    
    public Venda() {
    }

    public int getId_venda() {
        return Id_venda;
    }

    public void setId_venda(int Id_venda) {
        this.Id_venda = Id_venda;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Vendedor> getVendedor() {
        return vendedor;
    }

    public void setVendedor(List<Vendedor> vendedor) {
        this.vendedor = vendedor;
    }

    public List<ItemVenda> getItem_venda() {
        return item_venda;
    }

    public void setItem_venda(List<ItemVenda> item_venda) {
        this.item_venda = item_venda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venda(int Id_venda, String valorVenda, Date data, List<Vendedor> vendedor, List<ItemVenda> item_venda, Cliente cliente) {
        this.Id_venda = Id_venda;
        this.valorVenda = valorVenda;
        this.data = data;
        this.vendedor = vendedor;
        this.item_venda = item_venda;
        this.cliente = cliente;
    }

    
}
