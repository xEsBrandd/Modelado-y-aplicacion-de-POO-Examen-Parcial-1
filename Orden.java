import java.time.LocalTime;

public class Orden {
    private boolean tipoOrden;
    private int idOrden;
    private LocalTime tiempo;

    public Orden(boolean tipoOrden, int idOrden) {
        this.tipoOrden = tipoOrden;
        this.idOrden = idOrden;
        this.tiempo = LocalTime.now();
    }

    public void prepararOrden() {
        System.out.println("Preparando la orden " + idOrden);
    }

    public void guardarOrden() {
        System.out.println("Orden guardada");
    }

    public void archivarOrden() {
        System.out.println("Orden archivada");
    }

    public void mostrarOrden() {
        System.out.println("Orden: " + idOrden);
        System.out.println("Tipo de orden: " + tipoOrden);
        System.out.println("Hora: " + tiempo);
    }
}
