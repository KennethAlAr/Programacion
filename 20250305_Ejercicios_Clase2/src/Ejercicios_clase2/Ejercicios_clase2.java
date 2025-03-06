package Ejercicios_clase2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios_clase2 {
    public static void main(String[] args) {

//1️⃣ Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.

        System.out.println("\uD83D\uDCCC EJERCICIO 1");
        System.out.println();

        final double gravedad = 9.81;
        System.out.println("La constante de la gravedad en la Tierra es: " + gravedad);

        System.out.println();

//2️⃣ Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.

        System.out.println("\uD83D\uDCCC EJERCICIO 2");
        System.out.println();

        int a = 25;
        int b = 7;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("La suma entre a y b es: " + suma);
        System.out.println("La resta de a menos b es: " + resta);
        System.out.println("La multiplicación entre a y b es: " + multiplicacion);
        System.out.println("La división entre a y b es: " + division);
        System.out.println("La resta de la división entre a y b es: " + modulo);

        System.out.println();

//3️⃣ Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).

        System.out.println("\uD83D\uDCCC EJERCICIO 3");
        System.out.println();

        int edad1 = 12;
        int edad2 = 23;
        boolean esMayorEdad1 = edad1 > 18;
        boolean esMayorEdad2 = edad2 > 18;

        System.out.println("¿La persona 1 que tiene 12 años es mayor de edad? " + esMayorEdad1);
        System.out.println("¿La persona 2 que tiene 23 años es mayor de edad? " + esMayorEdad2);

        System.out.println();

//4️⃣ Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.

        System.out.println("\uD83D\uDCCC EJERCICIO 4");
        System.out.println();

        Scanner primerNumeroInput = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        int primerNumero = primerNumeroInput.nextInt();

        Scanner segundoNumeroInput = new Scanner((System.in));
        System.out.println("Ingresa otro número entero:");
        int segundoNumero = segundoNumeroInput.nextInt();

        if (primerNumero > segundoNumero) {
            System.out.println("el mayor es " + primerNumero + " y el menor es " + segundoNumero + ".");
        } else if (primerNumero < segundoNumero) {
            System.out.println("el mayor es " + segundoNumero + " y el menor es " + primerNumero + ".");
        } else {
            System.out.println("Los dos números son el mismo: " + primerNumero + ".");
        }

        System.out.println();

//5️⃣ Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?

        System.out.println("\uD83D\uDCCC EJERCICIO 5");
        System.out.println();

        boolean expresionLogica = (5 > 3) && (10 < 20);

        System.out.println("El resultado de la expresión lógica (5 > 3) && (10 < 20) es: " + expresionLogica);

        System.out.println();

//6️⃣ Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenido

        System.out.println("\uD83D\uDCCC EJERCICIO 6");
        System.out.println();

        boolean expresionLogica2 = (5 > 3) || (10 > 20);

        System.out.println("El resultado de la expresión lógica (5 > 3) || (10 > 20) es: " + expresionLogica2);

        /*
        El resultado de ambas expresiones es "true". En el ejercicio 5 ambas condiciones son true y al tratarse de una
        operación lógica conjuntiva, el resultado es "true".
        En el caso del ejercicio 6 solo la primera parte de la expresión es "true", pero al tratarse de una operación
        lógica disyuntiva, solo hace falta que una de las partes sea "true" para que el resultado sea "true".
         */

        System.out.println();

//7️⃣ Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.

        System.out.println("\uD83D\uDCCC EJERCICIO 7");
        System.out.println();

        int x = 10;
        int y = 20;
        int z = 30;

        int sumaxy = x + y;

        System.out.println("¿Es x + y mayor que z? " + (sumaxy > z));
        System.out.println("¿Es x + y menor que z? " + (sumaxy < z));
        System.out.println("¿Es x + y igual que z? " + (sumaxy == z));

        System.out.println();

//8️⃣ Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).

        System.out.println("\uD83D\uDCCC EJERCICIO 8");
        System.out.println();

        Scanner numero1Input = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        int numero1 = numero1Input.nextInt();

        Scanner numero2Input = new Scanner((System.in));
        System.out.println("Ingresa otro número entero:");
        int numero2 = numero2Input.nextInt();

        int numeroMayor, numeroMenor;

        if (numero1 > numero2) {
            numeroMayor = numero1;
            numeroMenor = numero2;
        } else {
            numeroMayor = numero2;
            numeroMenor = numero1;
        }

        if (numeroMayor % numeroMenor == 0) {
            System.out.println(numeroMayor + " es múltiplo de " + numeroMenor);
        } else {
            System.out.println(numeroMayor + " no es múltiplo de " + numeroMenor);
        }

        System.out.println();

        /*
9️⃣ Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).
🔟 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.
         */

    }
}
