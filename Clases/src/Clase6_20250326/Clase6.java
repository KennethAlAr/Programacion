package Clase6_20250326;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Clase6 {
    public static void main(String[] args) {
    //Ejercicio 1 – Salir de un bucle while con break
    //Haz un programa que pida al usuario números enteros positivos.
    //El programa debe terminar cuando el usuario introduzca el número 0. Usa un bucle while con break.

        Scanner sc = new Scanner((System.in));
        int numero;

        while(true) {
            System.out.println("Introduce un número y pon 0 para salir:");
            numero = sc.nextInt();
            if(numero == 0) {
                break; //Si es 0 salgo del bucle.
            }
            System.out.println("Has introducido: " + numero);
        }
        System.out.println("Programa finalizado.");
        System.out.println("\n");

    //Ejercicio 2 – Saltarse los múltiplos de 3 con continue
    //Escribe un programa que muestre los números del 1 al 10,
    //excepto los múltiplos de 3. Usa un bucle for con continue.

        for (int i = 1; i<=10; i++) {
            if(i%3 == 0){
                continue; //Si es múltiplo de 3, sáltame.
            }
            System.out.println(i);
        }
        System.out.println("\n");

    //Ejercicio 3 – Finalizar un bucle for al encontrar un número concreto
    //Haz un programa que busque el número 7 entre los números del 1 al 20.
    //Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break.

        for (int i=1; i<=20; i++) {
            if (i==7) {
                System.out.println("¡Has encontrado el número 7!");
                break;
            }
            System.out.println("Probando qué se ve con: " + i);
        }
        System.out.println("\n");

    //Ejercicio 4 – Evitar mostrar letras vocales con continue
    //Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.

        String palabra = "PROGRAMACION";
        for (int i = 0; i<palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                continue;
            }
            System.out.println(letra);
        }
        System.out.println("\n");

    //Ejercicio 5 – Dividir dos números con try-catch
    //Haz un programa que divida dos números enteros introducidos por el usuario.
    //Usa try-catch para evitar que el programa se rompa si el divisor es 0.

        System.out.println("Introduce el numerador de la división:");
        int numerador = sc.nextInt();
        System.out.println("Introduce el denominador de la división:");
        int denominador = sc.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("El resultado de tu división es: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("¡Has intentado dividir entre cero!");
        }
        //No sé por qué, si la división es con doubles, dividir entre cero no da error, el resultado es "Infinity".
        System.out.println("\n");

    //Ejercicio 6 – Acceder a una posición no válida de una cadena (charAt) con control de excepción
    //Solicita una palabra al usuario y pide una posición. Intenta mostrar el carácter en esa posición usando try-catch.
    //Si se produce un error, muestra un mensaje.

        System.out.println("Introduce una cadena:");
        sc.nextLine();
        String cadena = sc.nextLine();

        System.out.println("Qué posición de la cadena quieres ver: ");
        int posicion = sc.nextInt();

        try {
            char letra_cadena = cadena.charAt(posicion);
            System.out.println("El carácter en la posición " + posicion + " de la cadena "
                    + cadena + " es '" +letra_cadena + "'");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("La cadena que has indicado no tiene una posición " + posicion);
        }
        System.out.println("\n");

    //Ejercicio 7 – Mensaje de fin con finally
    //Haz un programa que intente dividir dos números.
    //Usa try-catch-finally para mostrar siempre un mensaje final que diga "Operación terminada".

        System.out.println("Introduce un número entero a dividir:");
        int numerador_ej7 = sc.nextInt();

        System.out.println("Introduce un número entero para dividir el anterior:");
        int denominador_ej7 = sc.nextInt();

        try {
            int resultado_ej7 = numerador_ej7 / denominador_ej7;
            System.out.println("El resultado de tu división es: " + resultado_ej7);
        } catch (ArithmeticException e) {
            System.out.println("Has intentado dividir entre cero.");
        } finally {
            System.out.println("Operación terminada");
        }
        System.out.println("\n");

    //Ejercicio 8 – Leer números y sumar los positivos, ignorando los negativos con continue
    //Pide al usuario 5 números enteros. Suma solo los positivos usando continue para ignorar los negativos.

        int resultado_ej8 = 0;

        for (int i = 0; i <= 4; i++) {
            if (i==0){
                System.out.println("Introduce un número entero, puede ser negativo o positivo: ");
            } else if (i > 0 && i < 4) {
                System.out.println("Introduce otro número entero, puede ser negativo o positivo: ");
            } else {
                System.out.println("Introduce un último número entero, puede ser negativo o positivo: ");
            }
            int numero_ej8 = sc.nextInt();
            if (numero_ej8 < 0) {
                continue;
            }
            resultado_ej8 = resultado_ej8 + numero_ej8;
        }

        System.out.println("El resultado de sumar los números positivos que has introducido es: " + resultado_ej8);
        System.out.println("\n");

    //Ejercicio 9 – Detectar si se ha introducido texto en lugar de número (try-catch)
    //Pide al usuario que introduzca un número. Si escribe una palabra u otro texto,
    //el programa debe capturar la excepción y mostrar "Eso no es un número".

        System.out.println("Introduce un número: ");

        try {
            double numero_ej9 = sc.nextDouble();
            System.out.println("Tu número es: " + numero_ej9);
        } catch (InputMismatchException e) {
            System.out.println("Eso no es un número.");
        }
        System.out.println("\n");

    //Ejercicio 10 – Salir de un bucle do-while cuando se adivina un número secreto
    //Crea un número secreto entre 1 y 10. El usuario tiene que adivinarlo.
    //Usa do-while y break para salir cuando acierte.

        Random random = new Random();
        int numero_random = random.nextInt(1,11);
        int respuesta;

        System.out.println("Intenta adivinar el número secreto del 1 al 10:");

        do {
            respuesta = sc.nextInt();
            if (respuesta < numero_random) {
                System.out.println("Incorrecto, el número es más alto.");
            } else if (respuesta > numero_random) {
                System.out.println("Incorrecto, el número es más bajo.");
            } else if (respuesta == numero_random) {
                System.out.println("Correcto, el número secreto era " + numero_random);
                break;
            }
        } while(true);

        sc.close();
    }
}