/** 
 * Ejercicios 20-28
 * 
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números enteros que contenga las siguientes funciones:
 * 
 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
 * 7. volteaArrayInt: Le da la vuelta a un array.
 * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
 * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
 * 
 * @author Pablo
 */

package practicas.funciones.funciones;

public class Arrays {
  
  /**
   * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * @param n tamaño del array
   * @param min mínimo
   * @param max máximo
   * @return array generado
   */
  public static int[] generaArrayInt (int n, int min, int max) {
    
    int[] array = new int[n];
    
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random()*(max-min))+min;
    }
    
    return array;
    
  }
  
  /**
   * Devuelve el mínimo del array que se pasa como parámetro.
   * 
   * @param array
   * @return mínimo valor en el array
   */
  public static int minimoArrayInt (int[] array) {
    
    int min = array[0];
    
    for (int i = 1; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    
    return min;
    
  }
  
  /**
   * Devuelve el máximo del array que se pasa como parámetro.
   * 
   * @param array
   * @return máximo valor en el array
   */
  public static int maximoArrayInt (int[] array) {
    
    int max = array[0];
    
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    
    return max;
    
  }
  
  /**
   * Devuelve la media del array que se pasa como parámetro.
   * 
   * @param array
   * @return media de los valores en el array
   */
  public static double mediaArrayInt (int[] array) {
    
    int aux = 0;
    
    for (int i = 0; i < array.length; i++) {
      aux += array[i];
    }
    
    return aux/array.length;
    
  }
  
  /**
   * Dice si un número está o no dentro de un array.
   * 
   * @param array
   * @param n número a buscar
   * @return <true> si n está en el array o <false> si no lo está
   */
  public static boolean estaEnArrayInt (int[] array, int n) {
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        return true;
      }
    }
    
    return false;
    
  }
  
  /**
   * Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
   * 
   * @param array
   * @param n número a buscar
   * @return posición de n dentro del array
   */
  public static int posicionEnArray (int[] array, int n) {
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        return i;
      }
    }
    
    return -1;
    
  }
  
  /**
   * Le da la vuelta a un array.
   * 
   * @param array
   * @return array dado la vuelta
   */
  public static int[] volteaArrayInt (int[] array) {
    
    int[] arrayVolteado = new int[array.length];
    
    for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
      arrayVolteado[i] = array[j];
    }
    
    return arrayVolteado;
    
  }
  
  /**
   * Rota n posiciones a la derecha los números de un array.
   * 
   * @param array
   * @param n número de posiciones a rotar hacia la derecha
   * @return array rotado
   */
  public static int[] rotaDerechaArrayInt (int[] array, int n) {
    
    int[] arrayRotado = new int[array.length];
    
    for (int i = 0; i < array.length; i++) {
      arrayRotado[(i+n)%array.length] = array[i];
    }
    
    return arrayRotado;
    
  }
  
  /**
   * Rota n posiciones a la izquierda los números de un array.
   * 
   * @param array
   * @param n número de posiciones a rotar hacia la izquierda
   * @return array rotado
   */
  public static int[] rotaIzquierdaArrayInt (int[] array, int n) {
    
    int[] arrayRotado = new int[array.length];
    
    for (int i = 0; i < array.length; i++) {
      arrayRotado[(i+(array.length-n))%array.length] = array[i];
    }
    
    return arrayRotado;
    
  }
  
}
