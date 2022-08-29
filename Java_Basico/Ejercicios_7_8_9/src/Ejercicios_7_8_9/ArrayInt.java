package Ejercicios_7_8_9;

import java.util.ArrayList;

// Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
//con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
//Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
public class ArrayInt {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            list.add(i);

            for (int num = 0; num < list.size(); num++) {

                if (list.get(num) % 2 == 0) {
                    list.remove(num);
                }
            }
        }

        System.out.println(list);

    }
}
