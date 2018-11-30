package practicas.secuenciales;

import java.util.Scanner;

public class E20Dinero {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int monedas_2e;
    int monedas_1e;
    int monedas_50c;
    int monedas_20c;
    int monedas_10c;
    double total;
    
    // Introduccion de datos
    System.out.println("Monedas de 2 euros:");
    monedas_2e = s.nextInt();
    System.out.println("Monedas de 1 euro:");
    monedas_1e = s.nextInt();
    System.out.println("Monedas de 50 centimos:");
    monedas_50c = s.nextInt();
    System.out.println("Monedas de 20 centimos:");
    monedas_20c = s.nextInt();
    System.out.println("Monedas de 10 centimos:");
    monedas_10c = s.nextInt();
    
    // Resultado
    total = monedas_2e*200+monedas_1e*100+monedas_50c*50+monedas_20c*20+monedas_10c*10;
    total = total/100;
    
    System.out.println("El total es: "+total+" euros.");
    
    s.close();
    
  }
  
}
