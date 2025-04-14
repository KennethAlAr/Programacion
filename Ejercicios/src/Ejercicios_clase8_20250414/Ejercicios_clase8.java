package Ejercicios_clase8_20250414;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Ejercicios_clase8 {
    public static void main(String[] args) {
//        Ejercicio 1: División segura
//
//        Objetivo: Añadir manejo de ArithmeticException y InputMismatchException

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce el dividendo: ");
            int a = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);
        }catch(ArithmeticException e_division) {
            System.out.println("No se puede dividir entre cero");
        }catch(InputMismatchException e_input) {
            System.out.println("No has introducido un número entero");
        } finally {
            System.out.println("Cerrando programa");
        }

//        Instrucción: Añade try-catch-finally para evitar que el programa falle si el divisor es cero o si se introduce texto.


//        Ejercicio 2: Convertidor de texto a número
//
//        Objetivo: Añadir manejo de NumberFormatException

        sc.nextLine();

        try {
            System.out.print("Escribe un número (en texto): ");
            String texto = sc.nextLine();

            int numero = Integer.parseInt(texto);
            System.out.println("Número x 10: " + (numero * 10));
        } catch (NumberFormatException e_numero) {
            System.out.println("No has escrito un número");
        } finally {
            System.out.println("Cerrando programa");
        }

//        Instrucción: Añade un bloque try-catch para evitar que el programa se rompa si el usuario escribe letras.


//        Ejercicio 3: Acceso a un array
//
//        Objetivo: Añadir manejo de ArrayIndexOutOfBoundsException


        String[] frutas = {"Manzana", "Banana", "Naranja"};

        try {
            System.out.print("Introduce un número entre 0 y 2: ");
            int posicion = sc.nextInt();

            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        } catch (ArrayIndexOutOfBoundsException e_array) {
            System.out.println("No has introducido un número entero entre 0 y 2");
        } finally {
            System.out.println("Cerrando programa");
        }

//        Instrucción: Usa try-catch para evitar error si se ingresa una posición incorrecta (como 5 o -1).


//                Ejercicio 4: Adivina el número aleatorio
//
//        Objetivo: Añadir manejo de NumberFormatException al convertir texto a número

        sc.nextLine();
        Random random = new Random();
        int secreto = random.nextInt(10) + 1;

        try {
            System.out.print("Adivina el número (1-10): ");
            String intentoTexto = sc.nextLine();

            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        } catch (NumberFormatException e_random) {
            System.out.println("No has escrito un número entero");
        } finally {
            System.out.println("Cerrando programa");
        }

//        Instrucción: Añade manejo de NumberFormatException y un finally que diga: "Juego finalizado."


//        Ejercicio 5: Longitud de un nombre
//
//        Objetivo: Añadir manejo de NullPointerException

        String nombre = null;
        try {
            System.out.println("La longitud del nombre es: " + nombre.length());
        } catch (NullPointerException e_null) {
            System.out.println("El nombre tiene valor 'null', por lo tanto no tiene longitud");
        } finally {
            System.out.println("Cerrando programa");
        }

//        Instrucción: Usa try-catch para evitar que el programa se detenga si nombre es null.

        sc.close();
    }
}