package main.java.co.edu.cotecnova.bancoapp.menu;

import main.java.co.edu.cotecnova.bancoapp.servicio.AhorroService;
import static main.java.co.edu.cotecnova.bancoapp.util.LeerEscribirPantalla.*;

import static main.java.co.edu.cotecnova.bancoapp.util.OpcionesMenu.*;

public class Menu {

    private final AhorroService ahorroService = new AhorroService();

    public void mostrarMenu(){
        int opcion;
        do{
            opciones();
            opcion = Integer.parseInt(leerTeclado("opcion"));
            procesarMenu(opcion);
        }while (opcion != 0);
    }

    private void opciones(){
        imprimirPantalla("1. " + CREARCUENTAAHORRO);
        imprimirPantalla("2. " + CREARCUENTACORRIENTE);
        imprimirPantalla("3. " + DEPOSITARCUENTAAHORRO);
        imprimirPantalla("4. " + DEPOSITARCUENTACORRIENTE);
        imprimirPantalla("5. " + RETIRARCUENTAAHORRO);
        imprimirPantalla("6. " + RETIRARCUENTACORRIENTE);
        imprimirPantalla("7. " + IMPRIMIRCUENTAAHORRO);
        imprimirPantalla("8. " + IMPRIMIRCUENTACORRIENTE);
        imprimirPantalla("0. " + SALIR);
    }

    private void procesarMenu(int opcion){
        switch (opcion){
            case 1:
                imprimirPantalla(CREARCUENTAAHORRO);
                ahorroService.crearCuenta();
                break;
            case 2:
                imprimirPantalla(CREARCUENTACORRIENTE);
                break;
            case 3:
                imprimirPantalla(DEPOSITARCUENTAAHORRO);
                ahorroService.depositar();
                break;
            case 4:
                imprimirPantalla(DEPOSITARCUENTACORRIENTE);
                break;
            case 5:
                imprimirPantalla(RETIRARCUENTAAHORRO);
                ahorroService.retirar();
                break;
            case 6:
                imprimirPantalla(RETIRARCUENTACORRIENTE);
                break;
            case 7:
                imprimirPantalla(IMPRIMIRCUENTAAHORRO);
                ahorroService.recorrerLista();
                break;
            case 8:
                imprimirPantalla(IMPRIMIRCUENTACORRIENTE);
                break;
            case 0:
                imprimirPantalla(SALIR);
                break;
            default:
                imprimirPantalla("Opción Inválida");
        }
    }
}
