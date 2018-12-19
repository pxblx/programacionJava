/**
 * Ejercicio 4
 * 
 * Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
 * 
 * @author Pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E04Pares {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int numero1, numero2, aux;
    
    // Introduccion de datos
    System.out.println("Desde:");
    numero1 = s.nextInt();
    System.out.println("Hasta:");
    numero2 = s.nextInt();
    
    // Si el primer numero no es par, se le suma 1 para convertirlo en par para empezar el bucle desde este
    if (numero1%2!=0) {
      numero1++;
    }
    
    // Bucle
    for (aux=numero1; aux<numero2; aux+=2) {
      System.out.println(aux);
    }
    
    s.close();
  
  }
  
}
