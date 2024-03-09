package Robots;

import Menu.Menu;

/**
 * Clase que implementa el estado activo de un robot.
 * En este estado, el robot está activo para realizar acciones.
 *
 * @author Hermes
 * @author Steve
 * @author Emilio 
 */
public class ModoAtender implements EstadoRobot{

    // Referencia al robot que está en estado activo.
    private Robot robot;

    /**
     * Constructor para el estado atender del robot.
     * 
     * @param robot El robot que se va a atender.
     */
    public ModoAtender(Robot robot) {
        this.robot = robot;
    }

    /**
     * Mantiene al robot en su estado atender.
     * Imprime un mensaje indicando que el robot ya está atendiendo.
     */
    @Override
    public void atender() {
        System.out.println("El robot ya se encuentra atendiendo.");
    }

    /**
     * Impide que el robot se suspenda mientras se atiende.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void suspender() {
        System.out.println("El robot no se puede suspender mientras atiende.");
    }

    /**
     * Impide que el robot camine mientras se atiende.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void caminar() {
        System.out.println("El robot no puede caminar mientras atiende.");
    }

    /**
     * Toma la orden de un cliente mostrando primero el menú y luego 
     * cambiando al estado cocinar.
     * 
     * @param listaMenus Arreglo que contiene los menús disponibles 
     * para mostrar al cliente.
     */
    @Override
    public void tomarOrden(Menu[] listaMenus) {
        // Muestra el menú al cliente
        System.out.println("El robot muestra el menu");
        robot.leerMenu(listaMenus);
        
        // Toma la orden del cliente
        robot.tomarOrden(listaMenus);
        
        // Cambia el estado del robot a modo Cocinar
        System.out.println("El robot cambia a modo Cocinar");
        robot.asignarEstado(robot.getModoCocinar());
    }

    /**
     * Impide que el robot cocine mientras atiende.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot no se puede cocinar mientras atiende.");
    }

    /**
     * Impide que el robot sirva mientras atiende.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void servir() {
        System.out.println("El robot no se puede servir mientras atiende.");
    }

    /**
     * Imprime el estado actual del robot.
     * Indica que el robot está en modo atender.
     */
    @Override
    public void imprimirEstado() {
        System.out.println("El robot se encuentra actualmente atendiendo.");
    }
    
}
