package com.javajedi.dominios;

import java.util.UUID;

public class Jugador extends Integrante {
    private UUID id;
    private double altura;
    private Posicion posicion;
    private int goles;
    private boolean esCapitan = false;
    private int nroDeCamiseta;
    private Equipo equipo;


    public Jugador(String nombre, String apellido, double altura, Posicion posicion, int goles, 
                   boolean esCapitan, int nroDeCamiseta) {
        super(nombre, apellido);
        this.id = java.util.UUID.randomUUID();
        this.altura = altura;
        this.goles = goles;
        this.posicion = posicion;
        this.esCapitan = esCapitan;
        this.nroDeCamiseta = nroDeCamiseta;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public int getNroDeCamiseta() {
        return nroDeCamiseta;
    }

    public void setNroDeCamiseta(int nroDeCamiseta) {
        this.nroDeCamiseta = nroDeCamiseta;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString(){
        return this.getNombre() + " " + this.getApellido() + " " + this.getNroDeCamiseta();
    }
}