package Clase3_20250312;

public class Clase3 {

    public static void main(String[] args) {
        //1. Conversión implícita de int a double
        int numeroEntero = 25;
        double numeroDecimal = numeroEntero;

        System.out.println("Número entero: " + numeroEntero);
        System.out.println("Número convertido a double: " + numeroDecimal);


        //2. Conversión explícita double a int con truncamiento
        double valorDecimal = 8.80;
        //conversion explícita, casting
        int valorEntero = (int) valorDecimal;

        System.out.println("Valor original, double: " + valorDecimal);
        System.out.println("Valor convertido con el int: " + valorEntero);


        //3. Desbordamiento. Int a byte
        int numeroGrande = 190;
        //Conversión explícita a byte
        byte numeroPequeno = (byte) numeroGrande;

        System.out.println("Número original en int: " + numeroGrande);
        System.out.println("Número covertido a byte: " + numeroPequeno);

        //4. Conversión de String a int con Integer.parseInt()

        String texto = "123";
        int numero = Integer.parseInt(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Número convertido: " + numero);
        //Haz el cambio al revés

        //5. Convertir un int a String (coger valor de numero)

        int numerito = 456;
        String textito = String.valueOf(numerito);

        System.out.println("Número: " + numerito);
        System.out.println("Texto convertido: " + textito);

        //6. Conversión double a String (Pasar de uno a otro)

        double precio = 99.99;
        String textoPrecio = Double.toString(precio);

        System.out.println("Precio como String: " + textoPrecio);
        String textoPrecito = String.valueOf(precio);

        //7. Conversión de Boolean a String

        boolean activo = true;
        String estado = String.valueOf(activo);

        System.out.println("Estado convertido: " + estado);

        //8. Conversión para operaciones matemáticas

        int a = 5 , b = 2;

        System.out.println("División entera: " + (a/b));
        //La división entera trunca los decimales ya que el divisor y el dividendo son enteros.

        //Conversión a double para tener decimales

        double resultado = (double)a/b;

        System.out.println("División con casting: " + resultado);

        //9. Conversión de long a int y de float a int

        long numeroLargo = 1_000_000_000L;
        //Convertir de long a int
        int numeroEnterito = (int)numeroLargo;

        System.out.println("Número con cambio de long a int: " + numeroEnterito);

    }
}