/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            JOptionPane.showMessageDialog(null, "No se pudo insertar el pedido. Verifique los datos.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al insertar el pedido: " + e.getMessage());
    }
}



}
