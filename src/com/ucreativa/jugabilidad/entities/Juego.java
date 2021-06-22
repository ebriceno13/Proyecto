package com.ucreativa.jugabilidad.entities;

public class Juego {

    private String nombreJuego;
    private int precio;
    private String categoria;
    private boolean completado;

    public Juego(String nombreJuego, int precio,
                 String categoria, boolean completado) {

        this.nombreJuego = nombreJuego;
        this.precio = precio;
        this.categoria = categoria;
        this.completado = completado;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isCompletado() {
        return completado;
    }

    public String toString() {
        return this.getNombreJuego();
    }
}
