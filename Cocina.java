public class Cocina {
    private Orden[] ordenes;
    private String instrumentosCocina;
    private String nombreEquipoDelChef;

    public Cocina(
            String instrumentosCocina,
            String nombreEquipoDelChef
    ) {
        this.ordenes = new Orden[5];
        this.instrumentosCocina =
                instrumentosCocina;
        this.nombreEquipoDelChef =
                nombreEquipoDelChef;
    }

    public void cocinar() {
        System.out.println(
                "La cocina está preparando la orden"
        );
    }

    public void comprarIngredientes() {
        System.out.println(
                "Comprando ingredientes"
        );
    }

    public void lavarIngredientes() {
        System.out.println(
                "Lavando ingredientes"
        );
    }
}