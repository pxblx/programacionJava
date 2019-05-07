package examenes.examen03.ejercicio02.test;

import examenes.examen03.ejercicio02.Cuadrado;
import examenes.examen03.ejercicio02.Rectangulo;
import examenes.examen03.utiles.Menu;
import examenes.examen03.utiles.Teclado;

/**
 * Programa de prueba para las clases Rectángulo y Cuadrado (Ejercicio 2)
 */
public class Test {
  private static Menu menuPrincipal = new Menu("Programa de prueba", new String[]{"Test rectángulo", "Test cuadrado", "Test comparar cuadrados", "Salir"});

  /**
   * Principal
   */
  public static void main(String[] args) {
    do {
      try {
        switch (menuPrincipal.gestionar()) {
          case 1:
            testRectangulo();
            break;

          case 2:
            testCuadrado();
            break;

          case 3:
            testCompararCuadrados();
            break;
            
          default:
            salir();
            return;
        }
      } catch (ArithmeticException e) {
        System.err.println("\nNo se ha podido crear el objeto: " + e.getMessage() + "\n");
      }
    } while (true);
  }

  /**
   * Test para la clase Rectangulo
   *
   * @throws ArithmeticException si se da un valor mayor que 10, negativo o 0 al lado
   */
  private static void testRectangulo() throws ArithmeticException {
    Rectangulo rectangulo = new Rectangulo(Teclado.leerEntero("\nIntroduce el ancho: "), Teclado.leerEntero("Introduce el alto: "));
    System.out.println("\n" + rectangulo);
  }

  /**
   * Test para la clase Cuadrado
   *
   * @throws ArithmeticException si se da un valor mayor que 10, negativo o 0 al lado
   */
  private static void testCuadrado() throws ArithmeticException {
    Cuadrado cuadrado = new Cuadrado(Teclado.leerEntero("\nIntroduce el lado: "));
    System.out.println("\n" + cuadrado);
  }

  /**
   * Test para la la clase Cuadrado (comparar)
   *
   * @throws ArithmeticException si se da un valor mayor que 10, negativo o 0 al lado
   */
  public static void testCompararCuadrados() throws ArithmeticException {
    Cuadrado cuadrado1 = new Cuadrado(Teclado.leerEntero("\nIntroduce el lado del primer cuadrado: "));
    Cuadrado cuadrado2 = new Cuadrado(Teclado.leerEntero("Introduce el lado del segundo cuadrado: "));
    System.out.println("\nCuadrado 1:\n" + cuadrado1 + "\n\nCuadrado 2:\n" + cuadrado2);
    if (cuadrado1.compareTo(cuadrado2) == 0) {
      System.out.println("\nLos cuadrados son iguales.");
    } else if (cuadrado1.compareTo(cuadrado2) == 1) {
      System.out.println("\nEl primer cuadrado es más grande que el segundo.\n");
    } else {
      System.out.println("\nEl primer cuadrado es más pequeño que el segundo.\n");
    }
  }

  /**
   * Salir
   */
  private static void salir() {
    System.out.print("\nSaliendo...");
  }
}
