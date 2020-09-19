
package com.system.sitemadevendas;

import java.util.List;


public class ItemVenda {
    
    private int Id_itemvenda;
    private String nome_item;
    private double valor_item;
    private int    quantidade_item;
    private Venda  venda;
    private List<Produto> produto;
    
    public ItemVenda() {
    }

    public ItemVenda(int Id_itemvenda, String nome_item, double valor_item) {
        this.Id_itemvenda = Id_itemvenda;
        this.nome_item = nome_item;
        this.valor_item = valor_item;
    }

    public int getId_itemvenda() {
        return Id_itemvenda;
    }

    public void setId_itemvenda(int Id_itemvenda) {
        this.Id_itemvenda = Id_itemvenda;
    }

    public String getNome_item() {
        return nome_item;
    }

    public void setNome_item(String nome_item) {
        this.nome_item = nome_item;
    }

    public double getValor_item() {
        return valor_item;
    }

    public void setValor_item(double valor_item) {
        this.valor_item = valor_item;
    }

    public int getQuantidade_item() {
        return quantidade_item;
    }

    public void setQuantidade_item(int quantidade_item) {
        this.quantidade_item = quantidade_item;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    
}
