package practicas.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejercicio 1 de ficheros
 *
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 */
public class E01Primos {
  public static void main(String[] args) {
    final String NOMBRE_ARCHIVO = ".\\src\\practicas\\ficheros\\primos.dat";
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(new File(NOMBRE_ARCHIVO)));
      int contador;
      for(int i = 2; i < 500; i++) {
        contador = 0;
        for(int j = 1; j < i+1; j++) {
          if (i % j == 0) {
            contador++;
          }
        }
        if (contador < 3) {
          bw.write(i + "\n");
        }
      }
      bw.close();
      System.out.println("Archivo '" + NOMBRE_ARCHIVO + "' creado.");
    } catch (IOException e) {
      System.err.println("No se ha podido escribir en el archivo '" + NOMBRE_ARCHIVO + "'.");
    }
  }
}
