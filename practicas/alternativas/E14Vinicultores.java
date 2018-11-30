/** Ejercicio 14
 * La asociacion de vinicultores tiene como politica fijar un precio inicial al kilo de uva, la cual se clasifica en tipos A y B,
 * y ademas en tamaños 1 y 2. Cuando se realiza la venta del producto, esta es de un solo tipo y tamaño, se requiere determinar cuanto
 * recibira un productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo A,  se le cargan 20 centimos
 * al precio inicial cuando es de tamaño 1; y 30 centimos si es de tamaño 2. Si es de tipo B, se rebajan 30 centimos cuando es de tamaño 1,
 * y 50 centimos cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E14Vinicultores {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double precio;
    char tipo;
    int tamano;
    
    // Introduccion de datos
    System.out.println("Introduce el precio inicial:");
    precio = s.nextDouble();
    System.out.println("Introduce el tipo:");
    tipo = s.next().charAt(0);
    System.out.println("Introduce el tamano:");
    tamano = s.nextInt();
    
    // Resultado
    if (tipo=='A') {
      if (tamano==1) {
        precio = precio+0.20;
      } else if (tamano==2) {
        precio = precio+0.30;
      }
    } else if (tipo=='B') {
      if (tamano==1) {
        precio = precio-0.30;
      } else if (tamano==2) {
        precio = precio-0.50;
      }
    }
    
    System.out.println("El precio final es "+precio+".");
    
    s.close();
    
  }
  
}
