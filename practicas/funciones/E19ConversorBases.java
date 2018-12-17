/**
 * Ejercicio 19 de funciones
 * 
 * Une y amplía los dos programas anteriores de tal forma que se permita convertir un número entre cualquiera de las siguientes
 * bases: decimal, binario, hexadecimal y octal.
 * 
 * @author Pablo
 */

package practicas.funciones;

import java.util.Scanner;
import practicas.funciones.funciones.Matematicas;

public class E19ConversorBases {
  
  public static void main(String[] args) {
    
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int opcion;
    int numero = 0;
    String numHex = "";
    
    // Introducción de datos
    System.out.println("(1) Decimal a binario.");
    System.out.println("(2) Decimal a octal.");
    System.out.println("(3) Decimal a hexadecimal.");
    System.out.println("(4) Binario a decimal.");
    System.out.println("(5) Binario a octal.");
    System.out.println("(6) Binario a hexadecimal.");
    System.out.println("(7) Octal a decimal.");
    System.out.println("(8) Octal a binario.");
    System.out.println("(9) Octal a hexadecimal.");
    System.out.println("(10) Hexadecimal a decimal.");
    System.out.println("(11) Hexadecimal a binario.");
    System.out.println("(12) Hexadecimal a octal.");
    System.out.println("");
    System.out.print("Selecciona una de las opciones: ");
    opcion = s.nextInt();
    s.nextLine();
    System.out.println("");
    System.out.print("Introduce el número a convertir: ");
    if (opcion < 10) {
      numero = s.nextInt();
    } else {
      numHex = s.nextLine();
    }
    System.out.println("");
    
    // Según la opción se llama a unos métodos u otros
    switch (opcion) {
    case 1:
      System.out.println(numero+" en binario es "+DecimalABinarioOctal(numero,2));
      break;
    case 2:
      System.out.println(numero+" en octal es "+DecimalABinarioOctal(numero,8));
      break;
    case 3:
      System.out.println(numero+" en hexadecimal es "+DecimalAHexadecimal(numero));
      break;
    case 4:
      System.out.println(numero+" en decimal es "+BinarioOctalADecimal(numero,2));
      break;
    case 5:
      System.out.println(numero+" en octal es "+DecimalABinarioOctal(BinarioOctalADecimal(numero,2),8));
      break;
    case 6:
      System.out.println(numero+" en hexadecimal es "+DecimalAHexadecimal(BinarioOctalADecimal(numero,2)));
      break;
    case 7:
      System.out.println(numero+" en decimal es "+BinarioOctalADecimal(numero,8));
      break;
    case 8:
      System.out.println(numero+" en binario es "+DecimalABinarioOctal(BinarioOctalADecimal(numero,8),2));
      break;
    case 9:
      System.out.println(numero+" en hexadecimal es "+DecimalAHexadecimal(BinarioOctalADecimal(numero,8)));
      break;
    case 10:
      System.out.println(numHex+" en decimal es "+HexadecimalADecimal(numHex));
      break;
    case 11:
      System.out.println(numHex+" en binario es "+DecimalABinarioOctal(HexadecimalADecimal(numHex),2));
      break;
    case 12:
      System.out.println(numHex+" en octal es "+DecimalABinarioOctal(HexadecimalADecimal(numHex),8));
      break;
    default:
      System.out.println("La opción que has especificado no existe.");
      break;
      
    }
    
    s.close();
    
  }
  
  /**
   * Pasa de binario u octal a decimal, según la base que se le especifique
   * 
   * @param numero número binario u octal a convertir
   * @param base base
   * @return número convertido a decimal
   */
  public static int BinarioOctalADecimal (int numero, int base) {
    
    // Declaración de variables
    int digito;
    int posicion = 0;
    int resultado = 0;
    
    while (numero != 0) {
      // Primero se toma el primer dígito del número
      digito = numero%10;
      // Se eleva la base 2/8 a la posición (p) en la que se encuentra el dígito (d) y se multiplica por el mismo, sumandolo con el
      // que será el resultado final
      resultado += digito * Matematicas.potencia(base, posicion);
      // Se incrementa p para pasar a la siguiente posición
      posicion++;
      // Se quita la cifra que ya hemos utilizado, cuando llegue a 0 terminará el ciclo
      numero = numero/10;
    }
    
    // Resultado
    return resultado;
    
  }
  
  /**
   * Pasa de decimal a binario u octal, según la base que se le especifique
   * 
   * @param numero número decimal a convertir
   * @param base base
   * @return número convertido a binario u octal
   */
  public static int DecimalABinarioOctal (int numero, int base) {
    
    // Declaración de variables
    int resto;
    int resultado;
    
    // Se añade al resultado el primer resto de la división del número entre 2/8
    resultado = numero%base;
    // Se divide por primera vez entre 2/8
    numero /= base;
    // Mientras que el número siga siendo mayor que 0
    while (numero > 0) {
      // Se obtiene el siguiente resto de la división
      resto = numero%base;
      // Se añade al resultado
      resultado = Matematicas.pegaPorDetras(resultado, resto);
      // Se divide entre 2/8
      numero /= base;
    }
    
    // Se voltea el resultado
    return Matematicas.voltea(resultado);
    
  }
  
  /**
   * Pasa de decimal a hexadecimal
   * 
   * @param numero número decimal a convertir
   * @return número convertido a hexadecimal
   */
  public static String DecimalAHexadecimal (int numero) {
    
    // Declaración de variables
    int resto;
    String resultado = "";
    String resultado2 = "";
    String hexadecimal[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
    
    // Mientras que el número siga siendo mayor que 0
    do {
      // Se obtiene el resto de la división y se toma el caracter que le corresponde del array hexadecimal
      resto = numero%16;
      // Se añade al resultado
      resultado = resultado+hexadecimal[resto];
      // Se divide entre 16
      numero /= 16;
    } while (numero > 0);
    
    // Se voltea el resultado
    for (int i = resultado.length(); i > 0; i--) {
      resultado2 = resultado2 + resultado.charAt(i-1);
    }
    
    return resultado2;
    
  }
  
  /**
   * Pasa de hexadecimal a decimal
   * 
   * @param numero número hexadecimal a convertir
   * @return número convertido a decimal
   */
  public static int HexadecimalADecimal (String numero) {
    
    // Declaración de variables
    int resultado = 0;
    char caracter;
    int pos;
    String hexadecimal = ("0123456789ABCDEF");
    
    // Para cada caracter del numero hexadecimal, se busca en la cadena su posición y se multiplica por 16 para añadirlo al resultado
    for (int i = 0; i < numero.length(); i++) {
      caracter = numero.charAt(i);
      pos = hexadecimal.indexOf(caracter);
      resultado = resultado*16 + pos;
    }
    
    return resultado;
    
  }
  
}
