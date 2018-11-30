/** Ejercicio 3
 * Escribe un programa que lea un numero e indique si es par o impar.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E03ParImpar {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int numero;
    
    // Introduccion de datos
    System.out.println("Introduce un numero:");
    numero = s.nextInt();
    
    // Resultado
    if (numero%2==0) {
      System.out.println("El numero es par.");
    } else {
      System.out.println("El numero es impar.");
    }
    
    s.close();
    
  }
  
}
