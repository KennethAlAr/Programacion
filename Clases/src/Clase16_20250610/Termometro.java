package Clase16_20250610;

public class Termometro {

   private double temperaturaActual;

   public Termometro(){
       this.temperaturaActual = 25.0;
   }

   public double leerTemperatura() {
       this.temperaturaActual += (Math.random() * 2 - 1); //Rango entre -1 y 1
       return this.temperaturaActual;
   }

}
