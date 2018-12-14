/**
 * Ejercicio 1 de Java
 * 
 * @author Pablo
 */

package examenes.examen02;

import java.util.Scanner;

public class Ejercicio01 {
  
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    // Definir las variables
    int opcion;
    String fecha = "";
    boolean fechaIntroducida = false;
    int fechaDia = 0;
    int fechaMes = 0;
    int fechaAno = 0;
    int dias = 0;
    boolean flag = true;
    String aux = "";
    
    while (flag) {
      // Menú
      System.out.println("(1) Introducir fecha.");
      System.out.println("(2) Sumar días.");
      System.out.println("(3) Restar días.");
      System.out.println("(4) Comparar.");
      System.out.println();
      System.out.print("Selecciones una de las siguientes opciones: ");
      opcion = s.nextInt();
      s.nextLine();
      System.out.println();
      
      switch (opcion) {
      
        case 1:
          System.out.print("Introduce una fecha: ");
          fecha = s.nextLine();
          fechaIntroducida = true;
          for (int i = 0; i < 2; i++) {
            aux = aux+fecha.charAt(i);
          }
          fechaDia = Integer.valueOf(aux);
          aux = "";
          for (int i = 3; i < 5; i++) {
            aux = aux+fecha.charAt(i);
          }
          fechaMes = Integer.valueOf(aux);
          aux = "";
          for (int i = 6; i < 10; i++) {
            aux = aux+fecha.charAt(i);
          }
          fechaAno = Integer.valueOf(aux);
          aux = "";
          System.out.println();
          break;
        case 2:
          if (fechaIntroducida) {
            System.out.print("Dias a sumar: ");
            dias = s.nextInt();
            System.out.println();
            System.out.println("La fecha ahora es: "+sumarDias(fechaDia, fechaMes, fechaAno, dias));
            flag = false;
          } else {
            System.out.println("No has introducido ninguna fecha.");
          }
          break;
        case 3:
          if (fechaIntroducida) {
            System.out.print("Dias a restar: ");
            dias = s.nextInt();
            System.out.println();
            System.out.println("La fecha ahora es: "+restarDias(fechaDia, fechaMes, fechaAno, dias));
            flag = false;
          } else {
            System.out.println("No has introducido ninguna fecha.");
          }
          break;
        case 4:
          // llamada a la función compararFechas
          break;
        
      }
      
    }
    
    s.close();
          
  }
  
  /**
   * Sumar dias a una fecha
   * 
   * @param fechaDia dia
   * @param fechaMes mes
   * @param fechaAno año
   * @param dias dias a sumar
   * @return fecha modificada
   */
  public static String sumarDias (int fechaDia, int fechaMes, int fechaAno, int dias) {
    
    while (dias > 0) {
      for (int x = 0; x < dias; dias--) {
        fechaDia++;
        if (fechaDia > 30) {
          fechaMes++;
          fechaDia = 1;
        }
        if (fechaMes > 12) {
          fechaAno++;
          fechaMes = 1;
        }
      }
    }
    
    return (fechaDia+"/"+fechaMes+"/"+fechaAno);
    
  }
  
  /**
   * Restar dias a una fecha
   * 
   * @param fechaDia dia
   * @param fechaMes mes
   * @param fechaAno año
   * @param dias dias a restar
   * @return fecha modificada
   */
  public static String restarDias (int fechaDia, int fechaMes, int fechaAno, int dias) {
    
    while (dias > 0) {
      for (int x = 0; x < dias; dias--) {
        fechaDia--;
        if (fechaDia < 1) {
          fechaMes--;
          fechaDia = 30;
        }
        if (fechaMes < 1) {
          fechaAno--;
          fechaMes = 12;
        }
      }
    }
    
    return (fechaDia+"/"+fechaMes+"/"+fechaAno);
    
  }
  
}
