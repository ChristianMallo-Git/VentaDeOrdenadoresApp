public class Computadora {

    private String idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;

    public Computadora(String idComputadora, String nombre, Monitor monitor, Teclado teclado,
                       Raton raton) {

        this.idComputadora = idComputadora;
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;

    }

    public String getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(String idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora {idComputadora=" + idComputadora + ", nombre=" + nombre + ", \nmonitor=" + monitor + ", \nteclado=" + teclado + ", \nraton=" + raton + "}";
    }
}

