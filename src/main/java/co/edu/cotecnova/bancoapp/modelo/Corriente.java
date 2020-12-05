package main.java.co.edu.cotecnova.bancoapp.modelo;

public class Corriente extends Cuenta{
    private int cuatroXMil;

    public Corriente(int id, String numeroCuenta, double saldo, String cliente, int cuatroXMil) {
        super(id, numeroCuenta, saldo, cliente);
        this.cuatroXMil = cuatroXMil;
    }

    @Override
    public String depositar(double valorDeposito) {
        saldo += valorDeposito;
        return "Deposito exitoso, nuevo saldo "  + saldo;
    }

    @Override
    public String retirar(double valorRetiro) {
        saldo -= (valorRetiro * cuatroXMil / 100) + valorRetiro;
        return "Retiroso exitoso, nuevo saldo " + saldo;
    }

    @Override
    public String toString() {
        return "Corriente{" +
                "cuatroXMil=" + cuatroXMil +
                ", id=" + id +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
