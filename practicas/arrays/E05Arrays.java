/** Ejercicio 5
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las palabras máximo
 * y mínimo al lado del máximo y del mínimo respectivamente.
 * 
 * @author pablo
 */

package practicas.arrays;

import java.util.Scanner;

public class E05Arrays {
  
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
    int max = numeros[0];
    int min = numeros[0];
    for (int i=0; i<10; i++) {
      if (numeros[i]>max) {
        max = numeros[i];
      }
      if (numeros[i]<min) {
        min = numeros [i];
      }
    }
    
    System.out.println("El mayor es "+max+" y el menor "+min+".");
    
    s.close();
    
  }
  
}
