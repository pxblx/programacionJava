package practicas.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejercicio 2 de ficheros
 *
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 */
public class E02Primos {
  public static void main(String[] args) {
    final String NOMBRE_ARCHIVO = ".\\src\\practicas\\ficheros\\primos.dat";
    String linea;

    try {
      BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
      linea = br.readLine();
      while (linea != null) {
        System.out.println(linea);
        linea = br.readLine();
      }
    } catch (FileNotFoundException e) {
      System.err.println("No se ha encontrado el archivo '"+NOMBRE_ARCHIVO+"'.");
    } catch (IOException e) {
      System.err.println("No se ha podido escribir en el archivo '"+NOMBRE_ARCHIVO+"'.");
    }
  }
}
