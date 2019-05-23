package practicas.poo2.E06;

/**
 * Ejercicio 6 de POO
 *
 * Programa de prueba
 */
public class Prueba {
  public static void main(String args[]) {
    Tiempo prueba = new Tiempo(15,59,60000000);
    Tiempo prueba2 = new Tiempo(9,67,57);
    System.out.println(prueba);
    System.out.println(prueba2);
    System.out.println(prueba.resta(prueba2));
  }
}
