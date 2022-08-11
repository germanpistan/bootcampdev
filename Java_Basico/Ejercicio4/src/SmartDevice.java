public class SmartDevice {
    protected String fabricante;
    protected String modelo;
    protected double capacidadProcesador;
    protected boolean resistenteAgua;
    protected String color;

    public SmartDevice() {};

    public SmartDevice(String fabricante, String modelo, double capacidadProcesador, boolean resistenteAgua, String color) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidadProcesador = capacidadProcesador;
        this.resistenteAgua = resistenteAgua;
        this.color = color;
    }

}
