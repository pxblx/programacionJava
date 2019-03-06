/**
 * Ejercicio 1 de Excepciones
 *
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 *
 * @author Pablo
 */
package practicas.excepciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E01Excepciones {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int numero;

    while (numeros.size() < 6) {
      System.out.print("Introduzca el "+(numeros.size()+1)+" número: ");
      try {
        numero = scanner.nextInt();
        numeros.add(numero);
      } catch (InputMismatchException e) {
        System.out.println("Los valores a introducir deben ser números enteros.");
        scanner.next(); // Limpiar el valor incorrecto del scanner
      }
    }

    System.out.println("\nEl máximo es "+ Collections.max(numeros));
    System.out.println("El mínimo es "+ Collections.min(numeros));
  }
}
