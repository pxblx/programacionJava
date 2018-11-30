/** Ejercicio 20
 * Escribe un programa que pida un número entero entre uno y doce e imprima el n�mero de días que tiene el mes correspondiente.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E20Paquetes {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double peso;
    int zona;
    
    // Introduccion de datos
    System.out.println("Introduzca el peso del paquete (en kg):");
    peso = s.nextDouble();
    System.out.println("Introduzca la zona a la que va el paquete:");
    zona = s.nextInt();
    
    // Resultado
    if (peso<=5) {
      if (zona==1) {
        System.out.println("El precio de envio a America del Norte es de "+peso*24+" euros.");
      } else if (zona==2) {
        System.out.println("El precio de envio a America Central es de "+peso*20+" euros.");
      } else if (zona==3) {
        System.out.println("El precio de envio a America del Sur es de "+peso*21+" euros.");
      } else if (zona==4) {
        System.out.println("El precio de envio a Europa es de "+peso*10+" euros.");
      } else if (zona==5) {
        System.out.println("El precio de envio a Asia es de "+peso*18+" euros.");
      }
    } else {
      System.out.println("No se pueden enviar paquetes de mas de 5kg.");
    }
    
    s.close();
    
  }
  
}
