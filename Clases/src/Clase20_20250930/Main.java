package Clase20_20250930;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Enviable> servicios = new ArrayList<>();
        servicios.add(new Email("cliente@pepe.com"));
        servicios.add(new SMS("+34666123123"));

        for (Enviable e: servicios){
            e.enviar("Pedido enviado");
            e.confirmar();
        }
    }

}
