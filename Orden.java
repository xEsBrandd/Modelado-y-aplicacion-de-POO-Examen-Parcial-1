import java.time.LocalTime;

public class Orden {
    private boolean tipoOrden;
    private int idOrden;
    private LocalTime tiempo;
    private Pizza pizza;
    private Pago pago;
    private DetalleDePago detalleDePago;

    public Orden(
            boolean tipoOrden,
            int idOrden,
            Pizza pizza,
            Pago pago,
            DetalleDePago detalleDePago
    ) {
        this.tipoOrden = tipoOrden;
        this.idOrden = idOrden;
        this.tiempo = LocalTime.now();
        this.pizza = pizza;
        this.pago = pago;
        this.detalleDePago = detalleDePago;
    }

    public void prepararOrden() {
        System.out.println(
                "Preparando la orden " + idOrden
        );
    }

    public void guardarOrden() {
        System.out.println("Orden guardada");
    }

    public void archivarOrden() {
        System.out.println("Orden archivada");
    }

    public void mostrarOrden() {
        System.out.println("Orden: " + idOrden);

        System.out.println(
                "Tipo de orden: "
                        + (tipoOrden
                        ? "Para llevar"
                        : "Comer en el restaurante")
        );

        System.out.println("Hora: " + tiempo);

        pizza.mostrarPizza();
        pago.mostrarPago();
        detalleDePago.mostrarPago();
    }

    public String obtenerResumen() {
        String tipo;

        if (tipoOrden) {
            tipo = "Para llevar";
        } else {
            tipo = "Comer en el restaurante";
        }

        return "<html>"
                + "<div style='text-align:center'>"
                + "<h2>Orden " + idOrden + "</h2>"
                + "<b>Tipo de orden:</b> "
                + tipo + "<br>"
                + "<b>Hora:</b> "
                + tiempo + "<br><br>"
                + pizza.obtenerResumen()
                + pago.obtenerResumen()
                + detalleDePago.obtenerResumen()
                + "</div>"
                + "</html>";
    }
}