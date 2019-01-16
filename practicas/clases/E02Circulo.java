/**
 * Ejercicio 2 de clases
 * 
 * Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 * - Un círculo puede crecer. Aumenta su radio.
 * - Un círculo puede menguar. Decrementa su radio.
 * - Un círculo me devuelve su área si se la pido.
 * - Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros. Ocupo un área de 0.7853981633974483 metros
 *   cuadrados” (método toString())
 *   
 * @author Pablo
 */
package practicas.clases;

public class E02Circulo {
  
  private double radio;
  
  /**
   * Método constructor
   * 
   * @param r
   */
  public E02Circulo(double r) {
    this.radio = r;
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
   * Devuelve el área del círculo
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
