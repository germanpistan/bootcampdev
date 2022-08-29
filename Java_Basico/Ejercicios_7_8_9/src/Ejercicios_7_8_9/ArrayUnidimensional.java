package Ejercicios_7_8_9;

//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

import java.lang.reflect.Array;

public class ArrayUnidimensional {
    public static void main(String[] args) {
        System.out.println("\nArrayUnidimensional\n");

        String textos [] = {"Germany", "Brazil", "France", "Belgium"};

        for (String texto : textos) {
            System.out.println(texto);
        }
    }
}
