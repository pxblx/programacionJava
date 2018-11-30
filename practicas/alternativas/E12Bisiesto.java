/** Ejercicio 12
 * Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un numero divisible por 4,
 * pero no si es divisible por 100, excepto que tambien sea divisible por 400.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E12Bisiesto {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int a;
    
    // Introduccion de datos
    System.out.println("Introduce un año:");
    a = s.nextInt();
    
    // Resultado
    if (a%4==0) {
      System.out.println("Es bisiesto.");
    } else if (a%100==0 && a%400==0) {
      System.out.println("Es bisiesto.");
    } else {
      System.out.println("No es bisiesto.");
    }
    
    s.close();
    
  }
  
}
