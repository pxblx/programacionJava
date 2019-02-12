/**
 * Ejercicio 9 de POO
 *
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio anterior que ya no hace falta
 * modificar). Cada móvil lleva asociada una tarifa que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de
 * 6, 12 y 30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente, cuando un móvil llama a otro, se
 * le cobra al que llama, no al que recibe la llamada. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla. Para que el total tarificado aparezca con dos decimales, puedes utilizar
 * DecimalFormat.
 *
 * Contenido del main
 *
 * Movil m1 = new Movil("678 11 22 33", "rata");
 * Movil m2 = new Movil("644 74 44 69", "mono");
 * Movil m3 = new Movil("622 32 89 09", "bisonte");
 * System.out.println(m1);
 * System.out.println(m2);
 * m1.llama(m2, 320);
 * m1.llama(m3, 200);
 * m2.llama(m3, 550);
 * System.out.println(m1);
 * System.out.println(m2);
 * System.out.println(m3);
 *
 * Salida
 *
 * Nº 678 11 22 33 - 0s de conversación - tarificados 0,00 euros
 * Nº 644 74 44 69 - 0s de conversación - tarificados 0,00 euros
 * Nº 678 11 22 33 - 520s de conversación - tarificados 0,52 euros
 * Nº 644 74 44 69 - 870s de conversación - tarificados 1,10 euros
 * Nº 622 32 89 09 - 750s de conversación - tarificados 0,00 euros
 *
 * @author Pablo
 */
package practicas.poo.E09;

import practicas.poo.E08.Terminal;
import java.text.DecimalFormat;

/**
 * Subclase Movil
 */
public class Movil extends Terminal {
  private String tarifa;
  private double gastado = 0;
  private DecimalFormat FormatoGastado = new DecimalFormat("#0.00");

  /**
   * Constructor
   *
   * @param numero número de terminal
   * @param tarifa tarifa de terminal
   */
  public Movil(String numero, String tarifa) {
    super(numero);
    this.setTarifa(tarifa);
  }

  /**
   * Setter para la tarifa
   *
   * @param tarifa tarifa
   */
  public void setTarifa (String tarifa) {
    if ((tarifa.equals("rata") || tarifa.equals("mono") || tarifa.equals("bisonte"))) {
      this.tarifa = tarifa;
    }
  }

  /**
   * Getter para la tarifa
   *
   * @return tarifa
   */
  public String getTarifa() {
    return this.tarifa;
  }

  /**
   * Setter para el dinero gastado
   *
   * @param gastado dinero gastado
   */
  public void setGastado(double gastado) {
    this.gastado = gastado;
  }

  /**
   * Getter para el dinero gastado
   *
   * @return dinero gastado
   */
  public double getGastado() {
    return gastado;
  }

  /**
   * Llamar a otro terminal
   *
   * @param t terminal al que se llama
   * @param tiempo duración de la llamada
   */
  @Override
  public void llama (Terminal t, int tiempo) {
    this.setTiempo(this.getTiempo() + tiempo);
    t.setTiempo(t.getTiempo() + tiempo);

    if (this.tarifa.equals("rata")) {
      this.setGastado(this.getGastado() + tiempo*0.001);
    } else if (this.tarifa.equals("mono")) {
      this.setGastado(this.getGastado() + tiempo*0.002);
    } else if (this.tarifa.equals("bisonte")) {
      this.setGastado(this.getGastado() + tiempo*0.005);
    }
  }

  /**
   * toString
   *
   * @return ejemplo: Nº 678 11 22 33 - 0s de conversación - tarificados 0,00 euros
   */
  @Override
  public String toString() {
    return ("Nº "+this.getNumero()+" - "+this.getTiempo()+"s de conversación - tarificados "+FormatoGastado.format(this.getGastado())+" euros");
  }
}
