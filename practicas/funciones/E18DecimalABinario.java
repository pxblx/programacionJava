/**
 * Ejercicio 18 de funciones
 * 
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author Pablo
 */

package practicas.funciones;

import java.util.Scanner;
import practicas.funciones.funciones.Matematicas;

public class E18DecimalABinario {
  
  public static void main(String[] args) {
    
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int numero;
    int resto;
    int resultado;
    
    // Introducción de datos
    System.out.print("Introduce un número decimal: ");
    numero = s.nextInt();
    
    // Se añade al resultado el primer resto de la división del número entre 2
    resultado = numero%2;
    // Se divide por primera vez entre 2
    numero /= 2;
    // Mientras que el número siga siendo mayor que 0
    while (numero > 0) {
      // Se obtiene el siguiente resto de la división
      resto = numero%2;
      // Se añade al resultado
      resultado = Matematicas.pegaPorDetras(resultado, resto);
      // Se divide entre 2
      numero /= 2;
    }
    
    s.close();
    
    // Se voltea el resultado
    resultado = Matematicas.voltea(resultado);
    
    // Se muestra por pantalla
    System.out.print("El número en decimal es: "+resultado);
    
  }
  
}
