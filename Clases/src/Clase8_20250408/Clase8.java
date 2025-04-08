package Clase8_20250408;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1. Saludar\n2.Salir");
        System.out.println("Elige una opción");

        try {
            int opcion = entrada.nextInt();

            int resultado = 5 / opcion;

            switch (opcion) {
                case 1 -> { //Este es otro formato para hacer los case del switch.
                    System.out.println("Hola");
                    System.out.println("Hola");
                }
                case 2 -> System.out.println("Saliendo");
                default -> System.out.println("Opción incorrecta");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes escribir un número");
        } catch (ArithmeticException e) { //Se pueden concatenar diferentes catch para diferentes exceptions
            System.out.println("División por cero");
        } finally {
            System.out.println("FIN");
        }

        entrada.close();

    }
}
