package Ejercicios_7_8_9;
//Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
//un HashMap y un ArrayList, LinkedList o array.*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.sun.tools.javac.file.JavacFileManager.getMessage;

public class PogramaSorpresa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Introduce tu apodo: ");
        String apodo = scanner.nextLine();
        System.out.println("Introduce tu equipo de futbol favorito: ");
        String equipoFutbol = scanner.nextLine();
        System.out.println("Introduce color favorito: ");
        String color = scanner.nextLine();
        System.out.println("Introduce tu lugar favorito: ");
        String lugar = scanner.nextLine();

        System.out.println("Introduce el fichero de origen: ");
        String origen = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String destino = scanner.nextLine();

        copiar(origen, destino);
        System.out.println(nombre + " " + apellido + " " + "tu archivo copiado es: " + destino);

        System.out.println("\nCreacion de Mapa\n");
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, nombre);
        map.put(2, apellido);
        map.put(3, apodo);
        map.put(4, equipoFutbol);
        map.put(5, color);
        map.put(6, lugar);

        for (Map.Entry elemento: map.entrySet()) {
            System.out.println("Elemento clave es: "  + elemento.getKey());
            System.out.println("Elemento valor es: "  + elemento.getValue());
        }


    }


    private static void copiar (String origen, String destino) {
        byte[] datos = new byte[0];
        try {
            InputStream in = new FileInputStream(origen);
            datos = in.readAllBytes();
            in.close();


            PrintStream out = new PrintStream(destino);
            out.write(datos);
            out.close();
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }

    }

    private static void reescribir (String origen, Map map) {
        try {
            InputStream in = new FileInputStream(origen);
            byte [] datos = in.readAllBytes();

            in.close();

            PrintStream out = new PrintStream((OutputStream) map);
            out.write(datos);
            out.close();
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
}}
