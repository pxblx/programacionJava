package practicas.secuenciales;

import java.util.Scanner;

public class E06Media {

  public static void main(String[] args) {
  
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    Double numero1;
    Double numero2;
    Double numero3;
    Double media;
    
    // Introduccion de datos
    System.out.println("Introduce el primer numero:");
    numero1 = s.nextDouble();
    System.out.println("Introduce el segundo numero:");
    numero2 = s.nextDouble();
    System.out.println("Introduce el tercer numero:");
    numero3 = s.nextDouble();
    
    // Resultado
    media = (numero1+numero2+numero3)/3;
    
    System.out.println("La media es "+media+".");
    
    s.close();
    
  }
  
}
