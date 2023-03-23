/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorLogin;

/**
 *
 * @author sistemas
 */
public class Login extends javax.swing.JFrame {
    private static Login logins;
    

    /**
     * Creates new form Login
     */
    private Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static Login getLogin(){
        if(logins == null){
            logins = new Login();
        }
        return logins;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        olvido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        contrasenia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        olvido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        olvido.setText("¿Olvido su contraseña?");
        olvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                olvidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                olvidoMouseExited(evt);
            }
        });
        getContentPane().add(olvido, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo johan actualizado (1).png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 226, 210));

        jPanel1.add(jPanel3);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        usuario.setForeground(new java.awt.Color(204, 204, 204));
        usuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usuario.setText("Digite su usuario");
        usuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));
        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel2.add(usuario);

        contrasenia.setForeground(new java.awt.Color(204, 204, 204));
        contrasenia.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        contrasenia.setText("Digite su contraseña");
        contrasenia.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));
        contrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contraseniaFocusLost(evt);
            }
        });
        contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseniaMouseClicked(evt);
            }
        });
        contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseniaActionPerformed(evt);
            }
        });
        jPanel2.add(contrasenia);

        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ControladorLogin cLogin = new ControladorLogin(usuario.getText(), contrasenia.getText());
        
        
        boolean valor = ControladorLogin.VerificarUsuarios(cLogin.usuario, cLogin.contrasenia);
        if(valor == true){
            Bienvenida bueno = Bienvenida.bienvenida();
            bueno.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        // TODO add your handling code here:
       
        if(usuario.getText().equals("Digite su usuario")){
         usuario.setText("");
         usuario.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_usuarioMouseClicked

    private void contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseniaMouseClicked
        // TODO add your handling code here:
        if(contrasenia.getText().equals("Digite su contraseña")){
           contrasenia.setForeground(new java.awt.Color(0, 0, 0));
           contrasenia.setText(""); 
        }
    }//GEN-LAST:event_contraseniaMouseClicked

    private void olvidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseEntered
        // TODO add your handling code here:
        olvido.setForeground(new java.awt.Color(255, 51, 51));
    }//GEN-LAST:event_olvidoMouseEntered

    private void olvidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseExited
        // TODO add your handling code here:
        olvido.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_olvidoMouseExited

    private void contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseniaActionPerformed

    private void contraseniaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contraseniaFocusLost
        // TODO add your handling code here:
        if(contrasenia.getText().equals("")){
           contrasenia.setForeground(new java.awt.Color(204, 204, 204));
           contrasenia.setText("Digite su contraseña"); 
                }
        
    }//GEN-LAST:event_contraseniaFocusLost

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost
        // TODO add your handling code here:
        if(usuario.getText().equals("")){
           usuario.setForeground(new java.awt.Color(204, 204, 204));
           usuario.setText("Digite su usuario"); 
                }
    }//GEN-LAST:event_usuarioFocusLost

    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contrasenia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel olvido;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
