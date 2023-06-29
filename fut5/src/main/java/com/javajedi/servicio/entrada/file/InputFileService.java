package com.javajedi.servicio.entrada.file;

import java.util.List;

import com.javajedi.dominios.Jugador;

public interface InputFileService {
    List<Jugador> cargarJugadorPorArchivo(String rutaArchivo);
}
