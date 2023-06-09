package com.javajedi.dominios;

import java.time.LocalDate;

public class Entrenador extends Integrante {
    private LocalDate fechaDeNacimiento;


    public Entrenador(String nombre, String apellido,  LocalDate fechaDeNacimiento) {
        super(nombre, apellido);
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public LocalDate getFechaDeNacimiento() {

        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
