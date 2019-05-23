package practicas.repetitivas;

import java.util.concurrent.TimeUnit;

/**
 * Ejercicio 8
 *
 * Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
 */
public class E08Cronometro {
  public static void main(String[] args) throws InterruptedException {
    
    // Declaracion de variables
    int horas, minutos, segundos;
    
    // Bucle y resultado
    for (horas = 0; horas < 24; horas++) {
      for (minutos = 0; minutos < 60; minutos++) {
        for (segundos = 0; segundos < 60; segundos++) {
          System.out.println(horas + ":" + minutos + ":" + segundos);
          TimeUnit.SECONDS.sleep(1);
        }
      }
    }
  }
}
