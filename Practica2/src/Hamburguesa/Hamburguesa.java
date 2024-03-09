package Hamburguesa;

/**
* Clase que simula un platillo del menú
*
* @author Hermes
* @author Steve
* @author Emilio
*
*/

public class Hamburguesa {

   /**
    * Atributo que muestra el proceso de preparacion
    */
   private Receta receta;

   /**
    * Entero que representa el id de la hamburguesa
    */
   private int id;

   /**
    * Cadena que representa el nombre de la hamburguesa
    */
   private String nombre;

   /**
    * Double que representa el precio de la hamburguesa
    */
   private double precio;

   /**
    * Boolean que indica si la hamburguesa es vegetariana
    */
   private boolean esVegetariana;
   
   /**
    * Boolean que indica si la hamburguesa lleva queso 
    */
   private boolean tieneQueso;

   /**
    * Constructor de la hamburguesa
    * 
    * @param id ID de la hamburguesa
    * @param nombre Nombre de la hamburguesa
    * @param precio Precio de la hamburguesa
    * @param esVegetariana Indica si la hamburguesa es vegana
    * @param tieneQueso Indica si la hamburguesa tiene queso
    * @param receta Indica que tipo de hamburguesa es
    */
   public Hamburguesa(int id, String nombre, double precio, boolean esVegetariana, boolean tieneQueso, Receta receta){
      this.id = id;
      this.nombre = nombre;
      this.precio = precio;
      this.esVegetariana = esVegetariana; 
      this.tieneQueso = tieneQueso;
      this.receta = receta;
   }

   /**
    * Devuelve el ID de la hamburguesa 
    * @return ID de la hamburguesa
    */
   public int getID(){
      return id;
   }

   /**
    * Devuelve el nombre de la hamburguesa
    *
    * @return Nombre de la hamburguesa
    */
   public String getNombre(){
      return nombre;
   }

   /** Devuelve el precio de la hamburguesa
    *
    * @return Precio de la hamburguesa
    */
   public double getPrecio(){
      return precio;
    }

   /**
    * Indica si la hamburguesa es vegetariano
    *
    * @return   true    -   si es vegetariano
    *           false   -   si no es vegetariano
    */
   public boolean esVegetariano(){
      return esVegetariana;
   }
   
   /**
    * Indica si la hamburguesa tiene queso
    * @return true - si tiene queso
    *         false - no tiene queso
    */
   public boolean tieneQueso(){
      return tieneQueso;
   }

    /**
    * Muestra el proceso de preparacion de la hamburguesa segun su receta
    */
   public void prepararHamburguesa(){
      receta.recetaPreparada(tieneQueso());
   }

   public void imprimir(){
      String info = "ID: " + getID() 
      + "\n Nombre: " + getNombre()
      + "\n Precio: " + getPrecio();
      if(esVegetariano()){
         info += "\n (Vegetariana)";
      }
      System.out.println(info);
   }

}
