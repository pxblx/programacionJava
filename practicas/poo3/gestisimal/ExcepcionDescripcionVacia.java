package practicas.poo3.gestisimal;

/**
 * ExcepcionDescripcionVacia
 */
public class ExcepcionDescripcionVacia extends Exception {
  public ExcepcionDescripcionVacia() {
    super("La descripción de los artículos no puede estar vacía.");
  }
}
