package main.java.co.edu.cotecnova.bancoapp.servicio;

import main.java.co.edu.cotecnova.bancoapp.modelo.Ahorro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AhorroService {
    private Scanner scanner = new Scanner(System.in);
    private int id;
    private String numeroCuenta;
    private double saldo;
    private String nombreCliente;
    private List<Ahorro> ahorroList = new ArrayList<>();

    public void crearCuenta(){
        id = 1;
        pedirDatos();
        Ahorro ahorro = new Ahorro(id, numeroCuenta, saldo, nombreCliente);
        ahorroList.add(ahorro);
        System.out.println("Cuenta creada con exito");
    }

    private void pedirDatos(){
        System.out.println("Ingrese nombre: ");
        nombreCliente = scanner.nextLine();
        System.out.println("Ingrese telefono: ");
        numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese saldo: ");
        saldo = scanner.nextDouble();
        String saltoDeLinea = scanner.nextLine();
    }

    public void depositar(){
        double monto;
        String numeroCuenta;
        System.out.println("Ingrese su numero de cuenta");
        numeroCuenta = scanner.nextLine();
        System.out.println("Ingrese monto depositar: ");
        monto = scanner.nextDouble();
        for(Ahorro ahorro: ahorroList){
            if(ahorro.getNumeroCuenta() == numeroCuenta){
                ahorro.depositar(monto);
            }
        }


    }
}
