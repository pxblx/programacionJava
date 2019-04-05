package examenes.examen03.Ejercicio01;

import examenes.examen03.Ejercicio01.src.Almacen;
import examenes.examen03.Ejercicio01.src.excepciones.ArticuloNoExistenteException;
import examenes.examen03.Ejercicio01.src.excepciones.DescripcionVaciaException;
import examenes.examen03.Ejercicio01.src.excepciones.IVAInvalidoException;
import examenes.examen03.Ejercicio01.src.excepciones.ValorNegativoException;
import examenes.examen03.Ejercicio01.src.utiles.Menu;
import examenes.examen03.Ejercicio01.src.utiles.Teclado;

/**
 * Interacción con el usuario
 */
public class TestAlmacen {
  private static Almacen almacen = new Almacen();

  /**
   * Principal
   */
  public static void main(String[] args) {
    Menu menuPrincipal = new Menu("Almacén", new String[]{"Dar de alta un nuevo artículo",
      "Dar de baja un artículo", "Entrada de mercancía", "Salida de mercancía", "Mostrar un artículo",
      "Mostrar todos los artículos", "Salir"});
    do {
      try {
        switch (menuPrincipal.gestionar()) {
          case 1:
            alta();
            break;

          case 2:
            baja();
            break;

          case 3:
            entrada();
            break;

          case 4:
            salida();
            break;

          case 5:
            mostrarArticulo();
            break;

          case 6:
            mostrarArticulos();
            break;

          case 7:
            salir();
            return;
        }
      } catch (ValorNegativoException | DescripcionVaciaException | IVAInvalidoException | ArticuloNoExistenteException e) {
        System.err.println("\n" + e.getMessage() + "\n");
      }
    } while (true);
  }

  /**
   * Dar de alta un artículo
   *
   * @throws ValorNegativoException si se da un valor negativo a los precios o las unidades
   * @throws DescripcionVaciaException si se da una descripción vacía
   */
  private static void alta() throws ValorNegativoException, DescripcionVaciaException, IVAInvalidoException {
    almacen.altaArticulo(Teclado.leerCadena("\nIntroduce la descripción del artículo: "),
      gestionarIVA(),
      Teclado.leerDecimal("Introduce el precio de compra del artículo: "),
      Teclado.leerDecimal("Introduce el precio de venta del artículo: "),
      Teclado.leerEntero("Introduce el número de unidades del artículo: "));
    System.out.println("Artículo creado.\n");
  }

  /**
   * Gestionar el menú de IVA al dar de alta un artículo
   */
  private static String gestionarIVA() {
    Menu menuIVA = new Menu("Tipo de IVA", new String[]{"General", "Reducido", "Súper reducido"});
    switch (menuIVA.gestionar()) {
      case 1:
        return "general";
      case 2:
        return "reducido";
      case 3:
        return "s_reducido";
      default:
        return null;
    }
  }

  /**
   * Dar de baja un artículo
   *
   * @throws ArticuloNoExistenteException si no existe ningún artículo con el código que se especifica
   */
  private static void baja() throws ArticuloNoExistenteException {
    almacen.bajaArticulo(Teclado.leerEntero("\nIntroduce el código del artículo: "));
    System.out.println("Artículo eliminado.\n");
  }

  /**
   * Incrementar las unidades de un artículo
   *
   * @throws ArticuloNoExistenteException si no existe ningún artículo con el código que se especifica
   * @throws ValorNegativoException si se da un valor negativo a las unidades
   */
  private static void entrada() throws ArticuloNoExistenteException, ValorNegativoException {
    almacen.entradaMercancia(Teclado.leerEntero("\nIntroduce el código del artículo: "),
      Teclado.leerEntero("Introduce las unidades que entran: "));
    System.out.println("Unidades añadidas.\n");
  }

  /**
   * Decrementar las unidades de un artículo
   *
   * @throws ArticuloNoExistenteException si no existe ningún artículo con el código que se especifica
   * @throws ValorNegativoException si se da un valor negativo a las unidades
   */
  private static void salida() throws ArticuloNoExistenteException, ValorNegativoException {
    almacen.salidaMercancia(Teclado.leerEntero("\nIntroduce el código del artículo: "),
      Teclado.leerEntero("Introduce las unidades que salen: "));
    System.out.println("Unidades quitadas.\n");
  }

  /**
   * Mostrar un artículo
   *
   * @throws ArticuloNoExistenteException si no existe ningún artículo con el código que se especifica
   */
  private static void mostrarArticulo() throws ArticuloNoExistenteException {
    System.out.println("\n" + almacen.getArticulo(Teclado.leerEntero("\nIntroduce el código del artículo: ")) + "\n");
  }

  /**
   * Mostrar todos los artículos
   */
  private static void mostrarArticulos() {
    System.out.print("\n" + almacen);
  }

  /**
   * Salir del programa
   */
  private static void salir() {
    System.out.print("\nSaliendo...");
  }
}
