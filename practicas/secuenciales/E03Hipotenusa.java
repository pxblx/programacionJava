package practicas.secuenciales;

import java.util.Scanner;

public class E03Hipotenusa {
  public static void main(String[] args) {

    // Declaracion de variables
  	Scanner s = new Scanner(System.in);
    Double cateto1;
    Double cateto2;
    Double hipotenusa;

    // Introduccion de datos
  	System.out.println("Cateto 1:");
    cateto1 = s.nextDouble();
    System.out.println("Cateto 2:");
    cateto2 = s.nextDouble();

  	// Resultado
  	hipotenusa = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
    System.out.println("La hipotenusa es "+hipotenusa+" cm.");

    s.close();
  }
}
