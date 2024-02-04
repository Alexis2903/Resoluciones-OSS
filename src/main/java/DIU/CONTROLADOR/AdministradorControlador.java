/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import DIU.MODELO.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jefe
 */
public class AdministradorControlador {

    private Administrador admi;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;
    
    public boolean InicioDeSecion(String usuario, String contrasena) {
        try {
            String consulta = "SELECT * FROM PERSONA WHERE USUARIO = ? AND CONTRASENA = ?";
            PreparedStatement ejecutar = conectar.prepareStatement(consulta);
            ejecutar.setString(1, usuario);
            ejecutar.setString(2, contrasena);
            
            ResultSet res = ejecutar.executeQuery();
            
            // Si hay resultados, entonces el usuario y la contraseña son correctos
            return res.next();
        } catch (SQLException e) {
         JOptionPane.showMessageDialog( null, "INICIO DE SECION EXITOSA");
            return false;
        }
}
}
