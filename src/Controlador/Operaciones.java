/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import Vista.*;

/**
 *
 * @author Daniel
 */
public class Operaciones {

    public static boolean Login(String username, String password) {
        Session sesion = HibernateUtil.getSessionFactory().openSession();

        Usuario usuario = (Usuario) sesion.createCriteria(Usuario.class)
                .add(Restrictions.eq("user", username)).uniqueResult();

        try {
            if (usuario != null) {

                if (usuario.getPass().equals(password)) {
                    int nivel = usuario.getNivel();
                    String lv;
                    if (nivel==2){
                    lv = "Vendedor";
                    }else{
                    lv = "Administrador";
                    }
                    ventanaVentas vnta = new ventanaVentas();
                    vnta.setTitle(lv);
                    vnta.setVisible(true);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error la contraseña ingresada "
                            + "no corresponde con el usuario", "", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe", "", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El usuario no existe", "", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return false;
        }
    }

}
