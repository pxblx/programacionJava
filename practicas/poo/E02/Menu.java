/**
 * Ejercicio 2 de POO
 */
package practicas.poo.E02;

import java.util.Scanner;

/**
 * Programa de prueba
 */
public class Menu {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int opcion = 0;
    Bicicleta bicicleta = new Bicicleta(450);
    Coche coche = new Coche(138984);

    do {
      System.out.print("VEHÍCULOS\n" +
        "=========\n" +
        "1. Anda con la bicicleta\n" +
        "2. Haz el caballito con la bicicleta\n" +
        "3. Anda con el coche\n" +
        "4. Quema rueda con el coche\n" +
        "5. Ver kilometraje de la bicicleta\n" +
        "6. Ver kilometraje del coche\n" +
        "7. Ver kilometraje total\n" +
        "8. Salir\n" +
        "Elige una opción (1-8): ");

      opcion = s.nextInt();
      switch (opcion) {
        case 1:
          bicicleta.arrancar();
          break;
        case 2:
          bicicleta.hacerCaballito();
          break;
        case 3:
          coche.arrancar();
          break;
        case 4:
          coche.quemarRueda();
          break;
        case 5:
          System.out.println("La bicicleta ha recorrido "+bicicleta.getKilometraje()+" kilómetros.");
          break;
        case 6:
          System.out.println("El coche ha recorrido "+coche.getKilometraje()+" kilómetros.");
          break;
        case 7:
          System.out.println("Los vehículos han recorrido un total de "+coche.getkilometrosTotales()+" kilómetros.");
          break;
        case 8:
          System.out.println("Saliendo");
          break;
        default:
          System.out.println("Error: Opción incorrecta");
          break;
      }
    } while (opcion != 8);
  }
}
