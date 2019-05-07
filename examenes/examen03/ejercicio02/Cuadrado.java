package examenes.examen03.ejercicio02;

/**
 * Cuadrado (Ejercicio 2)
 */
public class Cuadrado extends Rectangulo implements Comparable<Cuadrado> {

  /**
   * Constructor
   *
   * @param lado lado del cuadrado
   */
  public Cuadrado(double lado) {
    super(lado, lado);
  }

  /**
   * compareTo
   *
   * @param o cuadrado con el que comparar
   * @return resultado de la comparación de ambos
   */
  @Override
  public int compareTo(Cuadrado o) {
    if (getAlto() == o.getAlto()) {
      return 0;
    }
    if (getAlto() > o.getAlto()) {
      return 1;
    }
    return -1;
  }
}
