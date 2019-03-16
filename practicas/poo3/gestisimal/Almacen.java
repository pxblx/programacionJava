package practicas.poo3.gestisimal;

import java.util.ArrayList;

public class Almacen {
  private ArrayList<Articulo> almacen = new ArrayList<>();
  private String stringAlmacen;

  public void altaArticulo(String descripcion, double precioCompra, double precioVenta, int unidades) throws ExcepcionArticuloExistente, ExcepcionValorNegativo, ExcepcionDescripcionVacia {
    Articulo nuevoArticulo = new Articulo(descripcion, precioCompra, precioVenta, unidades);
    if (almacen.contains(nuevoArticulo)) {
      throw new ExcepcionArticuloExistente();
    } else {
      almacen.add(nuevoArticulo);
      Articulo.nextCodigo++;
    }
  }

  public void bajaArticulo(int codigo) throws ExcepcionArticuloNoExistente {
    for (int i = 0; i < almacen.size(); i++) {
      if (almacen.get(i).getCodigo() == codigo) {
        almacen.remove(i);
        return;
      }
    }
    throw new ExcepcionArticuloNoExistente();
  }

  public void entradaMercancia(int codigo, int unidades) throws ExcepcionArticuloNoExistente, ExcepcionValorNegativo {
    for (Articulo articulo : almacen) {
      if (articulo.getCodigo() == codigo) {
        articulo.setUnidades(articulo.getUnidades() + unidades);
        return;
      }
    }
    throw new ExcepcionArticuloNoExistente();
  }

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

  public String getArticulo(int codigo) throws ExcepcionArticuloNoExistente {
    for (Articulo articulo : almacen) {
      if (articulo.getCodigo() == codigo) {
        return articulo.toString();
      }
    }
    throw new ExcepcionArticuloNoExistente();
  }

  public String getArticulos() {
    stringAlmacen = "";
    for (Articulo articulo : almacen) {
      stringAlmacen = (stringAlmacen + articulo.toString() + "\n\n");
    }
    return stringAlmacen;
  }
}
