package com.ucreativa.jugabilidad.entities;

import java.util.Date;

public class BitacoraJuegos {

    private Persona persona;
    private String consola;
    private Date fechaCompra;

    public BitacoraJuegos(Persona persona, String consola, Date fechaCompra) {
        this.persona = persona;
        this.consola = consola;
        this.fechaCompra = fechaCompra;
    }

    public Persona getPerdona() {
        return persona;
    }

    public String getConsola() {
        return consola;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }
}
