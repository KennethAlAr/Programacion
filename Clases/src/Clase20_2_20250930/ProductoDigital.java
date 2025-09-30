package Clase20_2_20250930;

public class ProductoDigital extends Producto{

    private double descuento;

    public ProductoDigital(String nombre, float precioBase, double descuento) {
        super(nombre, precioBase);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecioFinal(){
        double precioFinal = precioBase * (1 - descuento);
        return precioFinal;
    }

}
