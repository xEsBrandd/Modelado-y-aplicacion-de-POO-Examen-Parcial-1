import java.time.LocalDate;
import java.util.Scanner;

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
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el número de la orden: ");
        int idOrden = Integer.parseInt(teclado.nextLine());

        System.out.print("¿La orden es para llevar? (si/no): ");
        boolean tipoOrden =
                teclado.nextLine().equalsIgnoreCase("si");

        System.out.println("\nSeleccione el tipo de masa:");
        System.out.println("1. Masa simple");
        System.out.println("2. Masa casera");
        System.out.println("3. Masa integral");

        int opcionMasa =
                Integer.parseInt(teclado.nextLine());

        TipoDeMasa masa =
                TipoDeMasa.values()[opcionMasa - 1];

        System.out.println("\nSeleccione el tipo de salsa:");
        System.out.println("1. Normal");
        System.out.println("2. Picante");
        System.out.println("3. Extra picante");

        int opcionSalsa =
                Integer.parseInt(teclado.nextLine());

        TipoDeSalsa salsa =
                TipoDeSalsa.values()[opcionSalsa - 1];

        System.out.println("\nSeleccione un topping:");
        System.out.println("1. Jamón");
        System.out.println("2. Pepperoni");
        System.out.println("3. Chile pimiento");
        System.out.println("4. Piña");

        int opcionTopping =
                Integer.parseInt(teclado.nextLine());

        Topping topping =
                Topping.values()[opcionTopping - 1];

        Pizza pizza =
                new Pizza(masa, salsa, topping, 1);

        System.out.println("\nSeleccione el tipo de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.println("3. Cheque");

        int opcionPago =
                Integer.parseInt(teclado.nextLine());

        TipoDePago tipoPago =
                TipoDePago.values()[opcionPago - 1];

        System.out.print(
                "Ingrese la cantidad de productos: "
        );

        int cantidadProductos =
                Integer.parseInt(teclado.nextLine());

        Pago pago = new Pago(
                idOrden,
                tipoPago,
                cantidadProductos
        );

        DetalleDePago detalle =
                new DetalleDePago(idOrden, LocalDate.now());

        return new Orden(
                tipoOrden,
                idOrden,
                pizza,
                pago,
                detalle
        );
    }
}