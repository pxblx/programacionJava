package examenes.examen01;

import java.util.Scanner;

/**
 * Ejercicio 3
 *
 * Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos
 * incluidos). A continuación el programa mostrar el array y preguntar si el usuario quiere resaltar los múltiplos de 5 o los
 * múltiplos de 7. Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    int[] numeros = new int[20];
    int opcion;
    
    // Introducir los datos en sus posiciones
    for (int i = 0; i < 20; i++) {
      numeros[i] = (int)(Math.random() * 400) + 1;
    }
    
    // Mostrar el array
    System.out.println("Contenido del array:");
    for (int e : numeros) {
      System.out.print("|" + e);
    }
    System.out.println("|\n");
    
    // Pedir el valor a destacar
    do {
      System.out.println("Destacar (1 - Multiplos de 5, 2 - Multiplos de 7):");
      opcion = s.nextInt();
      System.out.println("");
    } while (opcion != 1 && opcion != 2);
    
    // Mostrar el array con los numeros destacados segun la opcion
    System.out.println("Contenido del array (destacado):");
      for (int e : numeros) {
        if (opcion == 1) {
          if (e % 5 == 0) {
            System.out.print("|**" + e + "**");
          } else {
            System.out.print("|" + e);
          }
        }
        if (opcion == 2) {
          if (e % 7 == 0) {
            System.out.print("|**" + e + "**");
          } else {
            System.out.print("|" + e);
          }
        }
      }
      System.out.println("|\n");
    s.close();
  }
}
