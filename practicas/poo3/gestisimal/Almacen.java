package practicas.poo3.gestisimal;

import java.util.ArrayList;

public class Almacen {
  private ArrayList<Articulo> articulos = new ArrayList<>();

  public void altaArticulo(String descripcion, double precioCompra, double precioVenta, int unidades) throws ExcepcionArticuloExistente, ExcepcionValorNegativo, ExcepcionDescripcionVacia {
    Articulo articulo = new Articulo(descripcion, precioCompra, precioVenta, unidades);
    if (articulos.contains(articulo)) {
      throw new ExcepcionArticuloExistente();
    } else {
      articulos.add(articulo);
    }
  }

  public void bajaArticulo(int codigo) throws ExcepcionArticuloNoExistente {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo() == codigo) {
        articulos.remove(i);
      } else {
        throw new ExcepcionArticuloNoExistente();
      }
    }
  }

  public void entradaMercancia(int codigo, int unidades) throws ExcepcionArticuloNoExistente, ExcepcionValorNegativo {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo() == codigo) {
        articulos.get(i).setUnidades(articulos.get(i).getUnidades() + unidades);
      } else {
        throw new ExcepcionArticuloNoExistente();
      }
    }
  }

  public void salidaMercancia(int codigo, int unidades) throws ExcepcionArticuloNoExistente, ExcepcionValorNegativo {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo() == codigo) {
        if ((articulos.get(i).getUnidades() - unidades) < 0) {
          throw new ExcepcionValorNegativo();
        } else {
          articulos.get(i).setUnidades(articulos.get(i).getUnidades() - unidades);
        }
      } else {
        throw new ExcepcionArticuloNoExistente();
      }
    }
  }

  public String getArticulo(int codigo) throws ExcepcionArticuloNoExistente {
    for (int i = 0; i < articulos.size(); i++) {
      if (articulos.get(i).getCodigo() == codigo) {
        return articulos.get(i).toString();
      } else {
        throw new ExcepcionArticuloNoExistente();
      }
    }
    return null;
  }
}
