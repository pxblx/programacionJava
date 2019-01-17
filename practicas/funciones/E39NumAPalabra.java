/**
 * Ejercicio 39 de funciones
 * 
 * Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres.
 * Por ejemplo, el 470213 convertido a palabras sería: cuatro, siete, cero, dos, uno, tres.
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe mostrar nada por pantalla, solo se
 * debe usar print desde el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al final.
 * 
 * @author Pablo
 */

package practicas.funciones;

import practicas.funciones.funciones.Matematicas;

public class E39NumAPalabra {
  
  /**
   * Devuelve escritos cada uno de los dígitos del número que se pasa como parámetro
   * 
   * @param numero número
   * @return dígitos del número escritos
   */
  public static String NumAPalabra (int numero) {
    
    int numDigitos = Matematicas.digitos(numero);
    String numeroEscrito = DigitoEscrito(Matematicas.digitoN(numero, 0));
    
    for (int i = 2; i <= numDigitos; i++) {
      numeroEscrito = (numeroEscrito+", "+DigitoEscrito(Matematicas.digitoN(numero, i)));
    }
    numeroEscrito = (numeroEscrito+".");
    
    return numeroEscrito;
    
  }
  
  /**
   * Devuelve escrito el dígito que se pasa como parámetro
   * @param digito dígito
   * @return dígito escrito
   */
  public static String DigitoEscrito (int digito) {
    
    switch (digito) {
    
      case 0:
        return ("cero");
      case 1:
        return ("uno");
      case 2:
        return ("dos");
      case 3:
        return ("tres");
      case 4:
        return ("cuatro");
      case 5:
        return ("cinco");
      case 6:
        return ("seis");
      case 7:
        return ("siete");
      case 8:
        return ("ocho");
      case 9:
        return ("nueve");
      default:
        return ("?");
    
    }
    
  }
  
}
