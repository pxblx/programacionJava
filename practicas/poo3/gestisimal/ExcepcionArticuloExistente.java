package practicas.poo3.gestisimal;

/**
 * ExcepcionArticuloExistente
 */
public class ExcepcionArticuloExistente extends Exception {
  public ExcepcionArticuloExistente() {
    super("El artículo ya existe en el almacén.");
  }
}
