package practicas.poo4;

import java.util.ArrayList;

/**
 * Ejercicio 8 de POO4
 *
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 */
public class E08ArrayList {
  public static void main(String[] args) {
    ArrayList<Carta> cartas = new ArrayList<>();
    Carta cartaAdd;

    cartaAdd = new Carta();
    cartas.add(cartaAdd);
    for (int i = 0; i < 9; i++) {
      cartaAdd = new Carta();
      for (Carta c: cartas) {
        while (cartaAdd.equals(c)) {
          cartaAdd = new Carta();
        }
      }
      cartas.add(cartaAdd);
    }

    for (Carta c: cartas) {
      System.out.println(c);
    }
  }
}
