package Ejercicios_clase14_20250527;
import java.util.Scanner;

public class Ejercicios_clase14 {
    public static void main(String[] args) {

        String[] datos = cargarDatos();

        imprimirDatos(datos[0], Integer.parseInt(datos[1]));

    }

    public static String[] cargarDatos() {

        Scanner sc = new Scanner(System.in);
        String[] datos = new String[2];

        System.out.println("Introduce tu nombre: ");
        datos[0] = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        datos[1] = sc.nextLine();

        return datos;
    }

    public static void imprimirDatos(String nombre, int edad) {

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

    }

}
