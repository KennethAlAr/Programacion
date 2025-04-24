package Clase9_20250422;

import java.util.Scanner;
import java.util.Arrays;

public class Clase9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        // Los corchetes indican que vamos a crear un vector de int. El new int[5] sirve para definir el tamaño.
        int indice = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número para la posición " + (i+1) + ":"); // Las operaciones hay que ponerlas entre paréntesis para que no se concatenen.
            numeros[i] = sc.nextInt();
            // Así añadimos datos al vector en la posición indicada.
        }

        System.out.println("CONTENIDO:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en la posición " + (i+1) + ": " + numeros[i]);
            // Así cogemos el dato en la posición i del vector.
        }

        for (int numero : numeros) { // Así hacemos un for each. Mas eficiente si tenemos que recorrer todo el vector
            System.out.println("Elemento " + indice + ": " + numero); // En este caso 'num' es cada uno de los elementos del vector
            indice ++; // Para sacar el índice del elemento con el "for each" hay que hacerlo con una variable externa (línea 11)
        }

        indice = 0;

        while (indice < numeros.length) {
            System.out.println("Posición " + (indice+1) + ": " + numeros[indice]);
            indice++;
        }

        Arrays.stream(numeros).forEach(num -> System.out.println("Elemento: " + num)); // La librería 'stream' sirve para hacer varias cosas con vectores. En este ejemplo un for each.

        sc.close();

    }
}
