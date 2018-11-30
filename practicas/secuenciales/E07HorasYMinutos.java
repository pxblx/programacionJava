package practicas.secuenciales;

import java.util.Scanner;

public class E07HorasYMinutos {

  public static void main(String[] args) {
  
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int numero;
    int horas;
    int minutos;
    
    // Introduccion de datos
    System.out.println("Introduce una cantidad de minutos:");
    numero = s.nextInt();
    
    // Resultado
    horas = numero/60;
    minutos = numero%60;
    
    System.out.println("Son "+horas+" horas y "+minutos+" minutos.");
    
    s.close();
    
  }
  
}
