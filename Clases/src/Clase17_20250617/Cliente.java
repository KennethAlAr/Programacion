package Clase17_20250617;

public class Cliente {

    private String nombre;
    private String dni;
    private double saldo;

    public Cliente(String nombre, String dni, double saldo) {
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

    public void mostrarInfo() {
        System.out.println(" DNI: " + this.dni + "\n Nombre: " + this.nombre + "\n Saldo: " + this.saldo);
    }

}
