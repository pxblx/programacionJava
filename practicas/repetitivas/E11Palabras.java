/** Ejercicio 11
 * Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa
 * que cuente cuantas palabras tiene.
 * 
 * @author pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E11Palabras {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String cadena;
    int contador = 0;
    
    // Introducción de datos
    System.out.println("Introduzca una cadena:");
    cadena = s.nextLine();
    
    // Bucle y resultado
    cadena = cadena.trim();
    for (int i=0; i < cadena.length(); i++) {
      if (cadena.charAt(i)==' ') {
        contador++;
      }
    }
    contador++;
    
    System.out.println("La cadena '"+cadena+"' tiene "+contador+" palabras.");
    
    s.close();
    
  }
      
}
