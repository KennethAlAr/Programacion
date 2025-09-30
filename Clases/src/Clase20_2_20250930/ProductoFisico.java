package Clase20_2_20250930;

public class ProductoFisico extends Producto{

    private double costeFisico;

    public ProductoFisico(String nombre, float precioBase, double costeFisico) {
        super(nombre, precioBase);
        this.costeFisico = costeFisico;
    }

    @Override
    public double calcularPrecioFinal(){
        double precioFinal = precioBase + costeFisico;
        return precioFinal;
    }

}
