package practicas.poo3.gestisimal;

import practicas.poo3.gestisimal.src.Almacen;
import practicas.poo3.gestisimal.src.excepciones.DescripcionVaciaException;
import practicas.poo3.gestisimal.src.excepciones.OpcionIncorrectaException;
import practicas.poo3.gestisimal.src.excepciones.ValorNegativoException;
import practicas.poo3.gestisimal.src.excepciones.ArticuloNoExistenteException;
import practicas.poo3.gestisimal.src.excepciones.EntradaDeDatosException;
import practicas.poo3.gestisimal.src.utiles.Menu;
import practicas.poo3.gestisimal.src.utiles.Teclado;

/**
 * Interacción con el usuario
 */
public class TestAlmacen {
  private static Almacen almacen = new Almacen();
  private static Menu menuPrincipal = new Menu("Almacén", new String[]{"Dar de alta un nuevo artículo",
    "Dar de baja un artículo", "Entrada de mercancía", "Salida de mercancía", "Mostrar un artículo",
    "Mostrar todos los artículos", "Salir"});

  public static void main(String[] args) {
    int opcion;
    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int unidades;

    // Mostrar el menú y pedir una de las opciones
    do {
      try {
        opcion = menuPrincipal.gestionar();
      } catch (EntradaDeDatosException | OpcionIncorrectaException e) {
        opcion = 0;
        System.err.println("\n" + e.getMessage() + "\n");
      }

      switch (opcion) {
        case 1: // Dar de alta un artículo
          try {
            descripcion = Teclado.leerCadena("\nIntroduce la descripción del artículo: ");
            precioCompra = Teclado.leerDecimal("Introduce el precio de compra del artículo: ");
            precioVenta = Teclado.leerDecimal("Introduce el precio de venta del artículo: ");
            unidades = Teclado.leerEntero("Introduce el número de unidades del artículo: ");
            altaArticulo(descripcion, precioCompra, precioVenta, unidades);
          } catch (EntradaDeDatosException e) {
            System.err.println("\n" + e.getMessage() + "\n");
            break;
          }
          break;

        case 2: // Dar de baja un artículo
          try {
            codigo = Teclado.leerEntero("\nIntroduce el código del artículo: ");
            bajaArticulo(codigo);
          } catch (EntradaDeDatosException e) {
            System.err.println("\n" + e.getMessage() + "\n");
            break;
          }
          break;

        case 3: // Añadir unidades a un artículo
          try {
            codigo = Teclado.leerEntero("\nIntroduce el código del artículo: ");
            unidades = Teclado.leerEntero("Introduce las unidades que entran: ");
            entradaMercancia(codigo, unidades);
          } catch (EntradaDeDatosException e) {
            System.err.println("\n" + e.getMessage() + "\n");
            break;
          }
          break;

        case 4: // Quitar unidades a un artículo
          try {
            codigo = Teclado.leerEntero("\nIntroduce el código del artículo: ");
            unidades = Teclado.leerEntero("Introduce las unidades que salen: ");
            salidaMercancia(codigo, unidades);
          } catch (EntradaDeDatosException e) {
            System.err.println("\n" + e.getMessage() + "\n");
            break;
          }
          break;

        case 5: // Mostrar un artículo
          try {
            codigo = Teclado.leerEntero("\nIntroduce el código del artículo: ");
            mostrarArticulo(codigo);
          } catch (EntradaDeDatosException e) {
            System.err.println("\n" + e.getMessage() + "\n");
            break;
          }
          break;

        case 6: // Mostrar todos los artículos
          mostrarArticulos();
          break;

        case 7: // Salir
          salir();
          return;

        case 0: // Si salta alguna excepción al introducir la opción, la variable se establece a 0 y no se hace nada
          break;
      }
    } while (true);
  }

  private static void altaArticulo(String descripcion, double precioCompra, double precioVenta, int unidades) {
    try {
      almacen.altaArticulo(descripcion, precioCompra, precioVenta, unidades);
      System.out.print("Artículo creado.\n\n");
    } catch (DescripcionVaciaException | ValorNegativoException e) {
      System.err.println("\n" + e.getMessage() + "\n");
    }
  }

  private static void bajaArticulo(int codigo) {
    try {
      almacen.bajaArticulo(codigo);
      System.out.print("Artículo eliminado.\n\n");
    } catch (ArticuloNoExistenteException e) {
      System.err.println("\n" + e.getMessage() + "\n");
    }
  }

  private static void entradaMercancia(int codigo, int unidades) {
    try {
      almacen.entradaMercancia(codigo, unidades);
      System.out.println("Unidades añadidas.\n");
    } catch (ArticuloNoExistenteException | ValorNegativoException e) {
      System.err.println("\n" + e.getMessage() + "\n");
    }
  }

  private static void salidaMercancia(int codigo, int unidades) {
    try {
      almacen.salidaMercancia(codigo, unidades);
      System.out.println("Unidades quitadas.\n");
    } catch (ArticuloNoExistenteException | ValorNegativoException e) {
      System.err.println("\n" + e.getMessage() + "\n");
    }
  }

  private static void mostrarArticulo(int codigo) {
    try {
      System.out.println("\n" + almacen.getArticulo(codigo) + "\n");
    } catch (ArticuloNoExistenteException e) {
      System.err.println("\n" + e.getMessage() + "\n");
    }
  }

  private static void mostrarArticulos() {
    System.out.print("\n" + almacen);
  }

  private static void salir() {
    System.out.print("\nSaliendo...");
  }
}
