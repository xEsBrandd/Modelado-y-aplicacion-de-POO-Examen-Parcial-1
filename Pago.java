public class Pago {
    private int idPago;
    private TipoDePago tipoDePago;
    private int cantidadProductos;

    public Pago(int idPago, TipoDePago tipoDePago, int cantidadProductos) {
        this.idPago = idPago;
        this.tipoDePago = tipoDePago;
        this.cantidadProductos = cantidadProductos;
    }

    public void almacenarPago() {
        System.out.println("Pago almacenado");
    }

    public void corregirPago() {
        System.out.println("Pago corregido");
    }
}
