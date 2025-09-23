package Clase18_20250923;

public abstract class Pago {

    protected double cantidad;

    public Pago (double cantidad){
        if (cantidad <= 0){
            throw new IllegalArgumentException("La cantidad debe de ser correcta");
        }

        this.cantidad = cantidad;
    }

    public void mostrarCantidad(){
        System.out.println("Cantidad: " + this.cantidad);
    }

    public abstract void procesarPago();

}
