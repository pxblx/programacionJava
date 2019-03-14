package practicas.poo3.gestisimal;

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
        "\n\nSeleccione una opción: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          System.out.print("\nIntroduce la descripción del artículo: ");
          descripcion = scanner.nextLine();
          scanner.next();
          System.out.print("Introduce el precio de compra del artículo: ");
          precioCompra = scanner.nextDouble();
          System.out.print("Introduce el precio de venta del artículo: ");
          precioVenta = scanner.nextDouble();
          System.out.print("Introduce el número de unidades del artículo: ");
          unidades = scanner.nextInt();
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
        case 5:
          System.out.print("\nIntroduce el código del artículo: ");
          codigo = scanner.nextInt();
          try {
            System.out.println("\n" + almacen.getArticulo(codigo) + "\n");
          } catch (ExcepcionArticuloNoExistente e) {
            e.printStackTrace();
            System.out.println();
          }
          break;
        default:
          System.out.println("\nOpción incorrecta.");
          return;
      }
    } while (true);
  }
}
