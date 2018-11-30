/** Ejercicio 3
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el primero que se introduce
 * es el último en mostrarse y viceversa.
 * 
 * @author pablo
 */

package practicas.arrays;

import java.util.Scanner;

public class E03Arrays {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    int[] numeros = new int[10];
    
    // Introducir los datos en sus posiciones
    for (int i=0; i<10; i++) {
      System.out.println("Introduce el "+(i+1)+ " numero:");
      numeros[i]=s.nextInt();
    }
    
    // Recorrer el array mostrando todos sus elementos. Los elementos que no han sido inicializados se muestran como un 0.
    for (int i=9; i>=0; i--) {
      System.out.println("En la posici�n "+i+" hay un "+numeros[i]+".");
    }
    
    s.close();
    
  }
  
}
