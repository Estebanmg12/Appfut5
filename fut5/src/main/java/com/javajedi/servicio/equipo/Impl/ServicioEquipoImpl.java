package com.javajedi.servicio.equipo.Impl;

import java.util.ArrayList;
import java.util.List;

import com.javajedi.dominios.Equipo;
import com.javajedi.dominios.Jugador;
import com.javajedi.servicio.equipo.ServicioEquipo;
import com.javajedi.servicio.jugador.impl.ServicioJugadorImpl;
import com.javajedi.servicio.entrada.impl.InputService;
import com.javajedi.servicio.entrenador.impl.ServicioEntrenadorImpl;

public class ServicioEquipoImpl implements ServicioEquipo {
    List<Equipo> equipos = new ArrayList<>();
    

    String buscarEquipos, nombreEntrenador, nombreCapitanEquipo;
    

    @Override
    public Equipo crearEquipo() {
        Equipo equipoNuevo = new Equipo();
        List<Jugador> listaDeJugadores = new ArrayList<>();
        System.out.println("Ingrese el nombre del equipo: ");
        equipoNuevo.setNombre(InputService.getScanner().nextLine());
        
        ServicioEntrenadorImpl entrenadorNuevo = new ServicioEntrenadorImpl();
        equipoNuevo.setEntrenador(entrenadorNuevo.crearEntrenador());

        ServicioJugadorImpl jugadorNuevo = new ServicioJugadorImpl();
        for (int i = 0; i < 2; i++) {
            listaDeJugadores.add(jugadorNuevo.crearJugador(this));
        }

        equipoNuevo.setListaDeJugadores(listaDeJugadores);

        equipos.add(equipoNuevo);

        return equipoNuevo;
    }

    public void agregarJugadorAEquipo(Jugador jugador, String nombreEquipo) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombreEquipo)) {
            jugador.setEquipo(equipo);
            equipo.getListaDeJugadores().add(jugador);
            break;
            }
        }
    }

        
    @Override
    public void buscarEquipo() {
        System.out.println("Por favor ingrese el nombre del equipo a buscar: ");
        buscarEquipos = InputService.getScanner().nextLine();
        System.out.println("Por favor ingrese el nombre del entrenador");
        nombreEntrenador = InputService.getScanner().nextLine();
        System.out.println("Por favor ingrese el nombre del capitan del equipo");
        nombreCapitanEquipo = InputService.getScanner().nextLine();

        boolean equipoEncontrado = false;

        for (Equipo equipo : equipos) {
        if (equipo.getNombre().equals(buscarEquipos) &&
                equipo.getEntrenador().getNombre().equals(nombreEntrenador)) {
            for (Jugador jugador : equipo.getListaDeJugadores()) {
                if (jugador.getEsCapitan() && jugador.getNombre().equals(nombreCapitanEquipo)) {
                    System.out.println("Equipo encontrado");
                    equipoEncontrado = true;
                    break;
                }
            }
            break;
        }
    }

    if (!equipoEncontrado) {
        System.out.println("Equipo no encontrado");
    }
        

    }

    @Override
    public Equipo eliminarEquipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarEquipo'");
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    
}