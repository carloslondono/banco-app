package main.java.co.edu.cotecnova.bancoapp.util;

import java.util.Scanner;

public class LeerEscribirPantalla {
    public static void imprimirPantalla(String texto){
        System.out.println(texto);
    }

    public static String leerTeclado(String variable){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese " + variable + ": ");
        return scanner.nextLine();
    }
}
