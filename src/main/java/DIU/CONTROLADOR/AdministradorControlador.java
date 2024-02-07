/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import DIU.MODELO.Administrador;
import DIU.MODELO.Administrador_IS;
import DIU.MODELO.Administrador_RC;
import java.sql.CallableStatement;
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
 private Administrador_IS admiIS;
  private Administrador_RC admiRC;

    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public Administrador_RC getAdmiRC() {
        return admiRC;
    }

    public void setAdmiRC(Administrador_RC admiRC) {
        this.admiRC = admiRC;
    }

    public AdministradorControlador(Administrador_RC admiRC) {
        this.admiRC = admiRC;
    }

    
    public AdministradorControlador(Administrador_IS admiIS) {
        this.admiIS = admiIS;
    }

    public Administrador_IS getAdmiIS() {
        return admiIS;
    }

    public void setAdmiIS(Administrador_IS admiIS) {
        this.admiIS = admiIS;
    }

    
    public AdministradorControlador(Administrador admi) {
        this.admi = admi;
    }

    public Administrador getAdmi() {
        return admi;
    }

    public void setAdmi(Administrador admi) {
        this.admi = admi;
    }



    public void insertarAdministrador(Administrador admin) {
        try {

            // Aquí deberías ajustar los parámetros del stored procedure según tus necesidades

            String sql = "call sp_CrearCuenta('" + admin.getCedulaPersona() + "','" + admin.getIdActor() + "','" +
                          admin.getNombres() + "','" + admin.getApellidos() + "','" + admin.getTelefono() + "','" +
                          admin.getCorreo() + "','" + admin.getUsuario() + "','" + admin.getContrasena() + "','" +
                          admin.getCarrera() + "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Cuenta de Administrador Creada con Éxito");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
    
      public boolean autenticar(String usuario, String contrasena) {
        try {
            String consulta = "SELECT * FROM PERSONA WHERE USUARIO = ? AND CONTRASENA = ?";
            PreparedStatement ejecutar = conectar.prepareStatement(consulta);
            ejecutar.setString(1, usuario);
            ejecutar.setString(2, contrasena);
            
            ResultSet res = ejecutar.executeQuery();
            
            // Si hay resultados, entonces el usuario y la contraseña son correctos
            return res.next();
        } catch (SQLException e) {
            System.err.println("Error al autenticar: " + e.getMessage());
            return false;
        }
    }
      public int recuperarContraseña(Administrador_RC admiRC) {
    try {

        // Ajusta los parámetros según tus necesidades

        String sql = "CALL sp_RecuperarContraseña('" + admiRC.getCedula() + "','" + admiRC.getCorreo() + "','" + admiRC.getNuevaContraseña() + "','" + admiRC.getConfirmarContraseña() + "')";
        CallableStatement call = conectar.prepareCall(sql);

        ResultSet result = call.executeQuery();
        if (result.next()) {
            return result.getInt("resultado");
        } else {

            return 0;

        

        }
    } catch (SQLException e) {
        System.out.println("ERROR SQL: " + e.getMessage());
        return -1;
    }
}

}
