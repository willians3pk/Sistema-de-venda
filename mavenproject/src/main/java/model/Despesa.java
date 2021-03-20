/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "despesa")
public class Despesa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Despesa", unique = true, nullable = false)
    private Integer id;
    private Date   data;
    private double saidaDespesas;
    private String tipo;    
    private String descricaoDespesa;

    public Despesa() {
    }

    public Despesa(Integer id, Date data, double saidaDespesas, String tipo, String descricaoDespesa) {
        this.id = id;
        this.data = data;
        this.saidaDespesas = saidaDespesas;
        this.tipo = tipo;
        this.descricaoDespesa = descricaoDespesa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSaidaDespesas() {
        return saidaDespesas;
    }

    public void setSaidaDespesas(double saidaDespesas) {
        this.saidaDespesas = saidaDespesas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricaoDespesa() {
        return descricaoDespesa;
    }

    public void setDescricaoDespesa(String descricaoDespesa) {
        this.descricaoDespesa = descricaoDespesa;
    }
    
    
}
