package com.udea.model;

import java.sql.Date;

public class Transferencia{

    private int id;
    private Double cantidad;
    private Date fecha;
    private String tipoTransferencia;
    private Usuario usuario;
    private Cuenta cuenta;

    public Transferencia() {
    }

    public Transferencia(Double cantidad, Date fecha, int id, String tipoTransferencia, Usuario usuario, Cuenta cuenta) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.id = id;
        this.tipoTransferencia = tipoTransferencia;
        this.usuario = usuario;
        this.cuenta = cuenta;
    }

    public Transferencia(Double cantidad, Date fecha, String tipoTransferencia, Usuario usuario, Cuenta cuenta) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.tipoTransferencia = tipoTransferencia;
        this.usuario = usuario;
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
