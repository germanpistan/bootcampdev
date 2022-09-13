import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("TAILRECURSION");
        tailRecursion(5);
        System.out.println("\n DIFERENCIA CON HEAD\n");
        headRecursion(5);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Suma Iterativa: " + sumaIterativa(5));
        System.out.println("Suma Recursiva: " + sumaRecursiva(5));
        System.out.println("Suma Funcional: " + sumaFuncional(5));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Factorial Iterativa: " + factorialIterativo(5));
        System.out.println("Factorial Recursiva: " + factorialRecursivo(5));
        System.out.println("Factorial Funcional: " + factorialFuncional(5));

    }

    //factorial de un numero en forma iterativa
    public static int factorialIterativo (int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    //forma recursiva de factorial de un numero

    public static int factorialRecursivo (int numero) {
        if (numero == 0) {
            return 1;
        }

        return numero * factorialRecursivo(numero- 1);  //forma tailRecursion
    }

    //forma funcional de un factorial de un numero

    public static int factorialFuncional(int numero) {
        return IntStream.rangeClosed(1, numero)
                .reduce(1, (a,b) -> a * b);
    }

    //forma funcional de recursividad
    public static int sumaFuncional (int numero) {
        return IntStream.rangeClosed(1,5)     //clase IntStream con metodo rangeClosed para generar numeros
                .reduce(0, (a,b) -> a + b);     //metodo reduce con lamda
    }
    public static int sumaRecursiva (int numero) {
        if (numero ==1) {
            return 1;
        }
        return numero + sumaRecursiva( numero -1);
    }
    public static void headRecursion (int valor) {
        if (valor == 0) {
            return;
        }
        headRecursion(valor - 1); //primero se invoca la funcion recursiva, se hace todoy luego se lo imprime
        System.out.println(valor);
    }
    public static void tailRecursion (int valor) {
        if (valor == 0) {
            return;
        }
        System.out.println(valor);  //primero se lo imprime y luego se invoca a la funcion recursiva
        tailRecursion(valor - 1);
    }

    public static int sumaIterativa (int max) {
        //forma iterativa
        int resultado = 0;
        for ( int i = 0; i <= max; i++ ) {
            resultado = resultado + i;
        }
        return resultado;
    }
}
