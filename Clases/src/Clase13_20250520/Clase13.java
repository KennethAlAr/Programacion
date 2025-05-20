package Clase13_20250520;

import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Clase13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // Así conseguimos números del 1 al 100, ya que el primero del random es 0.
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------");

        int[][] matriz_transpuesta = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz_transpuesta[i][j] = matriz[j][i];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz_transpuesta[i][j] + "\t");
            }
            System.out.println();
        }

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0); // Podemos volver a poner un put con la misma key para sobreescribir el value.
        notas.put("Luis", 5.0);
        notas.put("Pepe", 9.0);

        for (Map.Entry<String, Double> entrada : notas.entrySet()) {
            System.out.println(entrada.getKey() + "->" + entrada.getValue());
        }

        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();

        if(notas.containsKey(nombre)) {
            System.out.println(nombre + " tiene una nota de: " + notas.get(nombre));
        } else {
            System.out.println("Estudiante no encontrado");
        }

        TreeMap<String, Double> ordenado = new TreeMap<>(notas);

        for (Map.Entry<String, Double> entrada : ordenado.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

    }
}
