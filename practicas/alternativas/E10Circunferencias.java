/**
 * Ejercicio 10
 * 
 * Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos circunferencias y las clasifique en uno de estos estados:
 * - Exteriores.
 * - Tangentes exteriores.
 * - Secantes
 * - Tangentes interiores.
 * - Interiores.
 * - Concéntricas.
 * 
 * @author Pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E10Circunferencias {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double x1, y1, x2, y2, r1, r2, d;
    
    // Introduccion de datos
    System.out.println("Introduce el valor para x1:");
    x1 = s.nextDouble();
    System.out.println("Introduce el valor para x2:");
    y1 = s.nextDouble();
    System.out.println("Introduce el valor para y1:");
    x2 = s.nextDouble();
    System.out.println("Introduce el valor para y2:");
    y2 = s.nextDouble();
    System.out.println("Introduce el valor para r1:");
    r1 = s.nextDouble();
    System.out.println("Introduce el valor para r2:");
    r2 = s.nextDouble();
    
    // Resultado
    d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    
    if ((r1+r2)<d) {
      System.out.println("Exteriores.");
    } else if ((r1+r2)==d) {
      System.out.println("Tangentes exteriores.");
    } else if ((r1+r2)>d && d>Math.abs(r1-r2)) {
      System.out.println("Secantes.");
    } else if (d==Math.abs(r1-r2)) {
      System.out.println("Tangentes interiores.");
    } else if (d>0 && d<Math.abs(r1-r2)) {
        System.out.println("Interiores.");
    } else if (d==0) {
      System.out.println("Concentricas.");
    }
    
    s.close();
    
  }
  
}
