/**
 * Ejercicio 3 de clases
 * 
 * Crea una clase TestCirculo que cree una instancia de “Circulo”, muestre su estado, lo haga crecer 27 veces, averigüe su área,
 * lo haga decrecer 10 veces y muestre su estado final.
 * 
 * @author Pablo
 */
package practicas.clases;

import practicas.clases.E04CirculoMod;

public class E03TestCirculo {
  
  public static void main(String args[]) {
    
    E04CirculoMod circulo = new E04CirculoMod(5);
    System.out.println(circulo);
    circulo.aumentarRadio(27);
    System.out.println("El área del círculo ahora es: "+circulo.area()+" metros cuadrados.");
    circulo.reducirRadio(10);
    System.out.println(circulo);
    
  }
  
}
