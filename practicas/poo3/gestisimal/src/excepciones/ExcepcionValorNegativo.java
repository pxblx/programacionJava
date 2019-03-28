package practicas.poo3.gestisimal.src.excepciones;

/**
 * Se lanza cuando se asigna un valor negativo a una variable que no debe tomarlo
 */
public class ExcepcionValorNegativo extends Exception {
  public ExcepcionValorNegativo(String msg) {
    super(msg);
  }
}
