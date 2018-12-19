/**
 * Ejercicio 2
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5 columnas. El programa
 * mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
 * esquina inferior derecha.
 * 
 * @author Pablo
 */

package practicas.arrays2d;

import java.util.Scanner;

public class E02Arrays2d {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    int[][] numeros = new int[4][5];
    int suma=0, sumaTotal=0, sumaColumna=0;
    
    // Introducir los datos en sus posiciones
    for (int x=0; x<4; x++) {
      for (int y=0; y<5; y++) {
        System.out.println("Introduce el numero para la posicion "+x+"x"+y+":");
        numeros[x][y] = s.nextInt();
      }
    }
    System.out.println("");
    
    // Mostrar el array
    for (int x=0; x<4; x++) {
      for (int y=0; y<5; y++) {
        System.out.printf("%-5d",numeros[x][y]);
        suma=suma+numeros[x][y];
      }
      System.out.print(suma);
      sumaTotal=sumaTotal+suma;
      suma=0;
      System.out.println("");
    }
    for (int y=0; y<5; y++) {
      for (int x=0; x<4; x++) {
        sumaColumna=sumaColumna+numeros[x][y];
      }
      System.out.printf("%-5d",sumaColumna);
      sumaColumna=0;
    }
    System.out.print(sumaTotal);
    
    s.close();
    
  }
  
}
