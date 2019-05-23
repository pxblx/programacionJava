package practicas.poo4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 9 de POO4
 *
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán por palo:
 * bastos, copas, espadas, oros. Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota,
 * caballo, rey.
 */
public class E09ArrayList {
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

    Collections.sort(cartas);

    for (Carta c: cartas) {
      System.out.println(c);
    }
  }
}
