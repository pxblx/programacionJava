package practicas.secuenciales;

import java.util.Scanner;

public class E08Vendedor {

  public static void main(String[] args) {
  
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double salario;
    double venta1;
    double venta2;
    double venta3;
    double comisiones;
    double total;
    
    // Introduccion de datos
    System.out.println("Introduce el salario base:");
    salario = s.nextInt();
    System.out.println("Introduce el precio de la venta 1:");
    venta1 = s.nextInt();
    System.out.println("Introduce el precio de la venta 2:");
    venta2 = s.nextInt();
    System.out.println("Introduce el precio de la venta 3:");
    venta3 = s.nextInt();
    
    // Resultado
    comisiones = venta1*0.1+venta2*0.1+venta3*0.1;
    total = salario+comisiones;
    
    System.out.println("Obtendra "+comisiones+" en concepto de comisiones y "+total+" en total.");
    
    s.close();
    
  }
  
}
