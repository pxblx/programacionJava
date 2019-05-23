package examenes.examen02;

import java.util.Scanner;

/**
 * Ejercicio 1
 */
public class Ejercicio01 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Definir las variables
    int opcion;
    int dias = 0;
    int fecha[] = new int[3];
//  int fecha2[] = new int[3];
    boolean fechaIntroducida = false;
    boolean menuFlag = true;
    String inputFecha = "";
//  String inputFecha2 = "";
    
    // Mostrar el menú
    while (menuFlag) {
      System.out.println("(1) Introducir fecha.");
      System.out.println("(2) Sumar días.");
      System.out.println("(3) Restar días.");
      System.out.println("(4) Comparar.");
      System.out.println();
      System.out.print("Seleccione una de las siguientes opciones: ");
      opcion = s.nextInt();
      s.nextLine();
      System.out.println();
      
      switch (opcion) {
        case 1:
          System.out.print("Introduce una fecha (dd/mm/aaaa): "); // Validar
          inputFecha = s.nextLine();
          fechaIntroducida = true;
          fecha = descomponerFecha(inputFecha);
          System.out.println();
          break;
          
        case 2:
          if (fechaIntroducida) {
            System.out.print("Dias a sumar (positivo): ");
            dias = s.nextInt();
            System.out.println();
            // Comprobar que es positivo
            if (dias <= 0) {
              System.out.println("El número debe ser positivo.");
              System.out.println();
            } else {
              System.out.println("La fecha ahora es: "+sumarDias(fecha, dias));
              menuFlag = false;
            }
          } else {
            System.out.println("No has introducido ninguna fecha.");
            System.out.println();
          }
          break;
          
        case 3:
          if (fechaIntroducida) {
            System.out.print("Dias a restar (negativo): ");
            dias = s.nextInt();
            System.out.println();
            // Comprobar que es negativo
            if (dias >= 0) {
              System.out.println("El número debe ser negativo.");
              System.out.println();
            } else {
              System.out.println("La fecha ahora es: "+restarDias(fecha, dias));
              menuFlag = false;
            }
          } else {
            System.out.println("No has introducido ninguna fecha.");
            System.out.println();
          }
          break;
          
        case 4:
//          if (fechaIntroducida) {
//            System.out.print("Introduce la fecha con la que quieres comparar la introducida: ");
//            System.out.println();
//            inputFecha2 = s.nextLine(); // Validar
//            fecha2 = descomponerFecha(inputFecha2);
//            if (compararFechas(fecha, fecha2) == -1) {
//              System.out.println("La primera fecha es más reciente.");
//            } else if (compararFechas (fecha, fecha2) == 0) {
//              System.out.println("Las fechas son iguales");
//            } else {
//              System.out.println("La primera fecha es más antigua.");
//            }
//          } else {
//            System.out.println("No has introducido ninguna fecha.");
//            System.out.println();
//          }
          break;
          
        default:
          System.out.println("La opción que has introducido no es correcta.");
          System.out.println();
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
  public static String sumarDias (int[] fecha, int dias) {
    // Mientras que los días a sumar sean mayores que 0
    while (dias > 0) {
      // Por cada iteración restar 1 día
      for (int x = 0; x < dias; dias--) {
        fecha[0]++;
        if (fecha[0] > diasMes(fecha[1], fecha[2])) {
          fecha[1]++;
          fecha[0] = 1;
        }
        if (fecha[1] > 12) {
          fecha[2]++;
          fecha[1] = 1;
        }
      }
    }
    return (String.format("%02d",fecha[0])+"/"+String.format("%02d",fecha[1])+"/"+String.format("%04d",fecha[2]));
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
  public static String restarDias (int[] fecha, int dias) {
    // Pasar los días a positivo
    dias = Math.abs(dias);
    // Mientras que los días a restar sean mayores que 0
    while (dias > 0) {
      // Por cada iteración restar 1 día
      for (int x = 0; x < dias; dias--) {
        fecha[0]--;
        if (fecha[0] < 1) {
          fecha[1]--;
          fecha[0] = diasMes(fecha[1], fecha[2]);
        }
        if (fecha[1] < 1) {
          fecha[2]--;
          fecha[1] = 12;
        }
      }
    }
    return (String.format("%02d",fecha[0])+"/"+String.format("%02d",fecha[1])+"/"+String.format("%04d",fecha[2]));
  }
  
  /**
   * Días que tiene el mes
   * 
   * @param mes
   * @return días
   */
  public static int diasMes (int mes, int ano) {
    if (mes == 2) {
      if (esBisiesto(ano)) {
        return 29;
      } else {
        return 28;
      }
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      return 30;
    } else {
      return 31;
    }
  }
  
  /**
   * Comprobar si el año es bisiesto
   * 
   * @param año
   * @return <true> si es bisiesto y <false> si no lo es
   */
  public static boolean esBisiesto (int ano) {
    if (ano % 4 == 0) {
      return true;
    } else if (ano % 100 == 0 && ano % 400 == 0) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Descomponer la fecha
   * 
   * @param fecha fecha en formato dd/mm/aaaa
   * @return resultado array con el dia[0], el mes[1] y el año[2]
   */
  public static int[] descomponerFecha (String fecha) {
    String aux = "";
    int fechaDia;
    int fechaMes;
    int fechaAno;
    
    for (int i = 0; i < 2; i++) {
      aux = aux + fecha.charAt(i);
    }
    fechaDia = Integer.valueOf(aux);
    aux = "";
    for (int i = 3; i < 5; i++) {
      aux = aux + fecha.charAt(i);
    }
    fechaMes = Integer.valueOf(aux);
    aux = "";
    for (int i = 6; i < 10; i++) {
      aux = aux + fecha.charAt(i);
    }
    fechaAno = Integer.valueOf(aux);
    aux = "";
    int resultado[] = {fechaDia, fechaMes, fechaAno};
    return resultado;
  }
}
