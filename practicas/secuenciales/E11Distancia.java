package practicas.secuenciales;

import java.util.Scanner;
import java.lang.Math;

public class E11Distancia {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double numero1;
    double numero2;
    
    // Introduccion de datos
    System.out.println("Introduce el primer numero:");
    numero1 = s.nextInt();
    System.out.println("Introduce el segundo numero:");
    numero2 = s.nextInt();
    
    // Resultado
    System.out.println("La distancia entre los dos numeros es "+(Math.abs(numero1-numero2))+".");
    
    s.close();
    
  }
  
}
