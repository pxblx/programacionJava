package practicas.poo3.gestisimal.src.utiles;

import practicas.poo3.gestisimal.src.excepciones.EntradaDeDatosException;

/**
 * Clase para crear un menú de opciones
 */
public class Menu {
  private String titulo;
  private String[] opciones;

  /**
   * Consctructor
   *
   * @param titulo título del menú
   * @param opciones array de opciones
   */
  public Menu(String titulo, String[] opciones) {
    this.titulo = titulo;
    this.opciones = opciones;
  }

  /**
   * Construir el menú y mostrarlo por pantalla
   */
  private void mostrar() {
    String stringMenu;
    stringMenu = (titulo + "\n---------------\n");
    for (int i = 0; i < opciones.length; i++) {
      stringMenu += ((i+1) + ".- " + opciones[i] + "\n");
    }
    System.out.print(stringMenu);
  }

  /**
   * Pedir por teclado una opción entre las posibles
   *
   * @return opción válida
   */
  private int getOpcionValida() {
    int opcion = 0;
    do {
      System.out.print("Elige opción [1, " + opciones.length + "]: ");
      try {
        opcion = Teclado.leerEntero();
      } catch (EntradaDeDatosException e) {
        System.err.println("\n" + e.getMessage() + "\n");
      }
    } while (!esOpcionValida(opcion));
    return opcion;
  }

  /**
   * Indica si la opción es válida
   *
   * @param opcion número a comparar
   * @return true si es válida false en otro caso
   */
  private boolean esOpcionValida(int opcion) {
    return (opcion >= 1 && opcion <= opciones.length);
  }

  /**
   * Mostrar el menú y pedir una opción por teclado
   *
   * @return opción introducida por teclado
   */
  public int gestionar() {
    mostrar();
    return getOpcionValida();
  }
}
