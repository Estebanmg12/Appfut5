package com.javajedi.servicio.jugador;

import com.javajedi.dominios.Jugador;
import com.javajedi.servicio.equipo.Impl.ServicioEquipoImpl;

public interface ServicioJugador {
    void buscarJugador(ServicioEquipoImpl servicioEquipo);
    Jugador crearJugador(ServicioEquipoImpl servicioEquipo);
}
