package practicas.poo3.gestisimal;

/**
 * ExcepcionArticuloNoExistente
 */
public class ExcepcionArticuloNoExistente extends Exception {
  public ExcepcionArticuloNoExistente() {
    super("El artículo no existe en el almacén.");
  }
}
