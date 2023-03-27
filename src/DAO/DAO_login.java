/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 * Clase utilizada para la implementacion del patron DAO 
 * @author JohanCoderDev
 * Version: 1.0
 */
public interface DAO_login {
    
    /**
     * Verifica si el usuario y contraseña son validos
     * @param usuario Nombre del usuario
     * @param contrasenia Contraseña del usuario
     * @return 
     */
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    
    /**
     * Devuelve el nombre del usuario
     * @return 
     */
    public String getUsuario();
    
    /**
     * 
     * @param contrasenia
     * @return 
     */
    public boolean CambiarContrasenia(String contrasenia);
    
}
