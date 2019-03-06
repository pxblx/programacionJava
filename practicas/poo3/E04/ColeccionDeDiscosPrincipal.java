/**
 * ColeccionDeDiscosPrincipal.java
 * Gestión de una colección de discos.
 * @author Luis José Sánchez | Modificado
 */
package practicas.poo3.E04;

import java.util.Scanner;

public class ColeccionDeDiscosPrincipal {

  // N determina el tamaño del array
  static int N = 3;

  public static void main(String[] args) {

    //Crea el array de discos
    Disco[] album = new Disco[N];

    // Crea todos los discos que van en cada una de
    // las celdas del array
    for(int i = 0; i < N; i++) {
      album[i] = new Disco();
    }

    int opcion;
    int listado;
    String codigoIntroducido = "";
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    Scanner scanner = new Scanner(System.in);
    int duracionIntroducida;
    int limite1;
    int limite2;
    int primeraLibre;
    int i;
    boolean flag = true;

    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          do {
            System.out.println("\nTIPOS DE LISTADO");
            System.out.println("================");
            System.out.println("1. Completo");
            System.out.println("2. Por autor");
            System.out.println("3. Por género");
            System.out.println("4. Por duración");
            System.out.println("5. Volver");
            System.out.print("Introduzca una opción: ");
            listado = scanner.nextInt();

            // Tipos de listado
            switch (listado) {
              // General
              case 1:
                for (Disco d: album) {
                  if (!d.getCodigo().equals("LIBRE")) {
                    System.out.println(d);
                  }
                }

                break;

              // Autor
              case 2:
                System.out.print("Introduzca un autor: ");
                autorIntroducido = System.console().readLine();
                for (Disco d: album) {
                  if ((!d.getCodigo().equals("LIBRE")) && (d.getAutor().equals(autorIntroducido))){
                    System.out.println(d);
                  }
                }

                break;

              // Genero
              case 3:
                System.out.print("Introduzca un género: ");
                generoIntroducido = System.console().readLine();
                for (Disco d: album) {
                  if ((!d.getCodigo().equals("LIBRE")) && (d.getGenero().equals(generoIntroducido))){
                    System.out.println(d);
                  }
                }

                break;

              // Rango de duración
              case 4:
                System.out.print("Desde (minutos): ");
                limite1 = Integer.parseInt(System.console().readLine());
                System.out.print("Hasta (minutos): ");
                limite2 = Integer.parseInt(System.console().readLine());
                for (Disco d: album) {
                  if ((!d.getCodigo().equals("LIBRE")) && (d.getDuracion() <= limite2) && (d.getDuracion() >= limite1)){
                    System.out.println(d);
                  }
                }

                break;
            }
          } while (listado != 5);

          break;

        case 2:
          try {
            // Busca la primera posición libre del array
            primeraLibre = -1;
            do {
              primeraLibre++;
            } while (!((album[primeraLibre].getCodigo()).equals("LIBRE")));
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nSe ha llegado al límite de la colección, borre algún disco para introducir otro nuevo.");

            break;
          }

          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");
          System.out.println("Por favor, introduzca los datos del disco.");

          System.out.print("Código: ");
          // Comprobar que no se repita el código
          while (flag) {
            flag = false;
            codigoIntroducido = scanner.nextLine();
            for (Disco c: album) {
              if (c.getCodigo().equals(codigoIntroducido)) {
                flag = true;
              }
            }
            if (flag) {
              System.out.println("El código ya existe, introduzca otro.");
              System.out.print("Código: ");
            }
          }
          album[primeraLibre].setCodigo(codigoIntroducido);
          flag = true;

          System.out.print("Autor: ");
          autorIntroducido = scanner.nextLine();
          album[primeraLibre].setAutor(autorIntroducido);

          System.out.print("Título: ");
          tituloIntroducido = scanner.nextLine();
          album[primeraLibre].setTitulo(tituloIntroducido);

          System.out.print("Género: ");
          generoIntroducido = scanner.nextLine();
          album[primeraLibre].setGenero(generoIntroducido);

          System.out.print("Duración: ");
          duracionIntroducida = scanner.nextInt();
          album[primeraLibre].setDuracion(duracionIntroducida);
          scanner.nextLine();

          break;

        case 3:
          System.out.println("\nMODIFICAR");
          System.out.println("===========");

          System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
          codigoIntroducido = scanner.nextLine();

          i = -1;
          do {
            i++;
          } while (!((album[i].getCodigo()).equals(codigoIntroducido)));

          System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

          System.out.println("Código: " + album[i].getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = scanner.nextLine();
          if (!codigoIntroducido.equals("")) {
            album[i].setCodigo(codigoIntroducido);
          }

          System.out.println("Autor: " + album[i].getAutor());
          System.out.print("Nuevo autor: ");
          autorIntroducido = scanner.nextLine();
          if (!autorIntroducido.equals("")) {
            album[i].setAutor(autorIntroducido);
          }

          System.out.println("Título: " + album[i].getTitulo());
          System.out.print("Nuevo título: ");
          tituloIntroducido = scanner.nextLine();
          if (!tituloIntroducido.equals("")) {
            album[i].setTitulo(tituloIntroducido);
          }

          System.out.println("Género: " + album[i].getGenero());
          System.out.print("Nuevo género: ");
          generoIntroducido = scanner.nextLine();
          if (!generoIntroducido.equals("")) {
            album[i].setGenero(generoIntroducido);
          }

          System.out.println("Duración: " + album[i].getDuracion());
          System.out.print("Duración: ");
          duracionIntroducidaString = scanner.nextLine();
          if (!duracionIntroducidaString.equals("")) {
            album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
          }

          break;

        case 4:
          System.out.println("\nBORRAR");
          System.out.println("======");

          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = scanner.nextLine();

          // Comprobar que exista el código del álbum a borrar
          try {
            i = -1;
            do {
              i++;
            } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
            album[i].setCodigo("LIBRE");
            System.out.println("Album borrado.");
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No existe ningún álbum con ese código");

            break;
          }

          break;

        default:

      } // switch
    } while (opcion != 5);
  }
}
