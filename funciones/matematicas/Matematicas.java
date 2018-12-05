/** Ejercicios 1-14
 * 
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que puedes usar unas dentro de otras si es
 * necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la
 * función esCapicua resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de implementar teniendo esPrimo.
 * 
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 5. digitos: Cuenta el número de dígitos de un número entero.
 * 6. voltea: Le da la vuelta a un número.
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 12. pegaPorDelante: Añade un dígito a un número por delante.
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
 * 14. juntaNumeros: Pega dos números para formar uno.
 * 
 * @author  Pablo
 */

package funciones.matematicas;

public class Matematicas {
  
  /** 1. Comprueba si un número es capicúa
   * 
   * @param n número entero a comprobar
   * @return <code>true</code> si el número es capicúa
   * @return <code>false</code> si el número no es capicúa
   */
  public static boolean esCapicua (int n) {
    
    // Comprobar si es igual (haciendo uso de la función "voltea" del ejercicio 7)
    if (n == voltea(n)) {
      return true;
    } else {
      return false;
    }
    
  }
  
  /** 2. Comprueba si un número es primo
   * 
   * @param n número entero a comprobar
   * @return <code>true</code> si el número es primo
   * @return <code>false</code> si el número no es primo
   */
  public static boolean esPrimo (int n) {
    
    // Comprobar si es primo
    if (n < 2) {
      return false;
    }
    for (int i=2; n>i; i++) {
      if (n%i == 0) {
        return false;
      }
    }
    return true;
    
  }
  
  /** 3. Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * 
   * @param n número entero a comprobar
   * @return el menor primo mayor al parámetro
   */
  public static int siguientePrimo (int n) {
    
    // Usando la funcion "esPrimo" del ejercicio 2
    n++;
    while (!esPrimo(n)) {
      n++;
    }
    return n;
    
  }
  
  /** 4. Dada una base y un exponente devuelve la potencia.
   * 
   * @param b base de la potencia
   * @param e exponente de la potencia
   * @return potencia
   */
  public static int potencia (int b, int e) {
    
    int p = 1;
    for (int i=0; i<e; i++) {
      p = p*b;
    }
    return p;
    
  }
  
  /** 5. Cuenta el número de dígitos de un número entero.
   * 
   * @param n número entero
   * @return cantidad de digitos
   */
  public static int digitos (int n) {
    
    return String.valueOf(n).length();
    
  }
  
  /** 6. Le da la vuelta a un número.
   * 
   * @param n número entero
   * @return número entero volteado
   */
  public static int voltea (int n) {
    
    int resto;
    int invertido = 0;
    while (n > 0) {
      resto = n%10;
      invertido = invertido*10+resto;
      n /= 10;
    }
    return invertido;
    
  }
  
  /** 7. Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param n número entero
   * @param x dígito a buscar
   * @return posición de x
   */
  
  
}
