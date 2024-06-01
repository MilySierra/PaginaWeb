package com.udea.model;
import java.io.Serializable;

public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String usuario;
    private String contrasena;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(int id, String usuario, String contrasena) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Usuario(int id, String contrasena) {
        this.id = id;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
