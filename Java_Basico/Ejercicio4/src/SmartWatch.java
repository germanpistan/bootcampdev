public class SmartWatch extends SmartDevice{
    int pixelPantalla;

    public SmartWatch(){};

    public SmartWatch(String fabricante, String modelo, double capacidadProcesador, boolean resistenteAgua, String color, int pixelPantalla) {
        super(fabricante, modelo, capacidadProcesador, resistenteAgua, color);
        this.pixelPantalla = pixelPantalla;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pixelPantalla=" + pixelPantalla +
                ", capacidadProcesador=" + capacidadProcesador +
                ", resistenteAgua=" + resistenteAgua +
                ", color='" + color + '\'' +
                '}';
    }
}
