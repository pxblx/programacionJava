/**
 * Ejercicio 2 de Excepciones
 *
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo
 * cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
 * = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
 * el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 *
 * @author Pablo
 */
package practicas.excepciones.E02;

public class E02Excepciones extends GatoSimple {

  public E02Excepciones(String sexo) {
    super(sexo);
  }

  public E02Excepciones apareaCon(GatoSimple gato) throws ExcepcionApareamientoImposible {
    if (this.getSexo() == gato.getSexo()) {
      throw new ExcepcionApareamientoImposible("El apareamiento es imposible porque los gatos son del mismo sexo.");
    } else {
      String[] sexos = new String[]{"macho", "hembra"};
      return new E02Excepciones(sexos[((int)(Math.random()*2))]);
    }
  }
}
