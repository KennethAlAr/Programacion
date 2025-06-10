package Clase16_20250610;

import java.util.ArrayList;

public class Termostato {

    private double temperaturaDeseada;
    private Termometro termometro;
    private ArrayList<Split> splits;

    public Termostato (double tD, Termometro t) {
        this.temperaturaDeseada = tD;
        this.termometro = t;
        this.splits = new ArrayList<>();
    }

    public void anadirSplit (Split s) {
        this.splits.add(s);
    }

    public void comprobarTemperatura() {
        double tActual = termometro.leerTemperatura();
        System.out.println("Temperatura actual: " + tActual + ". Temperatura deseada: " + this.temperaturaDeseada);

        if (tActual > this.temperaturaDeseada) {
            for (Split s : splits) {
                s.encender();
            }
        } else {
            for (Split s : splits) {
                s.apagar();
            }
        }

    }

}
