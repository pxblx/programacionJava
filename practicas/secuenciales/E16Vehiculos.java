package practicas.secuenciales;

import java.util.Scanner;

public class E16Vehiculos {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double v1;
    double v2;
    double d;
    double resultado;
    
    // Introduccion de datos
    System.out.println("Velocidad del vehiculo 1:");
    v1 = s.nextDouble();
    System.out.println("Velocidad del vehiculo 2:");
    v2 = s.nextDouble();
    System.out.println("Distancia entre los dos:");
    d = s.nextDouble();
    
    // Resultado
    resultado = d/(v1-v2);
    
    System.out.println("Se cruzaran en "+resultado*60+" minutos.");
    
    s.close();
    
  }
  
}
