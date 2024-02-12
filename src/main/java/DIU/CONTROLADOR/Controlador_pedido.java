/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jefe
 */
public class Controlador_pedido {
    
     ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;

    public Controlador_pedido() {
    }
    
    public void insertarPedido(String nroPedido, int cedulaPersona, String asunto, Date fechaIngresoOficio, String archivoPdf) {
     try {
        // Check if the person has a valid ID_ACTOR
        if (personaHasValidActor(cedulaPersona)) {
            JOptionPane.showMessageDialog(null, "La persona tiene un ID_ACTOR válido. No puede realizar el oficio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            // Llamar al procedimiento almacenado para insertar un pedido
            String sql = "{CALL sp_insertar_pedido(?, ?, ?, ?, ?)}";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ejecutar.setString(1, nroPedido);
            ejecutar.setInt(2, cedulaPersona);
            ejecutar.setString(3, asunto);
            ejecutar.setDate(4, fechaIngresoOficio);
            ejecutar.setString(5, archivoPdf);

            // Ejecutar el procedimiento almacenado
            var resultado = ejecutar.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Pedido insertado correctamente");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Pedido insertado correctamente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar el pedido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }



    public ArrayList<Object[]> obtenerDatosPedidos() {
        ArrayList<Object[]> listaPedidos = new ArrayList<>();

        try {
            // Llamar al procedimiento almacenado para obtener datos de pedidos
            String sql = "{CALL sp_obtener_datos_pedidos()}";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ResultSet resultado = ejecutar.executeQuery();

            // Procesar los resultados y agregarlos a la lista
            while (resultado.next()) {
                Object[] datosPedido = new Object[6]; // Ajusta según la cantidad de columnas
                datosPedido[0] = resultado.getString("NRO_PEDIDO");
                datosPedido[1] = resultado.getInt("CEDULA_PERSONA");
                datosPedido[2] = resultado.getString("ASUNTO");
                datosPedido[3] = resultado.getDate("FECHAINGRESO_OFICIO");
                datosPedido[4] = resultado.getString("ARCHIVOPDF");

                listaPedidos.add(datosPedido);
            }

            ejecutar.close();
        } catch (SQLException e) {
            // Manejar la excepción según tus necesidades
            e.printStackTrace();
        }

        return listaPedidos;
    }
public ArrayList<Object[]> buscarPedidoPorNumero(String numeroPedido) {
    ArrayList<Object[]> listaPedidos = new ArrayList<>();

    try {
        // Llamar al procedimiento almacenado para buscar un pedido por número de pedido
        String sql = "{CALL sp_BuscarPedidoPorNumero(?)}";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ejecutar.setString(1, numeroPedido);
        ResultSet resultado = ejecutar.executeQuery();

        // Procesar los resultados y agregarlos a la lista
        while (resultado.next()) {
            Object[] datosPedido = new Object[5]; // Ajusta según la cantidad de columnas
            datosPedido[0] = resultado.getString("NRO_PEDIDO");
            datosPedido[1] = resultado.getInt("CEDULA_PERSONA");
            datosPedido[2] = resultado.getString("ASUNTO");
            datosPedido[3] = resultado.getDate("FECHAINGRESO_OFICIO");
            datosPedido[4] = resultado.getString("ARCHIVOPDF");

            listaPedidos.add(datosPedido);
        }

        ejecutar.close();
    } catch (SQLException e) {
        // Manejar la excepción según tus necesidades
        e.printStackTrace();
    }

    return listaPedidos;
}

public String obtenerArchivoPedido(String numeroPedido) {
    try {
        String sql = "SELECT ARCHIVOPDF FROM PEDIDO WHERE NRO_PEDIDO = ?";
        try (PreparedStatement statement = conectado.prepareStatement(sql)) {
            statement.setString(1, numeroPedido);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("ARCHIVOPDF");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;
}

public void eliminarPedido(String numeroPedido) {
    try {
        // Obtener la ruta del archivo asociado al pedido
        String rutaArchivo = obtenerArchivoPedido(numeroPedido);

        if (rutaArchivo != null && !rutaArchivo.isEmpty()) {
            // Crear el objeto File con la ruta del archivo
            File file = new File(rutaArchivo);

            // Verificar si el archivo existe y eliminarlo
            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("Archivo eliminado correctamente.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                }
            } else {
                System.out.println("El archivo no existe.");
            }
        }

        // Llamar al procedimiento almacenado para eliminar el pedido de la base de datos
        String sql = "{CALL sp_EliminarPedido(?)}";
        try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
            ejecutar.setString(1, numeroPedido);
            ejecutar.executeUpdate();
            System.out.println("Pedido eliminado correctamente.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

private boolean personaHasValidActor(int cedulaPersona) {
    try {
        String sql = "SELECT ID_ACTOR FROM PERSONA WHERE CEDULA_PERSONA = ?";
        try (PreparedStatement statement = conectado.prepareStatement(sql)) {
            statement.setInt(1, cedulaPersona);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next() && resultSet.getInt("ID_ACTOR") != 0;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
}
}
