package Menu;

import java.util.ArrayList;
import java.util.Iterator;
import Hamburguesa.*;

/**
 * Clase MenuDelDia
 * 
 * @author Hermes
 * @author Steve
 * @author Emilio
 */
public class MenuDelDia extends Menu{

   /**
    * Arraylist con las hamburguesas del menu
    */
   private ArrayList<Hamburguesa> hamburguesas = new ArrayList<>();

   /**
    * Cadena que representa el nombre del menu
    */
   private String nombre = "MENU DEL DIA!!!";

   /**
    * Cadena que representa la descripcion del menu
    */
   private String descripcion = "Nuestra eleccion especial para ti, cada dia tenemos algo diferente!!!";

   /**
    * Constructor del menu del dia
    */
   public MenuDelDia(){
      agregar(new Hamburguesa(21, "Hongos" , 120 , true, false, new Hongos()));
      agregar(new Hamburguesa(22, "Pollo", 135, false, true,new Pollo()));
      agregar(new Hamburguesa(23, "Doble", 140, false, true, new Doble()));
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
      hamburguesas.add(hamburguesa);
   }

   @Override
   public void imprimirMenu(){
      System.out.println("####" + getNombre() + "####"
         + "\n [" + getDescripcion() + "]");
   }

   @Override
   public Iterator getIterator(){
      return hamburguesas.iterator();
   }
   
}
