/**
 * Ejercicio 13
 * 
 * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos
 * incluidos). A continuación el programa mostrar el array y preguntar si el usuario quiere destacar el máximo o el mínimo. Seguidamente
 * se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.
 * 
 * @author Pablo
 */

package practicas.arrays;

import java.util.Scanner;

public class E13Arrays {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    int[] numeros = new int[100];
    int opcion, destacado;
    
    // Introducir los datos en sus posiciones
    for (int i=0; i<100; i++) {
      numeros[i]=(int)(Math.random()*500)+1;
    }
    
    // Mostrar el array
    System.out.println("Contenido del array:");
    for (int e:numeros) {
      System.out.print("|"+e);
    }
    System.out.println("|");
    System.out.println("");
    
    // Pedir el valor a destacar y mostrar el array de nuevo
    do {
      System.out.println("Destacar (1 - minimo, 2 - maximo):");
      opcion = s.nextInt();
      System.out.println("");
    } while (opcion != 1 && opcion != 2);
    
    destacado = numeros[0];
    if (opcion==1) {
      for (int i=0; i<100; i++) {
        if (numeros[i]<destacado) {
          destacado=numeros[i];
        }
      }
    }
    if (opcion==2) {
      for (int i=0; i<100; i++) {
        if (numeros[i]>destacado) {
          destacado=numeros[i];
        }
      }
    }
    System.out.println("Contenido del array (destacado):");
      for (int e:numeros) {
        if (e==destacado) {
          System.out.print("|**"+e+"**"); 
        } else {
          System.out.print("|"+e);
        }
      }
      System.out.println("|");
      System.out.println("");
    
    s.close();
    
  }
  
}
