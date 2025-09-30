package Clase20_2_20250930;

public abstract class Producto implements Vendible{

    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, float precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();

    public double calcularImporte() {
        return calcularPrecioFinal();
    }

}
