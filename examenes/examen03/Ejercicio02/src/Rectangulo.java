package examenes.examen03.Ejercicio02.src;

/**
 * Rectángulo (Ejercicio 2)
 *
 * @author Pablo
 * @version 1.0
 */
public class Rectangulo {
  private double ancho;
  private double alto;

  /**
   * Constructor
   *
   * @param ancho ancho del rectángulo
   * @param alto largo del rectángulo
   */
  public Rectangulo(double ancho, double alto) {
    setAncho(ancho);
    setAlto(alto);
  }

  /**
   * Obtener el ancho del rectángulo
   *
   * @return ancho del rectángulo
   */
  public double getAncho() {
    return ancho;
  }

  /**
   * Establecer el ancho del rectángulo
   *
   * @param ancho ancho del rectángulo
   */
  void setAncho(double ancho) {
    if (ancho <= 0 || ancho > 10) {
      throw new ArithmeticException("Las medidas no pueden tomar valores negativos o 0.");
    }
    this.ancho = ancho;
  }

  /**
   * Obtener el alto del rectángulo
   *
   * @return alto del rectángulo
   */
  public double getAlto() {
    return alto;
  }

  /**
   * Establecer el alto del rectángulo
   *
   * @param alto alto del rectángulo
   */
  void setAlto(double alto) {
    if (alto <= 0 || alto > 10) {
      throw new ArithmeticException("Las medidas no pueden tomar valores negativos o 0.");
    }
    this.alto = alto;
  }

  /**
   * toString
   *
   * @return rectángulo representado como cadena
   */
  @Override
  public String toString() {
    int i, espacios;
    String resultado = "";
    for (i = 0; i < this.ancho; i++) {
      resultado += "[ ]";
    }
    resultado += "\n";
    for (i = 1; i < this.alto - 1; i++) {
      resultado += "[ ]";
      for (espacios = 1; espacios < this.ancho - 1; espacios++) {
        resultado += "   ";
      }
      resultado += "[ ]\n";
    }
    for (i = 0; i < this.ancho; i++) {
      resultado += "[ ]";
    }
    resultado += "\n";
    return resultado;
  }
}
