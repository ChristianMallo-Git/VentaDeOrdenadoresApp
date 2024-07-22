public class Monitor {
    private String idMonitor;
    private String marca;
    private double tamaño;

    public Monitor(String idMonitor, String marca, double tamaño) {

        this.idMonitor = idMonitor;
        this.marca = marca;
        this.tamaño = tamaño;
    }

    public String getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(String idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + "]";
    }
}

