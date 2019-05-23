package practicas.secuenciales;

import java.util.Scanner;

public class E09Descuento {
  public static void main(String[] args) {
  
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double precio;
    
    // Introduccion de datos
    System.out.println("Introduce el precio de la compra:");
    precio = s.nextInt();
    
    // Resultado
    System.out.println("Pagara " + (precio - precio * 0.15) + " aplicando el descuento del 15%.");
    
    s.close();
  }
}
