package practicas.poo3.gestisimal.src.excepciones;

/**
 * Se lanza cuando se asigna una descripción vacía para un artículo
 */
public class ExcepcionDescripcionVacia extends Exception {
  public ExcepcionDescripcionVacia(String msg) {
    super(msg);
  }
}
