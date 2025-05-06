package Ejercicios_clase9_20250422;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios_clase9_2 {
    public static void main(String[] args) {

//      6. Invertir un array
//      Crea un programa que invierta los elementos de un array. Por ejemplo, si el array es {1,
//      2, 3, 4, 5}, el resultado debe ser {5, 4, 3, 2, 1}.

        int[] arrayAInvertir = {1, 2, 3, 4, 5};

        int[] arrayInvertido = new int[arrayAInvertir.length];

        for (int i = 0; i < arrayInvertido.length; i++) {
            arrayInvertido[i] = arrayAInvertir[arrayAInvertir.length - 1 - i];
        }

        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.println("Número en la posición " + (i + 1) + ": " + arrayInvertido[i]);
        }

//      7. Copiar sin duplicados
//      Dado un array con posibles números repetidos, crea un nuevo array que contenga los
//      mismos elementos sin duplicados.
//      Ejemplo: {1, 2, 2, 3, 4, 4, 5} → {1, 2, 3, 4, 5}.

        Integer[] arrayDuplicados = {1, 2, 2, 3, 4, 4, 5};

        ArrayList<Integer> listSinDuplicados = new ArrayList<>();

        for (int i = 0; i < arrayDuplicados.length; i++) {
            if (!listSinDuplicados.contains(arrayDuplicados[i])) {
                listSinDuplicados.add(arrayDuplicados[i]);
            }
        }

        int[] arraySinDuplicados = new int[listSinDuplicados.size()];

        for (int i = 0; i < listSinDuplicados.size(); i++) {
            arraySinDuplicados[i] = listSinDuplicados.get(i);
        }

        for (int i = 0; i < arraySinDuplicados.length; i++) {
            System.out.println("Número en la posición " + (i + 1) + ": " + arraySinDuplicados[i]);
        }

//      8. Rotar elementos
//      Escribe un programa que rote los elementos de un array una posición hacia la derecha.
//      Ejemplo: {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4}.

        int[] arrayARotar = {1, 2, 3, 4, 5};

        int[] arrayRotado = new int[arrayARotar.length];

        for (int i = 0; i < arrayARotar.length; i++) {
            if (i==0) {
                arrayRotado[i] = arrayARotar[arrayARotar.length-1];
            } else {
                arrayRotado[i] = arrayARotar[i-1];
            }
        }

        for (int i = 0; i < arrayRotado.length; i++) {
            System.out.println("Número en la posición " + (i + 1) + ": " + arrayRotado[i]);
        }

//      9. Comparar arrays
//      Pide al usuario que introduzca dos arrays de enteros del mismo tamaño y muestra
//      cuántos elementos coinciden en la misma posición.
//      Ejemplo:
//      Array 1: {1, 2, 3, 4, 5}
//      Array 2: {1, 4, 3, 0, 5}
//      Coinciden en 3 posiciones (índices 0, 2 y 4).

        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        int contador = 1;

        System.out.println("Introduce dos arrays de enteros de 5 elementos cada uno:\n");
        while (contador < 6) {
            System.out.println("Introduce el elemento " + contador + " del primer array:\n");
            array1[contador-1] = sc.nextInt();
            sc.nextLine();
            contador++;
        }

        contador = 1;

        while (contador < 6) {
            System.out.println("Introduce el elemento " + contador + " del segundo array:\n");
            array2[contador-1] = sc.nextInt();
            sc.nextLine();
            contador++;
        }

        int contadorCoincidencias = 0;
        ArrayList<Integer> listaCoincidencias = new ArrayList<>();

        for (int i = 0; i < array1.length; i ++) {
            if (array1[i] == array2[i]) {
                contadorCoincidencias++;
                listaCoincidencias.add(i);
            }
        }

        if (contadorCoincidencias > 0){
            System.out.println("Coinciden en " + contadorCoincidencias + " posiciones: índices " + listaCoincidencias);
        }

        sc.close();

//      10. Frecuencia de elementos
//      Dado un array de enteros, muestra cuántas veces se repite cada valor.
//      Ejemplo: {1, 2, 2, 3, 1, 1} →
//      1 aparece 3 veces
//      2 aparece 2 veces
//      3 aparece 1 vez

        int[] arrayFrecuencia = {1, 2, 2, 4, 1, 1};

        ArrayList<Integer> noRepetidos = new ArrayList<>();

        for (int i = 0; i < arrayFrecuencia.length; i++) {
            if (!noRepetidos.contains(arrayFrecuencia[i])) {
                noRepetidos.add(arrayFrecuencia[i]);
                int contadorFrecuencia = 0;
                for (int j = 0; j < arrayFrecuencia.length; j++) {
                    if (arrayFrecuencia[i] == arrayFrecuencia[j]) {
                        contadorFrecuencia++;
                    }
                }
                if (contadorFrecuencia == 1) {
                    System.out.println(arrayFrecuencia[i] + " aparece " + contadorFrecuencia + " vez");
                } else {
                    System.out.println(arrayFrecuencia[i] + " aparece " + contadorFrecuencia + " veces");
                }
            }
        }

    }
}
