package practicas.poo4;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 11 de POO4
 *
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior. El programa
 * irá pidiendo que el usuario teclee la traducción al inglés de cada una de las palabras y comprobará si
 * son correctas. Al final, el programa deberá mostrar cuántas respuestas son
 * válidas y cuántas erróneas.
 */
public class E11HashMap {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random r = new Random();
    int correctas = 0;
    int incorrectas = 0;
    String[] palabras;
    String input;
    String palabraAleatoria;

    HashMap<String, String> diccionario = new HashMap<>();
    diccionario.put("hola", "hello");
    diccionario.put("adiós", "goodbye");
    diccionario.put("por favor", "please");
    diccionario.put("nombre", "name");
    diccionario.put("hoy", "today");
    diccionario.put("ayer", "yesterday");
    diccionario.put("semana", "week");
    diccionario.put("día", "day");
    diccionario.put("mes", "month");
    diccionario.put("lunes", "monday");
    diccionario.put("martes", "tuesday");
    diccionario.put("miércoles", "wednesday");
    diccionario.put("jueves", "thursday");
    diccionario.put("viernes", "friday");
    diccionario.put("sábado", "saturday");
    diccionario.put("domingo", "sunday");
    diccionario.put("enero", "january");
    diccionario.put("febrero", "frebruary");
    diccionario.put("marzo", "march");
    diccionario.put("abril", "april");

    palabras = diccionario.keySet().toArray(new String[0]);

    for (int i = 0; i < 5; i++) {
      palabraAleatoria = palabras[r.nextInt(palabras.length)];
      System.out.print("Introduce la traducción en inglés de " + palabraAleatoria + ": ");
      input = scanner.nextLine();
      if (diccionario.get(palabraAleatoria).equals(input)) {
        correctas++;
      } else {
        incorrectas++;
      }
    }

    System.out.println("\nHas acertado " + correctas + " palabras y has fallado " + incorrectas + ".");
  }
}
