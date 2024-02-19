/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.MODELO;

import java.sql.Timestamp;

/**
 *
 * @author jefe
 */
public class Reunion {
    
     private int idReunion;
    private int idResolucion;
    private Timestamp fechaHora; 
    private String tipoOrdinariaExtraordinaria;
    private String observaciones;

    
    public Reunion(int idResolucion, Timestamp fechaHora, String tipoOrdinariaExtraordinaria, String observaciones) {
        this.idResolucion = idResolucion;
        this.fechaHora = fechaHora;
        this.tipoOrdinariaExtraordinaria = tipoOrdinariaExtraordinaria;
        this.observaciones = observaciones;
    }

 
    public int getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(int idReunion) {
        this.idReunion = idReunion;
    }

    public int getIdResolucion() {
        return idResolucion;
    }

    public void setIdResolucion(int idResolucion) {
        this.idResolucion = idResolucion;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getTipoOrdinariaExtraordinaria() {
        return tipoOrdinariaExtraordinaria;
    }

    public void setTipoOrdinariaExtraordinaria(String tipoOrdinariaExtraordinaria) {
        this.tipoOrdinariaExtraordinaria = tipoOrdinariaExtraordinaria;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
