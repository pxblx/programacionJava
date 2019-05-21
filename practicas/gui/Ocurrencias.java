package practicas.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;

/**
 * Ejercicio 6 de GUI
 * 
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero
 */
@SuppressWarnings("serial")
public class Ocurrencias extends JFrame {
  private JPanel contenedor;
  private JTextField textPalabra;

  /**
   * Lanzar la aplicación
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ocurrencias frame = new Ocurrencias();
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
  public Ocurrencias() {
    setTitle("Contador de ocurrencias");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 288, 130);
    contenedor = new JPanel();
    contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contenedor);
    contenedor.setLayout(null);
    
    JLabel lblPalabra = new JLabel("Palabra a buscar:");
    lblPalabra.setBounds(10, 11, 115, 14);
    contenedor.add(lblPalabra);
    
    textPalabra = new JTextField();
    textPalabra.setBounds(135, 8, 129, 20);
    contenedor.add(textPalabra);
    textPalabra.setColumns(10);
    
    JButton btnSeleccionar = new JButton("Seleccionar archivo");
    btnSeleccionar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String palabra = textPalabra.getText();
        if (!palabra.equalsIgnoreCase("")) {
          contarOcurrencias(textPalabra.getText());
        } else {
          JOptionPane.showMessageDialog(contenedor, "No has introducido la palabra a buscar");
        }
      }
    });
    btnSeleccionar.setBounds(62, 52, 149, 23);
    contenedor.add(btnSeleccionar);
  }
  
  /**
   * Contar las ocurrencias de una palabra en un fichero de texto
   * 
   * @param palabra palabra
   */
  private void contarOcurrencias(String palabra) {
    JFileChooser fc = new JFileChooser();
    fc.showOpenDialog(this);
    File archivo = fc.getSelectedFile();
    try {
      ArrayList<String> palabras = new ArrayList<>();
      BufferedReader br = new BufferedReader(new FileReader(archivo));
      String linea = br.readLine();
      while (linea != null) {
        palabras.add(linea);
        linea = br.readLine();
      }
      br.close();
      JOptionPane.showMessageDialog(contenedor, "La palabra '" + palabra + "' aparece " + Collections.frequency(palabras, palabra) + " veces");
    } catch (IOException e) {
      JOptionPane.showMessageDialog(contenedor, "No se ha podido abrir el archivo seleccionado");
    } catch (NullPointerException e) {
      JOptionPane.showMessageDialog(contenedor, "No has seleccionado ningún archivo");
    }
  }
}
