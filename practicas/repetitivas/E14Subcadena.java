package practicas.repetitivas;

import java.util.Scanner;

/**
 * Ejercicio 14
 *
 * Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.
 */
public class E14Subcadena {
  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String cadena, subcadena;
    
    // Introducción de datos
    System.out.println("Introduzca una cadena:");
    cadena = s.nextLine();
    System.out.println("Introduzca una subcadena a buscar:");
    subcadena = s.nextLine();
    
    // Bucle y resultado
    if (cadena.indexOf(subcadena) != -1) {
      System.out.println("Contiene la subcadena.");
    } else {
      System.out.println("No contiene la subcadena.");
    }
    s.close();
  }
}
