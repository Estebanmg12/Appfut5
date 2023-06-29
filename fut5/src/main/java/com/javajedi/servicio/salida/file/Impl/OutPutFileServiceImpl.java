package com.javajedi.servicio.salida.file.Impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.javajedi.dominios.Jugador;
import com.javajedi.servicio.salida.file.OutPutFileService;

public class OutPutFileServiceImpl implements OutPutFileService {

    @Override
    public void exportJugadores(List<Jugador> jugadores, String rutaDeDestino) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDeDestino))){

            for (Jugador jugador : jugadores) {
                String linea = jugador.getNombre() + ";" + jugador.getApellido() +
                ";" + jugador.getAltura() + ";" + jugador.getPosicion() + 
                ";" + jugador.getGoles() + ";" + jugador.getEsCapitan() + 
                ";" + jugador.getNroDeCamiseta();

                writer.write(linea);
                writer.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
