/**
 * Ejercicio del examen utilizando LocalDate
 * 
 * @author Pablo
 */
package practicas.poo2.Examen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Examen {
  public static void main (String[] args) {
    boolean menuFlag = true;
    boolean fechaIntroducida = false;
    String input;
    int opcion;
    int dias;
    Scanner s = new Scanner(System.in);
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate fecha = LocalDate.of(1, 1, 1);
    LocalDate fecha2;

    while (menuFlag) {
      System.out.println("(1) Introducir fecha.");
      System.out.println("(2) Sumar días.");
      System.out.println("(3) Restar días.");
      System.out.println("(4) Comparar.");
      System.out.println("(5) Salir.\n");
      System.out.print("Seleccione una de las siguientes opciones: ");
      opcion = s.nextInt();
      s.nextLine();
      
      switch (opcion) {
        case 1:
          System.out.print("Introduce una fecha (dd/mm/aaaa): ");
          input = s.nextLine();
          if (!input.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("La fecha introducida no está en el formato correcto.\n");
            break;
          } else {
            fecha = LocalDate.parse(input, formato);
            fechaIntroducida = true;
            System.out.println();
            break;
          }

        case 2:
          if (fechaIntroducida) {
            System.out.print("Dias a sumar (positivo): ");
            dias = s.nextInt();
            if (dias <= 0) {
              System.out.println("\nEl número debe ser positivo.\n");
            } else {
              fecha = fecha.plusDays(dias);
              System.out.println("\nLa fecha ahora es: "+formato.format(fecha)+"\n");
              break;
            }
          } else {
            System.out.println("No has introducido ninguna fecha.\n");
          }
          break;

        case 3:
          if (fechaIntroducida) {
            System.out.print("Dias a restar (negativo): ");
            dias = s.nextInt();
            if (dias >= 0) {
              System.out.println("\nEl número debe ser negativo.\n");
            } else {
              dias = Math.abs(dias);
              fecha = fecha.minusDays(dias);
              System.out.println("\nLa fecha ahora es: "+formato.format(fecha)+"\n");
              break;
            }
          } else {
            System.out.println("No has introducido ninguna fecha.\n");
          }
          break;

        case 4:
          if (fechaIntroducida) {
            System.out.print("Introduce la fecha con la que quieres comparar la introducida: ");
            input = s.nextLine();
            if (!input.matches("\\d{2}/\\d{2}/\\d{4}")) {
              System.out.println("La fecha introducida no está en el formato correcto.\n");
              break;
            } else {
              fecha2 = LocalDate.parse(input, formato);
              if (fecha.isAfter(fecha2)) {
                System.out.println("\nLa primera fecha es más reciente.\n");
                break;
              } else if (fecha.isEqual(fecha2)) {
                System.out.println("\nLas fechas son iguales.\n");
                break;
              } else {
                System.out.println("\nLa primera fecha es más antigua.\n");
                break;
              }
            }
          } else {
            System.out.println("No has introducido ninguna fecha.\n");
          }
          break;

        case 5:
          System.out.println("\nSaliendo.");
          menuFlag = false;
          break;

        default:
          System.out.println("La opción que has introducido no es correcta.\n");
      }
    }
    s.close();
  }
}
