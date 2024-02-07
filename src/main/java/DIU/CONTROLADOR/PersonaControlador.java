/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import DIU.MODELO.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jefe
 */
public class PersonaControlador {
 
  private Persona persona;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaControlador() {
    }

    public Persona getPersona() {
        return persona;
    }

  public void setPersona (Persona persona){
  this.persona=persona;
    }
  
public void insertarPersona(Persona p) {
    try {
        // Call the stored procedure to create a person
        String sql = "{CALL CrearPersona(?, ?, ?, ?, ?)}";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ejecutar.setString(1, p.getCedula());
        ejecutar.setString(2, p.getNombres());
        ejecutar.setString(3, p.getApellidos());
        ejecutar.setString(4, p.getTelefono());
        ejecutar.setString(5, p.getCorreo());
        
        // Execute the stored procedure
        var resultado = ejecutar.executeUpdate();
        
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Persona Creada con Éxito");
            ejecutar.close();
        } else {
            JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
        }
    } catch (SQLException e) {
       JOptionPane.showMessageDialog( null, "ERROR SQL");
    }
}

public ArrayList<Object[]> datosPersona() {
    ArrayList<Object[]> listaObject = new ArrayList<>();

    try {
        String sql = "CALL sp_listaPersonas();";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        resultado = ejecutar.executeQuery();
        int cont = 1;

        while (resultado.next()) {
            Object[] obpersona = new Object[6];
            obpersona[0] = cont;
            obpersona[1] = resultado.getObject("CEDULA_PERSONA");
            obpersona[2] = resultado.getObject("NOMBRES");
            obpersona[3] = resultado.getObject("APELLIDOS");
            obpersona[4] = resultado.getObject("TELEFONO");
            obpersona[5] = resultado.getObject("CORREO");
            listaObject.add(obpersona);
            cont++;
        }
        ejecutar.close();
        return listaObject;

    } catch (SQLException e) {
        System.out.println("ERROR SQL CARGA PERSONAS");
    }

    return null;
}

    public ArrayList<Object[]> buscarPersona(String cedula) {
    ArrayList<Object[]> listaObject = new ArrayList<>();
    try {
        String sql = "{CALL sp_BuscarPersonaPorCedula(?)}";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ejecutar.setString(1, cedula);
        resultado = ejecutar.executeQuery();

        int cont = 1;
        while (resultado.next()) {
            Object[] obpersona = new Object[6];
            obpersona[0] = cont;
            obpersona[1] = resultado.getObject("NOMBRES");
            obpersona[2] = resultado.getObject("APELLIDOS");
            obpersona[3] = resultado.getObject("TELEFONO");
            obpersona[4] = resultado.getObject("CORREO");

            listaObject.add(obpersona);
            cont++;
        }
        ejecutar.close();
        return listaObject;

    } catch (SQLException e) {
        System.out.println("ERROR SQL: " + e.getMessage());
        e.printStackTrace();
    }
    return null;
}
    
public void actualizarPersona(String cedula, String nuevosNombres, String nuevosApellidos, String nuevoTelefono, String nuevoCorreo) {
    try {
        String sql = "{CALL sp_ActualizarPersona(?, ?, ?, ?, ?)}";
        ejecutar = conectado.prepareCall(sql);

        ejecutar.setString(1, cedula);
        ejecutar.setString(2, nuevosNombres);
        ejecutar.setString(3, nuevosApellidos);
        ejecutar.setString(4, nuevoTelefono);
        ejecutar.setString(5, nuevoCorreo);
        ejecutar.executeUpdate();
        ejecutar.close();

        JOptionPane.showMessageDialog(null, "Persona actualizada con éxito.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se pudo actualizar la persona. Revise los datos ingresados.");
        System.out.println("Error SQL: " + e.getMessage());
    }
}

    public void eliminarPersona(String cedula) {
        try {
            String sql = "{CALL sp_EliminarPersona(?)}";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ejecutar.setString(1, cedula);

            // Ejecutar el stored procedure para eliminar la persona
            ejecutar.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Persona eliminada con éxito");

            ejecutar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la persona. Revise los datos ingresados.");
        }
    }



}