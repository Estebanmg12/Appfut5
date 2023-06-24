package com.javajedi.servicio.menu.impl;

import com.javajedi.servicio.entrada.impl.InputService;
import com.javajedi.servicio.equipo.Impl.ServicioEquipoImpl;
import com.javajedi.servicio.jugador.impl.ServicioJugadorImpl;
import com.javajedi.servicio.menu.Menu;

public class MenuImpl implements Menu {
    
    @Override
    public void crearEquipoYJugadores() {
        ServicioEquipoImpl nuevoEquipo = new ServicioEquipoImpl();
        ServicioJugadorImpl jugadorNuevo = new ServicioJugadorImpl();
        String capturaCrearMasEquipos;

        nuevoEquipo.crearEquipo();
        System.out.println("Desea cargar mas equipos? Ingrese: si o no ");
        capturaCrearMasEquipos = InputService.scanner.nextLine();

        while(capturaCrearMasEquipos.equals("si")){
            nuevoEquipo.crearEquipo();
            break;
        };
        System.out.println("estoy");
        nuevoEquipo.buscarEquipo();
        jugadorNuevo.buscarJugador();
        
        

        
    }
    
}
