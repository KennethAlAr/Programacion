package Clase17_20250617;

public class GestBanco {
    public static void main(String[] args) {

        Banco miBanco = new Banco("Mi Banco");

        Cliente c1 = new Cliente("Pepe Pérez", "44444444A", 1500f);
        Cliente c2 = new Cliente("María Pérez", "22222222B", 800f);

        miBanco.agregarCliente(c1);
        miBanco.agregarCliente(c2);

        miBanco.mostrarTodosLosClientes();

        miBanco.transferir("44444444A", "22222222B", 2000f);

        miBanco.mostrarTodosLosClientes();

    }
}
