import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Juego juego = new Juego();

            new ControladorJuego(juego);

            juego.setVisible(true);
        });
    }
}