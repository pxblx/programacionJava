/** Ejercicio 17
 * Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras y muestre por
 * pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
 * 
 * Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: "ERROR: número incorrecto.".
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E17Dado {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int resultado;
    
    // Introduccion de datos
    System.out.println("Introduzca numero del dado:");
    resultado = s.nextInt();
    
    // Resultado
    if (resultado==1) {
      System.out.println("El opuesto es el seis.");
    } else if (resultado==2) {
      System.out.println("El opuesto es el cinco.");
    } else if (resultado==3) {
      System.out.println("El opuesto es el cuatro.");
    } else if (resultado==4) {
      System.out.println("El opuesto es el tres.");
    } else if (resultado==5) {
      System.out.println("El opuesto es el dos.");
    } else if (resultado==6) {
      System.out.println("El opuesto es el uno.");
    } else {
      System.out.println("ERROR: Numero incorrecto.");
    }
    
    s.close();
    
  }
  
}
