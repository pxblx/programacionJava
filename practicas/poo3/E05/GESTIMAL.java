package practicas.poo3.E05;
import java.util.ArrayList;
import java.util.Scanner;
public class GESTIMAL {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    ///variable que almacena la respuesta
    int respuesta=0;
    ///variables para inicializar los objetos
    int codigo=0;
    int precioc=0;
    int preciov=0;
    int stock=0;
    int indi=0;
    String desc="";
    ArrayList<Producto> lista=new ArrayList<Producto>();
    Scanner s = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);
    
    do {
      System.out.println(" 1. Listado \n 2. Alta \n 3. Baja \n 4. Modificacion \n 5. Entrada de mercancia \n 6. Salida de mercancia \n 7. Salir");
      respuesta= s.nextInt();
      
      if(respuesta==1) {
        for(int a=0;a<Producto.indicet; a++ ) {
          ;
          if(lista.get(a).getIndice()!=-1) {//esta condicion mas la manera en la que se comporta el metodo Borrar no se muestren los Productos "borrados"
            System.out.println(lista.get(a));
          }
        }
      }
      
      if(respuesta==2) {
        System.out.println("Introduzca un valor numerico entero que será el codigo del nuevo producto");
        codigo = s.nextInt();
        System.out.println("Introduzca un valor numerico entero que será el precio de compra en centimos");
        precioc=s.nextInt();
        System.out.println("Introduzca un valor numerico entero que será el precio de venta en centimos");
        preciov=s.nextInt();
        System.out.println("Introduzca el numero de existencias en stock");
        stock=s.nextInt();
        System.out.println("Introduzca una descripcion del producto");
        desc=ss.nextLine();
        lista.add( new Producto(codigo,precioc,preciov,stock,desc)); 
      }
      if(respuesta==3) {
        System.out.println("Introduzca el indice del objeto a borrar");
        int ind= s.nextInt();
        if(lista.get(ind).getIndice()!=-1) {
          lista.get(ind).Borrar();
        }else {
          System.out.println("Este producto ya ha sido borrado");
        }
        
      }
      /**
       * Esto se le puede meter una comprobacion para que si se mete el indice de un objeto que ya no existe
       * diga que ese objeto no existe
       */
    if(respuesta==4) {
      
      System.out.println("Quiere introducir un nuevo indice o continuar con el ultimo usado? \n1. Nuevo indice \n 2 Continuar con el ultimo usado(Si no ha usado ninguno anteriormente se usara el 0) \n Selecione numero 1 o 2");
      respuesta=s.nextInt();
      if (respuesta==1) {
        System.out.println("Introduzca el indice: ");
        indi=s.nextInt();        
      }
      if(lista.get(indi).getIndice()!=-1) {
        respuesta=0;
        for(;respuesta!=5;) {
          int valornum=0;
          String valorcar="";
          System.out.println("Valor quiere cambiar?: \n 1. Codigo \n 2. Precio de Compra \n 3. Precio de Venta \n 4. Descripcion \n 5.Salir");
          respuesta=s.nextInt();
          if(respuesta==1) {
            System.out.println("Introduzca el nuevo codigo: ");
            valornum=s.nextInt();
            lista.get(indi).setCodigo(valornum);
          }
          if(respuesta==2) {
            System.out.println("Introduzca el nuevo precio de compra: ");
            valornum=s.nextInt();
            lista.get(indi).setPrecioc(valornum);
          }
          if(respuesta==3) {
            System.out.println("Introduzca el nuevo precio de venta: ");
            valornum=s.nextInt();
            lista.get(indi).setPreciov(valornum);
          }
          if(respuesta==4) {
            System.out.println("Introduzca la nueva descripcion: ");
            valorcar=ss.nextLine();
            lista.get(indi).setDescripcion(valorcar);
          }
        
        }
        respuesta=0;
      }else {
        System.out.println("El producto fue borrado anteriormente no se puede acceder.");
      }
    }
    if(respuesta==5) {
      int cantidad=-1;
      System.out.println("Introduzca el indice del producto que entra");
      indi=s.nextInt();
      if(lista.get(indi).getIndice()!=-1) { 
        for(;cantidad<0;) {
          System.out.println("Introduzca la cantidad de producto que entra(numero positivo entero):");
          cantidad=s.nextInt();
        }
        lista.get(indi).Entrada(cantidad);
      }else {
        System.out.println("El producto fue borrado anteriormente, no se puede acceder.");
      }
    }
    if(respuesta==6) {
      int cantidadn=1;
      System.out.println("Introduzca el indice del producto que sale");
      indi=s.nextInt();
      if(lista.get(indi).getIndice()!=-1) { 
        for(;cantidadn>0&&(lista.get(indi).getStock()>=-(cantidadn));) {//aqui se asegura que el valor dado sea negativo y no mayor que el stock actual
          System.out.println("Introduzca la cantidad de producto que sale, no puede ser mayor que el stock actual.(numero negativo entero):");
          cantidadn=s.nextInt();
        }
        lista.get(indi).Entrada(cantidadn);
      }else {
        System.out.println("El producto fue borrado anteriormente, no se puede acceder");
      }
    }
    }while (respuesta !=7);
    
    
  }

}
