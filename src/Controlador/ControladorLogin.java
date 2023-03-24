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
    
    public String usuario;
    public String contrasenia;
    

    public ControladorLogin() {
        
        }
        
    
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia){
        boolean estado = false;
        
            if((usuario.equals("daniel"))&&(contrasenia.equals("1234"))) {
            estado = true;
        }
        
        return estado;
    }
    
   
    
    
}
