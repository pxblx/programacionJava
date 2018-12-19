/**
 * Ejercicio 10
 * 
 * Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena.
 * 
 * @author Pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E10Cadena {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String cadena;
    char caracter;
    int contador = 0;
    
    // Introducción de datos
    System.out.println("Introduzca una cadena:");
    cadena = s.nextLine();
    System.out.println("Introduzca un caracter:");
    caracter = s.next().charAt(0);
    
    // Bucle y resultado
    for (int i=0; i < cadena.length(); i++) {
      if (cadena.charAt(i)==caracter) {
        contador++;
      }
    }
    
    System.out.println("El caracter '"+caracter+"' aparece "+contador+" veces en la cadena '"+cadena+"'.");
    
    s.close();
    
  }
      
}
