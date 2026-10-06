import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private LocalDate fecha;
    private int idCliente;

    public Cliente(String nombre, LocalDate fecha, int idCliente) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public Orden crearOrden() {
        return new Orden(true, 1);
    }
}
