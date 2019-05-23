package practicas.poo4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Ejercicio 12 de POO4
 *
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey →
 * 4; el resto de cartas no vale nada.
 */
public class E12HashMap {
  public static void main(String[] args) {
    ArrayList<Carta> cartas = new ArrayList<>();
    HashMap<String, Integer> valores = new HashMap<>();
    valores.put("as", 11);
    valores.put("dos", 0);
    valores.put("tres", 10);
    valores.put("cuatro", 0);
    valores.put("cinco", 0);
    valores.put("seis", 0);
    valores.put("siete", 0);
    valores.put("sota", 2);
    valores.put("caballo", 3);
    valores.put("rey", 4);
    int puntos = 0;
    Carta carta = new Carta();

    cartas.add(carta);
    for (int i = 0; i < 5; i++) {
      do {
        carta = new Carta();
      } while (cartas.contains(carta));
      cartas.add(carta);
    }

    for (Carta c : cartas) {
      System.out.println(c);
      puntos += valores.get(c.getNumero());
    }

    System.out.println("\nPuntos obtenidos: "+puntos);
  }
}
