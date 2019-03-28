package practicas.poo3.gestisimal.src.excepciones;

/**
 * Se lanza cuando se especifica una opción incorrecta en el menú de opciones
 */
public class ExcepcionOpcionIncorrecta extends Exception {
  public ExcepcionOpcionIncorrecta(String msg) {
    super(msg);
  }
}
