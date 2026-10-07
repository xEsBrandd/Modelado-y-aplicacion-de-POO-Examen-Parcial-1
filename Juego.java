import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Juego extends JFrame {
    private static final long serialVersionUID = 1L;

    private final JTextField campoNumeroOrden;
    private final JCheckBox casillaParaLlevar;
    private final JComboBox<TipoDeMasa> comboMasa;
    private final JComboBox<TipoDeSalsa> comboSalsa;
    private final JComboBox<Topping> comboTopping;
    private final JComboBox<TipoDePago> comboPago;
    private final JTextField campoCantidad;
    private final JButton botonRevisar;
    private final JLabel etiquetaOrden;

    public Juego() {
        setTitle("Cocina - Orden de pizza");
        setSize(650, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel titulo = new JLabel(
                "COCINA",
                SwingConstants.CENTER
        );

        titulo.setFont(
                new Font("Arial", Font.BOLD, 24)
        );

        add(titulo, BorderLayout.NORTH);

        JPanel panelOpciones =
                new JPanel(new GridLayout(7, 2, 8, 8));

        panelOpciones.setBorder(
                BorderFactory.createTitledBorder(
                        "Seleccione los elementos de la orden"
                )
        );

        campoNumeroOrden = new JTextField();
        casillaParaLlevar = new JCheckBox("Sí");

        comboMasa =
                new JComboBox<>(TipoDeMasa.values());

        comboSalsa =
                new JComboBox<>(TipoDeSalsa.values());

        comboTopping =
                new JComboBox<>(Topping.values());

        comboPago =
                new JComboBox<>(TipoDePago.values());

        campoCantidad = new JTextField("1");

        panelOpciones.add(
                new JLabel("Número de orden:")
        );
        panelOpciones.add(campoNumeroOrden);

        panelOpciones.add(
                new JLabel("¿Es para llevar?")
        );
        panelOpciones.add(casillaParaLlevar);

        panelOpciones.add(
                new JLabel("Tipo de masa:")
        );
        panelOpciones.add(comboMasa);

        panelOpciones.add(
                new JLabel("Tipo de salsa:")
        );
        panelOpciones.add(comboSalsa);

        panelOpciones.add(
                new JLabel("Topping:")
        );
        panelOpciones.add(comboTopping);

        panelOpciones.add(
                new JLabel("Tipo de pago:")
        );
        panelOpciones.add(comboPago);

        panelOpciones.add(
                new JLabel("Cantidad de productos:")
        );
        panelOpciones.add(campoCantidad);

        etiquetaOrden = new JLabel(
                "<html><div style='text-align:center'>"
                        + "La orden aparecerá aquí"
                        + "</div></html>",
                SwingConstants.CENTER
        );

        etiquetaOrden.setBorder(
                BorderFactory.createTitledBorder(
                        "Vista de la orden"
                )
        );

        botonRevisar =
                new JButton("Revisar orden");

        add(panelOpciones, BorderLayout.WEST);
        add(etiquetaOrden, BorderLayout.CENTER);
        add(botonRevisar, BorderLayout.SOUTH);
    }

    public String getNumeroOrden() {
        return campoNumeroOrden.getText();
    }

    public boolean esParaLlevar() {
        return casillaParaLlevar.isSelected();
    }

    public TipoDeMasa getMasaSeleccionada() {
        return (TipoDeMasa)
                comboMasa.getSelectedItem();
    }

    public TipoDeSalsa getSalsaSeleccionada() {
        return (TipoDeSalsa)
                comboSalsa.getSelectedItem();
    }

    public Topping getToppingSeleccionado() {
        return (Topping)
                comboTopping.getSelectedItem();
    }

    public TipoDePago getPagoSeleccionado() {
        return (TipoDePago)
                comboPago.getSelectedItem();
    }

    public String getCantidad() {
        return campoCantidad.getText();
    }

    public JButton getBotonRevisar() {
        return botonRevisar;
    }

    public void mostrarOrden(String resumen) {
        etiquetaOrden.setText(resumen);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(
                this,
                mensaje,
                "Dato incorrecto",
                JOptionPane.ERROR_MESSAGE
        );
    }
}