package practicas.poo3.gestisimal.src.excepciones;

/**
 * ExcepcionArticuloExistente
 */
public class ExcepcionArticuloExistente extends Exception {
  public ExcepcionArticuloExistente() {
    super("El artículo ya existe en el almacén.");
  }
}
