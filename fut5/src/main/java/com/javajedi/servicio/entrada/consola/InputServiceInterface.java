package com.javajedi.servicio.entrada.consola;

import java.util.Scanner;

public interface InputServiceInterface {
    void createScanner();
    Scanner getScanner();
    void closeScanner();
}
