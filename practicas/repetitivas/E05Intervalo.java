/** Ejercicio 5
 * Escribe un programa que pida el limite inferior y superior de un intervalo. Si el l�mite inferior es mayor que el superior lo tiene que volver a pedir. 
 * A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:
 * - La suma de los números que estén dentro del intervalo (intervalo abierto).
 * - Cuantos números están fuera del intervalo.
 * - Informa si hemos introducido algún número igual a los límites del intervalo.
 * 
 * @author pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E05Intervalo {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int desde, hasta, suma=0, fuera=0, igual=0, numero;
    
    // Introduccion de datos
    do {
    System.out.println("Desde:");
    desde = s.nextInt();
    System.out.println("Hasta:");
    hasta = s.nextInt();
    } while (desde>hasta);
    System.out.println("Introduce un numero:");
    numero = s.nextInt();
    
    // Bucle
    do {
      suma=suma+numero;
      if (numero<desde || numero >hasta) {
        fuera++;
      }
      if (numero==desde || numero==hasta) {
        igual++;
      }
      System.out.println("Introduce un numero:");
      numero = s.nextInt();
    } while (numero!=0);
    
    // Resultado
    System.out.println("Has introducido "+fuera+" numeros fuera del rango, "+igual+" numeros iguales a los limites y la suma de todos es igual a "+suma+".");
    
    s.close();
  
  }
  
}
