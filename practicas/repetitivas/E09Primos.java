package practicas.repetitivas;

import java.util.Scanner;

/**
 * Ejercicio 9
 *
 * Mostrar en pantalla los N primero números primos. Se pide por teclado la cantidad de números primos que queremos mostrar.
 */
public class E09Primos {
  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int n, i, contador = 1, actual = 3;
    
    // Introducción de datos
    System.out.println("Numero de numeros primos a generar:");
    n = s.nextInt();
    
    // Bucle y resultado
    System.out.println("2");
    while (contador < n) {
      boolean primo = true;
      for (i = 3; i <= Math.sqrt(actual) && primo; i += 2) {
        if (actual % i == 0) {
          primo = false;
        }
      }
      if (primo) {
        contador++;
        System.out.println(actual);
      }
      actual+=2;
    }
    s.close();
  }
}
