/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.MODELO;

import java.sql.Date;


public class Resolucion {
    
    private int idResolucion;
    private String numeroPedido;
    private Date fechaResolucion;
    private String estadoAprobadoNoAprobado;
    private String descargarPdfAprobado;

  
      public Resolucion(String numeroPedido, Date fechaResolucion, String estadoAprobadoNoAprobado, String descargarPdfAprobado) {
        this.numeroPedido = numeroPedido;
        this.fechaResolucion = fechaResolucion;
        this.estadoAprobadoNoAprobado = estadoAprobadoNoAprobado;
        this.descargarPdfAprobado = descargarPdfAprobado;
    }
    
    public int getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(int idResolucion) {
        this.idResolucion = idResolucion;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getEstadoAprobadoNoAprobado() {
        return estadoAprobadoNoAprobado;
    }

    public void setEstadoAprobadoNoAprobado(String estadoAprobadoNoAprobado) {
        this.estadoAprobadoNoAprobado = estadoAprobadoNoAprobado;
    }

    public String getDescargarPdfAprobado() {
        return descargarPdfAprobado;
    }

    public void setDescargarPdfAprobado(String descargarPdfAprobado) {
        this.descargarPdfAprobado = descargarPdfAprobado;
    }

    
}
