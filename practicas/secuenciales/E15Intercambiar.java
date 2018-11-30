package practicas.secuenciales;

import java.util.Scanner;

public class E15Intercambiar {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int a;
    int b;
    int c;
    
    // Introduccion de datos
    System.out.println("Introduce el valor de A:");
    a = s.nextInt();
    System.out.println("Introduce el valor de B:");
    b = s.nextInt();
    
    // Resultado
    c = a;
    a = b;
    b = c;
    
    System.out.println("Ahora el valor de A es "+a+" y el de B "+b+".");
    
    s.close();
    
  }
  
}
