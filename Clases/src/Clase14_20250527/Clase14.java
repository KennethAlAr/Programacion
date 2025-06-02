package Clase14_20250527;

import java.util.Scanner;

public class Clase14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();

        saludar();

        String name = "María";

        saludar("Juan");
        saludar(name);

        name = "Kenneth";
        System.out.println(saludar2(name));

        System.out.println(sumar(5, 7));
        System.out.println(sumar());
        System.out.println(sumar(2, 5, 8, 5, 7, 4, 5, 8));

        if(esPar(num)) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }

        System.out.println(!esPar(num) ? "No es par" : "Es par"); //Es otra manera de hacer if's sencillos.

        String email = "pepe@gmail.com";
        String nombreUsuario = email.substring(0, email.indexOf("@"));
        System.out.println(nombreUsuario);
        String servidor = email.substring(email.indexOf("@")+1);
        System.out.println(servidor);

        int[] numeros = {1,5,6,8,10};
        System.out.println("La media es: " + String.format("%.2f", calcularMedia(numeros)));

    }

//Podemos poner las funciones donde queramos, nosotros las pondremos debajo del main.

    // 1. Función para imprimir saludo.
    public static void saludar() {
        System.out.println("Hola");
    }

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static String saludar2(String nombre) {
        return("¡Hola, " + nombre + "!");
    }

    public static int sumar (int n1, int n2) {
        return n1 + n2;
    }

    public static int sumar (int... numeros) { // Así podemos poner un array de ints del tamaño del número de números que se introduzcan.
        int suma = 0;

        for (int n: numeros) {
            suma += n;
        }

        return suma;
    }

    public static boolean esPar(int n1) {
        if (n1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double calcularMedia(int[] numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return (double) suma / numeros.length; //Hace falta castear a double para asegurar que la división entre enteros salga double.
    }

}
