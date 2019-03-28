package practicas.poo3.gestisimal;

import practicas.poo3.gestisimal.src.Almacen;
import practicas.poo3.gestisimal.src.excepciones.ExcepcionDescripcionVacia;
import practicas.poo3.gestisimal.src.excepciones.ExcepcionOpcionIncorrecta;
import practicas.poo3.gestisimal.src.excepciones.ExcepcionValorNegativo;
import practicas.poo3.gestisimal.src.excepciones.ExcepcionArticuloNoExistente;
import practicas.poo3.gestisimal.src.utiles.Menu;
import practicas.poo3.gestisimal.src.utiles.Teclado;

/**
 * TestAlmacen
 */
public class TestAlmacen {
  public static void main(String[] args) {
    Almacen almacen = new Almacen();
    Menu menuPrincipal = new Menu("Almacén", new String[]{"Dar de alta un nuevo artículo", "Dar de baja un artículo",
    "Entrada de mercancía", "Salida de mercancía", "Mostrar un artículo", "Mostrar todos los artículos",
    "Salir"});
    int opcion;
    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int unidades;

    // Mostrar menú
    do {
      try {
        opcion = menuPrincipal.gestionar();
      } catch (NumberFormatException e) {
        opcion = 0;
        System.err.println("\nEntrada de datos incorrecta.\n");
      } catch (ExcepcionOpcionIncorrecta e) {
        opcion = 0;
        System.err.println("\n" + e.getMessage() + "\n");
      }

      switch (opcion) {
        case 1: // Dar de alta un nuevo artículo
          try {
            descripcion = Teclado.leerCadena("\nIntroduce la descripción del artículo: ");
            precioCompra = Teclado.leerDecimal("Introduce el precio de compra del artículo: ");
            precioVenta = Teclado.leerDecimal("Introduce el precio de venta del artículo: ");
            unidades = Teclado.leerEntero("Introduce el número de unidades del artículo: ");
          } catch (NumberFormatException e) {
            System.err.println("\nEntrada de datos incorrecta.\n");
            break;
          }
          try {
            almacen.altaArticulo(descripcion, precioCompra, precioVenta, unidades);
            System.out.print("Artículo creado.\n\n");
          } catch (ExcepcionDescripcionVacia e) {
            System.err.println("\n" + e.getMessage() + "\n");
          } catch (ExcepcionValorNegativo e) {
            System.err.println("\n" + e.getMessage() + "\n");
          }
          break;

        case 2: // Dar de baja un artículo
          try {
            codigo = Teclado.leerEntero("\nIntroduce el código del artículo: ");
          } catch (NumberFormatException e) {
            System.err.println("\nEntrada de datos incorrecta.\n");
            break;
          }
          try {
            almacen.bajaArticulo(codigo);
            System.out.print("Artículo eliminado.\n\n");
          } catch (ExcepcionArticuloNoExistente e) {
            System.err.println("\n" + e.getMessage() + "\n");
          }
          break;

        case 3: // Entrada de mercancía
          try {
            codigo = Teclado.leerEntero("\nIntroduce el código del artículo: ");
            unidades = Teclado.leerEntero("Introduce las unidades que entran: ");
          } catch (NumberFormatException e) {
            System.err.println("\nEntrada de datos incorrecta.\n");
            break;
          }
          try {
            almacen.entradaMercancia(codigo, unidades);
            System.out.println("Unidades añadidas.\n");
          } catch (ExcepcionArticuloNoExistente e) {
            System.err.println("\n" + e.getMessage() + "\n");
          } catch (ExcepcionValorNegativo e) {
            System.err.println("\n" + e.getMessage() + "\n");
          }
          break;

        case 4: // Salida de mercancía
          try {
            codigo = Teclado.leerEntero("\nIntroduce el código del artículo: ");
            unidades = Teclado.leerEntero("Introduce las unidades que salen: ");
          } catch (NumberFormatException e) {
            System.err.println("\nEntrada de datos incorrecta.\n");
            break;
          }
          try {
            almacen.salidaMercancia(codigo, unidades);
            System.out.println("Unidades quitadas.\n");
          } catch (ExcepcionArticuloNoExistente e) {
            System.err.println("\n" + e.getMessage() + "\n");
          } catch (ExcepcionValorNegativo e) {
            System.err.println("\n" + e.getMessage() + "\n");
          }
          break;

        case 5: // Mostrar un artículo
          try {
            codigo = Teclado.leerEntero("\nIntroduce el código del artículo: ");
          } catch (NumberFormatException e) {
            System.err.println("\nEntrada de datos incorrecta.\n");
            break;
          }
          try {
            System.out.println("\n" + almacen.getArticulo(codigo) + "\n");
          } catch (ExcepcionArticuloNoExistente e) {
            System.err.println("\n" + e.getMessage() + "\n");
          }
          break;

        case 6: // Mostrar todos los artículos
          System.out.print("\n" + almacen);
          break;

        case 7: // Salir
          System.out.print("\nSaliendo...");
          return;

        case 0: // Si salta alguna excepción al introducir la opción, la variable se establece a 0 y no se hace nada
          break;
      }
    } while (true);
  }
}
