package Clase7_20250402;

public class Clase7 {
    public static void main(String[] args) {
        int edad = -5;
        assert edad>0 : "La edad no puede ser negativa"; // Si el condicional es true, pasa a la siguiente línea de código.
        System.out.println("Edad: " + edad);

        // Parece que sirve con un try-catch pero sin error de programación,
        // el error lo damos nosotros por el concepto de nuestro condicional.
    }
}
