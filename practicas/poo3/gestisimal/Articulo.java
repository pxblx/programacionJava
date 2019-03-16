package practicas.poo3.gestisimal;

public class Articulo {
  protected static int nextCodigo = 100;
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int unidades;

  public Articulo(String descripcion, double precioCompra, double precioVenta, int unidades) throws ExcepcionDescripcionVacia, ExcepcionValorNegativo {
    this.codigo = nextCodigo;
    setDescripcion(descripcion);
    setPrecioCompra(precioCompra);
    setPrecioVenta(precioVenta);
    setUnidades(unidades);
  }

  public int getCodigo() {
    return this.codigo;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public double getPrecioCompra() {
    return this.precioCompra;
  }

  public double getPrecioVenta() {
    return this.precioVenta;
  }

  public int getUnidades() {
    return this.unidades;
  }

  public void setDescripcion(String descripcion) throws ExcepcionDescripcionVacia {
    if (descripcion.isEmpty()) {
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
      "Código: " + this.codigo + "\n" +
      "Descripción: " + this.descripcion + "\n" +
      "Precio de compra: " + this.precioCompra + "\n" +
      "Precio de venta: " + this.precioVenta + "\n" +
      "Unidades: " + this.unidades);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Articulo && ((Articulo)obj).getCodigo() == this.codigo) {
      return true;
    } else {
      if (obj instanceof Articulo && ((Articulo)obj).getDescripcion().equals(this.descripcion)) {
        return true;
      } else {
        return false;
      }
    }
  }
}
