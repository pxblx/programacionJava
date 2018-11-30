package practicas.secuenciales;

import java.util.Scanner;

public class E10Calificacion {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double parcial1;
    double parcial2;
    double parcial3;
    double examen;
    double trabajo;
    double nota;
    
    // Introduccion de datos
    System.out.println("Introduce la nota del primer parcial:");
    parcial1 = s.nextInt();
    System.out.println("Introduce la nota del segundo parcial:");
    parcial2 = s.nextInt();
    System.out.println("Introduce la nota del tercer parcial:");
    parcial3 = s.nextInt();
    System.out.println("Introduce la nota del examen final:");
    examen = s.nextInt();
    System.out.println("Introduce la nota del trabajo final:");
    trabajo = s.nextInt();
    
    // Resultado
    nota = (((parcial1+parcial2+parcial3)/3)*0.55)+(examen*0.3)+(trabajo*0.15);
    
    System.out.println("La nota final es "+nota+".");
    
    s.close();
    
  }
  
}
