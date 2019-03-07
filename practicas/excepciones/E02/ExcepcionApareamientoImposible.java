/**
 * Ejercicio 2 de Excepciones
 *
 * Excepción ExcepcionApareamientoImposible
 * No se pueden aparear dos gatos del mismo sexo.
 *
 * @author Pablo
 */
package practicas.excepciones.E02;

public class ExcepcionApareamientoImposible extends Exception {
  public ExcepcionApareamientoImposible() {
    super("El apareamiento es imposible porque los gatos son del mismo sexo.");
  }
}
