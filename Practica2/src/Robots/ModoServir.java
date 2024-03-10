package Robots;

import Menu.*;

/**
 * Clase que implementa el estado servir de un robot.
 *
 * @author Hermes
 * @author Steve
 * @author Emilio 
 */
public class ModoServir implements EstadoRobot{

    // Referencia al robot que esta en estado caminar.
    private Robot robot;

    /**
     * Constructor para el estado caminar del robot.
     * 
     * @param robot El robot que va a caminar.
     */
    public ModoServir(Robot robot) {
        this.robot = robot;
    }

    /**
     * Impide que el robot atienda mientras sirve.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void atender() {
        System.out.println("El robot se encuentra en sirviendo, no puede atender.");
    }

    /**
     * Impide que el robot se suspenda mientras sirve.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void suspender() {
        System.out.println("El robot se encuentra en sirviendo, no se puede suspender.");
    }

    /**
     * Impide que el robot camine mientras sirve.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void caminar() {
        System.out.println("El robot se encuentra en sirviendo, no puede caminar.");
    }

    /**
     * Impide que el robot tome ordenes mientras sirve.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void tomarOrden(Menu[] listaMenus) {
        System.out.println("El robot se encuentra en sirviendo, no se pueden tomar ordenes.");
    }

    /**
     * Impide que el robot cocine mientras sirve.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot se encuentra en sirviendo, no puede cocinar.");
    }

    /**
     * Realiza la accion de servir del robot.
     * Este metodo imprime un mensaje indicando que el robot ha comenzado a servir.
     * Tras completar el servicio, cambia el estado del robot al modo suspender.
     */
    @Override
    public void servir() {
        System.out.println("El robot comienza a servir. \n " + "Se cambia al modo suspender.");
        robot.asignarEstado(robot.getModoSuspender());
    }

    /**
     * Imprime el estado actual del robot.
     * Indica que el robot esta en modo servir.
     */
    @Override
    public void imprimirEstado() {
        System.out.println("El robot se encuentra actualmente sirviendo.");
    }
    
}
