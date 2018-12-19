/**
 * Ejercicio 11
 * 
 * Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triangulo.
 * El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
 * - Si se cumple Pitágoras entonces es triángulo rectángulo
 * - Si sólo dos lados del triángulo son iguales entonces es isósceles.
 * - Si los 3 lados son iguales entonces es equilátero.
 * - Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 * 
 * @author Pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E11Triangulos {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double a;
    double b;
    double c;
    
    // Introduccion de datos
    System.out.println("Introduce el valor para A:");
    a = s.nextDouble();
    System.out.println("Introduce el valor para B:");
    b = s.nextDouble();
    System.out.println("Introduce el valor para C:");
    c = s.nextDouble();
    
    // Resultado
    if (a==b && a==c) {
      System.out.println("El triangulo es equilatero.");
    } else if ((Math.pow(a,2))+(Math.pow(b,2))==(Math.pow(c,2)) || (Math.pow(a,2))+(Math.pow(c,2))==(Math.pow(b,2)) || (Math.pow(b,2))+(Math.pow(c,2))==(Math.pow(a,2))) {
      System.out.println("Es un triangulo rectangulo.");
    } else if ((a==b && a!=c) || (b==c && b!=a) || (c==a && c!=b)) {
      System.out.println("El triangulo es isosceles.");
    } else {
      System.out.println("El triangulo es escaleno.");
    }
    
    s.close();
    
  }
  
}
