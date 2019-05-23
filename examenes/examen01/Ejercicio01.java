package examenes.examen01;

import java.util.Scanner;

/**
 * Ejercicio 1
 *
 * Haz un programa en Java y Python que calcule el combinatorio de dos numeros. Si hay un error en la introducción debe indicarlos.
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Definir las variables
    int n, m, contador, factorialN = 1, factorialM = 1, factorialNM = 1;
    double combinatorio;
    
    // Pedir los valores N y M
    do {
      System.out.println("Introduce N:");
      n = s.nextInt();
      System.out.println("Introduce M:");
      m = s.nextInt();
      System.out.println();
    } while (n < m);
    
    // Calcular el factorial de N
    contador = n;
    while (contador != 0) {
      factorialN *= contador;
      contador--;
    }
    
    // Calcular el factorial de M
    contador = m;
    while (contador != 0) {
      factorialM *= contador;
      contador--;
    }
    
    // Calcular el factorial de N-M
    contador = n - m;
    while (contador != 0) {
      factorialNM *= contador;
      contador--;
    }
    
    // Calcular el combinatorio de N y M y sacarlo por pantalla
    combinatorio = factorialN / (factorialNM * factorialM);
    System.out.println("El combinatorio de " + n + " y " + m + " es " + combinatorio + ".");
    s.close();
  }
}
