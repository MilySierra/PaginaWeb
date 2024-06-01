package com.udea.model;
public class Cuenta {

    private int id;
    private String tipoCuenta;
    private String estado;
    private int numeroCuenta;
    private double saldo;
    private Usuario usuario;

    public Cuenta() {
    }

    public Cuenta(String estado, int id, int numeroCuenta, double saldo, String tipoCuenta, Usuario usuario) {
        this.estado = estado;
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.usuario = usuario;
    }

    public Cuenta(String estado, int id, double saldo, String tipoCuenta, Usuario usuario) {
        this.estado = estado;
        this.id = id;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.usuario = usuario;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String gettipoCuenta() {
        return tipoCuenta;
    }

    public void settipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getestado() {
        return estado;
    }

    public void setestado(String estado) {
        this.estado = estado;
    }

    public int getnumeroCuenta() {
        return numeroCuenta;
    }

    public void setnumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Usuario getusuario() {
        return usuario;
    }

    public void setusuario(Usuario usuario2) {
        this.usuario = usuario2;
    }

}
