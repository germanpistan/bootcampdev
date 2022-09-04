import java.util.function.Function;

public class Funcionales {
    //ejemplo funcion que recibe una lambda
    //primero declaro la funcion pero como variable con Function
    //pide dos parametros <parametro que acepto entrada , parametro que devuelvo salida>, luego darle nombre

    private Function<String, String> toMayus = x -> x.toUpperCase();  //funcion lambda // x es el parametro de entrada
    //esta forma es funcional, y si fuera imperativo seria
    // public String toMayus (String x) {
    // return x.toUpperCase(); }

    private Function<Integer, Integer> sumador = x -> x.sum(x, x);  //no se puede aplicar mas xq pide devolver funcion


    public void pruebas() {
        System.out.println(toMayus.apply("German"));     //para invocar a la funcion flecha o alto nivel uso apply
        System.out.println(sumador.apply(5));
        Saluda(toMayus, "German");  //1er parametro una funcion

    }

    public void Saluda (Function<String, String> mifuncion, String nombre){  //funcion que tiene como parametro otra funcion
        mifuncion.apply(nombre);

    }


}
