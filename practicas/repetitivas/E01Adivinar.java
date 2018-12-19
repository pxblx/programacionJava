/**
 * Ejercicio 1
 * 
 * Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo
 * números y va respondiendo si el número a adivinar es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes 10
 * intentos para acertarlo). El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se
 * llega al limite de intentos te muestra el número que había generado.
 * 
 * @author Pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E01Adivinar {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int numero, contador = 10, random = (int)(Math.random()*100)+1;
    
    
    // Introduccion de datos
    System.out.println("Introduzca un numero:");
    numero = s.nextInt();
    
    // Bucle
    while (numero!=random && contador>1) {  
      if (numero>random) {
        contador--;
        System.out.println("El numero es menor que el que has introducido, te quedan "+contador+" intentos.");
      }
      if (numero<random) {
        contador--;
        System.out.println("El numero es mayor que el que has introducido, te quedan "+contador+" intentos.");
      }
      System.out.println("Introduzca un numero:");
      numero = s.nextInt();
    }
    
    // Resultado
    if (numero==random) {
      System.out.println("Has acertado.");
    } else {
      System.out.println("El numero era "+random+".");
    }
    
    s.close();
  
  }
  
}
