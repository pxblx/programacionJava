/**
 * Ejercicio 4
 * 
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retardo,
 * dando la impresión de que el ordenador se queda “pensando” antes de mostrar los números
 * 
 * @author Pablo
 */

package practicas.arrays2d;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class E04Arrays2d {
  
  public static void main(String[] args) throws InterruptedException {
    
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
    
    // Mostrar el array con delays
    for (int x=0; x<4; x++) {
      for (int y=0; y<5; y++) {
        System.out.printf("%-5d",numeros[x][y]);
        suma=suma+numeros[x][y];
      }
      TimeUnit.SECONDS.sleep(1);
      System.out.print(suma);
      sumaTotal=sumaTotal+suma;
      suma=0;
      System.out.println("");
    }
    for (int y=0; y<5; y++) {
      for (int x=0; x<4; x++) {
        sumaColumna=sumaColumna+numeros[x][y];
      }
      TimeUnit.SECONDS.sleep(1);
      System.out.printf("%-5d",sumaColumna);
      sumaColumna=0;
    }
    TimeUnit.SECONDS.sleep(3);
    System.out.print(sumaTotal);
    
    s.close();
    
  }
  
}
