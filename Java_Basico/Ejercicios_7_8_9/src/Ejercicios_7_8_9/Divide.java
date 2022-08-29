package Ejercicios_7_8_9;
//Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
//ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
//mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

import java.util.Scanner;

public class Divide {

        public static int dividir (int a, int b) throws ArithmeticException {
            return (a / b);
        }

        public static void main(String[] args) {
        System.out.println("--------------Divide Por Cero----------------------");

        Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce los numeros que vas a dividir: ");
            System.out.println("Numero 1: ");
            int a = scanner.nextInt();
            System.out.println("Numero 2: ");
            int b = scanner.nextInt();

            try {
                System.out.println("El resultado es: " + dividir(a,b));
            } catch (ArithmeticException e) {
                System.out.println("No se puede realizar la division");

            } finally {
                System.out.println("Demo de código");
            }




    }
}
