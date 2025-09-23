package Clase19_20250923_ej1herencia;

public class Coche extends Vehiculo{
    private int caballos;

    public Coche(){

    }
    public Coche(int caballos){
        this.caballos = caballos;
    }

    @Override
    public double calcularVelocidadMaxima(){
        return this.caballos * 2.0;
    }

    @Override
    public double consumo(){
        return this.caballos * 0.05;
    }

}
