package practicas.poo3.gestisimal.src.excepciones;

/**
 * Se lanza cuando se asigna una descripción vacía para un artículo
 */
public class DescripcionVaciaException extends Exception {
  public DescripcionVaciaException(String msg) {
    super(msg);
  }
}
