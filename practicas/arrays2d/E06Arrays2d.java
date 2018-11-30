/** Ejercicio 6
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 * 
 * @author pablo
*/

package practicas.arrays2d;

public class E06Arrays2d {
  
  public static void main(String[] args) {
    
    // Definir el array y las variables
    int[][] numeros = new int[6][10];
    int[] maxPos = new int[2];
    int[] minPos = new int[2];
    int random, max=0, min=1000;
    boolean esta = false;
    
    // Introducir los datos en sus posiciones comprobando que no se repitan
    for (int x=0; x<6; x++) {
      for (int y=0; y<10; y++) {
        do {
          random = (int)(Math.random()*1000)+1;
          for (int[] aux:numeros) {
            for (int n:aux) {
              if (n==random) {
                esta=true;
              } else {
                esta=false;
              }
            }
          }
        } while (esta);
        numeros[x][y] = random;
        if (random>max) {
          max=random;
          maxPos[0]=x;
          maxPos[1]=y;
        }
        if (random<min) {
          min=random;
          minPos[0]=x;
          minPos[1]=y;
        }
      }
    }
    
    // Mostrar el array y el maximo y el minimo
    for (int x=0; x<6; x++) {
      for (int y=0; y<10; y++) {
        System.out.printf("%-5d",numeros[x][y]);
      }
      System.out.println("");
    }
    
    System.out.println("");
    System.out.println("El maximo esta en la posicion "+maxPos[0]+"x"+maxPos[1]+" y el minimo en la "+minPos[0]+"x"+minPos[1]+".");
    
  }
  
}
