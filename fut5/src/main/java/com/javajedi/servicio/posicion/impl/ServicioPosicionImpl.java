package com.javajedi.servicio.posicion.impl;

import com.javajedi.dominios.Posicion;
import com.javajedi.servicio.entrada.consola.impl.InputService;
import com.javajedi.servicio.posicion.ServicioPosicion;

public class ServicioPosicionImpl implements ServicioPosicion {

    @Override
    public Posicion crearPosicion() {
        Posicion posicion = new Posicion();
        System.out.println("Por favor ingrese la posicion del jugador ");
        posicion.setNombre(InputService.getScanner().nextLine());
       
        return posicion;
    }
    
}
