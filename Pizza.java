public class Pizza {
    private TipoDeMasa tipoDeMasa;
    private TipoDeSalsa tipoDeSalsa;
    private Topping topping;
    private int capacidad;

    public Pizza(
            TipoDeMasa tipoDeMasa,
            TipoDeSalsa tipoDeSalsa,
            Topping topping,
            int capacidad
    ) {
        this.tipoDeMasa = tipoDeMasa;
        this.tipoDeSalsa = tipoDeSalsa;
        this.topping = topping;
        this.capacidad = capacidad;
    }

    public void anadirIngrediente(
            TipoDeSalsa tipoDeSalsa
    ) {
        this.tipoDeSalsa = tipoDeSalsa;
    }

    public void anadirIngredientes(
            Topping topping,
            TipoDeMasa tipoDeMasa
    ) {
        this.topping = topping;
        this.tipoDeMasa = tipoDeMasa;
    }
    public String obtenerResumen() {
    return "<b>Pizza</b><br>"
            + "Masa: " + tipoDeMasa + "<br>"
            + "Salsa: " + tipoDeSalsa + "<br>"
            + "Topping: " + topping + "<br>"
            + "Capacidad: " + capacidad + "<br><br>";
}
    public void mostrarPizza() {
        System.out.println("Masa: " + tipoDeMasa);
        System.out.println("Salsa: " + tipoDeSalsa);
        System.out.println("Topping: " + topping);
    }
}