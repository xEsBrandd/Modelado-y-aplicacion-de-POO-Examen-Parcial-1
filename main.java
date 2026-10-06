import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Brandon", LocalDate.now(), 1);
        Orden orden = cliente.crearOrden();

        orden.prepararOrden();
        orden.guardarOrden();
        orden.mostrarOrden();
    }
}
