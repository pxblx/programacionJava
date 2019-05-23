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
   * Obtener el lado del cuadrado
   *
   * @return lado del cuadrado
   */
  public double getLado() {
    return this.getAlto();
  }

  /**
   * Establecer el lado del cuadrado
   *
   * @param lado lado del cuadrado
   */
  protected void setLado(double lado) {
    this.setAlto(lado);
    this.setAncho(lado);
  }

  /**
   * equals
   *
   * @param o cuadrado con el que comparar
   * @return true si son iguales o false si son diferentes
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cuadrado that = (Cuadrado) o;
    return Double.compare(that.getLado(), getLado()) == 0;
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
