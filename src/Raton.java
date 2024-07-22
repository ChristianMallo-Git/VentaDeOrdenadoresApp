public class Raton {

    private String idRaton;
    private DispositivoDeEntrada dispositivoDeEntrada;

    public Raton(String idRaton, DispositivoDeEntrada dispositivoDeEntrada) {

        this.idRaton = idRaton;
        this.dispositivoDeEntrada = dispositivoDeEntrada;

    }

    public String getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(String idRaton) {
        this.idRaton = idRaton;
    }

    public DispositivoDeEntrada getDispositivoDeEntrada() {
        return dispositivoDeEntrada;
    }

    public void setDispositivoDeEntrada(DispositivoDeEntrada dispositivoDeEntrada) {
        this.dispositivoDeEntrada = dispositivoDeEntrada;
    }

    @Override
    public String toString() {
        return "Raton [idRaton=" + idRaton + ", dispositivoDeEntrada=" + dispositivoDeEntrada + "]";
    }
}
