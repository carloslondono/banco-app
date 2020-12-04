package main.java.co.edu.cotecnova.bancoapp.menu;

import main.java.co.edu.cotecnova.bancoapp.modelo.Ahorro;
import main.java.co.edu.cotecnova.bancoapp.servicio.AhorroService;

import java.util.Scanner;

import static main.java.co.edu.cotecnova.bancoapp.util.OpcionesMenu.*;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private AhorroService ahorroService = new AhorroService();

    public void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do{
            opciones();
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            procesarMenu(opcion);
        }while (opcion != 0);
    }

    private void opciones(){
        System.out.println("1. " + CREARCUENTAAHORRO);
        System.out.println("2. " + CREARCUENTACORRIENTE);
        System.out.println("3. " + DEPOSITARCUENTAAHORRO);
        System.out.println("4. " + DEPOSITARCUENTACORRIENTE);
        System.out.println("5. " + RETIRARCUENTAAHORRO);
        System.out.println("5. " + RETIRARCUENTACORRIENTE);
        System.out.println("0. " + SALIR);
    }

    private void procesarMenu(int opcion){
        String saltoDeLinea = scanner.nextLine();
        switch (opcion){
            case 1:
                System.out.println(CREARCUENTAAHORRO);
                ahorroService.crearCuenta();
                break;
            case 2:
                System.out.println(CREARCUENTACORRIENTE);
                break;
            case 3:
                System.out.println(DEPOSITARCUENTAAHORRO);
                ahorroService.depositar();
                break;
            case 4:
                System.out.println(DEPOSITARCUENTACORRIENTE);
                break;
            case 5:
                System.out.println(RETIRARCUENTAAHORRO);
                break;
            case 6:
                System.out.println(RETIRARCUENTACORRIENTE);
                break;
            case 0:
                System.out.println(SALIR);
                break;
            default:
                System.out.println("Opción Inválida");
        }
    }
}
