package practicas.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 * Ejercicio 3 de GUI
 * 
 * Pide un DNI y comprueba que es correcto, será correcto si tiene 9 caracteres y la letra es correcta
 */
@SuppressWarnings("serial")
public class Dni extends JFrame {
  private JPanel contenedor;
  private JTextField textDni;

  /**
   * Lanzar la aplicación
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Dni frame = new Dni();
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
  public Dni() {
    setTitle("Comprobar DNI");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 330, 215);
    contenedor = new JPanel();
    contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contenedor);
    contenedor.setLayout(null);
    
    JLabel lblDni = new JLabel("Introduce un DNI: ");
    lblDni.setBounds(30, 31, 114, 14);
    contenedor.add(lblDni);
    
    textDni = new JTextField();
    textDni.setBounds(174, 28, 109, 20);
    contenedor.add(textDni);
    textDni.setColumns(10);
    
    JLabel lblMensaje = new JLabel("");
    lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
    lblMensaje.setBounds(10, 105, 294, 14);
    contenedor.add(lblMensaje);
    
    JButton boton = new JButton("Comprobar");
    boton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (comprobarDni(textDni.getText())) {
          lblMensaje.setText("El DNI es válido");
        } else {
          lblMensaje.setText("El DNI no es válido");
        }
      }
    });
    boton.setBounds(100, 142, 114, 23);
    contenedor.add(boton);
  }
  
  /**
   * Comprobar un DNI
   * 
   * @param dni dni
   * @return true si es válido o false si es inválido
   */
  private boolean comprobarDni(String dni) {
    try {
      Integer.parseInt(dni.substring(0, 8));
    } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
      return false;
    }
    if (!comprobarLetra(dni)) {
      return false;
    }
    return true;
  }
  
  /**
   * Comprobar la letra de un DNI
   * 
   * @param dni dni
   * @return true si es válida o false si es inválida
   */
  private boolean comprobarLetra(String dni) {
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    if (letras.indexOf(dni.charAt(8)) == -1) {
      return false;
    } else if (Integer.parseInt(dni.substring(0, 8)) % 23 != letras.indexOf(dni.charAt(8))) {
      return false;
    }
    return true;
  }
}
