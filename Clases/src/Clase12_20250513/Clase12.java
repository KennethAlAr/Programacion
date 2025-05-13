package Clase12_20250513;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Clase12 {
    public static void main(String[] args) {

        int [][] matriz1 = new int [3][4]; // El primer [] indica las filas y el segundo las columnas.

        int [][] matriz2 = {
                {1, 2, 3, 14},
                {4, 5, 6, 12},
                {7, 8, 9, 65}
        }; // Esta es una matriz 3, 3. Si no ponemos algún valor en alguna fila, el último lo integrará como null.

        System.out.println("Número de filas:" + matriz2.length); // El .length indica el número de filas.
        System.out.println("Número de columnas: " + matriz2[0].length); // Para ver el número de columnas necesitamos ver el número de elementos de una fila.
        // Hay que ir con cuidado porque si ese array tiene menos elementos nos saldrán menos columnas.

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        matriz2[1][1] = 30; // Así modificamos el valor de una posición en la matriz.

        for (int[] fila : matriz2) { // Así recorremos la matriz con un for each
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();

        ArrayList<String> estudiante1 = new ArrayList<>();
        estudiante1.add("Juan");
        estudiante1.add("9");
        estudiante1.add("8");

        ArrayList<String> estudiante2 = new ArrayList<>();
        estudiante2.add("Raquel");
        estudiante2.add("10");
        estudiante2.add("6");
        estudiante2.add("8");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        for (ArrayList<String> estudiante : estudiantes) {

            int contador = 0;

            for (String valor : estudiante) {
                if (contador == 0) {
                    System.out.print("Nombre: ");
                } else {
                    System.out.print("Nota " + contador + ": ");
                }
                System.out.print(valor + " ");
                contador ++;
            }
            System.out.println();
        }

    }
}
