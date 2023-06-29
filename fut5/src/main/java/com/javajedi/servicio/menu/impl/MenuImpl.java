package com.javajedi.servicio.menu.impl;

import java.util.List;

import com.javajedi.dominios.Jugador;
import com.javajedi.servicio.entrada.consola.impl.InputService;
import com.javajedi.servicio.entrada.file.InputFileService;
import com.javajedi.servicio.entrada.file.Impl.InputFileServiceImpl;
import com.javajedi.servicio.equipo.ServicioEquipo;
import com.javajedi.servicio.equipo.Impl.ServicioEquipoImpl;
import com.javajedi.servicio.jugador.ServicioJugador;
import com.javajedi.servicio.jugador.impl.ServicioJugadorImpl;
import com.javajedi.servicio.menu.Menu;
import com.javajedi.servicio.salida.file.OutPutFileService;
import com.javajedi.servicio.salida.file.Impl.OutPutFileServiceImpl;

public class MenuImpl implements Menu {
    public static final InputFileService inputFileService = new InputFileServiceImpl();
    public static final OutPutFileService outputFileService = new OutPutFileServiceImpl();
    @Override
    public void crearEquipoYJugadores() {
        ServicioEquipo nuevoEquipo = new ServicioEquipoImpl();
        ServicioJugador jugadorNuevo = new ServicioJugadorImpl();
        String capturaCrearMasEquipos;

        nuevoEquipo.crearEquipo();

        System.out.println("Desea cargar mas equipos? Ingrese: si o no ");
        capturaCrearMasEquipos = InputService.scanner.nextLine();

        while(capturaCrearMasEquipos.equals("si")){
            nuevoEquipo.crearEquipo();
            System.out.println("Desea cargar mas equipos? Ingrese: si o no ");
            capturaCrearMasEquipos = InputService.scanner.nextLine();
        }
        nuevoEquipo.buscarEquipo();
        //nuevoEquipo.buscarEquipos();
        //jugadorNuevo.buscarJugador(nuevoEquipo);
        String rutaArchivo = "C:\\Facultad\\INFORMATORIO\\JAVA_JEDI\\fut5\\src\\main\\java\\com\\javajedi\\resource\\jugadores.txt";
        List<Jugador> listaJugador = inputFileService.cargarJugadorPorArchivo(rutaArchivo);
        System.out.println(listaJugador.size());

        String rutaArchivoSalida = "C:\\Facultad\\INFORMATORIO\\JAVA_JEDI\\fut5\\src\\main\\java\\com\\javajedi\\resource\\jugadores_salida.txt";
        outputFileService.exportJugadores(listaJugador, rutaArchivoSalida);
        
        

        
    }
    
}
