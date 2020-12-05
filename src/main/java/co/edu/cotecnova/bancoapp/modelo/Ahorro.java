package main.java.co.edu.cotecnova.bancoapp.modelo;

/**
 * Se encarga de crear cuentas de tipo ahorro en la cual puedo realizar depositos y retiros
 * @author Carlos Londoño
 * {@link Cuenta}
 */
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

    /**
     * {@inheritDoc}
     */
    @Override
    public String depositar(double valorDeposito) {
        saldo += (valorDeposito * porcentajeGanancia / 100) + valorDeposito;
        return "Deposito exitoso, nuevo saldo " + saldo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String retirar(double valorRetiro) {
        saldo -= valorRetiro;
        return "Retiro exitoso, nuevo saldo " + saldo;
    }

    @Override
    public String toString() {
        return "Ahorro{" +
                "porcentajeGanancia=" + porcentajeGanancia +
                ", id=" + id +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", cliente='" + cliente + '\'' +
                '}';
    }
}
