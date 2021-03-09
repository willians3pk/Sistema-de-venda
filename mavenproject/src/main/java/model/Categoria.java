

package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Cod_Categoria", unique = true, nullable = false)
    private Integer id;
    private String tipo_Categoria;

    public Categoria() {
    }

    public Categoria(Integer id, String tipo_Categoria) {
        this.id = id;
        this.tipo_Categoria = tipo_Categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo_Categoria() {
        return tipo_Categoria;
    }

    public void setTipo_Categoria(String tipo_Categoria) {
        this.tipo_Categoria = tipo_Categoria;
    }
    
    
    
}
