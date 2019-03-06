/**
 * Ejercicio 3 de POO4
 *
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 *
 * @author Pablo
 */
package practicas.poo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E03ArrayList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();
    int input;

    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce el "+(i+1)+" valor: ");
      input = scanner.nextInt();
      array.add(input);
    }

    Collections.sort(array);

    System.out.print("\n| ");
    for (int c: array) {
      System.out.print(c+" | ");
    }
  }
}
