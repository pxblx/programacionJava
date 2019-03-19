package practicas.poo3.gestisimal.excepciones;

/**
 * ExcepcionArticuloExistente
 */
public class ExcepcionArticuloExistente extends Exception {
  public ExcepcionArticuloExistente() {
    super("El artículo ya existe en el almacén.");
  }
}
