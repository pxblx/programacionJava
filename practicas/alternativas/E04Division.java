package practicas.alternativas;

import java.util.Scanner;

/**
 * Ejercicio 4
 *
 * Crea un programa que pida al usuario dos números y muestre su división si el segundo
 * no es cero, o un mensaje de aviso en caso contrario.
 */
public class E04Division {
  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    double numero1, numero2;
    
    // Introduccion de datos
    System.out.println("Introduce el primer numero:");
    numero1 = s.nextDouble();
    System.out.println("Introduce el segundo numero:");
    numero2 = s.nextDouble();
    
    // Resultado
    if (numero2 == 0) {
      System.out.println("No se puede dividir entre 0.");
    } else {
      System.out.println("El resultado es " + numero1 / numero2 + ".");
    }
    s.close();
  }
}
