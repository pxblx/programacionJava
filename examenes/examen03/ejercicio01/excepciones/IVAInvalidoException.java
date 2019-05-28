package examenes.examen03.ejercicio01.excepciones;

/**
 * Se lanza cuando se intenta establecer un tipo de IVA no existente
 */
@SuppressWarnings("serial")
public class IVAInvalidoException extends Exception {
  public IVAInvalidoException(String msg) {
    super(msg);
  }
}
