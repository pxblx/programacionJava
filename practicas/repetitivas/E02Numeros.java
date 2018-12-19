/**
 * Ejercicio 2
 * 
 * Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuantos
 * números introducidos son mayores que 0, menores que 0 e iguales a 0.
 * 
 * @author Pablo
 */

package practicas.repetitivas;

import java.util.Scanner;

public class E02Numeros {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int numero, cantidad, contador=0, contadorMayores=0, contadorMenores=0, contadorIguales=0;
    
    // Cantidad de numeros que se van a introducir
    System.out.println("Introduce la cantidad de numeros que vas a guardar:");
    cantidad = s.nextInt();
    
    // Bucle
    while (contador<cantidad) { 
      System.out.println("Introduce un numero:");
      numero = s.nextInt();
      if (numero>0) {
        contadorMayores++;
      }
      if (numero<0) {
        contadorMenores++;
      }
      if (numero==0) {
        contadorIguales++;
      }
      contador++;
    }
    
    // Resultado
    System.out.println("Has introducido "+contadorMayores+" numeros mayores a 0, "+contadorIguales+" iguales a 0 y "+contadorMenores+" menores a 0.");
    
    s.close();
  
  }
  
}
