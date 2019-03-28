package practicas.poo3.gestisimal.src.utiles;

import practicas.poo3.gestisimal.src.excepciones.EntradaDeDatosException;
import practicas.poo3.gestisimal.src.excepciones.OpcionIncorrectaException;

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
   * Construir el menú y mostrarlo por pantalla
   */
  private void mostrar() {
    stringMenu = (titulo + "\n---------------\n");
    for (int i = 0; i < opciones.length; i++) {
      stringMenu += ((i+1) + ".- " + opciones[i] + "\n");
    }
    stringMenu += ("\nSeleccione una opción: ");
    System.out.print(stringMenu);
  }

  /**
   * Pedir por teclado una opción
   *
   * @return opción introducida por teclado
   * @throws NumberFormatException si se introduce algo distinto a un entero
   */
  private int pedirOpcion() throws EntradaDeDatosException, OpcionIncorrectaException {
    opcion = Teclado.leerEntero();
    if ((opcion < 1) || (opcion > opciones.length+1)) {
      throw new OpcionIncorrectaException("Opción incorrecta.");
    }
    return opcion;
  }

  /**
   * Mostrar el menú y pedir una opción por teclado
   *
   * @return opción introducida por teclado
   */
  public int gestionar() throws EntradaDeDatosException, OpcionIncorrectaException {
    mostrar();
    return pedirOpcion();
  }
}
