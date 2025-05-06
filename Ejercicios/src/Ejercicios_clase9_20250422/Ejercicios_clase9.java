package Ejercicios_clase9_20250422;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.OptionalInt;


public class Ejercicios_clase9 {
    public static void main(String[] args) {
//      1. Declarar y mostrar
//      Declara un array de 5 números enteros, asígnales valores y muéstralos por pantalla.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 1:\n");

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número para la posición " + (i+1) + ":");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en la posición " + (i + 1) + ": " + numeros[i]);
        }

//      2. Sumar elementos
//      Suma todos los valores de un array de enteros y muestra el total.

        System.out.println("\nEjercicio 2:\n");

        int[] numerosSuma = new int[5];
        int suma = 0;
        int sumaStream = 0;

        for (int i = 0; i < numerosSuma.length; i++) {
            System.out.println("Introduce el número para la posición " + (i+1) + ":");
            numerosSuma[i] = sc.nextInt();
        }

        for (int numero : numerosSuma) {
            suma += numero;
        }

        System.out.println("La suma de todos los números es: " + suma);

        sumaStream = Arrays.stream(numerosSuma).sum();

        System.out.println("La suma de todos los números es: " + sumaStream + " (método Stream)");

//      3. Valor máximo y mínimo
//      Dado un array de enteros, muestra el valor más alto y el más bajo.

        System.out.println("\nEjercicio 3:\n");

        int[] numerosMaxMin = new int[5];

        for (int i = 0; i < numerosMaxMin.length; i++) {
            System.out.println("Introduce el número para la posición " + (i+1) + ":");
            numerosMaxMin[i] = sc.nextInt();
        }

        int numMax = numerosMaxMin[1];
        int numMin = numerosMaxMin[1];
        OptionalInt streamMax;
        OptionalInt streamMin;

        for (int i = 0; i < numerosMaxMin.length; i++) {
            if (numerosMaxMin[i] > numMax) {
                numMax = numerosMaxMin[i];
            }
            if (numerosMaxMin[i] < numMin) {
                numMin = numerosMaxMin[i];
            }
        }

        System.out.println("El número mas grande de los introducidos es: " + numMax);
        System.out.println("El número mas pequeño de los introducidos es: " + numMin);

        streamMax = Arrays.stream(numerosMaxMin).max();
        streamMin = Arrays.stream(numerosMaxMin).min();

        System.out.println("El número mas grande de los introducidos es: " + streamMax + " (Método stream)");
        System.out.println("El número mas pequeño de los introducidos es: " + streamMin + " (Método stream)");

//      4. Buscar un elemento
//      Pide al usuario un número y muestra si está presente en un array, y en qué posición.

        System.out.println("\nEjercicio 4:\n");

        int[] numerosElemento = new int[5];
        numerosElemento[0] = 5;
        numerosElemento[1] = 7;
        numerosElemento[2] = 9;
        numerosElemento[3] = 11;
        numerosElemento[4] = 13;

        System.out.println("Introduce un número para saber si está en el array:");
        int numeroIntroducido = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < numerosElemento.length; i++) {
            if (numeroIntroducido == numerosElemento[i]) {
                System.out.println("El número que has introducido, el " + numeroIntroducido +
                        ", se encuentra en la posición " + (i+1) +  " del array.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("Tu número no está en la lista.");
        }

//      5. Ordenar el array
//      Declara un array con números desordenados y ordénalo de menor a mayor utilizando
//      Arrays.sort().

        System.out.println("\nEjercicio 5:\n");

        int[] arrayNumeros = {34, 56, 12, 78, 63};
        int indice = 1;

        Arrays.sort(arrayNumeros);

        for (int numero : arrayNumeros) {
            System.out.println("Elemento " + indice + ": " + numero);
            indice ++;
        }

//      6. Crear una lista de nombres
//      Crea una ArrayList de tipo String, añade 5 nombres y muéstralos por pantalla.

        ArrayList<String> listaNombres = new ArrayList<>();

        listaNombres.add("Kenneth");
        listaNombres.add("Mario");
        listaNombres.add("Marina");
        listaNombres.add("Lucas");
        listaNombres.add("Sara");

        System.out.println(listaNombres);

//      7. Añadir y eliminar elementos
//      Crea una lista de tareas (ArrayList<String>), añade elementos y elimina uno por su nombre.

        ArrayList<String> listaTareas = new ArrayList<>();

        listaTareas.add("Limpiar coche");
        listaTareas.add("Hacer la comida");
        listaTareas.add("Estudiar");
        listaTareas.add("Mirar memes");
        listaTareas.add("Dormir");

        System.out.println(listaTareas);

        listaTareas.remove("Mirar memes");

        System.out.println(listaTareas);

//      8. Buscar en la lista
//      Pregunta al usuario un nombre, y busca si está en la lista. Si está, muestra su posición.

        ArrayList<String> nombresLista = new ArrayList<>(Arrays.asList("kenneth", "maria", "lucas", "núria", "rigoberto"));

        System.out.println("Introduce tu nombre para saber si está en la lista:\n");
        String inputNombre = sc.nextLine();

        if (nombresLista.contains(inputNombre.toLowerCase())) {
            System.out.println("Tu nombre está en la lista en la posición " + ((nombresLista.indexOf(inputNombre))+1) + ".");
        } else {
            System.out.println("Tu nombre no está en la lista.");
        }

//      9. Convertir array a lista
//      Dado un array de enteros, conviértelo a una ArrayList<Integer> y muestra su contenido.

        Integer[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        ArrayList<Integer> listaEnteros = new ArrayList<>(Arrays.asList(arrayEnteros));

        System.out.println(listaEnteros);

//      10. Eliminar duplicados de una lista
//      Crea una ArrayList con elementos repetidos (por ejemplo: [1, 2, 2, 3, 4, 4, 5])
//      Elimina los duplicados y muestra la lista final sin repetir.

        ArrayList<Integer> listaRepetidos = new ArrayList<>();

        listaRepetidos.add(1);
        listaRepetidos.add(2);
        listaRepetidos.add(2);
        listaRepetidos.add(3);
        listaRepetidos.add(4);
        listaRepetidos.add(4);
        listaRepetidos.add(5);

        listaRepetidos = new ArrayList<>(new LinkedHashSet<>(listaRepetidos));

        System.out.println(listaRepetidos);

        sc.close();

    }
}
