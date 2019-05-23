package practicas.arrays;

/**
 * Ejercicio 1
 *
 * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a continuación. Muestra el
 * contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 */
public class E01Arrays {
  public static void main(String[] args) {
    
    // Definir el array y las variables
    int[] numeros = new int[12];
    int indice = 0;
    
    // Introducir los datos en sus posiciones
    numeros[0] = 39;
    numeros[1] =- 2;
    numeros[4] = 0;
    numeros[6] = 14;
    numeros[8] = 5;
    numeros[9] = 120;
    
    // Recorrer el array mostrando todos sus elementos. Los elementos que no han sido inicializados se muestran como un 0.
    for (int i : numeros) {
      System.out.println("En la posicion " + indice + " hay un " + i + ".");
      indice++;
    }
  }
}
