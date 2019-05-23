package practicas.repetitivas;

/**
 * Ejercicio 7
 *
 * Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10€, el segundo 20€, el tercero 40€ y así
 * sucesivamente. Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después de
 * los 20 meses.
 */
public class E07Pagos {
  public static void main(String[] args) {
    
    // Declaracion de variables
    int mes = 10, i, total = 0;
    
    // Bucle y resultado
    for (i = 1; i <= 20; i++) {
      System.out.println("El mes " + i + " pagara " + mes + " euros.");
      total = total + mes;
      mes = mes * 2;
    }
    System.out.println();
    System.out.println("En total pagara " + total + " euros.");
  }
}
