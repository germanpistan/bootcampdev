import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Funcionales f = new Funcionales();
        //f.pruebas();

        ArrayList<String> nombres = new ArrayList();
        nombres.add("Germany");
        nombres.add("Brazil");
        nombres.add("France");
        nombres.add("Belgium");

        //si quiero meter filtro
        Stream<String> valores = nombres.stream()
                .map((x) -> x.toUpperCase())
                .filter(x -> x.startsWith("B"));  //aplica funcion de descarte filter. devuelve true o false


        valores.forEach(System.out::println);

        int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,};
        var stNumeros = Arrays.stream (numeros);
        var resultado = stNumeros
                .map(x -> x*2)
                .filter(x -> x % 2 == 0)
                .reduce(0,(x,y) -> {
            System.out.println("X es: " + x + " Y es: " + y);
            return x+y;
        });

        //forma con el for o imperativa

        int sumaTotal = 0;
        for (int numero: numeros){
            numero = numero *2;
            if (numero %2 != 0){
                continue;
            }
            sumaTotal += numero;
        }

        System.out.println("Mi suma de pares es: " + resultado + " y con for el total es: " + sumaTotal);

    }
    public static String toMayuscula(String nombre) {  //metodo
        return nombre.toUpperCase();

    }

}




