package Ejercicios_7_8_9;
//Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente
//el valor de cada elemento.

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayString {
    public static void main(String[] args) {
        System.out.println("\nArrayList de tipo String\n");

        ArrayList<String> list = new ArrayList<String>();
        list.add("German");
        list.add("English");
        list.add("Poland");
        list.add("Portuguese");

        LinkedList <String> linkedList = new LinkedList<String>();

        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }
        System.out.println("Elementos del array");
        for (String element : list) {
            System.out.println("Elementos del array: " + element);
        }

        System.out.println("Elementos de la linkedlist");
        for (String element : linkedList) {
            System.out.println("Elementos de la linkedlist: " + element);
        }

    }
}
