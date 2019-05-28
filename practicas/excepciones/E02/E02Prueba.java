package practicas.excepciones.E02;

/**
 * Ejercicio 2 de Excepciones
 *
 * Programa de prueba.
 */
public class E02Prueba {
  public static void main(String[] args) {
    E02Excepciones garfield = new E02Excepciones("macho");
    E02Excepciones tom = new E02Excepciones("macho");

    try {
      E02Excepciones gatito = garfield.apareaCon(tom);
      gatito.maulla();
    } catch (ExcepcionApareamientoImposible e) {
      e.printStackTrace();
    }
  }
}
