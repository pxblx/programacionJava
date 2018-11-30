package practicas.secuenciales;

import java.util.Scanner;

public class E05Grados {

  public static void main(String[] args) {
  
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    Double farenheit;
    Double celsius;
    
    // Introduccion de datos
    System.out.println("Introduce valor en Farenheit:");
    farenheit = s.nextDouble();
    
    // Resultado
    celsius = (farenheit-32)*5/9;
    
    System.out.println(farenheit+" grados Farenheit equivalen a "+celsius+" grados Celsius.");
    
    s.close();
    
  }
  
}
