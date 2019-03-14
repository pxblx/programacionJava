package practicas.poo3.gestisimal;

public class Articulo {
  private static int contador = 1;
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int unidades;

  public Articulo(String descripcion, double precioCompra, double precioVenta, int unidades) throws ExcepcionDescripcionVacia, ExcepcionValorNegativo {
    this.codigo = contador;
    setDescripcion(descripcion);
    setPrecioCompra(precioCompra);
    setPrecioVenta(precioVenta);
    setUnidades(unidades);
    contador++;
  }

  public int getCodigo() {
    return codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }

  public int getUnidades() {
    return unidades;
  }

  public void setDescripcion(String descripcion) throws ExcepcionDescripcionVacia {
    if (descripcion == "" || descripcion == null) {
      throw new ExcepcionDescripcionVacia();
    } else {
      this.descripcion = descripcion;
    }
  }

  public void setPrecioCompra(double precioCompra) throws ExcepcionValorNegativo {
    if (precioCompra <= 0) {
      throw new ExcepcionValorNegativo();
    } else {
      this.precioCompra = precioCompra;
    }
  }

  public void setPrecioVenta(double precioVenta) throws ExcepcionValorNegativo {
    if (precioVenta <= 0) {
      throw new ExcepcionValorNegativo();
    } else {
      this.precioVenta = precioVenta;
    }
  }

  public void setUnidades(int unidades) throws ExcepcionValorNegativo {
    if (unidades < 0) {
      throw new ExcepcionValorNegativo();
    } else {
      this.unidades = unidades;
    }
  }

  @Override
  public String toString() {
    return ("Articulo\n" +
      "--------\n" +
      "Código: " + codigo + "\n" +
      "Descripción: " + descripcion + "\n" +
      "Precio de compra: " + precioCompra + "\n" +
      "Precio de venta: " + precioVenta + "\n" +
      "Unidades: " + unidades);
  }

  @Override
  public boolean equals(Object obj) {
    Articulo other = (Articulo) obj;
    if (this.codigo == other.codigo) {
      return true;
    } else {
      if (this.descripcion == other.descripcion) {
        return true;
      } else {
        return false;
      }
    }
  }
}
