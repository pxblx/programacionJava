/** Ejercicio 6
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de
 * la potencia. No se puede utilizar el operador de potencia.
 * 
 * @author pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E06Potencia {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int base, exponente, i, resultado = 1;
    
    // Introduccion de datos
    System.out.println("Introduce la base:");
    base = s.nextInt();
    System.out.println("Introduce el exponente:");
    exponente = s.nextInt();
    
    // Bucle
    for (i=1;i<=exponente;i++) {
      resultado=resultado*base;
    }
    
    // Resultado
    System.out.println("El resultado es "+resultado+".");
    
    s.close();
  
  }
  
}
