package Ejercicios_clase2;

public class Ejercicios_clase2 {
    public static void main(String[] args) {

//1️⃣ Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.

        System.out.println("EJERCICIO 1");
        System.out.println();

        final double gravedad = 9.81;
        System.out.println("La constante de la gravedad en la Tierra es: " + gravedad);

        System.out.println();

//2️⃣ Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.

        System.out.println("EJERCICIO 2");
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

        System.out.println("EJERCICIO 3");
        System.out.println();

        int edad1 = 12;
        int edad2 = 23;
        boolean esMayorEdad1 = edad1 > 18;
        boolean esMayorEdad2 = edad2 > 18;

        System.out.println("¿La persona 1 que tiene 12 años es mayor de edad? " + esMayorEdad1);
        System.out.println("¿La persona 2 que tiene 23 años es mayor de edad? " + esMayorEdad2);

        System.out.println();

//4️⃣ Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.

        System.out.println("EJERCICIO 4");
        System.out.println();

        /*
4️⃣ Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.
5️⃣ Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?
6️⃣ Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.
7️⃣ Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.
8️⃣ Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).
9️⃣ Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).
🔟 Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.
         */

    }
}
