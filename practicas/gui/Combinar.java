package practicas.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Ejercicio 5 de GUI
 * 
 * Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero
 * resultante aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será del primer
 * fichero, la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc
 */
@SuppressWarnings("serial")
public class Combinar extends JFrame {
  private JPanel contendor;
  private File archivoA;
  private File archivoB;

  /**
   * Lanzar la aplicación
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Combinar frame = new Combinar();
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
  public Combinar() {
    setTitle("Combinar archivos");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 165);
    contendor = new JPanel();
    contendor.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contendor);
    contendor.setLayout(null);
    
    JLabel lblPathA = new JLabel("Selecciona un archivo");
    lblPathA.setBounds(170, 15, 254, 14);
    contendor.add(lblPathA);
    
    JLabel lblPathB = new JLabel("Selecciona un archivo");
    lblPathB.setBounds(170, 49, 254, 14);
    contendor.add(lblPathB);
    
    JButton btnSeleccionarA = new JButton("Archivo A");
    btnSeleccionarA.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        archivoA = seleccionarArchivo();
        if (archivoA != null) {
          lblPathA.setText(archivoA.getName());
        }
      }
    });
    btnSeleccionarA.setBounds(10, 11, 150, 23);
    contendor.add(btnSeleccionarA);
    
    JButton btnSeleccionarB = new JButton("Archivo B");
    btnSeleccionarB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        archivoB = seleccionarArchivo();
        if (archivoB != null) {
          lblPathB.setText(archivoB.getName());
        }
      }
    });
    btnSeleccionarB.setBounds(10, 45, 150, 23);
    contendor.add(btnSeleccionarB);
    
    JButton btnCombinar = new JButton("Combinar");
    btnCombinar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (archivoA == null || archivoB == null) {
          JOptionPane.showMessageDialog(contendor, "Debes seleccionar los dos archivos a combinar");
        } else {
          combinarArchivos(archivoA, archivoB);
        }
      }
    });
    btnCombinar.setBounds(142, 95, 150, 23);
    contendor.add(btnCombinar);
  }
  
  /**
   * Seleccionar un archivo mediante JFileChooser
   * 
   * @return archivo seleccionado
   */
  private File seleccionarArchivo() {
    JFileChooser fc = new JFileChooser();
    fc.showOpenDialog(this);
    return fc.getSelectedFile();
  }
  
  /**
   * Combinar dos archivos de texto
   * 
   * @return archivo combinado
   */
  private File combinarArchivos(File archivoA, File archivoB) {
    try {
      File combinado = new File(seleccionarArchivo().getAbsolutePath());
      try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(combinado));
        
        BufferedReader br1 = new BufferedReader(new FileReader(archivoA));
        BufferedReader br2 = new BufferedReader(new FileReader(archivoB));
        
        String linea1 = br1.readLine();
        String linea2 = br2.readLine();
        
        while (linea1 != null || linea2 != null) {
          if (linea1 != null) {
            bw.write(linea1 + "\n");
            linea1 = br1.readLine();
          }
          if (linea2 != null) {
            bw.write(linea2 + "\n");
            linea2 = br2.readLine();
          }
        }
        
        bw.flush();
        bw.close();
        br1.close();
        br2.close();
        
        JOptionPane.showMessageDialog(contendor, "Archivo " + combinado.getName() + " creado");
      } catch (IOException e) {
        JOptionPane.showMessageDialog(contendor, "No se ha podido abrir alguno de los archivos seleccionados");
      }
      return combinado;
    } catch (NullPointerException e) {
      JOptionPane.showMessageDialog(contendor, "No has seleccionado el archivo de destino");
      return null;
    }
  }
}
