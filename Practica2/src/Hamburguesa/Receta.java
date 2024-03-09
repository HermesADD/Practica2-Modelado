package Hamburguesa;

/**
 * Clase que muestra el proceso de elaboracion de Hamburguesa
 * @author Hermes
 * @author Steve
 * @author Emilio
 */

public abstract class Receta {

   /**
    * Metodo que realiza la preparacion de la hamburguesa
    */
   public void recetaPreparada(boolean tieneQueso){
      ponerPan();
      ponerMayonesa();
      ponerVegetales();
      ponerCarne();
      if(tieneQueso){
         ponerQueso();
      }
      ponerMostaza();
      ponerCatsup();
      System.out.println("Hamburguesa Lista!!!");
   }

   /**
    * Metodo que indica cuando le ponemos pan a la hamburguesa
    */
   public void ponerPan(){
      System.out.println("Poniendo el pan!");
   }

   /**
    * Metodo que indica cuando ponemos mayonesa
    */
   public void ponerMayonesa(){
      System.out.println("Poniendo Mayonesa!");
   }

   /**
    * Metodo que indica cuando ponemos mostaza
    */
   public void ponerMostaza(){
      System.out.println("Poniendo Mostaza!");
   }

   /**
    * Metodo abstracto que indica cuando ponemos carne depende el caso
    */
   public abstract void ponerCarne();

   /**
    * Metodo que indica cuando ponemos queso
    */
   public void ponerQueso(){
      System.out.println("Poniendo queso!!");
   }


   /**
    * Metodo que indica cuando ponemos vegetales
    */
   public void ponerVegetales(){
      System.out.println("Poniendo Vegetales!");
   }

   /**
    * Metodo que indica cuando ponemos catsup
    */
   public void ponerCatsup(){
      System.out.println("Poniendo catsup!");
   }

}
