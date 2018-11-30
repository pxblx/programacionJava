package practicas.secuenciales;

import java.util.Scanner;
import java.lang.Math;

public class E13Raiz {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double numero;
    double cuadrada;
    double cubica;
    
    // Introduccion de datos
    System.out.println("Introduce un numero:");
    numero = s.nextDouble();
    
    // Resultado
    cuadrada = Math.sqrt(numero);
    cubica = Math.pow(numero,1.0/3); 
    // Como no existe una funcion para calcular la raiz cubica directamente, utilizamos Math.pow y elevamos el número a 1/3.
    
    System.out.println("La raiz cuadrada es "+cuadrada+" y la cubica "+cubica+".");
    
    s.close();
    
  }
  
}
