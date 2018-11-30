/** Ejercicio 3
 * Algoritmo que pida caracteres e imprima "VOCAL" si son vocales y "NO VOCAL" en caso contrario, el programa termina cuando se introduce
 * un espacio.
 * 
 * @author pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E03Caracteres {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String caracter;
    
    // Introduccion de datos
    System.out.println("Introduce un caracter:");
    caracter = s.nextLine();
    
    // Bucle
    while (!" ".equals(caracter)) {
      if ("aeiouAEIOU".indexOf(caracter)!=-1) {
        System.out.println("Vocal.");
      } else {
        System.out.println("No vocal.");
      }
      System.out.println("Introduce un caracter:");
      caracter = s.nextLine();
    }
    
    s.close();
  
  }
  
}
