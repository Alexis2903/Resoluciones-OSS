/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import DIU.MODELO.Resolucion;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jefe
 */
public class Controlador_resoluciones {
    
    
    
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = conectar.conectar();
    CallableStatement ejecutar;

    public Controlador_resoluciones() {
    }

        public void registrarResolucion(String NRO_PEDIDO, Date fechaResolucion, String estadoAprobadoNoAprobado, String descargarPdfAprobado) {
        try {
            // Llamar al procedimiento almacenado para registrar una resolución
            String sql = "{CALL sp_RegistrarResolucion(?, ?, ?, ?)}";
            ejecutar = conectado.prepareCall(sql);
            ejecutar.setString(1, NRO_PEDIDO);
            ejecutar.setDate(2, fechaResolucion);
            ejecutar.setString(3, estadoAprobadoNoAprobado);
            ejecutar.setString(4, descargarPdfAprobado);

            // Ejecutar el procedimiento almacenado
            ejecutar.execute();
            System.out.println("Resolución registrada correctamente.");

            ejecutar.close();
        } catch (SQLException e) {
            // Manejar la excepción según tus necesidades
            e.printStackTrace();
        }
    }

     public ArrayList<Resolucion> obtenerResolucionesDesdeBaseDeDatos() {
        ArrayList<Resolucion> resoluciones = new ArrayList<>();

        try {
            // Reemplaza esto con la lógica para obtener datos de la base de datos
            String sql = "SELECT * FROM Resolucion";
            PreparedStatement preparedStatement = conectado.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // Obtener datos de la consulta
                String numeroPedido = resultSet.getString("NRO_PEDIDO");
                Date fechaResolucion = resultSet.getDate("FECHA_RESOLUCION");
                String estadoAprobadoNoAprobado = resultSet.getString("ESTADO_APROBADO_NO_APROBADO");
                String descargarPdfAprobado = resultSet.getString("DESCARGAR_PDF_APROBADO");

                // Crear instancia de Resolucion y agregar a la lista
                Resolucion resolucion = new Resolucion(numeroPedido, fechaResolucion, estadoAprobadoNoAprobado, descargarPdfAprobado);
                resoluciones.add(resolucion);
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            // Manejar la excepción según tus necesidades
            e.printStackTrace();
        }

        return resoluciones;
    }
     public ArrayList<Resolucion> obtenerResolucionesPorNumeroPedido(String numeroPedido) {
    ArrayList<Resolucion> resoluciones = new ArrayList<>();

    try {
        // Reemplaza esto con la lógica para obtener datos de la base de datos por número de pedido
        String sql = "CALL sp_BuscarPedidoPorNumeroPedido(?)";
        CallableStatement callableStatement = conectado.prepareCall(sql);
        callableStatement.setString(1, numeroPedido);
        ResultSet resultSet = callableStatement.executeQuery();

        while (resultSet.next()) {
            // Obtener datos de la consulta
            String numeroPedidoResultado = resultSet.getString("NRO_PEDIDO");
            String archivoPDFResultado = resultSet.getString("ARCHIVOPDF");

            // Crear instancia de Resolucion y agregar a la lista
            Resolucion resolucion = new Resolucion(numeroPedidoResultado, null, null, archivoPDFResultado);
            resoluciones.add(resolucion);
        }

        resultSet.close();
        callableStatement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return resoluciones;
}
}
     
    

    
    

