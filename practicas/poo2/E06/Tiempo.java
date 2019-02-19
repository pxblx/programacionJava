/**
 * Ejercicio 6 de POO
 *
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo son intervalos de tiempo y se
 * crean de la forma Tiempo t = new Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString para ver los intervalos de tiempo de la
 * forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa
 * de prueba para comprobar que la clase funciona bien.
 *
 * @author Pablo
 */
package practicas.poo2.E06;

/**
 * Clase Tiempo
 */
public class Tiempo {
  private int horas;
  private int minutos;
  private int segundos;

  /**
   * Constructor
   *
   * @param h horas
   * @param m minutos
   * @param s segundos
   */
  public Tiempo(int h, int m, int s) {
    if (s >= 59) {
      m += s/60;
      s = s%60;
    }
    if (m >= 60) {
      h += m/60;
      m = m%60;
    }

    this.horas = h;
    this.minutos = m;
    this.segundos = s;
  }

  /**
   * toString
   *
   * @return ejemplo: 1h 34m 12s
   */
  @Override
  public String toString() {
    return (this.horas+"h "+this.minutos+"m "+this.segundos+"s");
  }

  /**
   * Sumar dos tiempos
   *
   * @param t tiempo con el que sumar
   * @return suma con t
   */
  public Tiempo suma(Tiempo t) {
    int segundos = this.segundos+t.segundos;
    int minutos = this.minutos+t.minutos;
    int horas = this.horas+t.horas;

    if (segundos > 59) {
      segundos -= 60;
      minutos++;
    }
    if (minutos > 59) {
      minutos -= 60;
      horas ++;
    }

    return (new Tiempo(horas, minutos, segundos));
  }

  /**
   * Restar dos tiempos
   *
   * @param t tiempo con el que restar
   * @return resta con t
   */
  public Tiempo resta(Tiempo t) {
    int segundos = this.segundos-t.segundos;
    int minutos = this.minutos-t.minutos;
    int horas = this.horas-t.horas;

    if (segundos < 0) {
      segundos += 60;
      minutos--;
    }
    if (minutos < 0) {
      minutos += 60;
      horas--;
    }

    return (new Tiempo(horas, minutos, segundos));
  }
}
