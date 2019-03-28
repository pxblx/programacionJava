package practicas.poo3.gestisimal.src;

import practicas.poo3.gestisimal.src.excepciones.ArticuloNoExistenteException;
import practicas.poo3.gestisimal.src.excepciones.DescripcionVaciaException;
import practicas.poo3.gestisimal.src.excepciones.ValorNegativoException;
import java.util.ArrayList;

/**
 * Almacen
 */
public class Almacen {
  private ArrayList<Articulo> almacen = new ArrayList<>();

  /**
   * Dar de alta un nuevo artículo
   *
   * @param descripcion descripción del artículo
   * @param precioCompra precio de compra del artículo
   * @param precioVenta precio de venta del artículo
   * @param unidades unidades disponibles del artículo
   * @throws ValorNegativoException si se da un valor negativo o 0 a precioCompra, precioVenta y unidades
   * @throws DescripcionVaciaException si se da una descripción vacía
   */
  public void altaArticulo(String descripcion, double precioCompra, double precioVenta, int unidades) throws ValorNegativoException, DescripcionVaciaException {
    almacen.add(new Articulo(descripcion, precioCompra, precioVenta, unidades));
  }

  /**
   * Obtener un artículo del almacén según su código
   *
   * @param codigo código del artículo
   * @return artículo
   * @throws ArticuloNoExistenteException si el artículo no existe en el almacén
   */
  public Articulo getArticulo(int codigo) throws ArticuloNoExistenteException {
    try {
      return almacen.get(almacen.indexOf(new Articulo(codigo)));
    } catch (IndexOutOfBoundsException e) {
      throw new ArticuloNoExistenteException("No existe ningún artículo con el código introducido.");
    }
  }

  /**
   * Dar de baja un artículo
   *
   * @param codigo código del artículo
   *
   */
  public void bajaArticulo(int codigo) throws ArticuloNoExistenteException {
    almacen.remove(getArticulo(codigo));
  }

  /**
   * Entrada de mercancía (incrementar unidades del artículo)
   *
   * @param codigo código del artículo
   * @param unidades unidades del artículo a incrementar
   * @throws ArticuloNoExistenteException si el artículo no existe en el almacén
   * @throws ValorNegativoException si las unidades del artículo pasan a negativas
   */
  public void entradaMercancia(int codigo, int unidades) throws ArticuloNoExistenteException, ValorNegativoException {
    if (unidades < 0) {
      throw new ValorNegativoException("El valor para las unidades no puede ser negativo.");
    }
    Articulo articulo = getArticulo(codigo);
    articulo.setUnidades(articulo.getUnidades() + unidades);
  }

  /**
   * Salida de mercancía (decrementar unidades del artículo)
   *
   * @param codigo código del artículo
   * @param unidades unidades del artículo a decrementar
   * @throws ArticuloNoExistenteException si el artículo no existe en el almacén
   * @throws ValorNegativoException si las unidades del artículo pasan a negativas
   */
  public void salidaMercancia(int codigo, int unidades) throws ArticuloNoExistenteException, ValorNegativoException {
    if (unidades < 0) {
      throw new ValorNegativoException("El valor para las unidades no puede ser negativo.");
    }
    Articulo articulo = getArticulo(codigo);
    articulo.setUnidades(articulo.getUnidades() - unidades);
  }

  /**
   * toString
   *
   * @return almacén representado como string (conjunto de strings de los artículos)
   */
  @Override
  public String toString() {
    if (almacen.isEmpty()) {
      return ("El almacén está vacío.\n\n");
    }
    return (almacen.toString() + "\n\n");
  }
}
