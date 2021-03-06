package com.ucreativa.jugabilidad.repositories;

import com.ucreativa.jugabilidad.entities.Juego;
import com.ucreativa.jugabilidad.entities.Persona;

import java.io.IOException;
import java.util.List;

public interface Repository {

    void save(Persona persona, Juego juego) throws IOException;

    List<String> get();
}
