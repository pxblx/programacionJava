package practicas.poo3.gestisimal;

import practicas.poo3.gestisimal.excepciones.ExcepcionArticuloExistente;
import practicas.poo3.gestisimal.excepciones.ExcepcionArticuloNoExistente;
import practicas.poo3.gestisimal.excepciones.ExcepcionDescripcionVacia;
import practicas.poo3.gestisimal.excepciones.ExcepcionValorNegativo;
import java.util.ArrayList;

/**
 * Almacen
 */
public class Almacen {
  private ArrayList<Articulo> almacen = new ArrayList<>();
  private String stringAlmacen;

  /**
   * Dar de alta un nuevo artículo
   *
   * @param descripcion descripción del artículo
   * @param precioCompra precio de compra del artículo
   * @param precioVenta precio de venta del artículo
   * @param unidades unidades disponibles del artículo
   * @throws ExcepcionArticuloExistente si el artículo que se introduce coincide en código o en descripción
   * @throws ExcepcionValorNegativo si se da un valor negativo o 0 a precioCompra, precioVenta y unidades
   * @throws ExcepcionDescripcionVacia si se da una descripción vacía
   */
  public void altaArticulo(String descripcion, double precioCompra, double precioVenta, int unidades) throws ExcepcionArticuloExistente, ExcepcionValorNegativo, ExcepcionDescripcionVacia {
    Articulo nuevoArticulo = new Articulo(descripcion, precioCompra, precioVenta, unidades);
    if (almacen.contains(nuevoArticulo)) {
      throw new ExcepcionArticuloExistente();
    } else {
      almacen.add(nuevoArticulo);
      Articulo.nextCodigo++;
    }
  }

  /**
   * Dar de baja un artículo
   *
   * @param codigo código del artículo
   * @throws ExcepcionArticuloNoExistente si el artículo no existe en el almacén
   */
  public void bajaArticulo(int codigo) throws ExcepcionArticuloNoExistente {
    for (int i = 0; i < almacen.size(); i++) {
      if (almacen.get(i).getCodigo() == codigo) {
        almacen.remove(i);
        return;
      }
    }
    throw new ExcepcionArticuloNoExistente();
  }

  /**
   * Entrada de mercancía (incrementar unidades del artículo)
   *
   * @param codigo código del artículo
   * @param unidades unidades del artículo a incrementar
   * @throws ExcepcionArticuloNoExistente si el artículo no existe en el almacén
   * @throws ExcepcionValorNegativo si las unidades del artículo pasan a negativas
   */
  public void entradaMercancia(int codigo, int unidades) throws ExcepcionArticuloNoExistente, ExcepcionValorNegativo {
    for (Articulo articulo : almacen) {
      if (articulo.getCodigo() == codigo) {
        articulo.setUnidades(articulo.getUnidades() + unidades);
        return;
      }
    }
    throw new ExcepcionArticuloNoExistente();
  }

  /**
   * Salida de mercancía (decrementar unidades del artículo)
   *
   * @param codigo código del artículo
   * @param unidades unidades del artículo a decrementar
   * @throws ExcepcionArticuloNoExistente si el artículo no existe en el almacén
   * @throws ExcepcionValorNegativo si las unidades del artículo pasan a negativas
   */
  public void salidaMercancia(int codigo, int unidades) throws ExcepcionArticuloNoExistente, ExcepcionValorNegativo {
    for (Articulo articulo : almacen) {
      if (articulo.getCodigo() == codigo) {
        if ((articulo.getUnidades() - unidades) < 0) {
          throw new ExcepcionValorNegativo();
        } else {
          articulo.setUnidades(articulo.getUnidades() - unidades);
          return;
        }
      }
    }
    throw new ExcepcionArticuloNoExistente();
  }

  /**
   * Obtener la representación en string de un artículo
   *
   * @param codigo código del artículo
   * @return artículo representado como string
   * @throws ExcepcionArticuloNoExistente si el artículo no existe en el almacén
   */
  public String getArticulo(int codigo) throws ExcepcionArticuloNoExistente {
    for (Articulo articulo : almacen) {
      if (articulo.getCodigo() == codigo) {
        return articulo.toString();
      }
    }
    throw new ExcepcionArticuloNoExistente();
  }

  /**
   * toString
   *
   * @return almacén representado como string (conjunto de strings de los artículos)
   */
  @Override
  public String toString() {
    if (!almacen.isEmpty()) {
      stringAlmacen = "";
      for (Articulo articulo : almacen) {
        stringAlmacen = (stringAlmacen + articulo + "\n\n");
      }
      return stringAlmacen;
    } else {
      return ("El almacén está vacío.\n\n");
    }
  }
}
