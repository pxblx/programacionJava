package practicas.alternativas;

import java.util.Scanner;

/**
 * Ejercicio 16
 *
 * La politica de cobro de una compañía telefonica es: cuando se realiza una llamada, el cobro es por el tiempo que esta dura,
 * de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 centimos, los siguientes dos minutos, 70 centimos,
 * y a partir del decimo minuto, 50 centimos.
 * Ademas, se carga un impuesto de 3 % cuando es domingo, y si es otro dia, en turno de mañana, 15 %, y en turno de tarde, 10 %.
 * Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
 */
public class E16Telefonica {
  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int minutos;
    double precio;
    String dia, turno;
    
    // Introduccion de datos
    System.out.println("Introduce el dia de la semana:");
    dia = s.nextLine();
    System.out.println("Introduce el turno:");
    turno = s.nextLine();
    System.out.println("Introduce la duracion de la llamada:");
    minutos = s.nextInt();
    
    // Resultado
    if (minutos <= 5) {
      precio = 1;
    } else if (minutos > 5 && minutos <= 8) {
      precio = 1 + minutos * 0.8;
    } else if (minutos > 8 && minutos <= 10) {
      precio = 1 + minutos * 0.7;
    } else {
      precio = 1 + minutos * 0.5;
    }
    if (dia.equals("domingo")) {
      precio = precio + precio * 0.3;
    } else {
      if (turno.equals("manana")) {
        precio = precio + precio * 0.15;
      } else if (turno.equals("tarde")) {
        precio = precio + precio * 0.10;
      }
    }
    System.out.println("El precio de la llamada es "+precio+" euros.");
    s.close();
  }
}
