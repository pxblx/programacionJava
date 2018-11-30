/** Ejercicio 10
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz
 * de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
 * restantes. Utiliza arrays auxiliares si es necesario.
 * 
 * @author pablo
 */

package practicas.arrays;

import java.util.Scanner;

public class E10Arrays {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    int[] numeros = new int[20];
    int[] pares = new int[20];
    int contPares = 0;
    int contImpares = 0;
    int[] impares = new int[20];
    int[] resultado = new int[20];
    
    // Introducir los datos en sus posiciones
    for (int i=0; i<20; i++) {
      numeros[i]=(int)(Math.random()*100)+1;
    }
    
    // Mostrar el array
    System.out.println("Contenido del array:");
    for (int e:numeros) {
      System.out.print("|"+e);
    }
    System.out.println("|");
    System.out.println("");
    
    for (int i=0; i<20; i++) {
      if (numeros[i]%2==0) {
        pares[contPares] = numeros[i];
        contPares++;
      } else {
        impares[contImpares] = numeros[i];
        contImpares++;
      }
    }
    
    // Introducir los datos ordenados en el nuevo array
    System.arraycopy(pares,0,resultado,0,contPares);
    System.arraycopy(impares,0,resultado,(contPares),contImpares);
    
    // Mostrar el array ordenado
    System.out.println("Contenido del array ordenado:");
    for (int e:resultado) {
      System.out.print("|"+e);
    }
    System.out.println("|");
    
    s.close();
    
  }
  
}
