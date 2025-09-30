package Clase18_20250923;

public class Main {

    public static void main(String[] args) {

        Pago pago1 = new PagoTarjeta(150, "1234-1234-1234-1234");
        Pago pago2 = new Paypal(300, "cliente@correo.es");

        Pago[] pagos = {pago1, pago2};

        for (Pago p : pagos) {
            p.procesarPago();
            p.mostrarCantidad();
        }

    }

}
