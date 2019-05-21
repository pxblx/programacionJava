package practicas.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 * Ejercicio 4 de GUI
 * 
 * Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de forma "ideal"; es decir, con el
 * menor número de billetes y monedas posibles
 */
@SuppressWarnings("serial")
public class Cajero extends JFrame {
  private JPanel contenedor;
  private JTextField textCantidad;

  /**
   * Lanzar la aplicación
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Cajero frame = new Cajero();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Crear la ventana
   */
  public Cajero() {
    setTitle("Cajero de cambio");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 295);
    contenedor = new JPanel();
    contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contenedor);
    contenedor.setLayout(null);
    
    JLabel lblCantidad = new JLabel("Introduce una cantidad:");
    lblCantidad.setBounds(14, 11, 135, 14);
    contenedor.add(lblCantidad);
    
    textCantidad = new JTextField();
    textCantidad.setBounds(159, 8, 120, 20);
    contenedor.add(textCantidad);
    textCantidad.setColumns(10);
    
    JLabel lblMensaje = new JLabel("");
    lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
    lblMensaje.setBounds(10, 50, 410, 195);
    contenedor.add(lblMensaje);
    
    JButton btnObtenerCambio = new JButton("Obtener cambio");
    btnObtenerCambio.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          lblMensaje.setText(cambio(Double.parseDouble(textCantidad.getText().replace(",", "."))));
        } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(contenedor, "Debes introducir la cantidad en un formato válido");
        }
      }
    });
    btnObtenerCambio.setBounds(291, 7, 129, 23);
    contenedor.add(btnObtenerCambio);
  }
  
  /**
   * Construir una String con el cambio a partir de una cantidad de dinero
   * 
   * @param cantidad cantidad de dinero
   * @return string con el cambio
   */
  private String cambio(double cantidad) {
    double [] tipos = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};
    String mensaje = "<html>";
    for (int i = 0; i < tipos.length; i++) {
      if (cantidad >= tipos[i]) {
        int aux = (int)(cantidad / tipos[i]);
        cantidad = cantidad - (tipos[i] * aux);
        if (i < 7) {
          mensaje += aux + " billete(s) de " + (int)tipos[i] + "€<br/>";
        } else if (i > 6 && i < 9) {
          mensaje += aux + " moneda(s) de " + (int)tipos[i] + "€<br/>";
        } else {
          mensaje += aux + " moneda(s) de " + (int)(tipos[i] * 100) + " céntimo(s)<br/>";
        }
      }
    }
    return mensaje + "</html>";
  }
}
