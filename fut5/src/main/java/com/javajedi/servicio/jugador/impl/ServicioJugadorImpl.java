package com.javajedi.servicio.jugador.impl;

import com.javajedi.dominios.Equipo;
import com.javajedi.dominios.Jugador;
import com.javajedi.dominios.Posicion;
import com.javajedi.servicio.entrada.impl.InputService;
import com.javajedi.servicio.equipo.Impl.ServicioEquipoImpl;
import com.javajedi.servicio.jugador.ServicioJugador;
import com.javajedi.servicio.posicion.ServicioPosicion;
import com.javajedi.servicio.posicion.impl.ServicioPosicionImpl;

public class ServicioJugadorImpl implements ServicioJugador {

    ServicioPosicion nuevaPosicion = new ServicioPosicionImpl();
    String capturaCapitan;
    String capturaBuscarJugador;

    @Override
    public Jugador crearJugador(ServicioEquipoImpl servicioEquipo) {
        Jugador nuevoJugador = new Jugador(null, null, 0, null, 0, false, 0);
        Equipo equipoQuePertenece = new Equipo();

        System.out.println("Por favor ingrese el nombre del jugador");
        nuevoJugador.setNombre(InputService.scanner.nextLine());

        System.out.println("Por favor ingrese el apellido del jugador");
        nuevoJugador.setApellido(InputService.scanner.nextLine());

        System.out.println("Por favor ingrese la altura del jugador");
        nuevoJugador.setAltura(InputService.scanner.nextDouble());
        InputService.scanner.nextLine();

        Posicion posicion = nuevaPosicion.crearPosicion(); 
        nuevoJugador.setPosicion(posicion);

        System.out.println("Por favor ingrese la cantidad de goles del jugador");
        nuevoJugador.setGoles(InputService.scanner.nextInt());
        InputService.scanner.nextLine();

        System.out.println("EL jugador es capitan? ingrese: si o no ");
        capturaCapitan = InputService.scanner.nextLine();
        if(capturaCapitan.equals("si")){
            nuevoJugador.setEsCapitan(true);
        }

        System.out.println("Ingrese el número de camiseta del jugador");
        nuevoJugador.setNroDeCamiseta(InputService.scanner.nextInt());
        InputService.scanner.nextLine();

        System.out.println("Por favor ingrese el equipo al que pertenece el jugador");
        equipoQuePertenece.setNombre(InputService.scanner.nextLine());
        servicioEquipo.agregarJugadorAEquipo(nuevoJugador, equipoQuePertenece.getNombre());

        nuevoJugador.setEquipo(equipoQuePertenece);

        return nuevoJugador;
    }

    @Override
    public void buscarJugador() {
    ServicioEquipoImpl traemeLosEquipos = new ServicioEquipoImpl();
    System.out.println("Por favor ingrese el nombre del jugador a buscar: ");
    capturaBuscarJugador = InputService.scanner.nextLine();

    boolean jugadorEncontrado = false;

    for (Equipo equipo : traemeLosEquipos.getEquipos()) {
        for (Jugador jugador : equipo.getListaDeJugadores()) {
            if (jugador.getNombre().equals(capturaBuscarJugador)) {
                System.out.println(jugador.getNombre() + " " +
                        jugador.getApellido() + " " +
                        jugador.getPosicion().getNombre() + " " +
                        jugador.getEsCapitan() + " " +
                        equipo.getNombre());
                jugadorEncontrado = true;
                break;
            }
        }
        if (jugadorEncontrado) {
            break;
        }
    }

    if (!jugadorEncontrado) {
        System.out.println("No se encontró al jugador");
    }
}


}