package Ejercicios_7_8_9;
//Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento
//y muestra el resultado final.
//Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos
//para ser añadidos al mismo.

import java.util.Vector;

public class Vector_Ejercicio {
    public static void main(String[] args) {
        Vector <String> vector = new Vector<String>();
        vector.add("Germany");
        vector.add("Argentina");
        vector.add("Poland");
        vector.add("Brazil");
        vector.add("Ukraine");
        System.out.println("Vector antes de borrar: " + vector);


        vector.remove (2);
        vector.remove (1);

        System.out.println("Datos del vector con datos eliminados 2 y 3: " + vector);

        System.out.println("\n-------------------- \n Respuesta\n--------------------");
        System.out.println("Desperdiciamos mucha memoria del sistema, ya que cada vez que se sobrepasa" +
                " el limite establecido (Por defecto, 10) la dimension del vector se duplica.");

   }
}


