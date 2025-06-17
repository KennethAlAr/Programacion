package Clase17_20250617;

import java.util.ArrayList;

public class Banco {

    private String nombre;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("Cliente añadido con éxito.");
    }

    public Cliente buscarClientePorDNI (String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }

    public void mostrarTodosLosClientes() {
        for (Cliente cliente : clientes) {
            cliente.mostrarInfo();
        }
    }

    public void transferir(String dniOrigen, String dniDestino, double cantidad) {
        Cliente origen = buscarClientePorDNI(dniOrigen);
        Cliente destino = buscarClientePorDNI(dniDestino);

        if (origen != null && destino != null) {
            if (origen.retirar(cantidad)) {
                destino.depositar(cantidad);
                System.out.println("Transferencia realizada con éxito.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Uno o ambos clientes no existen.");
        }
    }

}
