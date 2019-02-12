/**
 * Ejercicio 8 de POO
 *
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los terminales se pueden llamar unos a otros y
 * el tiempo de conversación corre para ambos. A continuación se proporciona el contenido del main y el resultado que
 * debe aparecer por pantalla.
 *
 * Contenido del main
 *
 * Terminal t1 = new Terminal("678 11 22 33");
 * Terminal t2 = new Terminal("644 74 44 69");
 * Terminal t3 = new Terminal("622 32 89 09");
 * Terminal t4 = new Terminal("664 73 98 18");
 * System.out.println(t1);
 * System.out.println(t2);
 * t1.llama(t2, 320);
 * t1.llama(t3, 200);
 * System.out.println(t1);
 * System.out.println(t2);
 * System.out.println(t3);
 * System.out.println(t4);
 *
 * Salida
 *
 * Nº 678 11 22 33 - 0s de conversación
 * Nº 644 74 44 69 - 0s de conversación
 * Nº 678 11 22 33 - 520s de conversación
 * Nº 644 74 44 69 - 320s de conversación
 * Nº 622 32 89 09 - 200s de conversación
 * Nº 664 73 98 18 - 0s de conversación
 *
 * @author Pablo
 */
package practicas.poo.E08;

/**
 * Clase Terminal
 */
public class Terminal {
  private String numero;
  private int tiempo = 0;

  /**
   * Constructor
   *
   * @param numero número de terminal
   */
  public Terminal(String numero) {
    this.setNumero(numero);
  }

  /**
   * Setter para el número
   *
   * @param numero número de terminal
   */
  public void setNumero (String numero) {
    if (numero.matches("\\d{3} \\d{2} \\d{2} \\d{2}")) {
      this.numero = numero;
    }
  }

  /**
   * Getter para el número
   *
   * @return número de terminal
   */
  public String getNumero() {
    return this.numero;
  }

  /**
   * Getter para el tiempo
   *
   * @return segundos de conversación
   */
  public int getTiempo() {
    return this.tiempo;
  }

  /**
   * Setter para el tiempo
   *
   * @param tiempo segundos de conversación
   */
  public void setTiempo (int tiempo) {
    this.tiempo = tiempo;
  }

  /**
   * Llamar entre dos terminales
   *
   * @param t terminal al que se llama
   * @param tiempo duración de la llamada
   */
  public void llama (Terminal t, int tiempo) {
    this.setTiempo(this.getTiempo() + tiempo);
    t.setTiempo(t.getTiempo() + tiempo);
  }

  /**
   * toString
   *
   * @return ejemplo: Nº 678 11 22 33 - 0s de conversación
   */
  @Override
  public String toString() {
    return ("Nº "+this.getNumero()+" - "+this.getTiempo()+"s de conversación");
  }
}
