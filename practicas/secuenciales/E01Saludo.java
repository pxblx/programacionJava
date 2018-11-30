package practicas.secuenciales;

import java.util.Scanner;

public class E01Saludo {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String nombre;
    
    // Introduccion de datos
    System.out.println("Tu nombre:");
    nombre = s.nextLine();
  	
    // Resultado
    System.out.println("Hola, "+nombre+".");
    
    s.close();
      
  }
  
}
