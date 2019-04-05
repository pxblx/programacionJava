package examenes.examen03.Ejercicio02.src;

/**
 * Cuadrado (Ejercicio 2)
 *
 * @author Pablo
 * @version 1.0
 */
public class Cuadrado extends Rectangulo {

  /**
   * Constructor
   *
   * @param lado lado del cuadrado
   */
  public Cuadrado(double lado) {
    super(lado, lado);
  }

  /**
   * equals
   *
   * @param o cuadrado con el que comparar
   * @return true si son iguales o false si son diferentes
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cuadrado that = (Cuadrado) o;
    return Double.compare(that.getAlto(), getAlto()) == 0;
  }
}
