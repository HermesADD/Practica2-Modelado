package Robots;

import Menu.*;

/**
 * Clase que implementa el estado caminar de un robot.
 *
 * @author Hermes
 * @author Steve
 * @author Emilio 
 */
public class ModoCaminar implements EstadoRobot{

    // Referencia al robot que está en estado caminar.
    private Robot robot;

    /**
     * Constructor para el estado caminar del robot.
     * 
     * @param robot El robot que va a caminar.
     */
    public ModoCaminar(Robot robot) {
        this.robot = robot;
    }

    /**
     * Impide que el robot atienda mientras camina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void atender() {
        System.out.println("El robot se encuentra en camino a atenderlo.");
    }

    /**
     * Cambia el estado del robot a suspendido.
     * Se imprime un mensaje indicando que el robot se ha suspendido 
     * y se actualiza su estado.
     */
    @Override
    public void suspender() {
        System.out.println("El robot se ha suspendido.");
        this.robot.asignarEstado(this.robot.getModoSuspender());
    }

    /**
     * Realiza la acción de caminar del robot hacia el cliente.
     * Si el robot no ha llegado, reduce la distancia y muestra un mensaje.
     * Una vez que el robot llega, cambia su estado al modo atender.
     */
    @Override
    public void caminar(){
        if (!robot.getMesaCliente()) {
            robot.reducirDistancia();
            System.out.println("El robot se está acercando.");
        } else {
            System.out.println("El robot ha llegado.\n" +
                                "Se cambia al modo atender.");
            robot.asignarEstado(robot.getModoAtender());
        }
    }

    /**
     * Impide que el robot tome la orden mientras camina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void tomarOrden(Menu[] listaMenus) {
        System.out.println("El robot no se puede tomar la orden mientras camina.");
    }

    /**
     * Impide que el robot cocine mientras camina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot no se puede cocinar mientras camina.");
    }

    /**
     * Impide que el robot sirva mientras camina.
     * Imprime un mensaje indicando que la acción no es posible.
     */
    @Override
    public void servir() {
        System.out.println("El robot no tiene ninguna hamburguesa que servir.");
    }

    /**
     * Imprime el estado actual del robot.
     * Indica que el robot está en modo caminar.
     */
    @Override
    public void imprimirEstado() {
        System.out.println("El robot se encuentra actualmente caminando.");
    }

}

