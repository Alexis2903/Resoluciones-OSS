/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */

public class ConexionBDD {
   java.sql.Connection conexion;
     public java.sql.Connection conectar(){
        //LANZAR CÓDIGO DE PRUEBA 
        try {
            //Manera de Conexión a la Base de Datos
            Class.forName("com.mysql.jdbc.Driver");

             conexion=DriverManager.getConnection("jdbc:mysql://localhost/registro_resoluciones_osss?autoReconnect=true&useSSL=false","root","12HOO120n..S");
            System.out.println("CONECTADO"); 
        } catch (ClassNotFoundException | SQLException e)//CAPTURAR ERRORES 
        {
             System.out.println("ERROR DE CONEXION A LA BASE DE DATOS");
        }
        return conexion;
    }
   
}

