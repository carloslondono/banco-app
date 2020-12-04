package main.java.co.edu.cotecnova.bancoapp.modelo;

public abstract class Cuenta {
    protected int id;
    protected String numeroCuenta;
    protected double saldo;
    protected String cliente;

    public Cuenta(int id, String numeroCuenta, double saldo, String cliente) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    abstract String depositar(double valorDeposito);

    abstract String retirar(double valorRetiro);
}
