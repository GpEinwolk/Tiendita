package Modelo;
// Generated 12/10/2017 08:19:22 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idcliente;
     private String nombre;
     private String apM;
     private String apP;
     private String direccion;
     private String calle;
     private int noInt;
     private int noExt;
     private String colonia;
     private int cp;
     private String ciudad;
     private String estado;
     private String pais;
     private String rfc;
     private String correo;
     private Set ventas = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String nombre, String apM, String apP, String direccion, String calle, int noInt, int noExt, String colonia, int cp, String ciudad, String estado, String pais, String rfc, String correo) {
        this.nombre = nombre;
        this.apM = apM;
        this.apP = apP;
        this.direccion = direccion;
        this.calle = calle;
        this.noInt = noInt;
        this.noExt = noExt;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        this.rfc = rfc;
        this.correo = correo;
    }
    public Cliente(String nombre, String apM, String apP, String direccion, String calle, int noInt, int noExt, String colonia, int cp, String ciudad, String estado, String pais, String rfc, String correo, Set ventas) {
       this.nombre = nombre;
       this.apM = apM;
       this.apP = apP;
       this.direccion = direccion;
       this.calle = calle;
       this.noInt = noInt;
       this.noExt = noExt;
       this.colonia = colonia;
       this.cp = cp;
       this.ciudad = ciudad;
       this.estado = estado;
       this.pais = pais;
       this.rfc = rfc;
       this.correo = correo;
       this.ventas = ventas;
    }
   
    public Integer getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApM() {
        return this.apM;
    }
    
    public void setApM(String apM) {
        this.apM = apM;
    }
    public String getApP() {
        return this.apP;
    }
    
    public void setApP(String apP) {
        this.apP = apP;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNoInt() {
        return this.noInt;
    }
    
    public void setNoInt(int noInt) {
        this.noInt = noInt;
    }
    public int getNoExt() {
        return this.noExt;
    }
    
    public void setNoExt(int noExt) {
        this.noExt = noExt;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public int getCp() {
        return this.cp;
    }
    
    public void setCp(int cp) {
        this.cp = cp;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }




}

