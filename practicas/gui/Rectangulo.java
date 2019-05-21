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

/**
 * Ejercicio 1 de GUI
 * 
 * Calcular el perímetro y área de un rectángulo dada su base y su altura
 */
@SuppressWarnings("serial")
public class Rectangulo extends JFrame {
  private JPanel contenedor;
  private JTextField textBase;
  private JTextField textAltura;
  private JTextField textArea;
  private JLabel lblArea;
  private JLabel lblPerimetro;
  private JTextField textPerimetro;

  /**
   * Lanzar la aplicación
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Rectangulo frame = new Rectangulo();
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
  public Rectangulo() {
    setResizable(false);
    setTitle("Calcular área y perímetro");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 341, 200);
    contenedor = new JPanel();
    contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contenedor);
    contenedor.setLayout(null);
    
    JLabel lblBase = new JLabel("Base:");
    lblBase.setBounds(61, 11, 75, 20);
    contenedor.add(lblBase);
    
    textBase = new JTextField();
    textBase.setBounds(197, 11, 75, 20);
    contenedor.add(textBase);
    textBase.setColumns(10);
    
    JLabel lblAltura = new JLabel("Altura:");
    lblAltura.setBounds(61, 42, 75, 20);
    contenedor.add(lblAltura);
    
    textAltura = new JTextField();
    textAltura.setBounds(197, 42, 75, 20);
    contenedor.add(textAltura);
    textAltura.setColumns(10);
    
    lblArea = new JLabel("Área:");
    lblArea.setBounds(61, 73, 75, 20);
    contenedor.add(lblArea);
    
    textArea = new JTextField();
    textArea.setEditable(false);
    textArea.setBounds(197, 73, 75, 20);
    contenedor.add(textArea);
    textArea.setColumns(10);
    
    lblPerimetro = new JLabel("Perímetro:");
    lblPerimetro.setBounds(61, 101, 75, 20);
    contenedor.add(lblPerimetro);
    
    textPerimetro = new JTextField();
    textPerimetro.setEditable(false);
    textPerimetro.setBounds(197, 104, 75, 20);
    contenedor.add(textPerimetro);
    textPerimetro.setColumns(10);
    
    JButton boton = new JButton("Calcular");
    boton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          DecimalFormat df = new DecimalFormat("#.##");
          double base = Double.parseDouble(textBase.getText().replace(",", "."));
          double altura = Double.parseDouble(textAltura.getText().replace(",", "."));
          textArea.setText(df.format(calcularArea(base, altura)).replace(".", ","));
          textPerimetro.setText(df.format(calcularPerimetro(base, altura)).replace(".", ","));
        } catch (NumberFormatException e1) {
          JOptionPane.showMessageDialog(contenedor, "Debes introducir las medidas en un formato válido");
        }
      }
    });
    boton.setBounds(120, 141, 95, 20);
    contenedor.add(boton);
  }
  
  /**
   * Calcular área de un rectángulo
   * 
   * @param base base
   * @param altura altura
   * @return área
   */
  private double calcularArea(double base, double altura) {
    return base * altura;
  }
  
  /**
   * Calcular perímetro de un rectángulo
   * 
   * @param base base
   * @param altura altura
   * @return perímetro
   */
  private double calcularPerimetro(double base, double altura) {
    return 2 * (base + altura);
  }
}
