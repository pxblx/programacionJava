package practicas.secuenciales;

import java.util.Scanner;

public class E02PerimetroYArea {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    Double base;
    Double altura;
    Double perimetro;
    Double area;
      
    // Introduccion de datos
  	System.out.println("Base:");
    base = s.nextDouble();
    System.out.println("Altura:");
    altura = s.nextDouble();
      
  	// Resultado
  	perimetro = 2*(base*altura);
    area = base*altura;
      
  	System.out.println("El perimetro es "+perimetro+" cm y el area "+area+" cm2.");
  	
  	s.close();
      
  }
  
}
