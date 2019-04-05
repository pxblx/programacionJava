package examenes.examen03.Ejercicio02;

import examenes.examen03.Ejercicio02.src.Cuadrado;
import examenes.examen03.Ejercicio02.src.Rectangulo;

/**
 * Programa de prueba para las clases Rectángulo y Cuadrado (Ejercicio 2)
 *
 * @author Pablo
 * @version 1.0
 */
public class Test {

  /**
   * Principal
   */
  public static void main(String[] args) {
    // Prueba Rectángulo
    Rectangulo rectangulo1 = new Rectangulo(10, 5);
    System.out.println("Rectángulo 1:\n" + rectangulo1);
    try {
      Rectangulo rectangulo2 = new Rectangulo(6, -4);
      System.out.println("Rectángulo 2:\n" + rectangulo2);
    } catch (ArithmeticException e) {
      System.err.println("No se ha podido crear el objeto: " + e.getMessage() + "\n");
    }

    // Prueba Cuadrado
    Cuadrado cuadrado1 = new Cuadrado(5);
    Cuadrado cuadrado2 = new Cuadrado(8);
    System.out.println("Cuadrado 1:\n" + cuadrado1);
    System.out.println("Cuadrado 2:\n" + cuadrado2);
    System.out.println("¿Son iguales los dos cuadrados?\n" + cuadrado1.equals(cuadrado2));
  }
}
