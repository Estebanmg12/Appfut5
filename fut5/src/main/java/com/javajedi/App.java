package com.javajedi;

import com.javajedi.servicio.menu.impl.MenuImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        
        new MenuImpl().crearEquipoYJugadores();
    }
}
