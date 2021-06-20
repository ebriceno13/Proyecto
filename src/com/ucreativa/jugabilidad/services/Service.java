package com.ucreativa.jugabilidad.services;

import com.ucreativa.jugabilidad.entities.Juego;
import com.ucreativa.jugabilidad.entities.Persona;
import com.ucreativa.jugabilidad.repositories.Repository;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Service {

    private Repository repository;

    public Service(Repository repository){
        this.repository = repository;
    }

    public void save(String nombre, String correo, String txtEdad,
                     String nombreJuego, int precio, String categoria,
                     boolean completado, String consola){

        int edad = Integer.parseInt(txtEdad);
        Persona persona;
        Juego juego;
        persona = new Persona(nombre, correo, edad);
        juego = new Juego(nombreJuego, precio, categoria, completado);

        try {
            this.repository.save(persona, juego);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> get(){
        return this.repository.get();
    }
}
