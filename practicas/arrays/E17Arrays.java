/** Ejercicio 17
 * Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar entre 0 y 100. A continuación,
 * el programa debe pedir un número al usuario. Se debe comprobar que el número introducido por teclado se encuentra dentro del
 * array, en caso contrario se mostrará un mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca
 * uno correctamente. A continuación, el programa rotará el array hacia la derecha las veces que haga falta hasta que el número
 * introducido quede situado en la posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 * 
 * @author pablo
 */

package practicas.arrays;

import java.util.Scanner;

public class E17Arrays {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    int[] numeros = new int[10];
    int n, q=0, aux;
    boolean encontrado = false;
    
    // Introducir los datos en sus posiciones
    for (int i=0; i<10; i++) {
      numeros[i]=(int)(Math.random()*100)+1;
    }
    
    // Mostrar el array
    System.out.println("Contenido del array:");
    for (int e:numeros) {
      System.out.print("|"+e);
    }
    System.out.println("|");
    System.out.println("");
    
    // Pedir el valor a destacar
    while (encontrado == false) {
      System.out.println("Introduce un numero que este dentro del array:");
      n = s.nextInt();
      for (int i=0; i<10; i++) {
        if (numeros[i] == n) {
            encontrado = true;
            q = i;
        }
      }
    }
    if (encontrado == true) {
      System.out.println("El numero es correcto.");
      System.out.println("");
    }
    
    // Rotar el array
    for (int e=0; e<q; e++) {
      aux = numeros[0];
      for (int i=0; i<9; i++) {
        numeros[i]=numeros[i+1];
      }
      numeros[9]=aux;
    }
    
    // Mostrar el array rotado
    System.out.println("Contenido del array (rotado):");
    for (int e:numeros) {
      System.out.print("|"+e);
    }
    System.out.println("|");
    System.out.println("");
    
    s.close();
    
  }
  
}
