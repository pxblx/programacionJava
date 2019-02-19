/**
 * Ejercicio 5 de poo1
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
package practicas.poo1;

public class E05Fraccion {
  private int numerador;
  private int denominador;
  
  /**
   * Constructor
   * 
   * @param numerador
   * @param denominador
   */
  public E05Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
    if (this.denominador == 0) {
      this.denominador = 1;
    }
  }

  /**
   * Devolver la fracción
   */
  @Override
  public String toString() {
    return (this.numerador+"/"+this.denominador);
  }
  
  /**
   * Modifica la fracción
   */
  public void modificar(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
    if (this.denominador == 0) {
      this.denominador = 1;
    }
  }
  
  /**
   * Devuelve el resultado de dividir la fracción
   */
  public double getResultado() {
    return (this.numerador/this.denominador);
  }
  
  /**
   * Multiplicar la fracción por el número que se pasa como parámetro
   * 
   * @param numero
   */
  public E05Fraccion multiplicarEntero(int numero) {
    return (new E05Fraccion((this.numerador*numero), this.denominador));
  }
  
  /**
   * Multiplicar una fracción por otra que se pasa como parámetro
   * 
   * @param fraccion
   */
  public E05Fraccion multiplicar(E05Fraccion fraccion) {
    return (new E05Fraccion((this.numerador*fraccion.numerador), (this.denominador*fraccion.denominador)));
  }
  
  /**
   * Sumar una fracción con otra que se pasa como parámetro
   * 
   * @param fraccion
   */
  public E05Fraccion sumar(E05Fraccion fraccion) {
    int mcd = mcd(this.denominador,fraccion.denominador);
    int mcm = (this.denominador*fraccion.denominador)/mcd;
    return (new E05Fraccion((((mcm/this.denominador)*this.numerador)+((mcm/fraccion.denominador)*fraccion.numerador)), mcm));
  }
  
  /**
   * Restar una fracción con otra que se pasa como parámetro
   * 
   * @param fraccion
   */
  public E05Fraccion restar(E05Fraccion fraccion) {
    return (new E05Fraccion(((this.numerador*fraccion.denominador)-(this.denominador*fraccion.numerador)), (this.denominador*fraccion.denominador)));
  }
  
  /**
   * Simplificar una fracción
   */
  public E05Fraccion simplificar() {
    int mcd = mcd(this.numerador,this.denominador);
    return (new E05Fraccion((this.numerador/mcd), (this.denominador/mcd)));
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
