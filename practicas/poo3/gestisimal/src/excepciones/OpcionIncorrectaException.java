package practicas.poo3.gestisimal.src.excepciones;

/**
 * Se lanza cuando se especifica una opción incorrecta en el menú de opciones
 */
public class OpcionIncorrectaException extends Exception {
  public OpcionIncorrectaException(String msg) {
    super(msg);
  }
}
