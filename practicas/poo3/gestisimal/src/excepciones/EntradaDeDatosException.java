package practicas.poo3.gestisimal.src.excepciones;

/**
 * Se lanza cuando se introduce un tipo de dato diferente al que se pide
 */
public class EntradaDeDatosException extends Exception {
  public EntradaDeDatosException(String msg) {
    super(msg);
  }
}
