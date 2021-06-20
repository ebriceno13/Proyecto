package com.ucreativa.jugabilidad.entities;

import com.ucreativa.jugabilidad.repositories.FileRepository;

import java.util.Date;

public class BitacoraJuegos {

    private Persona persona;
    private Juego juego;

    public BitacoraJuegos(FileRepository repository) {
        this.persona = persona;
        this.juego = juego;
    }



    public Persona getPersona() {
        return persona;
    }

    public Juego getJuego(){
        return juego;
    }
}
