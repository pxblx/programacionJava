package practicas.poo3.gestisimal.src.excepciones;

/**
 * Se lanza cuando se intenta acceder a un artículo que no existe en el almacén
 */
public class ArticuloNoExistenteException extends Exception {
  public ArticuloNoExistenteException(String msg) {
    super(msg);
  }
}
