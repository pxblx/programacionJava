package examenes.examen03.ejercicio01.excepciones;

/**
 * Se lanza cuando se asigna un valor negativo a una variable que no debe tomarlo
 */
@SuppressWarnings("serial")
public class ValorNegativoException extends Exception {
  public ValorNegativoException(String msg) {
    super(msg);
  }
}
