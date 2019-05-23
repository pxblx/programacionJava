package practicas.arrays;

import java.util.Scanner;

/**
 * Ejercicio 8
 *
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y que muestre a continuación un diagrama
 * de barras horizontales con esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 */
public class E08Arrays {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    int[] temperaturas = new int[12];
    
    // Introducir los datos en sus posiciones
    for (int i = 0; i < 12; i++) {
      System.out.println("Introduce la temperatura media del mes " + (i + 1) + ":");
      temperaturas[i] = s.nextInt();
    }
    
    // Mostrar el grafico
    System.out.println("Contenido del array:");
    for (int e : temperaturas) {
      for (int i = 0; i < e; i++) {
        System.out.print("*"); 
      }
      System.out.println("");
    }
    s.close();
  }
}
