/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


// Se importa el package DAO
import DAO.DAO_login;
import Datos.datos;
import Encriptamiento.Security;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * Clase que controla el Login
 * @author JohanCoderDev
 * version: 1.0
 */
public class ControladorLogin implements DAO_login{
    
    Security encriptar = new Security();
    // Variable utilizada para aplicar el patron singleton
    private static ControladorLogin controladorLogin;
    
    // Variable que guarda el nombre del usuario
    private String usuario;
    
    // Variable que guarda la contraseña del usuario
    private String contrasenia;
    
    // Constructor de la clase ControladorLogin
    private ControladorLogin(){
    }
        
    /**
     * Metodo que devuelve una unica instancia de la clase ControladorLogin
     * Si esta no existe creara una nueva
     * @return controladorLogin
     */
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin == null){
            controladorLogin = new ControladorLogin();
        }
        return controladorLogin;
    }
    
    /**
     * Metodo que verifica si el usuario y contraseña son correctos
     * @param usuario nombre del usuario
     * @param contrasenia contraseña del usuario
     * @return true si el usuario y contraseña son correctos de lo contrario true (estado)
     */
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia){
        boolean estado = false;
        
        String usuarioCorrecto = "johan";
        String contraseniaCorrecta = "1234";
        String datosCorrectos = null;
        try {
            datosCorrectos = encriptar.encriptar(usuarioCorrecto, contraseniaCorrecta);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if((usuario.equals(datosCorrectos))&&(contrasenia.equals(contraseniaCorrecta))) {
           estado = true;
        }
        return estado;
    }

    /**
     * Metodo que devuelve el nombre del usuario
     * @return usuario
     */
    @Override
    public String getUsuario() {
        return this.usuario;
    }

    /**
     * Metodo que cambia la contraseña del usuario
     * @param NuevaContrasenia nueva contraseña del usuario
     * @return la nueva contraseña (estado)
     */
    @Override
    public boolean CambiarContrasenia(String NuevaContrasenia) {
        
        boolean estado = true;
        contrasenia = NuevaContrasenia;
        return estado;  
    }
}
