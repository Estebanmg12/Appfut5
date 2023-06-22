package com.javajedi.servicio.equipo.Impl;

import com.javajedi.dominios.Equipo;
import com.javajedi.servicio.equipo.ServivicioEquipo;
import com.javajedi.servicio.entrada.impl.InputService;

public class ServicioEquipoImpl implements ServivicioEquipo {

    @Override
    public Equipo crearEquipo() {
        Equipo equipoNuevo = new Equipo();
    
        System.out.println("Ingrese el nombre del equipo: ");

        equipoNuevo.setNombre(InputService.getScanner().nextLine());

        return equipoNuevo;
    }
        
    @Override
    public Equipo buscarEquipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarEquipo'");
    }

    @Override
    public Equipo eliminarEquipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarEquipo'");
    }

    
}