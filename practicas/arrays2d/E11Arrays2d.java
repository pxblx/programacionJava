/** Ejercicio 11
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios entre 200 y 300. A
 * continuación, el programa debe mostrar los números de la diagonal que va desde la esquina superior izquierda a la esquina inferior
 * derecha, así como el máximo, el mínimo y la media de los números que hay en esa diagonal.
 * 
 * @author pablo
*/

package practicas.arrays2d;

public class E11Arrays2d {
  
  public static void main(String[] args) {
    
    // Definir el array y las variables
    int[][] numeros = new int[10][10];
    int random, max=200, min=300;
    double media=0;
    
    // Introducir los datos en sus posiciones
    for (int x=0; x<10; x++) {
      for (int y=0; y<10; y++) {
        random = (int)(Math.random()*101)+200;
        numeros[x][y] = random;
      }
    }
    
    // Mostrar el array
    for (int x=0; x<10; x++) {
      for (int y=0; y<10; y++) {
        System.out.printf("%-5d",numeros[x][y]);
      }
      System.out.println("");
    }
    System.out.println("");
    
    // Mostrar la diagonal y calcular maximo, minimo y media de esta
    System.out.println("Los elementos de la diagonal son:");
    for (int x=0; x<10; x++) {
      System.out.print("|"+numeros[x][x]);
      if (numeros[x][x]>max) {
        max=numeros[x][x];
      }
      if (numeros[x][x]<min) {
        min=numeros[x][x];
      }
      media=media+numeros[x][x];
    }
    media=media/10;
    System.out.println("|");
    System.out.println("");
    
    System.out.println("El maximo es "+max+", el minimo "+min+" y la media es "+media+".");
    
  }
  
}
