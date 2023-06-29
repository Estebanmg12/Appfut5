package com.javajedi.servicio.salida.file;

import java.util.List;

import com.javajedi.dominios.Jugador;

public interface OutPutFileService {
    void exportJugadores(List<Jugador> jugadores, String rutaDeDestino);
}
