package practicas.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 * Ejercicio 2 de GUI
 * 
 * Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos
 */
@SuppressWarnings("serial")
public class Puntos extends JFrame {
  private JPanel contenedor;
  private JTextField textX1;
  private JTextField textX2;
  private JTextField textY1;
  private JLabel lblY1;
  private JLabel lblY2;
  private JTextField textY2;
  private JLabel lblMensaje;

  /**
   * Lanzar la aplicación
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Puntos frame = new Puntos();
          frame.setVisible(true);
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    });
  }

  /**
   * Crear la ventana
   */
  public Puntos() {
    setResizable(false);
    setTitle("Calcular distancias");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 341, 226);
    contenedor = new JPanel();
    contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contenedor);
    contenedor.setLayout(null);
    
    JLabel lblX1 = new JLabel("x1:");
    lblX1.setBounds(61, 11, 75, 20);
    contenedor.add(lblX1);
    
    textX1 = new JTextField();
    textX1.setBounds(197, 11, 75, 20);
    contenedor.add(textX1);
    textX1.setColumns(10);
    
    JLabel lblX2 = new JLabel("x2:");
    lblX2.setBounds(61, 73, 75, 20);
    contenedor.add(lblX2);
    
    textX2 = new JTextField();
    textX2.setBounds(197, 73, 75, 20);
    contenedor.add(textX2);
    textX2.setColumns(10);
    
    lblY1 = new JLabel("y1:");
    lblY1.setBounds(61, 42, 75, 20);
    contenedor.add(lblY1);
    
    textY1 = new JTextField();
    textY1.setBounds(197, 42, 75, 20);
    contenedor.add(textY1);
    textY1.setColumns(10);
    
    lblY2 = new JLabel("y2:");
    lblY2.setBounds(61, 101, 75, 20);
    contenedor.add(lblY2);
    
    textY2 = new JTextField();
    textY2.setBounds(197, 104, 75, 20);
    contenedor.add(textY2);
    textY2.setColumns(10);
    
    lblMensaje = new JLabel("");
    lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
    lblMensaje.setBounds(10, 135, 315, 20);
    contenedor.add(lblMensaje);
    
    JButton boton = new JButton("Calcular");
    boton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          DecimalFormat df = new DecimalFormat("#.##");
          lblMensaje.setText("La distancia entre los puntos es " + df.format(calcularDistancia(Double.parseDouble(textX1.getText().replace(",", ".")),
              Double.parseDouble(textY1.getText().replace(",", ".")),
              Double.parseDouble(textX2.getText().replace(",", ".")),
              Double.parseDouble(textY2.getText().replace(",", ".")))));
        } catch (NumberFormatException e1) {
          JOptionPane.showMessageDialog(contenedor, "Debes introducir los valores en un formato válido");
        }
      }
    });
    boton.setBounds(119, 166, 95, 20);
    contenedor.add(boton);
  }
  
  /**
   * Calcular distancia entre dos puntos en un plano
   * 
   * @param x1 x1
   * @param y1 y1
   * @param x2 x2
   * @param y2 y2
   * @return distancia entre ambos puntos
   */
  private double calcularDistancia(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
  }
}
