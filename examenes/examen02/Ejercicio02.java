package examenes.examen02;

import java.util.Scanner;

/**
 * Ejercicio 2
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    // Definir las variables
    Scanner s = new Scanner(System.in);
    String[][] equipos = new String[15][2];
    int[][] resultados = new int[15][2];
    
    // Pedir valores para el array de equipos
    for (int x = 0; x < 15; x++) {
      for (int y = 0; y < 2; y++) {
        System.out.print("Introduce el equipo " + (y + 1) + " para el partido " + (x + 1) + ": ");
        equipos[x][y] = s.nextLine();
      }
    }
    
    // Pedir valores para el array de resultados
    for (int x = 0; x < 15; x++) {
      for (int y = 0; y < 2; y++) {
        System.out.print("Introduce el resultado del equipo " + (y + 1) + " en el partido " + (x + 1) + ": ");
        resultados[x][y] = s.nextInt();
      }
    }
    
    // Imprimir la quiniela
    imprimirQuiniela(equipos, resultados);
    
    s.close();
  }
  
  /**
   * Imprime la quiniela, recibiendo como argumentos los arrays de quipos y resultados
   * 
   * @param equipos array de quipos
   * @param resultados array de resultados
   */
  public static void imprimirQuiniela (String[][] equipos, int[][] resultados) {
    // Definir las variables
    int res1 = 0;
    int res2 = 0;
    
    // Imprimir la quiniela
    System.out.println("\nResultados de la quiniela:\n");
    
    // Imprimir partido
    for (int x = 0; x < 15; x++) {
      System.out.print("Partido " + (x + 1) + ": ");
      
      // Imprimir los nombres de los equipos
      for (int y = 0; y < 2; y++) {
        System.out.print(equipos[x][y]);
        if (y == 0) {
          System.out.print(" - ");
        }
      }
      System.out.print(" > ");
      
      // Imprimir los resultados del partido y la quiniela
      for (int y = 0; y < 2; y++) {
        System.out.print(resultados[x][y]);
        if (y == 0) {
          System.out.print("-");
          res1 = resultados[x][y];
        } else {
          res2 = resultados[x][y];
          System.out.print(" > ");
          if (res1 > res2) {
            System.out.println("1");
          } else if (res1 < res2) {
            System.out.println("2");
          } else {
            System.out.println("x");
          }
        }
      }
      res1 = 0;
      res2 = 0;
    }
  }
}
