package examenes.examen03.Ejercicio01.src.excepciones;

/**
 * Se lanza cuando se intenta establecer un tipo de IVA no existente
 */
public class IVAInvalidoException extends Exception {
  public IVAInvalidoException(String msg) {
    super(msg);
  }
}
