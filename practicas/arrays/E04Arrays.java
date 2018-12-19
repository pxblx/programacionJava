/**
 * Ejercicio 4
 * 
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios
 * entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se
 * deben almacenar los cubos de los valores que hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 * 
 * @author Pablo
 */

package practicas.arrays;

public class E04Arrays {
  
  public static void main(String[] args) {
    
    // Definir el array y las variables
    int[] numeros = new int[20];
    int[] cubos = new int[20];
    int[] cuadrados = new int[20];
    
    // Introducir los datos en sus posiciones y recorrer el array
    System.out.printf("%-15s%-15s%-15s\n","Numero","Cuadrado","Cubo");
    System.out.println("---------------------------------------------");
    System.out.println("");
    for (int i=0; i<20; i++) {
      numeros[i]=(int)(Math.random()*100)+1;
      cuadrados[i]=(int)Math.pow(numeros[i],2);
      cubos[i]=(int)Math.pow(numeros[i],3);
      System.out.printf("%-15d%-15d%-15d\n",numeros[i],cuadrados[i],cubos[i]);
    }
    
  }
  
}
