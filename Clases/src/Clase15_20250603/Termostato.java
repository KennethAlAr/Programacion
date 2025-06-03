package Clase15_20250603;

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
