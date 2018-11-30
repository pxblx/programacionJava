/** Ejercicio 6
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los elementos de ese array, es decir, el
 * elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El n�mero que se encuentra en la última posición debe
 * pasar a la posición 0. Finalmente, muestra el contenido del array.
 * 
 * @author pablo
 */

package practicas.arrays;

import java.util.Scanner;

public class E06Arrays {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    int[] numeros = new int[15];
    int aux = 0, e;
    
    // Introducir los datos en sus posiciones
    for (int i=0; i<15; i++) {
      System.out.println("Introduce el "+(i+1)+ " numero:");
      numeros[i]=s.nextInt();
    }
    
    // Rotar el array
    aux = numeros[14];
    for (e=14; e>0; e--) {
      numeros[e]=numeros[e-1];
    }
    numeros[0]=aux;
    
    // Recorrer el array rotado
    for (int i:numeros) {
      System.out.println(i);
    }
    
    s.close();
    
  }
  
}
