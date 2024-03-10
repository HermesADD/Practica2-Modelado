package Menu;

import java.util.Iterator;
import java.util.Hashtable;
import Hamburguesa.*;
import Robots.AnsiColors;

/**
* Clase menu especial
*
* @author Hermes
* @author Steve
* @author Emilio
* 
*/
public class MenuEspecial extends Menu{

    /**
    * Hashtable con los platillos del menu
    */
    private Hashtable<Integer, Hamburguesa> hamburguesas = new Hashtable<>();

    /**
    * Entero que representa la llave de la hamburguesa proximo a guardar
    */
    private int llave = 0;

    /**
    * Cadena que representa el nombre del menu
    */
    private String nombre = "MENU ESPECIAL!!!";

    /**
    * Cadena que representa la descripcion del mene
    */
    private String descripcion = "Menu Especial, espero te guste!!!";

    /**
    * Constructor del menu especial
    */
    public MenuEspecial(){
        agregar(new Hamburguesa(31, "Salmon" , 165, false, true, new Salmon()));
        agregar(new Hamburguesa(32, "Monster", 150, false, true, new Monster()));
        agregar(new Hamburguesa(33, "Pastor", 150, false, true, new Pastor()));
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
        hamburguesas.put(llave, hamburguesa);
        llave++;
    }

    @Override
    public void imprimirMenu(){
        System.out.println(AnsiColors.YELLOW + "\n ##MENU ESPECIAL##" + AnsiColors.RESET
          + "\n [" + getDescripcion() + "]");
    }

    @Override
    public Iterator getIterator() {
        return hamburguesas.values().iterator();
    }
}

