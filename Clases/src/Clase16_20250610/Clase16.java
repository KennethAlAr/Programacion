package Clase16_20250610;

public class Clase16 {
    public static void main(String[] args) throws InterruptedException{

        Termometro t1 = new Termometro();
        Termostato termostato1 = new Termostato(26, t1);

        termostato1.anadirSplit(new Split("Puerta"));
        termostato1.anadirSplit(new Split("Ventana"));

        for (int i = 0; i < 10; i++) {
            termostato1.comprobarTemperatura();
            Thread.sleep(1000);
        }

    }
}
