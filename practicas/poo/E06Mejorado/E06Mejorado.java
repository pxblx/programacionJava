/**
 * Ejercicio 6 de POO mejorado
 */
package practicas.poo.E06Mejorado;

import java.time.LocalTime;

/**
 * Programa de prueba
 */
public class E06Mejorado {
  public static void main(String args[]) {
    int aux;

    LocalTime tiempo1 = LocalTime.of(6, 30, 10);
    LocalTime tiempo2 = LocalTime.of(13, 23, 55);
    LocalTime tiempo3 = LocalTime.of(14, 32, 11);

    System.out.println("Tiempo 1: "+tiempo1);
    System.out.println("Tiempo 2: "+tiempo2);
    System.out.println("Tiempo 3: "+tiempo3);
    System.out.println();

    aux = ((tiempo2.getHour()*3600)+(tiempo2.getMinute()*60)+tiempo2.getSecond());
    System.out.println("Suma de 1 + 2: "+tiempo1.plusSeconds(aux));

    aux = ((tiempo3.getHour()*3600)+(tiempo3.getMinute()*60)+tiempo3.getSecond());
    System.out.println("Suma de 1 + 3: "+tiempo1.plusSeconds(aux));

    aux = ((tiempo1.getHour()*3600)+(tiempo1.getMinute()*60)+tiempo1.getSecond());
    System.out.println("Suma de 3 - 1: "+tiempo3.minusSeconds(aux));
  }
}
