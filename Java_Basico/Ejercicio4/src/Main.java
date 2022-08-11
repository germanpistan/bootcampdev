/*Crear una clase SmartDevice
Crear clases hijas: SmartPhone y SmartWatch
Agregar atributos tal cual tendrian en la realidad
Crear constructor vacio y con todos los parametros para cada clase
Desde una clase Main, crear objetos de cada una y utilizarlos para imprimir sus valores por consola
 */


public class Main {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("samsung","galaxys9",3.1,true,"gris",4,20);
        System.out.println("El smartPhone es: " + smartPhone.fabricante + " " +  smartPhone.modelo + " " + smartPhone);

        SmartWatch smartWatch = new SmartWatch("Apple","series3", 2.1,true,"negro",780);
        System.out.println("El smarWatch es: " + smartWatch.fabricante + " " +  smartWatch.modelo + " " + smartWatch);
        

    }
}
