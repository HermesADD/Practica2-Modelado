package Robots;
import java.util.*;

import Hamburguesa.*;
import Menu.*;

/**
 * Clase que simula al robot 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class Robot {
  
    /**
     * Cliente referencia
     */
    private Cliente cliente;

    /**
     * Orden a realizar
     */
    private Hamburguesa orden;

    /**
     * Booleano que indica si el robot esta en la mesa del cliente
     */
    private boolean mesaC;

    /**
     * Estado actual del robot
     */
    private EstadoRobot estadoActual;

    /**
     * Estado suspender
     */
    private EstadoRobot modoSuspender;

    /**
      * Estado caminar
      */
    private EstadoRobot modoCaminar;

    /**
     * Estado atender
     */
    private EstadoRobot modoAtender;

    /**
     * Estado cocinar
     */
    private EstadoRobot modoCocinar;

      /** 
       * Estado servir 
       */
      private EstadoRobot modoServir;
    
    /**
     * Constructor Robot
     */
    public Robot(){
      modoSuspender = new ModoSuspender(this);
      modoCaminar = new ModoCaminar(this);
      modoAtender = new ModoAtender(this);
      modoCocinar = new ModoCocinar(this);
      modoServir = new ModoServir(this);

      estadoActual = modoSuspender;
    }

    /**
    * Reduce la distancia entre el Robot y la mesa del cliente a atender
    */
    public void reducirDistancia() {
      cliente.setDistancia(cliente.getDistancia() - 1);
   }

    /**
    * Indica que un cliente ha llamado al Robot
    */
    public void llamar(){
        imprimeEstado();
        estadoActual.llamar();
    }

    /**
    * Hace que el Robot camine
    */
    public void caminar(){
        imprimeEstado();
        estadoActual.caminar();
    }

    /**
    * El Robot recibe la orden del cliente
    */
    public void ordenar(Menu[] listaMenus){
      imprimeEstado();
      estadoActual.tomarOrden(listaMenus);
    }

    /**
    * El Robot cocina la orden del cliente
    */
    public void cocinar(){
        imprimeEstado();
        estadoActual.cocinar();
    }

    /**
    * El Robot se suspende
    */
    public void suspender(){
        imprimeEstado();
        estadoActual.suspender();
    }

    /**
    * El Robot sirve la orden al cliente
    */
    public void servir(){
        imprimeEstado();
        estadoActual.servir();
    }

    /**
    * Devuelve el cliente a atender
    *
    * @return Cliente que se atendera
    */
    public Cliente getCliente(){
        return cliente;
    }

    /**
    * Devuelve la orden recibida por el cliente
    *
    * @return Orden del cliente
    */
    public Hamburguesa getOrden() {
        return orden;
    }

    /**
    * Indica si el robot se encuentra en la mesa del cliente
    *
    * @return   true    -   si esta en la mesa del cliente
    *           false   -   si no esta en la mesa del cliente
    */
    public boolean getMesaCliente() {
        if (cliente.getDistancia() > 0) {
            return mesaC;
        } else {
            mesaC = true;
            return mesaC;
        }
    }

    /**
    * Asigna un nuevo cliente al robot, en caso de no haber uno o ya haber atendido a otro.
    */
    public void nuevoCliente(){
        cliente = new Cliente();
        mesaC = false;
    }

    /**
    * El Robot lee un menu dado
    *
    * @param listaMenus Lista de los menus que se leeran
    */
    public void leerMenu(Menu[] listaMenus) {
        Iterator iterador = new IteradorArreglo(listaMenus);
        Menu menu;
        Iterator iteradorIndividual;
        while (iterador.hasNext()) {
            menu = (Menu) iterador.next();
            menu.imprimirMenu();
            iteradorIndividual = menu.getIterator();
            Hamburguesa hamburguesa;
            while(iteradorIndividual.hasNext()){
                hamburguesa = (Hamburguesa) iteradorIndividual.next();
                hamburguesa.imprimir();
            }
        }
    }

    /**
    * Valida que el ID recibido pertenezca a una hamburguesa existente, en caso de
    * que si exista, se guardan como la orden a preparar
    *
    * @param id ID de la hamburguesa que se quiere buscar
    * @param listaMenus Lista de los menus en los que se buscara el id
    *
    * @return   true    -   si existe el ID
    *           false   -   si ningun platillo tiene ese ID
    */
    public boolean validarID(int id, Menu[] listaMenus){
        Iterator iterador = new IteradorArreglo(listaMenus);
        Menu menu;
        Iterator iteradorIndividual;
        while (iterador.hasNext()) {
            menu = (Menu) iterador.next();
            iteradorIndividual = menu.getIterator();
            Hamburguesa hamburguesa;
            while(iteradorIndividual.hasNext()){
                hamburguesa = (Hamburguesa) iteradorIndividual.next();
                if (hamburguesa.getID() == id) {
                    orden = hamburguesa;
                    return true;
                }
            }
        }
        System.out.println("ID invalido");
        return false;
    }

    /**
    * El Robot toma la orden del cliente, verificando que sea una id valido
    *
    * @param listaMenus Lista de menus entre los que se puede tomar una orden
    */
    public void tomarOrden(Menu[] listaMenus) {
        Scanner scn = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingresa el ID de la hamburguesa que deseas ordenar");

            while (true) {
                try {
                    String opcionUsuario = scn.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch(NumberFormatException e) {
                    System.out.println("ID invalido\n" +
                    "Ingresa el ID de la hamburguesa que deseas ordenar");
                }
            }
        } while (!validarID(opcion, listaMenus));
    }

    /**
    * El Robot prepara la hamburgue del cliente
    */
    public void prepararHamburguesa() {
        orden.prepararHamburguesa();
        orden = null;
    }

    /**
    * Devuelve el estado actual del Robot
    *
    * @return Estado actual del Robot
    */
    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    /**
    * Devuelve el estado de suspension del Robot
    *
    * @return Estado de suspension del Robot
    */
    public EstadoRobot getModoSuspender() {
        return modoSuspender;
    }

    /**
    * Devuelve el estado de caminar del Robot
    *
    * @return Estado de caminar del Robot
    */
    public EstadoRobot getModoCaminar() {
        return modoCaminar;
    }

    /**
    * Devuelve el estado de atencion al cliente del Robot
    *
    * @return Estado de atencion del Robot
    */
    public EstadoRobot getModoAtender() {
        return modoAtender;
    }

    /**
    * Devuelve el estado de cocinar del Robot
    *
    * @return Estado de cocinar del Robot
    */
    public EstadoRobot getModoCocinar() {
        return modoCocinar;
    }

    /**
    * Devuelve el estado de servir del Robot
    *
    * @return Estado de servir del Robot
    */
    public EstadoRobot getModoServir() {
        return modoServir;
    }

    /**
    * Actualiza el estado actual del Robot a uno dado
    *
    * @param nuevoEstado Nuevo estado actual del Robot
    */
    public void asignarEstado(EstadoRobot nuevoEstado) {
        estadoActual = nuevoEstado;
    }

    /**
    * Imprime el estado actual del robot
    */
    public void imprimeEstado(){
        estadoActual.imprimirEstado();
    }

}
