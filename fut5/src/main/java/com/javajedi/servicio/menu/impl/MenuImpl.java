package com.javajedi.servicio.menu.impl;

import com.javajedi.servicio.entrada.impl.InputService;
import com.javajedi.servicio.entrenador.impl.ServicioEntrenadorImpl;
import com.javajedi.servicio.equipo.Impl.ServicioEquipoImpl;
import com.javajedi.servicio.jugador.impl.ServicioJugadorImpl;
import com.javajedi.servicio.menu.Menu;

public class MenuImpl implements Menu {
    
    @Override
    public void crearEquipoYJugadores() {
        ServicioEquipoImpl nuevoEquipo = new ServicioEquipoImpl();
        ServicioJugadorImpl jugadorNuevo = new ServicioJugadorImpl();
        ServicioEntrenadorImpl entrenadorNuevo = new ServicioEntrenadorImpl();
        String capturaCrearJugador;
        String capturaCrearMasEquipos;

        do
        {nuevoEquipo.crearEquipo();
        entrenadorNuevo.crearEntrenador();
        System.out.println("Desea agregar los jugadores? Ingrese: si o no ");
        InputService.scanner.nextLine();
        capturaCrearJugador = InputService.scanner.nextLine();
        
        if(capturaCrearJugador.equals("si")){
            for (int i = 0; i < 2; i++) {
            jugadorNuevo.crearJugador();
        } }
        System.out.println("Desea cargar mas equipos? Ingrese: si o no ");
        capturaCrearMasEquipos = InputService.scanner.nextLine();
        }
        while(capturaCrearMasEquipos.equals("si"));
        System.out.println();
        jugadorNuevo.buscarJugador();
        
        

        
    }
    
}
