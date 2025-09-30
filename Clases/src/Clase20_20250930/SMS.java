package Clase20_20250930;

public class SMS implements Enviable{

    private String numero;

    public SMS(String numero) {
        this.numero = numero;
    }

    public void enviar (String mensaje){
        System.out.println("Enviando SMS al " + this.numero + ", mensaje: " + mensaje);
    }

}
