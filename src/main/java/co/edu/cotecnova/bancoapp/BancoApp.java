package main.java.co.edu.cotecnova.bancoapp;

import main.java.co.edu.cotecnova.bancoapp.menu.Menu;

/**
 * <h1>Banco App</h1>
 * <p>
 * Es una aplicación del sistema bancario que permite realizar operaciones de retiro y deposito en cuentas de ahorro y corriente
 * @author Carlos Londoño
 * @version 1.0
 * @since 2020
 */
public class BancoApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostrarMenu();
    }
}
