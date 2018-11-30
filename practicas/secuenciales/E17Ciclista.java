package practicas.secuenciales;

import java.util.Scanner;

public class E17Ciclista {

  public static void main(String[] args) {
    
    // Declaracion de variables
    Scanner s = new Scanner(System.in);
    int hora_salida;
    int minuto_salida;
    int segundo_salida;
    int tiempo_invertido;
    int llegada_segundos;
    int hora_llegada;
    int minuto_llegada;
    int segundo_llegada;
    
    // Introduccion de datos
    System.out.println("Hora de salida:");
    hora_salida = s.nextInt();
    System.out.println("Minuto de salida:");
    minuto_salida = s.nextInt();
    System.out.println("Segundo de salida:");
    segundo_salida = s.nextInt();
    System.out.println("Tiempo invertido en segundos:");
    tiempo_invertido = s.nextInt();
    
    // Resultado
    llegada_segundos = hora_salida*3600+minuto_salida*60+segundo_salida+tiempo_invertido;
    hora_llegada = llegada_segundos/3600;
    minuto_llegada = (llegada_segundos%3600)/60;
    segundo_llegada = (llegada_segundos%3600)%60;
    
    
    System.out.println("Llegara a las "+hora_llegada+":"+minuto_llegada+":"+segundo_llegada+".");
    
    s.close();
    
  }
  
}
