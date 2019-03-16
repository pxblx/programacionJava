package practicas.poo3.gestisimal.test;

import practicas.poo3.gestisimal.*;
import java.util.Scanner;

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
        case 1:
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
            e.printStackTrace();
            System.out.println();
          } catch (ExcepcionValorNegativo e) {
            e.printStackTrace();
            System.out.println();
          } catch (ExcepcionArticuloExistente e) {
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 2:
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = Integer.parseInt(scanner.nextLine());
          try {
            almacen.bajaArticulo(codigo);
            System.out.print("Artículo eliminado.\n\n");
          } catch (ExcepcionArticuloNoExistente e) {
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 3:
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = Integer.parseInt(scanner.nextLine());
          System.out.print("Introduce las unidades que entran: ");
          unidades = Integer.parseInt(scanner.nextLine());
          try {
            almacen.entradaMercancia(codigo, unidades);
            System.out.println("Unidades añadidas.\n");
          } catch (ExcepcionArticuloNoExistente e) {
            e.printStackTrace();
            System.out.println();
          } catch (ExcepcionValorNegativo e) {
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 4:
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = Integer.parseInt(scanner.nextLine());
          System.out.print("Introduce las unidades que salen: ");
          unidades = Integer.parseInt(scanner.nextLine());
          try {
            almacen.salidaMercancia(codigo, unidades);
            System.out.println("Unidades quitadas.\n");
          } catch (ExcepcionArticuloNoExistente e) {
            e.printStackTrace();
            System.out.println();
          } catch (ExcepcionValorNegativo e) {
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 5:
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = Integer.parseInt(scanner.nextLine());
          try {
            System.out.println("\n" + almacen.getArticulo(codigo) + "\n");
          } catch (ExcepcionArticuloNoExistente e) {
            e.printStackTrace();
            System.out.println();
          }
          break;

        case 6:
          System.out.print("\n" + almacen.getArticulos());
          break;

        case 7:
          System.out.print("\nSaliendo...");
          return;

        default:
          System.out.println("\nOpción incorrecta.\n");
          break;
      }
    } while (true);
  }
}
