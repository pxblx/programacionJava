/** Ejercicio 8
 * Algoritmo que pida dos numeros nota y edad y un caracter sexo y muestre el
 * mensaje ACEPTADA si la nota es mayor o igual a cinco, la edad es mayor o igual a
 * dieciocho y el sexo es F. En caso de que se cumpla lo mismo, pero el sexo sea M, debe
 * imprimir POSIBLE. Si no se cumplen dichas condiciones se debe mostrar NO ACEPTADA.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E08AceptadaONo {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    char sexo;
    double nota;
    int edad;
    
    // Introduccion de datos
    System.out.println("Introduce la nota:");
    nota = s.nextDouble();
    System.out.println("Introduce la edad:");
    edad = s.nextInt();
    System.out.println("Introduce el sexo:");
    sexo = s.next().charAt(0);
    
    // Resultado
    if (nota>=5 && edad>=18 && sexo=='F') {
      System.out.println("ACEPTADA.");
    } else if (nota>=5 && edad>=18 && sexo=='M') {
      System.out.println("POSIBLE.");
    } else {
      System.out.println("NO ACEPTADA");
    }
    
    s.close();
    
  }
  
}
