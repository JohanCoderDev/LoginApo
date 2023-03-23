/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author sistemas
 */
public class ControladorLogin {
    
    public String usuario;
    public String contrasenia;

    public ControladorLogin(String usuario, String contrasenia) {
        if(this.VerificarUsuarios(usuario, contrasenia)){
          this.usuario = usuario;
          this.contrasenia = contrasenia;  
        }
        
    }
    
    public static boolean VerificarUsuarios(String usuario, String contrasenia){
        boolean estado = false;
        
        if(usuario == null || contrasenia == null) {
        // Mostrar mensaje de error o devolver un valor nulo
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if((usuario.equals("daniel"))&&(contrasenia.equals("1234"))) {
                estado = true;
        }
        return estado;
    }
    
   
    
    
}
