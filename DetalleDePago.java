import java.time.LocalDate;

public class DetalleDePago {
    private int idPago;
    private LocalDate fecha;

    public DetalleDePago(int idPago, LocalDate fecha) {
        this.idPago = idPago;
        this.fecha = fecha;
    }

    public void imprimirPago() {
        System.out.println("Imprimiendo pago " + idPago);
    }

    public void mostrarPago() {
        System.out.println("Pago: " + idPago + " - Fecha: " + fecha);
    }
}
