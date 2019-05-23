package practicas.poo1;

import javax.swing.*;

/**
 * Ejercicio 4 de poo1
 *
 * Modifica la clase Círculo para que cuando el radio se convierta a 0 el círculo reaccione y diga con una caja de texto
 * gráfica “Soy un mísero punto sin área” usando la clase JOptionPane del paquete javax.swing. Podéis ver
 * este vídeo: https://youtu.be/F_48qh3BcDs.
 */
public class E04CirculoMod {
  private double radio;
  
  /**
   * Método constructor
   * 
   * @param r
   */
  public E04CirculoMod(double r) {
    this.radio = r;
    if (this.radio <= 0) {
      JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área");
    }
  }
  
  /**
   * Aumentar el radio del círculo
   * 
   * @param r
   */
  public void aumentarRadio(double r) {
    this.radio = this.radio + r;
  }
  
  /**
   * Reducir el radio del círculo
   * 
   * @param r
   */
  public void reducirRadio(double r) {
    this.radio = this.radio - r;
  }
  
  /**
   * Devolver el área del círculo
   * 
   * @return
   */
  public double area() {
    return Math.PI*Math.pow(this.radio, 2);
  }
  
  /**
   * Método toString para imprimir por pantalla la descripción del círculo
   * 
   */
  public String toString() {
    return ("Soy un círculo de radio "+this.radio+" metros. Ocupo un área de "+this.area()+" metros cuadrados.");
  }
}
