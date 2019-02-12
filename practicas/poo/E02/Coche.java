/**
 * Ejercicio 2 de POO
 */
package practicas.poo.E02;

/**
 * Subclase Coche
 */
public class Coche extends Vehiculo {
  private boolean quemandoRueda = false;

  /**
   * Constructor
   *
   * @param k kiómetros recorridos
   */
  public Coche(int k) {
    this.kilometrosRecorridos = k;
    setkilometrosTotales(getkilometrosTotales()+this.kilometrosRecorridos);
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
  /**
   * Obtener el número de kilómetros recorridos por el coche
   *
   * @return número de kilómetros recorridos por el coche
   */
  public int getKilometraje() {
    return this.kilometrosRecorridos;
  }
}
