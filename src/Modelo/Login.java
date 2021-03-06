package Modelo;
// Generated 12/10/2017 08:19:22 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer idlogin;
     private Usuario usuario;
     private Date fechaEnt;
     private Date fechaSal;
     private BigDecimal dineroEnt;
     private BigDecimal dineroSal;
     private Set ventas = new HashSet(0);

    public Login() {
    }

	
    public Login(Usuario usuario, Date fechaEnt, Date fechaSal) {
        this.usuario = usuario;
        this.fechaEnt = fechaEnt;
        this.fechaSal = fechaSal;
    }
    public Login(Usuario usuario, Date fechaEnt, Date fechaSal, BigDecimal dineroEnt, BigDecimal dineroSal, Set ventas) {
       this.usuario = usuario;
       this.fechaEnt = fechaEnt;
       this.fechaSal = fechaSal;
       this.dineroEnt = dineroEnt;
       this.dineroSal = dineroSal;
       this.ventas = ventas;
    }
   
    public Integer getIdlogin() {
        return this.idlogin;
    }
    
    public void setIdlogin(Integer idlogin) {
        this.idlogin = idlogin;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaEnt() {
        return this.fechaEnt;
    }
    
    public void setFechaEnt(Date fechaEnt) {
        this.fechaEnt = fechaEnt;
    }
    public Date getFechaSal() {
        return this.fechaSal;
    }
    
    public void setFechaSal(Date fechaSal) {
        this.fechaSal = fechaSal;
    }
    public BigDecimal getDineroEnt() {
        return this.dineroEnt;
    }
    
    public void setDineroEnt(BigDecimal dineroEnt) {
        this.dineroEnt = dineroEnt;
    }
    public BigDecimal getDineroSal() {
        return this.dineroSal;
    }
    
    public void setDineroSal(BigDecimal dineroSal) {
        this.dineroSal = dineroSal;
    }
    public Set getVentas() {
        return this.ventas;
    }
    
    public void setVentas(Set ventas) {
        this.ventas = ventas;
    }




}


