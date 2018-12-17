/**
 * Ejercicio 17 de funciones
 * 
 * Escribe un programa que pase de binario a decimal.
 * 
 * @author Pablo
 */

package practicas.funciones;

import java.util.Scanner;
import practicas.funciones.funciones.Matematicas;

public class E17BinarioADecimal {
  
  public static void main(String[] args) {
    
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int numero;
    int digito;
    int posicion = 0;
    int resultado = 0;
    
    // Introducción de datos
    System.out.print("Introduce un número binario: ");
    numero = s.nextInt();
    
    while (numero != 0) {
      // Primero se toma el primer dígito del número
      digito = numero%10;
      // Se eleva la base 2 a la posición (p) en la que se encuentra el dígito (d) y se multiplica por el mismo, sumandolo con el
      // que será el resultado final
      resultado += digito * Matematicas.potencia(2, posicion);
      // Se incrementa p para pasar a la siguiente posición
      posicion++;
      // Se quita la cifra que ya hemos utilizado, cuando llegue a 0 terminará el ciclo
      numero = numero/10;
    }
    
    s.close();
    
    // Resultado
    System.out.print("El número en decimal es: "+resultado);
    
  }
  
}
