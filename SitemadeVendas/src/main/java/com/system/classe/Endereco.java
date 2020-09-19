
package com.system.classe;

public class Endereco {
    
    private int Id_endereco;
    private int cep;
    private String rua;
    private String bairro;
    private int    numero_casa;

    public Endereco() {
    }

    public Endereco(int Id_endereco, String rua, String bairro, int numero_casa) {
        this.Id_endereco = Id_endereco;
        this.rua = rua;
        this.bairro = bairro;
        this.numero_casa = numero_casa;
    }

    public int getId_endereco() {
        return Id_endereco;
    }

    public void setId_endereco(int Id_endereco) {
        this.Id_endereco = Id_endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }
    
       
    
}
