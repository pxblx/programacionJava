package practicas.secuenciales;

import java.util.Scanner;

public class E19Estudiante {
  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int correctas;
    int incorrectas;
    int nota;
    
    // Introduccion de datos
    System.out.println("Respuestas correctas:");
    correctas = s.nextInt();
    System.out.println("Respuestas incorrectas:");
    incorrectas = s.nextInt();
    
    // Resultado
    nota = correctas * 5 + incorrectas *- 1;
    
    System.out.println("La nota final es: " + nota + ".");
    
    s.close();
  }
}
