/** Ejercicio 15
 * El director de una escuela esta organizando un viaje de estudios, y requiere determinar cuanto debe cobrar a cada alumno y cuanto
 * debe pagar a la compañia de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o mas, el costo por cada
 * alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta
 * del autobus es de 4000 euros, sin importar el numero de alumnos. 
 * Realice un algoritmo que permita determinar el pago a la compañia de autobuses y lo que debe pagar cada alumno por el viaje.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E15Viaje {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int nAlumnos;
    
    // Introduccion de datos
    System.out.println("Introduce el numero de alumnos:");
    nAlumnos = s.nextInt();
    
    // Resultado
    if (nAlumnos>=100) {
      System.out.println("El precio por alumno es 65 y el total "+65*nAlumnos+".");
    } else if (nAlumnos>=50 && nAlumnos<=99) {
      System.out.println("El precio por alumno es 70 y el total "+70*nAlumnos+".");
    } else if (nAlumnos>=30 && nAlumnos<=49) {
      System.out.println("El precio por alumno es 95 y el total "+95*nAlumnos+".");
    } else if (nAlumnos<30) {
      System.out.println("El precio por alumno es "+4000/nAlumnos+" y el total 4000.");
    }
    
    s.close();
    
  }
  
}
