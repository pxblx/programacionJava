package practicas.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 4 de ficheros
 *
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 */
public class E04Ordenar {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Se debe pasar como parámetro el nombre del archivo a ordenar.");
      System.exit(-1);
    }
    final String NOMBRE_ARCHIVO = args[0];
    ArrayList<String> palabras = new ArrayList<>();
    String linea;
    String nuevo_archivo = NOMBRE_ARCHIVO.substring(0, NOMBRE_ARCHIVO.lastIndexOf('.'))+"_sort.txt";

    try {
      BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

      linea = br.readLine();
      while (linea != null) {
        palabras.add(linea);
        linea = br.readLine();
      }
      Collections.sort(palabras);

      BufferedWriter bw = new BufferedWriter(new FileWriter(new File(nuevo_archivo)));
      for (String palabra : palabras) {
        bw.write(palabra+"\n");
      }
      bw.close();
      System.out.println("Archivo '"+nuevo_archivo+"' creado.");
    } catch (FileNotFoundException e) {
      System.err.println("No se ha encontrado el archivo '"+NOMBRE_ARCHIVO+"'.");
    } catch (IOException e) {
      System.err.println("No se ha podido escribir en el archivo '"+NOMBRE_ARCHIVO+"'.");
    }
  }
}
