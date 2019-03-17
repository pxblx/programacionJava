package practicas.poo3.gestisimal.test;

import java.util.Scanner;
import practicas.poo3.gestisimal.Almacen;
import practicas.poo3.gestisimal.ExcepcionDescripcionVacia;
import practicas.poo3.gestisimal.ExcepcionValorNegativo;
import practicas.poo3.gestisimal.ExcepcionArticuloExistente;
import practicas.poo3.gestisimal.ExcepcionArticuloNoExistente;

/**
 * TestAlmacen
 */
public class TestAlmacen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Almacen almacen = new Almacen();
    int opcion;
    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int unidades;

    // Mostrar menú
    do {
      System.out.print("Almacén" +
        "\n-------" +
        "\n1.- Dar de alta un nuevo artículo" +
        "\n2.- Dar de baja un artículo" +
        "\n3.- Entrada de mercancía" +
        "\n4.- Salida de mercancía" +
        "\n5.- Mostrar un artículo" +
        "\n6.- Mostrar todos los artículos" +
        "\n7.- Salir" +
        "\n\nSeleccione una opción: ");
      opcion = Integer.parseInt(scanner.nextLine());

      switch (opcion) {
        case 1: // Dar de alta un nuevo artículo
          System.out.print("\nIntroduce la descripción del artículo: ");
          descripcion = scanner.nextLine();
          System.out.print("Introduce el precio de compra del artículo: ");
          precioCompra = Double.parseDouble(scanner.nextLine());
          System.out.print("Introduce el precio de venta del artículo: ");
          precioVenta = Double.parseDouble(scanner.nextLine());
          System.out.print("Introduce el número de unidades del artículo: ");
          unidades = Integer.parseInt(scanner.nextLine());
          try {
            almacen.altaArticulo(descripcion, precioCompra, precioVenta, unidades);
            System.out.print("Artículo creado.\n\n");
          } catch (ExcepcionDescripcionVacia e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          } catch (ExcepcionValorNegativo e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          } catch (ExcepcionArticuloExistente e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 2: // Dar de baja un artículo
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = Integer.parseInt(scanner.nextLine());
          try {
            almacen.bajaArticulo(codigo);
            System.out.print("Artículo eliminado.\n\n");
          } catch (ExcepcionArticuloNoExistente e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 3: // Entrada de mercancía
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = Integer.parseInt(scanner.nextLine());
          System.out.print("Introduce las unidades que entran: ");
          unidades = Integer.parseInt(scanner.nextLine());
          try {
            almacen.entradaMercancia(codigo, unidades);
            System.out.println("Unidades añadidas.\n");
          } catch (ExcepcionArticuloNoExistente e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          } catch (ExcepcionValorNegativo e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 4: // Salida de mercancía
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = Integer.parseInt(scanner.nextLine());
          System.out.print("Introduce las unidades que salen: ");
          unidades = Integer.parseInt(scanner.nextLine());
          try {
            almacen.salidaMercancia(codigo, unidades);
            System.out.println("Unidades quitadas.\n");
          } catch (ExcepcionArticuloNoExistente e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          } catch (ExcepcionValorNegativo e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 5: // Mostrar un artículo
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = Integer.parseInt(scanner.nextLine());
          try {
            System.out.println("\n" + almacen.getArticulo(codigo) + "\n");
          } catch (ExcepcionArticuloNoExistente e) {
            System.out.println();
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 6: // Mostrar todos los artículos
          System.out.print("\n" + almacen);
          break;

        case 7: // Salir
          System.out.print("\nSaliendo...");
          return;

        default: // Por defecto
          System.out.println("\nOpción incorrecta.\n");
          break;
      }
    } while (true);
  }
}
