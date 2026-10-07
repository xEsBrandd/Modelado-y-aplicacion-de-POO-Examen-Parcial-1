import java.time.LocalDate;

public class ControladorJuego {
    private final Juego vista;

    public ControladorJuego(Juego vista) {
        this.vista = vista;

        this.vista
                .getBotonRevisar()
                .addActionListener(
                        evento -> crearOrden()
                );
    }

    private void crearOrden() {
        try {
            int numeroOrden = Integer.parseInt(
                    vista.getNumeroOrden()
            );

            int cantidad = Integer.parseInt(
                    vista.getCantidad()
            );

            Pizza pizza = new Pizza(
                    vista.getMasaSeleccionada(),
                    vista.getSalsaSeleccionada(),
                    vista.getToppingSeleccionado(),
                    1
            );

            Pago pago = new Pago(
                    numeroOrden,
                    vista.getPagoSeleccionado(),
                    cantidad
            );

            DetalleDePago detalle =
                    new DetalleDePago(
                            numeroOrden,
                            LocalDate.now()
                    );

            Orden orden = new Orden(
                    vista.esParaLlevar(),
                    numeroOrden,
                    pizza,
                    pago,
                    detalle
            );

            orden.prepararOrden();
            pago.almacenarPago();
            orden.guardarOrden();

            vista.mostrarOrden(
                    orden.obtenerResumen()
            );

        } catch (NumberFormatException error) {
            vista.mostrarError(
                    "El número de orden y la cantidad "
                            + "deben ser números."
            );
        }
    }
}