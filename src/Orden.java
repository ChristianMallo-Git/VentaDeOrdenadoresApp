import java.util.ArrayList;

public class Orden {

    private int idOrden;
    private ArrayList<Computadora> computadoras;

    public Orden(int idOrden, ArrayList<Computadora> computadora) {

        this.idOrden = idOrden;
        this.computadoras = computadora;

    }

    public Orden(int idOrden) {

        this.idOrden = idOrden;
        this.computadoras = new ArrayList<>();

    }

    int getIdOrden() {
        return this.idOrden;
    }

    private void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public ArrayList<Computadora> getComputadoras() {
        return this.computadoras;
    }

    public void setComputadoras(ArrayList<Computadora> computadoras) {
        this.computadoras = computadoras;
    }


    //Custom
    public void anhadirComputadora(Computadora computadora) {
        this.computadoras.add(computadora);
    }

    @Override
    public String toString() {
        return "Orden [idOrden=" + this.idOrden + ", computadora=" + this.computadoras + "]";
    }
}

