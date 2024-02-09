/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.MODELO;

/**
 *
 * @author jefe
 */
public class Administrador {
  
    private String cedulaPersona;
    private String nombre_actor;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String usuario;
    private String contrasena;
    private String carrera;

    public String getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public String getNombre_actor() {
        return nombre_actor;
    }

    public void setNombre_actor(String nombre_actor) {
        this.nombre_actor = nombre_actor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Administrador(String cedulaPersona, String nombre_actor, String nombres, String apellidos, String telefono, String correo, String usuario, String contrasena, String carrera) {
        this.cedulaPersona = cedulaPersona;
        this.nombre_actor = nombre_actor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.carrera = carrera;
    }

    
    
}
