
package com.system.sitemadevendas;

import java.util.List;

public class Produto {

    private int Id_produto;
    private String nome;
    private String tipo_produto;
    private int quant_estoque;
    private double preco;
    private int codigo;
    private String descricao;
    private List<ItemVenda> item_venda;
    
    public Produto() {
    }

    public Produto(int Id_produto, String nome, int quant_estoque, int codigo) {
        this.Id_produto = Id_produto;
        this.nome = nome;
        this.quant_estoque = quant_estoque;
        this.codigo = codigo;
    }

    public int getId_produto() {
        return Id_produto;
    }

    public void setId_produto(int Id_produto) {
        this.Id_produto = Id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    public int getQuant_estoque() {
        return quant_estoque;
    }

    public void setQuant_estoque(int quant_estoque) {
        this.quant_estoque = quant_estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ItemVenda> getItem_venda() {
        return item_venda;
    }

    public void setItem_venda(List<ItemVenda> item_venda) {
        this.item_venda = item_venda;
    }
    
}
