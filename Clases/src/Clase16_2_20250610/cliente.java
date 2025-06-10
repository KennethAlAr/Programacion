package Clase16_2_20250610;

public class cliente {

    private String nombre;
    private String dni;
    private double saldo;

    public cliente(double saldo, String nombre, String dni) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar (double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirar (double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

}
