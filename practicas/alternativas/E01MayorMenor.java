/** Ejercicio 1
 * Algoritmo que pida dos numeros e indique si el primero es mayor que el segundo o no.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E01MayorMenor {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int numero1, numero2;
    
    // Introduccion de datos
    System.out.println("Introduce el primer numero:");
    numero1 = s.nextInt();
    System.out.println("Introduce el segundo numero:");
    numero2 = s.nextInt();
    
    // Resultado
    if (numero1 > numero2) {
      System.out.println("El primer numero es mayor que el segundo.");
    } else {
      System.out.println("El segundo numero es mayor que el primero.");
    }
    
    s.close();
    
  }
  
}
