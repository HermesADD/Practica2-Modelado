package Menu;

import Hamburguesa.*;
import java.util.Iterator;

/**
 * Clase abstracta que simula un menu
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public abstract class Menu {

   /**
    * Agrega una hamburguesa al menu
    * @param hamburguesa Hamburguesa a agregar
    */
   public abstract void agregar(Hamburguesa hamburguesa);

   /**
    * Imprime el menu
    */
   public abstract void imprimirMenu();

   /**
    * Regresa un iterador para el menu
    * @return iterador para menu
    */
   public abstract Iterator getIterator();

}
