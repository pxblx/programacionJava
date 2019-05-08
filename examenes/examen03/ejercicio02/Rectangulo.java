package examenes.examen03.ejercicio02;

/**
 * Rectángulo (Ejercicio 2)
 */
public class Rectangulo {
  private static final int LIMITE_MEDIDAS = 10;
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
  protected void setAncho(double ancho) {
    if (!esMedidaValida(ancho)) {
      throw new ArithmeticException("El ancho no puede tomar valores mayores que " + LIMITE_MEDIDAS + ", negativos o 0.");
    }
    this.ancho = ancho;
  }

  /**
   * Comprobar si una medida es mayor o igual a 1 y menor que el límite establecido
   * 
   * @param medida medida
   * @return true si es correcta o false si no lo es
   */
  private boolean esMedidaValida(double medida) {
    return medida > 0 && medida <= LIMITE_MEDIDAS;
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
  protected void setAlto(double alto) {
    if (!esMedidaValida(alto)) {
      throw new ArithmeticException("El alto no puede tomar valores mayores que " + LIMITE_MEDIDAS + ", negativos o 0.");
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
