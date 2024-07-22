public class DispositivoDeEntrada {

    private String marca;
    private String tipoEntrada;

    public DispositivoDeEntrada(String marca, String tipoEntrada) {

        this.marca = marca;
        this.tipoEntrada = tipoEntrada;

    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "dispositivodeEntrada [tipoEntrada=" + tipoEntrada + ", marca=" + marca + "]";
    }

}

