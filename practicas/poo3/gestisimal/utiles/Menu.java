package practicas.poo3.gestisimal.utiles;

/**
 * Clase para crear un menú de opciones
 */
public class Menu {
  private String titulo;
  private String[] opciones;
  private String stringMenu;
  private int opcion;

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
   * toString
   *
   * @return menú construido en una string
   */
  @Override
  public String toString() {
    stringMenu = (titulo + "\n---------------\n");
    for (int i = 0; i < opciones.length; i++) {
      stringMenu += ((i+1) + ".- " + opciones[i] + "\n");
    }
    stringMenu += ("\nSeleccione una opción: ");
    return stringMenu;
  }

  /**
   * Pedir por teclado una opción
   *
   * @return opción introducida por teclado
   * @throws NumberFormatException si se introduce algo distinto a un entero
   */
  private int pedirOpcion() throws NumberFormatException {
    opcion = Teclado.leerEntero();
    return opcion;
  }

  /**
   * Mostrar el menú y pedir una opción por teclado
   *
   * @return opción introducida por teclado
   */
  public int mostrar() {
    System.out.print(this);
    return pedirOpcion();
  }
}
