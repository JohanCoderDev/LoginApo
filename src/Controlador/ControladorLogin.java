/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;



import DAO.DAO_login;
/**
 *
 * @author sistemas
 */
public class ControladorLogin implements DAO_login{
    
    private static ControladorLogin controladorLogin;
    public String usuario;
    public String contrasenia;
    

    private ControladorLogin() {
        
        }
        
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin == null)
            controladorLogin = new ControladorLogin();
        
        return controladorLogin;
    }
    
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia){
        boolean estado = false;
        
            if((usuario.equals("daniel"))&&(contrasenia.equals("1234"))) {
            estado = true;
        }
        
        return estado;
    }

    @Override
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    public boolean CambiarContrasenia(String contrasenia) {
        
        boolean estado = true;
        this.contrasenia = contrasenia;
        return estado;
        
    }
    
   
    
    
}
