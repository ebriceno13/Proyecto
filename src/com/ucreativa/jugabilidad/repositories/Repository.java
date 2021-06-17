package com.ucreativa.jugabilidad.repositories;

import com.ucreativa.jugabilidad.entities.Persona;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface Repository {

    void save(Persona persona, String consola, Date fechaCompra) throws IOException;

    List<String> get();
}
