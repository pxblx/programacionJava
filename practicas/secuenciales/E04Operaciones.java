package practicas.secuenciales;

import java.util.Scanner;

public class E04Operaciones {
  public static void main(String[] args) {

    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    Double numero1;
    Double numero2;
    
    // Introduccion de datos
    System.out.println("Numero 1:");
    numero1 = s.nextDouble();
    System.out.println("Numero 2:");
    numero2 = s.nextDouble();
    
    // Resultado
    System.out.println("La suma es " + (numero1 + numero2) + ".");
    System.out.println("La resta es " + (numero1 - numero2) + ".");
    System.out.println("La division es " + (numero1 / numero2) + ".");
    System.out.println("La multiplicacion es " + (numero1 * numero2) + ".");
    
    s.close();
  }
}
