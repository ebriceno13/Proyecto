package com.ucreativa.jugabilidad.entities;

public class Persona {

    private String nombre;
    private String correo;
    private int edad;

    public Persona(String nombre,
                   String correo,
                   int edad){

        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad + 1;
    }

    public String toString() {
        return this.getNombre();
    }
}
