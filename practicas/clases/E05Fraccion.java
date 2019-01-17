/**
 * Ejercicio 5 de clases
 * 
 * Crea una clase Fraccion de forma que podamos hacer las siguientes operaciones:
 * - Contruir un objeto Fraccion pasándole al constructor el numerador y el denominador.
 * - Obtener la fracción.
 * - Obtener y modificar numerador y denominador. No se puede dividir por cero.
 * - Obtener resultado de la fracción (número real).
 * - Multiplicar la fracción por un número.
 * - Multiplicar, sumar y restar fracciones.
 * - Simplificar la fracción.
 * 
 * @author Pablo
 */
package practicas.clases;

import java.util.Scanner;

public class E05Fraccion {
  
  private int numerador, denominador;
  private Scanner s = new Scanner(System.in);
  
  /**
   * Método constructor
   * 
   * @param numerador
   * @param denominador
   */
  public E05Fraccion(int numerador, int denominador) {
    do {
      this.numerador = numerador;
      this.denominador = denominador;
      if (this.denominador == 0) {
        System.out.println("No se puede dividir por 0.");
        System.out.println("Introduce el nuevo denominador:");
        this.denominador = s.nextInt();
      }
    } while (this.denominador == 0);
  }
  
  /**
   * Muestra la fracción por pantalla
   */
  public void getFraccion() {
    System.out.println(this.numerador+"/"+this.denominador);
  }
  
  /**
   * Modifica la fracción
   */
  public void modificar() {
    System.out.println("Modificar: "+this.numerador+"/"+this.denominador);
    do {
      System.out.println("Introduce el nuevo numerador:");
      this.numerador = s.nextInt();
      System.out.println("Introduce el nuevo denominador:");
      this.denominador = s.nextInt();
      if (this.denominador == 0) {
        System.out.println("No se puede dividir por 0.");
      }
    } while (this.denominador == 0);
  }
  
  /**
   * Muestra por pantalla el resultado de dividir la fracción
   */
  public void getResultado() {
    System.out.println((float)(this.numerador/this.denominador));
  }
  
  /**
   * Multiplica la fracción por el número que se pasa como parámetro
   * 
   * @param numero
   */
  public void multiplicarEntero(double numero) {
    System.out.println((this.numerador*numero)+"/"+this.denominador);
  }
  
  /**
   * Multiplica una fracción por otra que se pasa como parámetro
   * 
   * @param fraccion
   */
  public void multiplicar(E05Fraccion fraccion) {
    System.out.println((this.numerador*fraccion.numerador)+"/"+(this.denominador*fraccion.denominador));
  }
  
  /**
   * Suma una fracción por otra que se pasa como parámetro
   * 
   * @param fraccion
   */
  public void sumar(E05Fraccion fraccion) {
    int mcd = mcd(this.denominador,fraccion.denominador);
    int mcm = (this.denominador*fraccion.denominador)/mcd;
    System.out.println(((mcm/this.denominador)*this.numerador)+((mcm/fraccion.denominador)*fraccion.numerador)+"/"+mcm);
  }
  
  /**
   * Resta una fracción por otra que se pasa como parámetro
   * 
   * @param fraccion
   */
  public void restar(E05Fraccion fraccion) {
    System.out.println(((this.numerador*fraccion.denominador)-(this.denominador*fraccion.numerador))+"/"+(this.denominador*fraccion.denominador));
  }
  
  /**
   * Simplifica una fracción
   */
  public void simplificar() {
    int mcd = mcd(this.numerador,this.denominador);
    System.out.println(this.numerador/mcd+"/"+this.denominador/mcd);
  }
  
  /**
   * Calcular el MCD de dos números que se pasan como parámetro
   * 
   * @param n1 Primer número
   * @param n2 Segundo número
   * @return MCD
   */
  private int mcd(int n1, int n2) {
    int min = Math.min(n1, n2);
    int mcd = 0;
    for (int i = 1; i <= min; i++) {
      if (n1%i == 0 && n2%i == 0) {
        mcd = i;
      }
    }
    return mcd;
  }

}
