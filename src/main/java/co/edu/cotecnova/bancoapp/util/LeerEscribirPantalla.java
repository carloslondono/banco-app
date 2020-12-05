package main.java.co.edu.cotecnova.bancoapp.util;

import java.util.Scanner;

/**
 * Clase que permite leer y escribir en la pantalla
 * @author Carlos Londoño
 */
public class LeerEscribirPantalla {
    /**
     * Método que imprime en pantalla el texto enviado por el usuario
     * @param texto variable que contiene el texto a mostrar en la pantall
     */
    public static void imprimirPantalla(String texto){
        System.out.println(texto);
    }

    /**
     * Método que permite leer desde el teclado una variable que requiere el usuario
     * @param variable el titulo del campo que debe ingresar el suuario
     * @return la variable en texto que requiere el usuario
     */
    public static String leerTeclado(String variable){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese " + variable + ": ");
        return scanner.nextLine();
    }
}
