/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import DIU.MODELO.Reunion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Controlador_Acta {

    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = conectar.conectar();
    CallableStatement ejecutar;

    public Controlador_Acta() {
    }

    public void insertarActaReunion(int idResolucion, String fechaHora, String tipoOrdinariaExtraordinaria, String observaciones) {
        try {

            String sql = "{CALL sp_InsertarActaReunion(?, ?, ?, ?)}";
            ejecutar = conectado.prepareCall(sql);


            ejecutar.setInt(1, idResolucion);
            ejecutar.setString(2, fechaHora);
            ejecutar.setString(3, tipoOrdinariaExtraordinaria);
            ejecutar.setString(4, observaciones);

            ejecutar.execute();

            JOptionPane.showMessageDialog( null, "Acta de reunión insertada correctamente");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al insertar el acta de reunión");
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
    
    
     public ArrayList<Reunion> obtenerResolucionesDesdeBaseDeDatos() {
        ArrayList<Reunion> reuniones= new ArrayList<>();

        try {

            String sql = "SELECT * FROM acta_de_reunion";
            PreparedStatement preparedStatement = conectado.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int idResolucion = resultSet.getInt("ID_RESOLUCION");
                Timestamp fechaHora = resultSet.getTimestamp("FECHAYHORA");
                String tipoOrdinariaExtraordinaria = resultSet.getString("TIPO_ORDINARIA_EXTRAORDINARIA");
                String observaciones = resultSet.getString("OBSERVACIONES");


                Reunion reunion = new Reunion(idResolucion, fechaHora, tipoOrdinariaExtraordinaria, observaciones);
                reuniones.add(reunion);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return reuniones;
    }

public ArrayList<ResolucionAprobada> obtenerResolucionesAprobadasDesdeBaseDeDatos() {
    ArrayList<ResolucionAprobada> resolucionesAprobadas = new ArrayList<>();

    try {

        String sql = "{CALL sp_VisualizarResolucionesAprobadas()}";
        ejecutar = conectado.prepareCall(sql);


        ResultSet resultSet = ejecutar.executeQuery();

        while (resultSet.next()) {

            int idResolucion = resultSet.getInt("ID_RESOLUCION");
            String archivoPdfAprobado = resultSet.getString("DESCARGAR_PDF_APROBADO");

            ResolucionAprobada resolucionAprobada = new ResolucionAprobada(idResolucion, archivoPdfAprobado);
            resolucionesAprobadas.add(resolucionAprobada);
        }
    } catch (SQLException e) {

        e.printStackTrace();
    } finally {
        // Cerrar recursos
        try {
            if (ejecutar != null) {
                ejecutar.close();
            }
            if (conectado != null) {
                conectado.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    return resolucionesAprobadas;
}


public class ResolucionAprobada {
    private int idResolucion;
    private String archivoPdfAprobado;

    public ResolucionAprobada(int idResolucion, String archivoPdfAprobado) {
        this.idResolucion = idResolucion;
        this.archivoPdfAprobado = archivoPdfAprobado;
    }

    public int getIdResolucion() {
            return idResolucion;
        }

        public void setIdResolucion(int idResolucion) {
            this.idResolucion = idResolucion;
        }

        public String getArchivoPdfAprobado() {
            return archivoPdfAprobado;
        }

        public void setArchivoPdfAprobado(String archivoPdfAprobado) {
            this.archivoPdfAprobado = archivoPdfAprobado;
        }
    }

}