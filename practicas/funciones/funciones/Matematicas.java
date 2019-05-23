package practicas.funciones.funciones;

/**
 * Ejercicios 1-14
 *
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que puedes usar unas dentro de otras si es
 * necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la
 * función esCapicua resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de implementar teniendo esPrimo.
 *
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 5. digitos: Cuenta el número de dígitos de un número entero.
 * 6. voltea: Le da la vuelta a un número.
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 12. pegaPorDelante: Añade un dígito a un número por delante.
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
 * 14. juntaNumeros: Pega dos números para formar uno.
 */
public class Matematicas {
  
  /**
   * Comprueba si un número es capicúa
   * 
   * @param n número entero a comprobar
   * @return <code>true</code> si el número es capicúa
   * @return <code>false</code> si el número no es capicúa
   */
  public static boolean esCapicua (int n) {
    // Comprobar si es igual haciendo uso de la función voltea
    if (n == voltea(n)) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Comprueba si un número es primo
   * 
   * @param n número entero a comprobar
   * @return <code>true</code> si el número es primo
   * @return <code>false</code> si el número no es primo
   */
  public static boolean esPrimo (int n) {
    // Comprobar si es primo
    if (n < 2) {
      return false;
    }
    for (int i=2; n>i; i++) {
      if (n%i == 0) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * 
   * @param n número entero a comprobar
   * @return el menor primo mayor al parámetro
   */
  public static int siguientePrimo (int n) {
    // Usando la funcion esPrimo
    n++;
    while (!esPrimo(n)) {
      n++;
    }
    return n;
  }
  
  /**
   * Dada una base y un exponente devuelve la potencia.
   * 
   * @param b base de la potencia
   * @param e exponente de la potencia
   * @return potencia
   */
  public static int potencia (int b, int e) {
    int p = 1;
    for (int i=0; i<e; i++) {
      p = p*b;
    }
    return p;
  }
  
  /**
   * Cuenta el número de dígitos de un número entero.
   * 
   * @param n número entero
   * @return cantidad de digitos
   */
  public static int digitos (int n) {
    // Se pasa a cadena para contar los caracteres
    return String.valueOf(n).length();
  }
  
  /**
   * Le da la vuelta a un número.
   * 
   * @param n número entero
   * @return número entero volteado
   */
  public static int voltea (int n) {
    int resto;
    int invertido = 0;
    // Se van sacando dígitos en forma de decimales para ordenarlos de forma inversa
    while (n > 0) {
      resto = n%10;
      invertido = invertido*10+resto;
      n /= 10;
    }
    return invertido;
  }
  
  /**
   * Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param n número entero
   * @param x dígito a buscar
   * @return posición de x
   */
  public static int digitoN (int n, int x) {
    // Primero se voltea el número para después ir quitando digitos hasta llegar a la posición que se quiere
    n = voltea(n);
    n = quitaPorDetras(n,x-1);
    // Se obtiene el resto de dividir entre 10 para que de como resultado el número que se busca
    return n%10;
  }
  
  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
   * 
   * @param n número entero
   * @param x dígito a buscar
   * @return posición de x
   */
  public static int posicionDeDigito (int n, int x) {
    int i;
    // Usando el método digitoN se van comparando todos los números hasta que se encuentra x, quedando la posición de este guardada en i
    for (i = 1;(i < digitos(n)) && (digitoN(n,i) != x); i++);
    if (i == digitos(n)) {
      return -1;
    } else {
      return i;
    }
  }
  
  /**
   * Le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param n número entero
   * @param x número de dígitos a quitar por la derecha
   * @return el número entero con los dígitos quitados
   */
  public static int quitaPorDetras (int n, int x) {
    // Al ser n de tipo int y dividirlo entre 10 se van convirtiendo los dígitos que se quieren quitar en decimales y dejan de aparecer
    for (int i = x; i > 0; i--) {
      n /= 10;
    }
    return n;
  }
  
  /**
   * Le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param n número entero
   * @param x número de dígitos a quitar por la izquierda
   * @return el número entero con los dígitos quitados
   */
  public static int quitaPorDelante (int n, int x) {
    // Igual que quitaPorDetras solo que se voltea el número antes y después para que los números se quiten por la izquieda
    n = voltea(n);
    n = quitaPorDetras(n,x);
    return voltea(n);
  }
  
  /**
   * Añade un dígito a un número por detrás.
   * 
   * @param n número entero
   * @param x dígito a pegar por detrás
   * @return número con el dígito pegado
   */
  public static int pegaPorDetras (int n, int x) {
    // Se añaden al final de n tantos 0 como se necesiten para que los ocupe m al sumarlos
    for (int i = digitos(x); i > 0; i--) {
      n = n*10;
    }
    n = n+x;
    return n;
  }
  
  /**
   * Añade un dígito a un número por delante.
   * 
   * @param n número entero
   * @param x dígito a pegar por delante
   */
  public static int pegaPorDelante (int n, int x) {
    // Igual que pegaPorDetras solo que se voltea el número antes y después para que los números se añadan por la izquieda
    n = voltea(n);
    n = pegaPorDetras(n,x);
    return voltea(n);
  }
  
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param n número entero
   * @param i posición inicial
   * @param f posición final
   * @return trozo de número
   */
  public static int trozoDeNumero (int n, int i, int f) {
    n = quitaPorDelante(n,i-1);
    n = quitaPorDetras(n,digitos(n)-f+1);
    return n;
  }
  
  /**
   * Pega dos números para formar uno.
   * 
   * @param n número entero
   * @param m número entero
   * @return el primer número (n) con el segundo (m) pegado
   */
  public static int juntaNumeros (int n, int m) {
    // ?
    return pegaPorDetras(n,m);
  }
}
