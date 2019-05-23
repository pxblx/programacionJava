package practicas.poo4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 2 de POO4
 *
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 */
public class E02ArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();
    int n = (int)((Math.random() * 10) + 10);
    int r = (int)((Math.random() * 100) + 1);
    int sum = 0;

    for (int i = 0; i < n; i++) {
      array.add(r);
      r = (int)((Math.random() * 100) + 1);
    }

    for (int c : array) {
      sum += c;
    }

    System.out.println("Tamaño del array: " + array.size());
    System.out.println("La suma es: " + sum);
    System.out.println("La media es: " + (double)(sum / array.size()));
    System.out.println("El máximo es: " + Collections.max(array));
    System.out.println("El mínimo es: " + Collections.min(array));
  }
}
