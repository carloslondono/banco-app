package main.java.co.edu.cotecnova.bancoapp.modelo;

public class Ahorro extends Cuenta{
    private int porcentajeGanancia;

    public Ahorro(int id, String numeroCuenta, double saldo, String cliente) {
        super(id, numeroCuenta, saldo, cliente);
        this.porcentajeGanancia = 5;
    }

    public int getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setPorcentajeGanancia(int porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }

    @Override
    public String depositar(double valorDeposito) {
        saldo += (valorDeposito * porcentajeGanancia) + valorDeposito;
        return "Deposito exitoso, nuevo saldo " + saldo;
    }

    @Override
    public String retirar(double valorRetiro) {
        saldo -= valorRetiro;
        return "Retiro exitoso, nuevo salod " + saldo;
    }
}
