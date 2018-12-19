/**
 * Ejercicio 15
 * 
 * Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.
 * 
 * @author Pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E15Palindroma {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String cadena;
    int i,j;
    
    // Introducción de datos
    System.out.println("Introduzca una cadena:");
    cadena = s.nextLine();
    
    // Bucle y resultado
    for (i=0,j=cadena.length()-1; cadena.charAt(i)==cadena.charAt(j) && j>i; j--,i++);
    if (i>=j) {
      System.out.println("La cadena es palindroma.");
    }
    else {
      System.out.println("La cadena no es palindroma.");
    }
    
    s.close();
    
  }
      
}
