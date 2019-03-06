/**
 * Ejercicio 10 de POO4
 *
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 *
 * @author Pablo
 */
package practicas.poo4;

import java.util.HashMap;
import java.util.Scanner;

public class E10HashMap {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String palabra;

    HashMap<String, String> diccionario = new HashMap<>();
    diccionario.put("hola","hello");
    diccionario.put("adiós","goodbye");
    diccionario.put("por favor","please");
    diccionario.put("nombre","name");
    diccionario.put("hoy","today");
    diccionario.put("ayer","yesterday");
    diccionario.put("semana","week");
    diccionario.put("día","day");
    diccionario.put("mes","month");
    diccionario.put("lunes","monday");
    diccionario.put("martes","tuesday");
    diccionario.put("miércoles","wednesday");
    diccionario.put("jueves","thursday");
    diccionario.put("viernes","friday");
    diccionario.put("sábado","saturday");
    diccionario.put("domingo","sunday");
    diccionario.put("enero","january");
    diccionario.put("febrero","frebruary");
    diccionario.put("marzo","march");
    diccionario.put("abril","april");

    System.out.print("Introduce una palabra en español: ");
    palabra = scanner.nextLine();
    if (diccionario.containsKey(palabra)) {
      System.out.println("La traducción en inglés es: "+diccionario.get(palabra));
    } else {
      System.out.println("La palabra no está en el diccionario.");
    }
  }
}
