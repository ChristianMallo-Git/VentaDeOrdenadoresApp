import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacionVenta {

    static Scanner consola = new Scanner(System.in);
    static int opcionElegida;

    private static List<Orden> ordenes = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("**** App venta de computadoras **** \n");
        do {
            mostrarMenu();
            opcionElegida = consola.nextInt();
            System.out.println("elegiste: " + opcionElegida);
            gestionarCasuisticas(opcionElegida);

        } while (opcionElegida >= 1 && opcionElegida < 3);

    }

    private static void mostrarMenu() {
        System.out.println("Que quieres hacer?");
        System.out.println("1.Agregar orden 2.Mostrar ordenes 3.Salir \n");
    }

    private static void gestionarCasuisticas(int opcionElegida) {

        switch (opcionElegida) {
            case 1: {
                crearOrden();
                break;
            }
            case 2: {
                mostrarOrdenes();
                break;
            }
            case 3: {
                System.out.println("Hasta la próxima!");
                System.exit(0);
                break;
            }
            default:
                throw new IllegalArgumentException("Opcion no valida: " + opcionElegida);
        }
    }

    private static void mostrarOrdenes() {
        ordenes.forEach(orden -> {
            System.out.println("Orden# : " + orden.getIdOrden());
            System.out.println("Mostrando computadoras de la Orden " + orden.getIdOrden());
            mostrarComputadoras(orden.getComputadoras());
        });

    }

    private static void mostrarComputadoras(ArrayList<Computadora> computadoras) {
        computadoras.forEach(System.out::println);
    }

    private static void crearOrden() {
        System.out.print("Introduce el número de la Orden = ");
        int idOrden = consola.nextInt();
        Orden orden = new Orden(idOrden);
        int decision;

        do {
            Computadora nuevaComputadora = crearComputadora();
            orden.anhadirComputadora(nuevaComputadora);
            System.out.println("¿Quieres añadir otra computadora? 1.Si 2.No");
            decision = consola.nextInt();
        } while (decision == 1);

        ordenes.add(orden);
    }

    private static Computadora crearComputadora() {
        System.out.print("Introduce el número de referencia de la computadora = ");
        String idComputadora = consola.next();
        System.out.print("Introduce el nombre de la computadora = ");
        String nombre = consola.next();
        Monitor monitor = crearMonitor();
        Teclado teclado = crearTeclado();
        Raton raton = crearRaton();


        return new Computadora(idComputadora, nombre, monitor, teclado, raton);
    }

    private static Monitor crearMonitor() {
        System.out.print("Introduce el número de referencia del monitor = ");
        String idMonitor = consola.next();
        System.out.print("Introduce la marca del monitor = ");
        String marca = consola.next();
        System.out.print("Introduce el tamaño del monitor = ");
        double tamaño = consola.nextDouble();

        Monitor monitor = new Monitor(idMonitor, marca, tamaño);
        return monitor;
    }

    private static Teclado crearTeclado() {
        System.out.print("Introduce el número de referencia del teclado = ");
        String idTeclado = consola.next();
        DispositivoDeEntrada dispositivoDeEntrada = crearDispositivo();

        Teclado teclado = new Teclado(idTeclado, dispositivoDeEntrada);
        return teclado;
    }

    private static Raton crearRaton() {
        System.out.print("Introduce el número de referencia del ratón = ");
        String idRaton = consola.next();
        DispositivoDeEntrada dispositivoDeEntrada = crearDispositivo();

        Raton raton = new Raton(idRaton, dispositivoDeEntrada);
        return raton;
    }

    private static DispositivoDeEntrada crearDispositivo() {
        System.out.print("Introduce la marca del dispositivo = ");
        String marca = consola.next();
        System.out.print("Introduce el tipo de entrada del dispositivo de entrada =");
        String tipoEntrada = consola.next();

        DispositivoDeEntrada dispositivo = new DispositivoDeEntrada(marca, tipoEntrada);
        return dispositivo;
    }
}

