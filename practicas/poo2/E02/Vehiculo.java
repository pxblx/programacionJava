package practicas.poo2.E02;

/**
 * Ejercicio 2 de POO
 *
 * Crea la clase Vehiculo, así como las poo1 Bicicleta y Coche como subclases de la primera. Para la clase Vehiculo,
 * crea los atributos de clase vehiculosCreados y kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de las subclases. Prueba las poo1 creadas
 * mediante un programa con un menú como el que se muestra a continuación:
 *
 * VEHÍCULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8):
 */
abstract class Vehiculo {
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  protected boolean enMarcha = false;
  private int kilometrosRecorridos = 0;

  /**
   * Arrancar el vehículo
   */
  public void arrancar() {
    if (enMarcha) {
      enMarcha = false;
    } else {
      enMarcha = true;
    }
  }

  /**
   * Obtener el número de vehículos creados
   *
   * @return número de vehículos creados
   */
  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  /**
   * Establecer el número de vehículos creados
   *
   * @param x número de vehículos creados
   */
  protected static void setVehiculosCreados(int x) {
    vehiculosCreados = x;
  }

  /**
   * Obtener el número de kilómetros recorridos por todos los vehículos
   *
   * @return número de kilómetros recorridos por todos los vehículos
   */
  public static int getkilometrosTotales() {
    return kilometrosTotales;
  }

  /**
   * Establecer el número de kilómetros recorridos por todos los vehículos
   *
   * @param x número de kilómetros recorridos por todos los vehículos
   */
  protected static void setkilometrosTotales(int x) {
    kilometrosTotales = x;
  }

  /**
   * Obtener el número de kilómetros recorridos por el vehículo
   *
   * @return número de kilómetros recorridos por el vehículo
   */
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  /**
   * Establecer el número de kilómetros recorridos por el vehículo
   *
   * @param x número de kilómetros recorridos por el vehículo
   */
  protected void setKilometrosRecorridos(int x) {
    this.kilometrosRecorridos = x;
  }
}
