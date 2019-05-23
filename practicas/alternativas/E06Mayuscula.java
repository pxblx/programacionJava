package practicas.alternativas;

import java.util.Scanner;

/**
 * Ejercicio 6
 *
 * Programa que lea una cadena por teclado y compruebe si es una letra mayúscula
 */
public class E06Mayuscula {
  public static void main(String[] args) {

    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String cadena;
    
    // Introduccion de datos
    System.out.println("Introduce una cadena:");
    cadena = s.nextLine();
    
    // Resultado
    if (cadena.length() == 1 && Character.isUpperCase(cadena.charAt(0))) {
      System.out.println("La cadena es una letra mayuscula.");
    } else {
      System.out.println("La cadena no es una letra mayuscula.");
    }
    s.close();
  }
}
