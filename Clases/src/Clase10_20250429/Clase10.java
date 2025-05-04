package Clase10_20250429;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Clase10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'salir' para finalizar");
        String nombre;

        do{
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("salir")){
                nombres.add(nombre);
            }
        } while(!nombre.equalsIgnoreCase("salir"));

        int opcion;

        do {
            System.out.println("\nMENÚ DE OPCIONES");
            System.out.println("0. Salir");
            System.out.println("1. Mostrar todos los nombres");
            System.out.println("2. Obtener nombre por posición");
            System.out.println("3. Ordenar lista alfabéticamente");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    if (nombre.isEmpty()){
                        System.out.println("No hay nombres");
                    } else {
                        for (String nom : nombres) {
                            System.out.println(" - " + nom);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Introduce la posición: ");
                    int posicion = sc.nextInt();
                    sc.nextLine();
                    if (posicion < nombres.size() && posicion >= 0) {
                        System.out.println("Nombre en la posición elegida: " + nombres.get(posicion));
                    } else {
                        System.out.println("Introduce una posición válida.");
                    }
                }
                case 3 -> {
                    Collections.sort(nombres);
                    for (String nom : nombres) {
                        System.out.println(" - " + nom);
                    }
                }
                case 0 -> {
                    System.out.println("FIN");
                }
                default -> {
                    System.out.println("Opción no válida");
                }
            }

        } while (opcion != 0);

        sc.close();

    }
}
