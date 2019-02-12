/**
 * Ejercicio 2 de POO
 */
package practicas.poo.E02;

/**
 * Subclase Bicicleta
 */
public class Bicicleta extends Vehiculo {
  private boolean haciendoCaballito = false;

  /**
   * Constructor
   *
   * @param k kiómetros recorridos
   */
  public Bicicleta(int k) {
    this.kilometrosRecorridos = k;
    setkilometrosTotales(getkilometrosTotales()+this.kilometrosRecorridos);
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

  /**
   * Obtener el número de kilómetros recorridos por la bicicleta
   *
   * @return número de kilómetros recorridos por la bicicleta
   */
  public int getKilometraje() {
    return this.kilometrosRecorridos;
  }
}
