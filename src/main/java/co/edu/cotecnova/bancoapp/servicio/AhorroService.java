package main.java.co.edu.cotecnova.bancoapp.servicio;

import main.java.co.edu.cotecnova.bancoapp.modelo.Ahorro;
import main.java.co.edu.cotecnova.bancoapp.util.ImprimirDatos;

import static main.java.co.edu.cotecnova.bancoapp.util.LeerEscribirPantalla.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga de crear la instancia de la cuenta ahorro
 * @author Carlos Londoño
 * {@link ImprimirDatos}
 */
public class AhorroService implements ImprimirDatos {
    private static int id = 1;
    private String numeroCuenta;
    private double saldo;
    private String nombreCliente;
    private final List<Ahorro> ahorroList = new ArrayList<>();

    /**
     * Método que permite crear la cuenta de ahorro para un usuario y agregarla a la lista
     */
    public void crearCuenta(){
        pedirDatos();
        Ahorro ahorro = new Ahorro(id, numeroCuenta, saldo, nombreCliente);
        ahorroList.add(ahorro);
        id += 1;
        imprimirPantalla("Cuenta creada con exito");
    }

    /**
     * Método que permite solicitar al usuario los datos para crear una cuenta
     */
    private void pedirDatos(){
        nombreCliente = leerTeclado("nombre cliente");
        numeroCuenta = leerTeclado("numero cuenta");
        saldo = Double.parseDouble(leerTeclado("saldo"));
    }

    /**
     * Método que permite depositar un monto en una cuenta de ahorros
     */
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

    /**
     * Método que permite retirar un monto de una cuenta de ahorros
     */
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

    /**
     * Método que permite buscar una cuenta, dado su numero de cuenta
     * @param numeroCuenta valor que identifica la cuenta del usuario
     * @return el objeto que contiene la cuenta del usuario
     */
    private Ahorro buscarCuenta(String numeroCuenta){
        for(Ahorro ahorro: ahorroList){
            if(ahorro.getNumeroCuenta().equals(numeroCuenta) ){
                return ahorro;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void recorrerLista() {
        for(Ahorro ahorro: ahorroList){
            imprimirPantalla(ahorro.toString());
        }
    }
}
