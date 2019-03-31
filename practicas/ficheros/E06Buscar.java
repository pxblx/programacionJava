package practicas.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 6 de ficheros
 *
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 */
public class E06Buscar {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.err.println("Se deben pasar como parámetros el nombre del archivo y la palabra a buscar.");
      System.exit(-1);
    }
    final String NOMBRE_ARCHIVO = args[0];
    String palabra = args[1];
    String linea;
    int ocurrencias;
    ArrayList<String> palabras = new ArrayList<>();

    try {
      BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
      linea = br.readLine();
      while (linea != null) {
        palabras.add(linea);
        linea = br.readLine();
      }
      ocurrencias = Collections.frequency(palabras, palabra);
      System.out.println("Se han encontrado "+ocurrencias+" ocurrencias de la palabra '"+palabra+"'.");
    } catch (FileNotFoundException e) {
      System.err.println("No se ha encontrado el archivo '"+NOMBRE_ARCHIVO+"'.");
    } catch (IOException e) {
      System.err.println("No se ha podido escribir en el archivo '"+NOMBRE_ARCHIVO+"'.");
    }
  }
}
