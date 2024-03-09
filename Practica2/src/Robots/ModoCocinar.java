package Robots;

import Menu.*;

/**
 * Clase que implementa el estado cocinar de un robot.
 *
 * @author Hermes
 * @author Steve
 * @author Emilio 
 */
public class ModoCocinar implements EstadoRobot{

    // Referencia al robot que está en estado cocinar.
    private Robot robot;

    /**
     * Constructor para el estado cocinar del robot.
     * 
     * @param robot El robot que va a cocinar.
     */
    public ModoCocinar(Robot robot){
        this.robot = robot;
    }

    /**
     * Impide que el robot atienda mientras cocina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void atender() {
        System.out.println("El robot se encuentra en cocinando, no puede atender.");
    }

    /**
     * Impide que el robot se suspenda mientras cocina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void suspender() {
        System.out.println("El robot se encuentra en cocinando, no se puede suspender.");
    }

    /**
     * Impide que el robot camine mientras cocina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void caminar() {
        System.out.println("El robot se encuentra en cocinando, no puede caminar.");
    }

    /**
     * Impide que el robot tome órdenes mientras cocina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void tomarOrden(Menu[] listaMenus) {
        System.out.println("El robot se encuentra en cocinando una orden, no puede tomar una nueva orden.");
    }

    /**
     * Realiza la acción de cocinar del robot.
     * Inicia el proceso de preparación de la hamburguesa, 
     * una vez finalizado, se cambia el estado a servir.
     */
    @Override
    public void cocinar() {
        // Indica el inicio del proceso de cocinar
        System.out.println("El robot comienza a cocinar.");
        
        // Llama al método para preparar la hamburguesa
        robot.prepararHamburguesa();
        
        // Indica que el proceso de cocinar termino y cambia a servir
        System.out.println("Se cambia al modo servir.");
        robot.asignarEstado(robot.getModoServir());
    }

    /**
     * Impide que el robot sirva mientras cocina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void servir() {
        System.out.println("El robot se encuentra en cocinando la orden, no puede servirla aún.");
    }

    /**
     * Imprime el estado actual del robot.
     * Indica que el robot está en modo cocinar.
     */
    @Override
    public void imprimirEstado() {
        System.out.println("El robot se encuentra actualmente cocinando.");
    }

}
