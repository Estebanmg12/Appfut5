package com.javajedi.servicio.jugador.impl;

import java.util.ArrayList;
import java.util.List;

import com.javajedi.dominios.Equipo;
import com.javajedi.dominios.Jugador;
import com.javajedi.dominios.Posicion;
import com.javajedi.servicio.entrada.impl.InputService;
import com.javajedi.servicio.jugador.ServicioJugador;
import com.javajedi.servicio.posicion.ServicioPosicion;
import com.javajedi.servicio.posicion.impl.ServicioPosicionImpl;

public class ServicioJugadorImpl implements ServicioJugador {
    List<Jugador> listaDeJugadores = new ArrayList<Jugador>();
    ServicioPosicion nuevaPosicion = new ServicioPosicionImpl();
    Jugador nuevoJugador = new Jugador(null, null, 0, null, 0, false, 0);
    String capturaCapitan;
    Equipo equipoQuePertenece = new Equipo();
    String capturaBuscarJugador;

    @Override
    public Jugador crearJugador() {

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

        listaDeJugadores.add(nuevoJugador);
        return nuevoJugador;
    }

    @Override
    public void buscarJugador() {
        System.out.println("Por favor ingrese el nombre del jugador a buscar: ");
        capturaBuscarJugador = InputService.scanner.nextLine();
        for (int i = 0; i < listaDeJugadores.size(); i++) {
            if(nuevoJugador.getNombre().equals(capturaBuscarJugador)){
                System.out.println(nuevoJugador.getNombre()+ " " + nuevoJugador.getApellido()+ " "
                + nuevoJugador.getPosicion().getNombre()+ " " + nuevoJugador.getEsCapitan()+ " " + equipoQuePertenece.getNombre());
            }
        }
    }
}