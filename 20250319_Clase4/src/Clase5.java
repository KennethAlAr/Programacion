import java.util.Scanner;

public class Clase5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1. Haz que el usuario elija un número y salga por consola si este es positivo, negativo o cero.

        System.out.println("Introduce un número entero.");
        int numero = scanner.nextInt(); // con esto leo el número del usuario

        // Estructura del "if-else"
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // 2. Créame un menú interactivo donde el usuario elija una opción y muestre un resultado.

        // Menú de opciones:
        System.out.println("*Menú de opciones");
        System.out.println("1. Saludar");
        System.out.println("2. Mensaje motivacional de Llados");
        System.out.println("3. Salir");

        System.out.println("Selecciona una opción");
        int opcion = scanner.nextInt(); // Leemos la opción del usuario.

        // Evaluar opciones del switch

        switch (opcion) {
            case 1:
                System.out.println("Hola, bienvenido.");
                break;
            case 2:
                System.out.println("¡Bro, esto es masivo!");
                break;
            case 3:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Macho, me has dado algo que no entiendo.");
        }

        // 3. Imprimir los números del 1 al 10 con un "for":
        // Usar un bucle para CONTAR del 1 al 10

        for(int i=1; i<=10; i++) {
            System.out.println("Número: " + i);
            // Así muestro cada iteración
        }

        // 4. Usa el while para pedir números

        int numero_ej4;

        System.out.println("Dame un número y pon 0 para salir.");
        numero_ej4 = scanner.nextInt();

        // Mientras que no sea cero, sigue pidiendo.

        while (numero_ej4 !=0) {
            System.out.println("Has introducido: " + numero_ej4);
            System.out.println("Introduce otro número.");
            numero_ej4 = scanner.nextInt();
        }
        System.out.println("Programa finalizado.");

        // 5. Pide contraseña y que no pueda entrar el usuario hasta que ponga "java123".

        scanner.nextLine();
        String password;

        // Bucle do-while
        do {
            System.out.println("Introduce tu contraseña: ");
            password = scanner.nextLine();
        } while (!password.equals("java123"));

        System.out.println("Acceso concedido.");

        scanner.close();
    }
}
