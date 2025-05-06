package Clase11_20250506;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Clase11 {
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
            System.out.println("1. Mostrar todos los nombres");
            System.out.println("2. Obtener nombre por posición");
            System.out.println("3. Reemplazar nombre (set)");
            System.out.println("4. Eliminar nombre por posición (remove)");
            System.out.println("5. Verificar si existe un nombre (contains)");
            System.out.println("6. Obtener índice de un nombre (indexOf)");
            System.out.println("7. Vaciar lista de nombres (clear)");
            System.out.println("8. Ordenar la lista alfabéticamente (Collections. sort)");
            System.out.println("0. Salir");
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
                    System.out.println("Introduce la posición que quieres modificar");
                    int posicion = sc.nextInt();
                    sc.nextLine();
                    posicion--;
                    if (posicion < nombres.size() && posicion >= 0) {
                        System.out.println("Introduce nombre: ");
                        String nuevoNombre = sc.nextLine();
                        nombres.set(posicion, nuevoNombre);
                        System.out.println("Nombre reemplazado.");
                    } else {
                        System.out.println("Posición no válida.");
                    }
                }

                case 4 -> {
                    System.out.println("Introduce la posición que quieres eliminar");
                    int posicion = sc.nextInt();
                    sc.nextLine();
                    posicion--;
                    if (posicion < nombres.size() && posicion >= 0) {
                        nombres.remove(posicion);
                        System.out.println("Nombre eliminado.");
                    } else {
                        System.out.println("Posición no válida.");
                    }
                }

                case 5 -> {
                    System.out.println("Introduce el nombre: ");
                    String nombreBuscado = sc.nextLine();
                    if (nombres.contains(nombreBuscado)) {
                        System.out.println("El nombre está en la lista.");
                    } else {
                        System.out.println("El nombre no está en la lista.");
                    }
                }

                case 6 -> {
                    System.out.println("Introduce el nombre: ");
                    String nombreBuscado = sc.nextLine();
                    int indice = nombres.indexOf(nombreBuscado);
                    if (indice != -1) {
                        System.out.println("El nombre está en la posición: " + (indice+1));
                    } else {
                        System.out.println("El nombre no está en la lista.");
                    }
                }

                case 7 -> {
                    nombres.clear();
                    System.out.println("Nombres borrados.");
                }

                case 8 -> {
                    Collections.sort(nombres);
                }

                case 0 -> {
                    System.out.println("FIN");
                }
                default -> {
                    System.out.println("Opción no válida.");
                }
            }

        } while (opcion != 0);

        sc.close();
    }
}
