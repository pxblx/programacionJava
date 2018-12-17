/**
 * Ejercicio 16 de funciones
 * 
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Pablo
 */

package practicas.funciones;

import practicas.funciones.funciones.Matematicas;

public class E16Capicua {
  
  public static void main(String[] args) {
    
    // Obtener los números capicúa entre 1 y 99999
    System.out.print("| ");
    for (int i = 1; i < 100000; i++) {
      if (Matematicas.esCapicua(i)) {
        System.out.print(i + " | ");
      }
    }
    
  }
  
}
