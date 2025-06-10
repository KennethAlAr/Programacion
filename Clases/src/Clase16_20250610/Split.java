package Clase16_20250610;

public class Split {

    private boolean encendido;
    private String ubicacion;


    public Split (String ubicacion) {
        this.encendido = false;
        this.ubicacion = ubicacion;
    }

    public boolean estaEncendido() {
        return encendido;
    }

    public void encender() {
        if (!this.encendido) {
            this.encendido = true;
            System.out.println("Split de " + ubicacion + " encendido.");
        } else {
            System.out.println("¡Split de " + ubicacion + "ya estaba encendido!");
        }
    }

    public void apagar() {
        if (this.encendido) {
            this.encendido = false;
            System.out.println("Split de " + ubicacion + " apagado.");
        } else {
            System.out.println("¡Split de " + ubicacion + "ya estaba apagado!");
        }
    }

}
