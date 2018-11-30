package practicas.secuenciales;

import java.util.Scanner;

public class E18Iniciales {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String nombre;
    String apellido1;
    String apellido2;
    
    // Introduccion de datos
    System.out.println("Nombre:");
    nombre = s.nextLine();
    System.out.println("Primer apellido:");
    apellido1 = s.nextLine();
    System.out.println("Segundo apellido:");
    apellido2 = s.nextLine();
    
    // Resultado
    System.out.println(nombre.substring(0,1)+apellido1.substring(0,1)+apellido2.substring(0,1));
    
    s.close();
    
  }
  
}
