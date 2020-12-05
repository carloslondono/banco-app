package main.java.co.edu.cotecnova.bancoapp.servicio;

import main.java.co.edu.cotecnova.bancoapp.modelo.Ahorro;
import main.java.co.edu.cotecnova.bancoapp.util.ImprimirDatos;

import static main.java.co.edu.cotecnova.bancoapp.util.LeerEscribirPantalla.*;

import java.util.ArrayList;
import java.util.List;

public class AhorroService implements ImprimirDatos {
    private static int id = 1;
    private String numeroCuenta;
    private double saldo;
    private String nombreCliente;
    private final List<Ahorro> ahorroList = new ArrayList<>();

    public void crearCuenta(){
        pedirDatos();
        Ahorro ahorro = new Ahorro(id, numeroCuenta, saldo, nombreCliente);
        ahorroList.add(ahorro);
        id += 1;
        imprimirPantalla("Cuenta creada con exito");
    }

    private void pedirDatos(){
        nombreCliente = leerTeclado("nombre cliente");
        numeroCuenta = leerTeclado("numero cuenta");
        saldo = Double.parseDouble(leerTeclado("saldo"));
    }

    public void depositar(){
        Ahorro ahorroLocal;
        double monto;
        String cuentaLocal;
        cuentaLocal = leerTeclado("numero cuenta");
        ahorroLocal = buscarCuenta(cuentaLocal);
        if(ahorroLocal != null){
            monto = Double.parseDouble(leerTeclado("monto"));
            imprimirPantalla(ahorroLocal.depositar(monto));
        }
    }

    public void retirar(){
        Ahorro ahorroLocal;
        double monto;
        String cuentaLocal;
        cuentaLocal = leerTeclado("numero cuenta");
        ahorroLocal = buscarCuenta(cuentaLocal);
        if(ahorroLocal != null){
            monto = Double.parseDouble(leerTeclado("monto"));
            imprimirPantalla(ahorroLocal.retirar(monto));
        }
    }

    private Ahorro buscarCuenta(String numeroCuenta){
        for(Ahorro ahorro: ahorroList){
            if(ahorro.getNumeroCuenta().equals(numeroCuenta) ){
                return ahorro;
            }
        }
        return null;
    }

    @Override
    public void recorrerLista() {
        for(Ahorro ahorro: ahorroList){
            imprimirPantalla(ahorro.toString());
        }
    }
}
