package Modelo;
// Generated 12/10/2017 08:19:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Garantia generated by hbm2java
 */
public class Garantia  implements java.io.Serializable {


     private Integer idgarantia;
     private String tipo;
     private Set productos = new HashSet(0);

    public Garantia() {
    }

    public Garantia(String tipo, Set productos) {
       this.tipo = tipo;
       this.productos = productos;
    }
   
    public Integer getIdgarantia() {
        return this.idgarantia;
    }
    
    public void setIdgarantia(Integer idgarantia) {
        this.idgarantia = idgarantia;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


