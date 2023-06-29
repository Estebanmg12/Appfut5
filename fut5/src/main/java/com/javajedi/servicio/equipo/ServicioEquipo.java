package com.javajedi.servicio.equipo;

import com.javajedi.dominios.Equipo;

public interface ServicioEquipo {

    Equipo crearEquipo();
    void buscarEquipos();
    void buscarEquipo();
    void eliminarEquipo();
}
