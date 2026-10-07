import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente =
                new Cliente("Brandon", LocalDate.now(), 1);

        Orden orden = cliente.crearOrden();

        System.out.println("\nOrden creada correctamente");

        orden.prepararOrden();
        orden.guardarOrden();
        orden.mostrarOrden();
    }
}