package practicas.poo3.gestisimal.utiles;

import java.util.Scanner;

/**
 * Clase para pedir datos por teclado (envoltorio de Scanner)
 */
public class Teclado {
  private static Scanner scanner = new Scanner(System.in);

  /**
   * Pedir una cadena
   *
   * @return cadena introducida
   */
  public static String leerCadena() {
    return scanner.nextLine();
  }

  /**
   * Mostrar un mensaje y pedir una cadena
   *
   * @param msg mensaje a mostrar
   * @return cadena introducida
   */
  public static String leerCadena(String msg) {
    System.out.print(msg);
    return leerCadena();
  }

  /**
   * Pedir un entero
   *
   * @return entero introducido
   * @throws NumberFormatException si se introduce algo distinto a un entero
   */
  public static int leerEntero() throws NumberFormatException {
    return Integer.parseInt(leerCadena());
  }

  /**
   * Mostrar un mensaje y pedir un entero
   *
   * @param msg mensaje a mostrar
   * @return entero introducido
   * @throws NumberFormatException si se introduce algo distinto a un entero
   */
  public static int leerEntero(String msg) throws NumberFormatException {
    System.out.print(msg);
    return leerEntero();
  }

  /**
   * Pedir un decimal
   *
   * @return decimal introducido
   * @throws NumberFormatException si se introduce algo distinto a un decimal
   */
  public static double leerDecimal() throws NumberFormatException {
    return Double.parseDouble(leerCadena());
  }

  /**
   * Mostrar un mensaje y pedir un decimal
   *
   * @param msg mensaje a mostrar
   * @return decimal introducido
   * @throws NumberFormatException si se introduce algo distinto a un decimal
   */
  public static double leerDecimal(String msg) throws NumberFormatException {
    System.out.print(msg);
    return leerDecimal();
  }
}
