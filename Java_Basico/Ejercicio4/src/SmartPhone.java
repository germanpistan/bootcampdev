public class SmartPhone extends SmartDevice{
    int ram;
    int pixelCamara;

    public SmartPhone(String fabricante, String modelo, double capacidadProcesador, boolean resistenteAgua, String color, int ram, int pixelCamara) {
        super(fabricante, modelo, capacidadProcesador, resistenteAgua, color);
        this.ram = ram;
        this.pixelCamara = pixelCamara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "ram=" + ram +
                ", pixelCamara=" + pixelCamara +
                ", capacidadProcesador=" + capacidadProcesador +
                ", resistenteAgua=" + resistenteAgua +
                ", color='" + color + '\'' +
                '}';
    }
}

