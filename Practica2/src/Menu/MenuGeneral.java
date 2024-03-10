package Menu;

import java.util.Iterator;

import Hamburguesa.*;

public class MenuGeneral extends Menu{

   /**
    * Entero que indica la cantidad maxima de hamburguesas
    */
   private static final int MAX_HAM = 3;

   /**
    * Entera que indica la cantidad de hamburguesas en el menu
    */
   private int numHamburguesas = 0;

   /**
    * Arreglo de hamburguesas
    */
   private Hamburguesa[] hamburguesas = new Hamburguesa[MAX_HAM];

   /**
    * Cadena que representa el nombre del menu
    */
   private String nombre = "MENU GENERAL";

   /**
    * Cadena que representa la descripcion del menu
    */
   private String descripcion = "Nuestras hamburguesas clasicas, servidas todos los dias del ano!!!";

   /**
    * Constructor del menu general
    */
   public MenuGeneral(){
      agregar(new Hamburguesa(11, "Cerdo", 130, false, true, new Cerdo()));
      agregar(new Hamburguesa(12, "Res", 135, false, true, new Res()));
      agregar(new Hamburguesa(13, "Vegetariana", 115, true, false, new Vegetariana()));
   }

   /**
    * Regresa el nombre del menu
    * @return nombre del menu
    */
   public String getNombre(){
      return nombre;
   }
   
   /**
    * Regresa la descripcion del menu
    * @return descripcion del menu
    */
   public String getDescripcion(){
      return descripcion;
   }

   @Override
   public void agregar(Hamburguesa hamburguesa){
      if(numHamburguesas >= MAX_HAM){
         System.err.println("No se puede agregar mas hamburguesas, arreglo lleno");
      }else{
         hamburguesas[numHamburguesas] = hamburguesa;
         numHamburguesas++;
      }
   }

   @Override
   public void imprimirMenu(){
      System.out.println("####" + getNombre() + "####"
         + "\n [" + getDescripcion() + "]");
   }

   @Override
   public Iterator getIterator(){
      return new IteradorArreglo(hamburguesas);
   }  
   
}