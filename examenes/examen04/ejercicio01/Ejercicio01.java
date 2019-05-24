package examenes.examen04.ejercicio01;

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
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

/**
 * Ejercicio 1
 */
@SuppressWarnings("serial")
public class Ejercicio01 extends JFrame {
  private JPanel contenedor;
  private File archivo;
  private String texto;

  /**
   * Lanzar la aplicación
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio01 frame = new Ejercicio01();
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
  public Ejercicio01() {
    setTitle("Sustituir caracteres");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 570, 290);
    contenedor = new JPanel();
    contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contenedor);
    contenedor.setLayout(null);
    
    JLabel lblPath = new JLabel("Selecciona un archivo");
    lblPath.setHorizontalAlignment(SwingConstants.CENTER);
    lblPath.setBounds(7, 126, 249, 14);
    contenedor.add(lblPath);
    
    JLabel lblVistaPrevia = new JLabel("Vista previa:");
    lblVistaPrevia.setBounds(266, 15, 278, 14);
    contenedor.add(lblVistaPrevia);
    
    JTextArea textResultante = new JTextArea();
    textResultante.setEditable(false);
    textResultante.setBounds(266, 40, 278, 200);
    contenedor.add(textResultante);
    
    JButton btnSeleccionar = new JButton("Seleccionar");
    btnSeleccionar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        archivo = seleccionarArchivo();
        if (archivo != null) {
          texto = sustituirCaracteres(archivo);
          lblPath.setText(archivo.getName());
          textResultante.setText(texto);
        } else {
          lblPath.setText("Selecciona un archivo");
          textResultante.setText("");
        }
      }
    });
    btnSeleccionar.setBounds(56, 92, 150, 23);
    contenedor.add(btnSeleccionar);
    
    JButton btn = new JButton("Guardar como...");
    btn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (archivo != null) {
          guardarArchivo(texto);
        } else {
          JOptionPane.showMessageDialog(contenedor, "Debes seleccionar primero un archivo");
        }
      }
    });
    btn.setBounds(56, 217, 150, 23);
    contenedor.add(btn);
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
   * Sustituir los caracteres del archivo que se pasa como parámetro
   * 
   * @param archivo archivo
   * @return texto resultante
   */
  private String sustituirCaracteres(File archivo) {
    String resultante = "";
    try {
      BufferedReader br = new BufferedReader(new FileReader(archivo));
      String linea = br.readLine();
      while (linea != null) {
        linea = linea.replace("A", "4").replace("B", "8").replace("E", "3").replace("I", "1").replace("O", "0").replace("S", "5").replace("T", "7");
        linea = linea.replace("a", "4").replace("b", "8").replace("e", "3").replace("i", "1").replace("o", "0").replace("s", "5").replace("t", "7");
        resultante += linea + "\n";
        linea = br.readLine();
      }
      br.close();
    } catch (IOException e) {
      JOptionPane.showMessageDialog(contenedor, "No se ha podido abrir el archivo seleccionado");
    }
    return resultante;
  }
  
  /**
   * Guardar en un archivo de texto nuevo la String que se pasa como parámetro
   * 
   * @param texto String con el texto a guardar
   */
  private void guardarArchivo(String texto) {
    File resultante = seleccionarArchivo();
    if (resultante != null) {
      try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(resultante));
        bw.write(texto);
        bw.flush();
        bw.close();
        JOptionPane.showMessageDialog(contenedor, "Archivo '" + resultante.getName() + "' creado");
      } catch (IOException ex) {
        JOptionPane.showMessageDialog(contenedor, "No se ha podido guardar el archivo");
      }
    }
  }
}
