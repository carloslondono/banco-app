package main.java.co.edu.cotecnova.bancoapp.modelo;

public class Corriente extends Cuenta{
    private int cuatroXMil;

    public Corriente(int id, String numeroCuenta, double saldo, String cliente, int cuatroXMil) {
        super(id, numeroCuenta, saldo, cliente);
        this.cuatroXMil = cuatroXMil;
    }

    @Override
    String depositar(double valorDeposito) {
        saldo += valorDeposito;
        return "Deposito exitoso, nuevo saldo "  + saldo;
    }

    @Override
    String retirar(double valorRetiro) {
        saldo -= (valorRetiro * cuatroXMil) + valorRetiro;
        return "Retiroso exitoso, nuevo saldo " + saldo;
    }
}
