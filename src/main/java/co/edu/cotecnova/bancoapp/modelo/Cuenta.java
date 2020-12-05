package main.java.co.edu.cotecnova.bancoapp.modelo;

/**
 * Es una clase abstracta de la cual se pueden implementar cuenta de ahorro y cuenta corriente
 * @author Carlos Londoño
 */
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

    /**
     * Método que permite realizar el deposito de un monto en una cuenta
     * @param valorDeposito monto a depositar
     * @return mensaje indicando si el deposito fue exitoso
     */
    abstract String depositar(double valorDeposito);

    /**
     * Métood que permite realizar el retiro de un monto de una cuenta
     * @param valorRetiro monto a retirar
     * @return mensaje indicando si el retiro fue exitoso
     */
    abstract String retirar(double valorRetiro);
}
