/** Ejercicio 19
 * Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.
 * 
 * @author pablo
 */

package practicas.alternativas;

import java.util.Scanner;

public class E19Mes {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int mes;
    
    // Introduccion de datos
    System.out.println("Introduzca numero del mes:");
    mes = s.nextInt();
    
    // Resultado
    if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
      System.out.println("El mes tiene 31 dias.");
    } else if (mes==2) {
      System.out.println("El mes tiene 28 dias o 29 si es bisiesto.");
    } else if (mes==4 || mes==6 || mes==9 || mes==11) {
      System.out.println("El mes tiene 30 dias.");
    } else {
      System.out.println("Mes incorrecto.");
    }
    
    s.close();
    
  }
  
}
