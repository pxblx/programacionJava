package practicas.poo3.gestisimal;

public class ExcepcionValorNegativo extends Exception {
  public ExcepcionValorNegativo() {
    super("El valor para los precios y las unidades no puede ser 0 o negativo.");
  }
}
