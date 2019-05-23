package examenes.examen01;

import java.util.Scanner;

/**
 * Ejercicio 2
 *
 * Haz un programa en Java y Python que calcule el elemento N (se pide al usuario) de la serie de Fibonacci.
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Definir las variables
    int n, fibonacci = 1, aux1 = 1, aux2 = 1;
    
    // Pedir el valor para n
    System.out.println("Numero de elemento de la serie Fibonacci:");
    n = s.nextInt();
    
    // Calcular la serie de Fibonacci
    if (n > 3) {
      for (int i = 2; i < n; i++) {
        fibonacci = aux1 + aux2;
        aux1 = aux2;
        aux2 = fibonacci;
      }
    }
    System.out.println("El " + n + " numero de la serie Fibonacci es " + fibonacci + ".");
    s.close();
  }
}
