package Clase19_20250923_ej1herencia;

public class Main {
    public static void main(String[] args){

        Vehiculo[] vehiculos = {
                new Coche(120),
                new Bicicleta(18)
        };

        for (Vehiculo v : vehiculos){
            if (v instanceof Coche c){
                System.out.println("Velocidad máxima: "+ c.calcularVelocidadMaxima() + "km/h");
                System.out.println("Consumo: "+ c.consumo() + "l/km");
            } else if (v instanceof Bicicleta b){
                System.out.println("Velocidad máxima: "+ b.calcularVelocidadMaxima() + "km/h");
                System.out.println("Calorías: "+ b.consumo() + "cal");
            }
        }

    }
}
