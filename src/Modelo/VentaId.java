package Modelo;
// Generated 12/10/2017 08:19:22 PM by Hibernate Tools 4.3.1



/**
 * VentaId generated by hbm2java
 */
public class VentaId  implements java.io.Serializable {


     private int clienteIdcliente;
     private int productoIdproducto;

    public VentaId() {
    }

    public VentaId(int clienteIdcliente, int productoIdproducto) {
       this.clienteIdcliente = clienteIdcliente;
       this.productoIdproducto = productoIdproducto;
    }
   
    public int getClienteIdcliente() {
        return this.clienteIdcliente;
    }
    
    public void setClienteIdcliente(int clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }
    public int getProductoIdproducto() {
        return this.productoIdproducto;
    }
    
    public void setProductoIdproducto(int productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VentaId) ) return false;
		 VentaId castOther = ( VentaId ) other; 
         
		 return (this.getClienteIdcliente()==castOther.getClienteIdcliente())
 && (this.getProductoIdproducto()==castOther.getProductoIdproducto());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getClienteIdcliente();
         result = 37 * result + this.getProductoIdproducto();
         return result;
   }   


}


