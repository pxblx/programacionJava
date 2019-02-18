/**
 * Ejercicio 2 de POO
 */
package practicas.poo.E02;

/**
 * Subclase Bicicleta
 */
public class Bicicleta extends Vehiculo {
  protected boolean haciendoCaballito = false;

  /**
   * Constructor
   *
   * @param k kiómetros recorridos
   */
  public Bicicleta(int k) {
    setKilometrosRecorridos(k);
    setkilometrosTotales(getkilometrosTotales()+getKilometrosRecorridos());
    setVehiculosCreados(getVehiculosCreados()+1);
  }

  /**
   * Hacer el caballito
   */
  public void hacerCaballito() {
    if (haciendoCaballito) {
      haciendoCaballito = false;
    } else {
      haciendoCaballito = true;
    }
  }
}
