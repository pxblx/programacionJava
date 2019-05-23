package practicas.poo1.circuloGrafico;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Círculo por entorno gráfico (extra)
 *
 * - Pasar como parámetro el color del círculo
 * - Mostrar el círculo usando el entorno gráfico
 */
public class CirculoGrafico extends JFrame {
  private double diametro;
  
  public CirculoGrafico() {
    super ("Círculo por entorno gráfico");
    setSize(470,570);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D circulo = (Graphics2D)g;
    circulo.setStroke(new BasicStroke(10));
    circulo.setPaint(JColorChooser.showDialog(null, ("Selecciona un color"), Color.black));
    diametro = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio")) * 2;
    circulo.drawOval(30, 150, (int)diametro, (int)diametro);
  }
}
