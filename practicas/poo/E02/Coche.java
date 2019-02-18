/**
 * Ejercicio 2 de POO
 */
package practicas.poo.E02;

/**
 * Subclase Coche
 */
public class Coche extends Vehiculo {
  protected boolean quemandoRueda = false;

  /**
   * Constructor
   *
   * @param k kiómetros recorridos
   */
  public Coche(int k) {
    setKilometrosRecorridos(k);
    setkilometrosTotales(getkilometrosTotales()+getKilometrosRecorridos());
    setVehiculosCreados(getVehiculosCreados()+1);
  }

  /**
   * Quemar rueda
   */
  public void quemarRueda() {
    if (quemandoRueda) {
      quemandoRueda = false;
    } else {
      quemandoRueda = true;
    }
  }
}
