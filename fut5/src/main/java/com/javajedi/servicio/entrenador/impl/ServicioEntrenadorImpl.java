package com.javajedi.servicio.entrenador.impl;

import java.time.LocalDate;

import com.javajedi.dominios.Entrenador;
import com.javajedi.servicio.entrada.impl.InputService;
import com.javajedi.servicio.entrenador.ServicioEntrenador;

public class ServicioEntrenadorImpl implements ServicioEntrenador{

    @Override
    public Entrenador crearEntrenador() {
        Entrenador entrenador = new Entrenador(null, null, null);
        int anioNacimiento, mesNacimiento, diaNacimiento;

        System.out.println("Por favor ingrese el nombre del entrenador");
        entrenador.setNombre(InputService.scanner.nextLine());

        System.out.println("Por favor ingrese el apellido del entrenador");
        entrenador.setApellido(InputService.scanner.nextLine());

        System.out.println("Por favor ingrese el año de nacimiento del entrenador");
        anioNacimiento = InputService.scanner.nextInt();
        System.out.println("Por favor ingrese el mes de nacimiento del entrenador");
        mesNacimiento = InputService.scanner.nextInt();
        System.out.println("Por favor ingrese el dia de nacimiento del entrenador");
        diaNacimiento = InputService.scanner.nextInt();
        entrenador.setFechaDeNacimiento(LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento));
        InputService.scanner.nextLine();

        return entrenador;
    }
    
}
