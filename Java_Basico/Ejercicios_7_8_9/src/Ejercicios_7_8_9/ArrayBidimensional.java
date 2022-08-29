package Ejercicios_7_8_9;
//Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento
//en ambas dimensiones.

public class ArrayBidimensional {
    public static void main(String[] args) {
        int arrayBidimensional [][]= {
                {1, 2, 3, 4, 5,},
                {43, 5, 43, 21, 2}
        };

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("Estoy en la posicion i: " + i + " en j: " + j);
                System.out.println("Valor: " + arrayBidimensional[i][j]);
            }
        }
        }
    }

