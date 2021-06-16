package com.ucreativa.jugabilidad.entities;

import java.util.Date;

public class BitacoraJuegos {

    private Persona perdona;
    private String consola;
    private Date fechaCompra;

    public BitacoraJuegos(Persona perdona, String consola, Date fechaCompra) {
        this.perdona = perdona;
        this.consola = consola;
        this.fechaCompra = fechaCompra;
    }

    public Persona getPerdona() {
        return perdona;
    }

    public String getConsola() {
        return consola;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }
}
