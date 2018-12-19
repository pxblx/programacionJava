/**
 * Ejercicio 7
 * 
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios. El programa
 * pedir entonces por teclado dos valores y a continuación cambiar todas las ocurrencias del primer valor por el segundo en la lista
 * generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
 * 
 * @author Pablo
 */

package practicas.arrays;

import java.util.Scanner;

public class E07Arrays {
  
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Definir el array y las variables
    String[] numeros = new String[100];
    String cambio, buscar;
    
    // Introducir los datos en sus posiciones
    for (int i=0; i<100; i++) {
      numeros[i]=String.valueOf((int)(Math.random()*100)+1);
    }
    
    // Mostrar el array
    System.out.println("Contenido del array:");
    for (String e:numeros) {
      System.out.print("|"+e);
    }
    System.out.println("|");
    
    // Pedir el valor a cambiar
    System.out.println("Introduce el valor a que quieres reemplazar: ");
    buscar = s.nextLine();
    System.out.println("Introduce el valor por el que lo quieres reemplazar: ");
    cambio = s.nextLine();
    for (int e=0; e<100; e++) {
      if (numeros[e].equals(buscar)) {
        numeros[e]=("\""+cambio+"\"");
      }
    }
    
    // Volver a mostrar el array
    System.out.println("Nuevo contenido del array:");
    for (String e:numeros) {
      System.out.print("|"+e);
    }
    System.out.println("|");
    
    s.close();
    
  }
  
}
