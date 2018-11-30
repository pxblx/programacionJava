/** Ejercicio 7
 * Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
 * - El exponente sea positivo, solo tienes que imprimir la potencia.
 * - El exponente sea 0, el resultado es 1.
 * - El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;
import java.lang.Math;

public class E07Potencia {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double base, exponente;
    
    // Introduccion de datos
    System.out.println("Introduce la base:");
    base = s.nextDouble();
    System.out.println("Introduce el exponente:");
    exponente = s.nextDouble();
    
    // Resultado
    if (exponente==0) {
      System.out.println("El resultado es 1.0.");
    } else if (exponente<0) {
      System.out.println("El resultado es "+1/(Math.pow(base,Math.abs(exponente)))+".");
    } else {
      System.out.println("El resultado es "+Math.pow(base,exponente)+".");
    }
    
    s.close();
    
  }
  
}
