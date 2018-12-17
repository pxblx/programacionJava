/** Ejercicio 15 de funciones
 * 
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author Pablo
 */

package practicas.funciones;

import practicas.funciones.funciones.Matematicas;

public class E15Primos {
  
  public static void main(String[] args) {
    
    // Obtener los primos entre 1 y 1000
    System.out.print("| ");
    for (int i = 1; i < 1000; i++) {
      if (Matematicas.esPrimo(i)) {
        System.out.print(i + " | ");
      }
    }
    
  }
  
}
