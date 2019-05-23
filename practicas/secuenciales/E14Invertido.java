package practicas.secuenciales;

import java.util.Scanner;

public class E14Invertido {
  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    String numero;
    
    // Introduccion de datos
    System.out.println("Introduzca un número:");
    numero = s.nextLine();
    
    // Resultado
    System.out.println(numero.substring(1, 2) + numero.substring(0, 1));
    
    s.close();
  }
}
