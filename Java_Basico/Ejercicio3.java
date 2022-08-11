package com.OBCJavaBasic2;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*En este ejercicio tenéis que crear un bucle que permita concatenar
textos e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
String[] nombres = {"", "", "", ""}*/

        //Creamos el array de tipo String
        String[] texto = new String[]{"Texto 1", "Texto 2", "Texto 3"};
        //Recorremos el array y mostramos su contenido
        for(String palabras:texto) {

            System.out.print(palabras);
        }


        }
    }

