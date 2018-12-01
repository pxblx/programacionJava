/** Ejercicio 13
 * Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.
 * 
 * @author pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E13MayMin {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String cadena, cadenaNueva="";
    char caracter, caracterMin, caracterMay;
    
    // Introducción de datos
    System.out.println("Introduzca una cadena:");
    cadena = s.nextLine();
    
    // Bucle y resultado
    for (int i=0; i<cadena.length(); i++) {
      caracter = cadena.charAt(i);
      caracterMin = Character.toLowerCase(cadena.charAt(i));
      if (caracter!=caracterMin) {
        cadenaNueva = cadenaNueva+Character.toString(caracterMin);
      } else {
        caracterMay = Character.toUpperCase(cadena.charAt(i));
        cadenaNueva = cadenaNueva+Character.toString(caracterMay);
      }
    }
    
    System.out.println(cadenaNueva);
    
    s.close();
    
  }
      
}
