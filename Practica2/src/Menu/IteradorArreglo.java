package Menu;

import java.util.Iterator;
/**
 * Clase Iterador para Menu
 * 
 * @author Hermes
 * @author Steve
 * @author Emilio
 */
public class IteradorArreglo implements Iterator{

   /**
    * Arreglo de menu o hamburguesas
    */
   private Object[] arreglo;

   /**
    * Indice del arreglo
    */
   private int indice = 0;

   /**
    * Constructor de iterador
    * @param arreglo Arreglo de menu
    */
   public IteradorArreglo(Object[] arreglo){
      this.arreglo = arreglo;
   }

   @Override 
   public Object next(){
      Object aux = arreglo[indice];
      indice++;
      return aux;
   }

   @Override 
   public boolean hasNext(){
      if (indice >= arreglo.length || arreglo[indice] == null) {
         return false;
     } else {
         return true;
     }
   }
}
