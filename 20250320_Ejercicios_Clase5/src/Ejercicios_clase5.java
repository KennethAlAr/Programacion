import java.util.Scanner;
import java.util.Random;

public class Ejercicios_clase5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        📌 Ejercicios de Nivel Bajo (Fácil)

//1️⃣Ejercicio 1: Clasificación de edad
//Pide al usuario su edad e imprime si es menor de edad, adulto o adulto mayor.

        System.out.println("¿Cuál es tu edad?");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad\n");
        } else if (edad >= 18 && edad < 65) {
            System.out.println("Eres adulto\n");
        } else {
            System.out.println("Eres adulto mayor\n");
        }

//2️⃣Ejercicio 2: Contador de vocales
//Pide al usuario una palabra y cuenta cuántas vocales tiene.

        scanner.nextLine();

        System.out.println("Escribe una palabra");
        String palabra = scanner.nextLine();

        int longitud_palabra = palabra.length();
        int contador_vocales = 0;

        for (int i=0; i < longitud_palabra; i++) {
            String letra = palabra.split("")[i];
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                contador_vocales = contador_vocales + 1;
            }
        }

        System.out.println("Tu palabra tiene " + contador_vocales + " vocales.\n");

//        📌 Ejercicios de Nivel Medio (Intermedio)

//3️⃣Ejercicio 3: Simulación de una calculadora
//Crea un menú que permita sumar, restar, multiplicar y dividir dos números ingresados por el usuario.

        System.out.println("Ingresa un número:");
        double primer_numero = scanner.nextDouble();

        System.out.println("Ingresa otro número:");
        double segundo_numero = scanner.nextDouble();

        System.out.println("**CALCULADORA**");
        System.out.println("1. Sumar.");
        System.out.println("2. Restar.");
        System.out.println("3. Multiplicar.");
        System.out.println("4. Dividir.");
        System.out.println("Ingresa el número de la opción que desea realizar:");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(primer_numero + " y " + segundo_numero + " suman: " + (primer_numero + segundo_numero) + "\n");
                break;
            case 2:
                System.out.println(primer_numero + " menos " + segundo_numero + " es: " + (primer_numero - segundo_numero) + "\n");
                break;
            case 3:
                System.out.println(primer_numero + " por " + segundo_numero + " es: " + (primer_numero * segundo_numero) + "\n");
                break;
            case 4:
                System.out.println(primer_numero + " entre " + segundo_numero + " es: " + (primer_numero / segundo_numero) + "\n");
                break;
            default:
                System.out.println("Opción no válida. Cerrando programa.\n");
        }

//4️⃣Ejercicio 4: Números pares hasta N
//Pide un número al usuario y muestra todos los números pares desde 1 hasta ese número.

        System.out.println("Ingresa un número entero positivo:");
        int numero_pares = scanner.nextInt();
        int i = 1;

        System.out.println("Los números pares desde 1 hasta " + numero_pares + " son los siguientes");

        while (i <= numero_pares) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("\n");

//5️⃣Ejercicio 5: Contraseña con intentos limitados
//Pide al usuario una contraseña. Solo tiene 3 intentos antes de bloquearse.

        scanner.nextLine();

        int intentos = 3;

        while (intentos > 0) {
            System.out.println("Ingresa la contraseña:");
            String contrasena = scanner.nextLine();
            if (contrasena.equals("javatienesuscosillas")) {
                System.out.println("¡Contraseña correcta! Acceso permitido.");
                break;
            } else {
                intentos--;
                if (intentos == 0) {
                    System.out.println("No quedan intentos. Acceso bloqueado.");
                } else {
                    System.out.println("Contraseña incorrecta. Tienes " + intentos + " intento/s.");
                }
            }
        }

        System.out.println("\n");

        //        📌 Ejercicios de Nivel Alto (Avanzado)

//6️⃣Ejercicio 6: Adivina el número
//Genera un número aleatorio entre 1 y 100 y deja que el usuario lo adivine con pistas.

        Random random = new Random();
        int numero_random = random.nextInt(1, 101);

        System.out.println("¡Adivina el número entre 1 y 100!");

        int respuesta = 0;

        do {
            respuesta = scanner.nextInt();
            if (respuesta < numero_random && respuesta < numero_random -10) {
                System.out.println("¡Frío frío! Un número mas alto:");
            } else if (respuesta < numero_random && respuesta >= numero_random -10) {
                System.out.println("¡Caliente caliente! Un número un poco mas alto:");
            } else if (respuesta > numero_random && respuesta > numero_random + 10) {
                System.out.println("¡Frío frío! Un número mas bajo:");
            } else if (respuesta > numero_random && respuesta <= numero_random +10) {
                System.out.println("¡Caliente caliente! Un número un poco mas bajo:");
            } else if (respuesta == numero_random) {
                System.out.println("¡Correcto! El número era " + numero_random + ".");
            }
        } while (numero_random != respuesta);

        System.out.println("\n");

//7️⃣Ejercicio 7: Serie Fibonacci
//Pide un número "n" y muestra los primeros "n" términos de la serie de Fibonacci.

        System.out.println("¿Cuántos términos de la serie de Fibonacci quieres ver?");
        int numero_n = scanner.nextInt();
        int termino = 1;
        int anterior = 0;

        do {
            System.out.println(termino);
            termino = termino + anterior;
            anterior = termino - anterior;
            numero_n--;
        } while (numero_n > 0);

        scanner.close();
    }
}
