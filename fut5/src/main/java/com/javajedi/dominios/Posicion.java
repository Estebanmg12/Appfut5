package com.javajedi.dominios;

public class Posicion {
    private String nombre;


    public Posicion(String nombre) {
        this.nombre = nombre;
    }

    public Posicion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return this.getNombre();
    }
}
