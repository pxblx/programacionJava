package practicas.secuenciales;

import java.util.Scanner;
import java.lang.Math;

public class E12PuntosPlano {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int x1;
    int y1;
    int x2;
    int y2;
    double distancia;
    
    // Introduccion de datos
    System.out.println("Introduce x1:");
    x1 = s.nextInt();
    System.out.println("Introduce y1:");
    y1 = s.nextInt();
    System.out.println("Introduce x2:");
    x2 = s.nextInt();
    System.out.println("Introduce y2:");
    y2 = s.nextInt();
    
    // Resultado
    distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    
    System.out.println("La distancia entre los puntos es "+distancia+".");
    
    s.close();
    
  }
  
}
