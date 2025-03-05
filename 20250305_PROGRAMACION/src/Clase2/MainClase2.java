package Clase2;

public class MainClase2 {
    public static void main(String[] args) {
    //Declaras constante con la palabra "final"
        final double PI = 3.1416;
        final int mayoriaEdad = 18;

        System.out.println("EL valor de PI es: " + PI);
        System.out.println("La edad mínima para ser adulto en Spain es: " + mayoriaEdad);

    //Operadores relacionales

        int x = 10;
        int y = 20;

        System.out.println("¿Es x igual a y? " + (x==y));
        System.out.println("¿Es x diferente a y? " + (x!=y));
        System.out.println("¿Es x mayor que y? " + (x>y));
        System.out.println("¿Es x menor que y? " + (x<y));

    //Operadores lógicos. Es aquel que combina expresiones lógicas
        boolean a = true;
        boolean b = false;

        System.out.println("a AND b: " + (a && b)); //Y
        System.out.println("a OR b: " + (a || b)); //O
        System.out.println("NOT a: " + (!a));

    //Expresiones y/o evaluaciones
        int resultado = (10 + 5) * 2 / 3;
        int resultado2 = 10 + 5 * 2 / 3;

        System.out.println("El resultado de la expresión es: " + resultado);
        System.out.println("El resultado de la expresión es: " + resultado2);

    }
}
