package com.javajedi.servicio.entrada.file.Impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.javajedi.dominios.Jugador;
import com.javajedi.dominios.Posicion;
import com.javajedi.servicio.entrada.file.InputFileService;

public class InputFileServiceImpl implements InputFileService {

    @Override
    public List<Jugador> cargarJugadorPorArchivo(String rutaArchivo) {

        List<Jugador> jugadores = new ArrayList<>();

        try{
            List<String> lineas = FileUtils.readLines(new File(rutaArchivo), StandardCharsets.UTF_8);

            for (String linea : lineas) {
                String[] partes = linea.split(";");

                String nombre = partes[0];
                String apellido = partes[1];
                Double altura = Double.parseDouble(partes[2]);
                String posicion = partes[3];
                Posicion posicionObjet = new Posicion(posicion);
                int goles = Integer.parseInt(partes[4]);
                String capitan = partes[5];
                boolean capitanObjet = capitan.equalsIgnoreCase("True");
                int nroCamiseta = Integer.parseInt(partes[6]);
                
                Jugador jugador = new Jugador(nombre, apellido, altura, posicionObjet, 
                goles, capitanObjet, nroCamiseta);
                jugadores.add(jugador);
            }

        }catch (IOException e){
            throw new RuntimeException(e);
        }

        return jugadores;
        
    }
    
}
