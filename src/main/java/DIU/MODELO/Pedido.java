/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.MODELO;

import java.sql.Date;

/**
 *
 * @author jefe
 */
public class Pedido {
     private String nroPedido;
    private int cedulaPersona;
    private String asunto;
    private Date fechaIngresoOficio;
    private String archivoPdf;

    public String getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(String nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(int cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Date getFechaIngresoOficio() {
        return fechaIngresoOficio;
    }

    public void setFechaIngresoOficio(Date fechaIngresoOficio) {
        this.fechaIngresoOficio = fechaIngresoOficio;
    }

    public String getArchivoPdf() {
        return archivoPdf;
    }

    public void setArchivoPdf(String archivoPdf) {
        this.archivoPdf = archivoPdf;
    }

    public Pedido(String nroPedido, int cedulaPersona, String asunto, Date fechaIngresoOficio, String archivoPdf) {
        this.nroPedido = nroPedido;
        this.cedulaPersona = cedulaPersona;
        this.asunto = asunto;
        this.fechaIngresoOficio = fechaIngresoOficio;
        this.archivoPdf = archivoPdf;
    }
    
    
}
