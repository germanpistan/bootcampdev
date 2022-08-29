package Ejercicios_7_8_9;
/*Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo",
* debe retornar "odnum aloh".*/

import java.util.Scanner;

public class CadenaAlReves {
    public static void main(String[] args) {
        System.out.println("\n CADENA AL REVES \n");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un texto: ");
        String texto = scanner.nextLine();

        StringBuilder reves = new StringBuilder(texto);
        texto = reves.reverse().toString();
        System.out.println(texto);

    }
}
