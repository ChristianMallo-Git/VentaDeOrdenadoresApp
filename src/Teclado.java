public class Teclado {

    private String idTeclado;
    private DispositivoDeEntrada dispositivoDeEntrada;

    public Teclado(String idTeclado, DispositivoDeEntrada dispositivoDeEntrada) {

        this.idTeclado = idTeclado;
        this.dispositivoDeEntrada = dispositivoDeEntrada;

    }

    public String getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(String idTeclado) {
        this.idTeclado = idTeclado;
    }

    public DispositivoDeEntrada getDispositivoDeEntrada() {
        return dispositivoDeEntrada;
    }

    public void setDispositivoDeEntrada(DispositivoDeEntrada dispositivoDeEntrada) {
        this.dispositivoDeEntrada = dispositivoDeEntrada;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idTeclado + ", dispositivoDeEntrada=" + dispositivoDeEntrada + "]";
    }
}
