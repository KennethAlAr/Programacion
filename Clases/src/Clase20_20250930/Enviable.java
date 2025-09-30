package Clase20_20250930;

public interface Enviable {

    void enviar(String mensaje);

    default void confirmar(){
        System.out.println("Mensaje enviado correctamente");
    }

}
