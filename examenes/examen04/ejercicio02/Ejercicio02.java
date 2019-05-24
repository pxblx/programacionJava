package examenes.examen04.ejercicio02;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import examenes.examen04.ejercicio02.excepciones.FechaInvalidaException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * Ejercicio 2
 */
@SuppressWarnings("serial")
public class Ejercicio02 extends JFrame {
  private JPanel contenedor;
  private JTextField textFecha;

  /**
   * Lanzar la aplicación
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ejercicio02 frame = new Ejercicio02();
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
  public Ejercicio02() {
    setTitle("Gestor de fechas");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 470, 255);
    contenedor = new JPanel();
    contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contenedor);
    contenedor.setLayout(null);
    
    JLabel lblIntroduceUnaFecha = new JLabel("Introduce una fecha (dd/mm/aaaa):");
    lblIntroduceUnaFecha.setBounds(10, 11, 224, 14);
    contenedor.add(lblIntroduceUnaFecha);
    
    textFecha = new JTextField();
    textFecha.setBounds(244, 8, 200, 20);
    contenedor.add(textFecha);
    textFecha.setColumns(10);
    
    JLabel lblValidar = new JLabel("Comprobar si la fecha introducida es válida");
    lblValidar.setBounds(139, 51, 305, 14);
    contenedor.add(lblValidar);
    
    JLabel lblSumar = new JLabel("Sumar un día a la fecha introducida");
    lblSumar.setBounds(139, 85, 305, 14);
    contenedor.add(lblSumar);
    
    JLabel lblRestar = new JLabel("Restar un día a la fecha introducida");
    lblRestar.setBounds(139, 119, 305, 14);
    contenedor.add(lblRestar);
    
    JLabel lblHastaHoy = new JLabel("Calcular los que hay entre la fecha introducida y hoy");
    lblHastaHoy.setBounds(139, 153, 305, 14);
    contenedor.add(lblHastaHoy);
    
    JButton btnValidar = new JButton("Validar");
    btnValidar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          validarFecha(textFecha.getText());
          JOptionPane.showMessageDialog(contenedor, "La fecha introducida es válida");
        } catch (FechaInvalidaException ex) {
          JOptionPane.showMessageDialog(contenedor, "La fecha introducida no es válida");
        }
      }
    });
    btnValidar.setBounds(10, 47, 119, 23);
    contenedor.add(btnValidar);
    
    JButton btnSumar = new JButton("Día posterior");
    btnSumar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          textFecha.setText(sumarDia(validarFecha(textFecha.getText())));
        } catch (FechaInvalidaException ex) {
          JOptionPane.showMessageDialog(contenedor, "La fecha introducida no es válida");
        }
      }
    });
    btnSumar.setBounds(10, 81, 119, 23);
    contenedor.add(btnSumar);
    
    JButton btnRestar = new JButton("Día anterior");
    btnRestar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          textFecha.setText(restarDia(validarFecha(textFecha.getText())));
        } catch (FechaInvalidaException ex) {
          JOptionPane.showMessageDialog(contenedor, "La fecha introducida no es válida");
        }
      }
    });
    btnRestar.setBounds(10, 115, 119, 23);
    contenedor.add(btnRestar);
    
    JButton btnHastaHoy = new JButton("Días hasta hoy");
    btnHastaHoy.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          JOptionPane.showMessageDialog(contenedor, "Entre hoy y la fecha introducida hay " + diasHastaHoy(validarFecha(textFecha.getText())) + " días de diferencia");
        } catch (FechaInvalidaException ex) {
          JOptionPane.showMessageDialog(contenedor, "La fecha introducida no es válida");
        }
      }
    });
    btnHastaHoy.setBounds(10, 149, 119, 23);
    contenedor.add(btnHastaHoy);
    
    JButton btnSalir = new JButton("Salir");
    btnSalir.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    btnSalir.setBounds(182, 185, 89, 23);
    contenedor.add(btnSalir);
  }
  
  /**
   * Comprobar que la fecha que se pasa como parámetro está en el formato correcto (dd/mm/yyyy) y devolverla en formato LocalDate
   * 
   * @param fechaString fecha
   * @return fecha fecha en formato LocalDate
   * @throws FechaInvalidaException si la fecha no está en el formato correcto
   */
  private LocalDate validarFecha(String fechaString) throws FechaInvalidaException {
    LocalDate fecha;
    try {
      fecha = LocalDate.of(Integer.parseInt(fechaString.substring(6)), Integer.parseInt(fechaString.substring(3, 5)), Integer.parseInt(fechaString.substring(0, 2)));
      if (!(fechaString.substring(2, 3) == "/" || fechaString.substring(5, 6) == "/" || fechaString.length() == 10)) {
        throw new FechaInvalidaException();
      }
    } catch (NumberFormatException | DateTimeException | StringIndexOutOfBoundsException e) {
      throw new FechaInvalidaException();
    }
    return fecha;
  }
  
  /**
   * Sumar un día a la fecha que se pasa como parámetro y devolver una String en formato (dd/mm/yyy)
   * 
   * @param fecha fecha en formato LocalDate
   * @return fecha en formato String
   */
  private String sumarDia(LocalDate fecha) {
    fecha = fecha.plusDays(1);
    return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
  }
  
  /**
   * Restar un día a la fecha que se pasa como parámetro y devolver una String en formato (dd/mm/yyy)
   * 
   * @param fecha fecha en formato LocalDate
   * @return fecha en formato String
   */
  private String restarDia(LocalDate fecha) {
    fecha = fecha.minusDays(1);
    return fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
  }
  
  /**
   * Calcular los días de diferencia entre la fecha introducida y la fecha actual
   * 
   * @param fecha fecha en formato LocalDate
   * @return días de diferencia
   */
  private long diasHastaHoy(LocalDate fecha) {
    return Math.abs(fecha.until(LocalDate.now(), ChronoUnit.DAYS));
  }
}
