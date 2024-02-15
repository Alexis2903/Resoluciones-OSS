/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIU;

import DIU.CONTROLADOR.AdministradorControlador;
import DIU.MODELO.Administrador_IS;
import DIU.VISTA.CrearInicio;
import DIU.VISTA.Recuperar_contraseña;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jefe
 */
public class MENU_INICIODESESION extends javax.swing.JFrame {

    /**
     * Creates new form MENU_ACTOR_MIEMBRO_OSS
     */
    public MENU_INICIODESESION() {
        initComponents();

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/FONDOIST.JPG"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        bttnIS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bttnCreacionCuenta = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        bttnRecuperar = new javax.swing.JButton();
        jlabelFondo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        bttnIS.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bttnIS.setForeground(new java.awt.Color(0, 0, 204));
        bttnIS.setText("Iniciar Sesión");
        bttnIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnISActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Inicio de Sesión");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese su Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese su Contraseña:");

        bttnCreacionCuenta.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bttnCreacionCuenta.setForeground(new java.awt.Color(0, 51, 204));
        bttnCreacionCuenta.setText("Crear Cuenta");
        bttnCreacionCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCreacionCuentaActionPerformed(evt);
            }
        });

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        bttnRecuperar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        bttnRecuperar.setForeground(new java.awt.Color(0, 0, 255));
        bttnRecuperar.setText("Recuperar Contraseña");
        bttnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRecuperarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS1.png"))); // NOI18N

        escritorio.setLayer(bttnIS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(bttnCreacionCuenta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(txtContraseña, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(bttnRecuperar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jlabelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(bttnIS)
                        .addGap(32, 32, 32)
                        .addComponent(bttnRecuperar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(bttnCreacionCuenta))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(78, 78, 78)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(53, 53, 53)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addComponent(jlabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(jLabel1))
                                .addGroup(escritorioLayout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(jLabel7))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnIS)
                    .addComponent(bttnRecuperar)
                    .addComponent(bttnCreacionCuenta))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnCreacionCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCreacionCuentaActionPerformed
        // TODO add your handling code here:
   CrearInicio CI= new CrearInicio();
   escritorio.add(CI);
   CI.show();
    }//GEN-LAST:event_bttnCreacionCuentaActionPerformed

    private void bttnISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnISActionPerformed
        // TODO add your handling code here:
    String usuario = txtUsuario.getText();
    String clave = new String(txtContraseña.getPassword());

    Administrador_IS admi = new Administrador_IS(usuario, clave);
    AdministradorControlador controlador = new AdministradorControlador(admi);
    int rol = controlador.obtenerRol(usuario); // Necesitas implementar este método para obtener el rol del usuario

    switch (rol) {
        case 1: 
            JOptionPane.showMessageDialog(null, "Usted inició sesión como GESTOR");
            this.setVisible(false);
            
            MENU_ACTOR_Gestor menuGestor = new MENU_ACTOR_Gestor();
            menuGestor.setVisible(true);
            break;
        case 2: 
             JOptionPane.showMessageDialog(null, "Usted inició sesión como DOCENTE");
            this.setVisible(false);
            
            MENU_ACTOR_Docente menudocente = new MENU_ACTOR_Docente();
            menudocente.setVisible(true);
            break;
        case 3:
             JOptionPane.showMessageDialog(null, "Usted inició sesión como COORDINADOR");
            this.setVisible(false);
            
            MENU_ACTOR_Coordinador menudocoordinador = new MENU_ACTOR_Coordinador();
            menudocoordinador.setVisible(true);
            break;
        case 4: 
             JOptionPane.showMessageDialog(null, "Usted inició sesión como MIEMBRO OSS");
            this.setVisible(false);
            
            MENU_ACTOR_MiembroOSS menudomiembro = new MENU_ACTOR_MiembroOSS();
            menudomiembro.setVisible(true);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
            break;
    
    }//GEN-LAST:event_bttnISActionPerformed
}
    
    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void bttnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRecuperarActionPerformed
        // TODO add your handling code here:
    Recuperar_contraseña addrec = new Recuperar_contraseña();
    escritorio.add(addrec);
    addrec.setVisible(true);
    }//GEN-LAST:event_bttnRecuperarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENU_INICIODESESION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_INICIODESESION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_INICIODESESION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_INICIODESESION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_INICIODESESION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCreacionCuenta;
    private javax.swing.JButton bttnIS;
    private javax.swing.JButton bttnRecuperar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlabelFondo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}

