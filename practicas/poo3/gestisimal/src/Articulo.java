package practicas.poo3.gestisimal.src;

import practicas.poo3.gestisimal.src.excepciones.ExcepcionDescripcionVacia;
import practicas.poo3.gestisimal.src.excepciones.ExcepcionValorNegativo;

/**
 * Artículo
 */
public class Articulo {
  private static int nextCodigo = 100;
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int unidades;

  /**
   * Constructor
   *
   * @param descripcion descripción del artículo
   * @param precioCompra precio de compra del artículo
   * @param precioVenta precio de venta del artículo
   * @param unidades unidades disponibles del artículo
   * @throws ExcepcionDescripcionVacia si se da una descripción vacía
   * @throws ExcepcionValorNegativo si se da un valor negativo o 0 a precioCompra, precioVenta o unidades
   */
  public Articulo(String descripcion, double precioCompra, double precioVenta, int unidades) throws ExcepcionDescripcionVacia, ExcepcionValorNegativo {
    this.codigo = nextCodigo;
    setDescripcion(descripcion);
    setPrecioCompra(precioCompra);
    setPrecioVenta(precioVenta);
    setUnidades(unidades);
    nextCodigo();
  }

  /**
   * Incrementar la variable nextCodigo para asignarsela al código del siguiente artículo que se cree
   */
  private static void nextCodigo() {
    nextCodigo++;
  }

  /**
   * Obtener código del artículo
   *
   * @return código del artículo
   */
  public int getCodigo() {
    return this.codigo;
  }

  /**
   * Obtener descripción del artículo
   *
   * @return descripción del artículo
   */
  public String getDescripcion() {
    return this.descripcion;
  }

  /**
   * Obtener precio de compra del artículo
   *
   * @return precio de compra del artículo
   */
  public double getPrecioCompra() {
    return this.precioCompra;
  }

  /**
   * Obtener precio de venta del artículo
   *
   * @return precio de venta del artículo
   */
  public double getPrecioVenta() {
    return this.precioVenta;
  }

  /**
   * Obtener las unidades disponibles del artículo
   *
   * @return unidades del artículo
   */
  public int getUnidades() {
    return this.unidades;
  }

  /**
   * Establecer la descripción del artículo
   *
   * @param descripcion descripción del artículo
   * @throws ExcepcionDescripcionVacia si se da una descripción vacía
   */
  public void setDescripcion(String descripcion) throws ExcepcionDescripcionVacia {
    if (descripcion.isEmpty()) {
      throw new ExcepcionDescripcionVacia();
    }
    this.descripcion = descripcion;
  }

  /**
   * Establecer el precio de compra del artículo
   *
   * @param precioCompra precio de compra del artículo
   * @throws ExcepcionValorNegativo si se da un valor negativo o 0 a precioCompra
   */
  public void setPrecioCompra(double precioCompra) throws ExcepcionValorNegativo {
    if (precioCompra <= 0) {
      throw new ExcepcionValorNegativo();
    }
    this.precioCompra = precioCompra;
  }

  /**
   * Establecer el precio de venta del artículo
   *
   * @param precioVenta precio de venta del artículo
   * @throws ExcepcionValorNegativo si se da un valor negativo o 0 a precioVenta
   */
  public void setPrecioVenta(double precioVenta) throws ExcepcionValorNegativo {
    if (precioVenta <= 0) {
      throw new ExcepcionValorNegativo();
    }
    this.precioVenta = precioVenta;
  }

  /**
   * Establecer el número de unidades disponibles del artículo
   *
   * @param unidades unidades disponibles del artículo
   * @throws ExcepcionValorNegativo si se da un valor negativo a unidades
   */
  public void setUnidades(int unidades) throws ExcepcionValorNegativo {
    if (unidades < 0) {
      throw new ExcepcionValorNegativo();
    }
    this.unidades = unidades;
  }

  /**
   * toString
   *
   * @return artículo representado como string
   */
  @Override
  public String toString() {
    return ("Articulo\n" +
      "--------\n" +
      "Código: " + this.codigo + "\n" +
      "Descripción: " + this.descripcion + "\n" +
      "Precio de compra: " + this.precioCompra + "\n" +
      "Precio de venta: " + this.precioVenta + "\n" +
      "Unidades: " + this.unidades);
  }

  /**
   * equals
   *
   * @param o artículo con el que comparar
   * @return true si son iguales o false si son distintos
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Articulo articulo = (Articulo) o;
    if (codigo == articulo.codigo) {
      return true;
    } else {
      return false;
    }
  }
}
