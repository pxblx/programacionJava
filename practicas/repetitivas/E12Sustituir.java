package practicas.repetitivas;

import java.util.Scanner;

/**
 * Ejercicio 12
 *
 * Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena
 * por el segundo carácter.
 */
public class E12Sustituir {
  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String cadena;
    String caracter1;
    String caracter2;
    
    // Introducción de datos
    System.out.println("Introduzca una cadena:");
    cadena = s.nextLine();
    do {
      System.out.println("Introduzca el caracter a buscar:");
      caracter1 = s.nextLine();
    } while (caracter1.length() != 1);
    do {
      System.out.println("Introduzca el caracter por el que se sustituye:");
      caracter2 = s.nextLine();
    } while (caracter2.length() != 1);
    
    // Bucle y resultado
    cadena = cadena.replace(caracter1, caracter2);
    System.out.println(cadena);
    s.close();
  }
}
