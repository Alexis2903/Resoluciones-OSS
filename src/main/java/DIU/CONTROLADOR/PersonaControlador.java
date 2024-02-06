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
  
  public void crearPersona(Persona p) {
    try {
        String SQL = "CALL CrearPersona(?, ?, ?, ?)";
        ejecutar = conectado.prepareStatement(SQL);
        ejecutar.setString(1, p.getNombres());
        ejecutar.setString(2, p.getApellidos());
        ejecutar.setString(3, p.getTelefono());
        ejecutar.setString(4, p.getCorreo());

        int res = ejecutar.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "PERSONA CREADA CON ÉXITO");
        } else {
            JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR");
    } finally {
        try {
            if (ejecutar != null) {
                ejecutar.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

 public ArrayList<Object[]> datosPersona() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        
        try {
            String sql = "call ListarPersonas();";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] obpersona = new Object[5];
                for (int i = 1; i < 5; i++) {
                    obpersona[i] = resultado.getObject(i+1);
                }
                obpersona[0]=cont;
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
}