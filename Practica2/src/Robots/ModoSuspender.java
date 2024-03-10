package Robots;

import Menu.*;

/**
 * Clase que implementa el estado suspendido de un robot.
 * En este estado, el robot esta inactivo y espera ser activado.
 */
public class ModoSuspender implements EstadoRobot{

    // Referencia al robot que esta en estado suspendido.
    private Robot robot;

    /**
     * Constructor para el estado suspendido del robot.
     * 
     * @param robot El robot que se va a suspender.
     */
    public ModoSuspender(Robot robot){
        this.robot = robot;
    }

    /**
     * Activa el robot desde su estado suspendido.
     * Se imprime un mensaje indicando que el robot se ha activado 
     * y se actualiza su estado.
     */
    @Override
    public void atender() {
        System.out.println("El robot ha activado. \n " + "Se cambia al modo caminar.");
        this.robot.asignarEstado(this.robot.getModoAtender());
    }

    /**
     * Mantiene al robot en su estado suspendido.
     * Imprime un mensaje indicando que el robot ya esta suspendido.
     */
    @Override
    public void suspender() {
        System.out.println("El robot ya se encuentra suspendido.");
    }

    /**
     * Impide que el robot camine mientras esta suspendido.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void caminar() {
        System.out.println("El robot no puede caminar mientras se encuentra suspendido.");
    }

    /**
     * Impide que el robot tome ordenes mientras esta suspendido.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void tomarOrden(Menu[] listaMenus) {
        System.out.println("El robot no puede tomar ordenes mientras se encuentra suspendido.");
    }

    /**
     * Impide que el robot cocine mientras esta suspendido.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot no puede cocinar mientras se encuentra suspendido.");
    }

    /**
     * Impide que el robot sirva mientras esta suspendido.
     * Imprime un mensaje indicando que la accion no es posible.
     */
    @Override
    public void servir() {
        System.out.println("El robot no puede servir mientras se encuentra suspendido.");
    }

    /**
     * Imprime el estado actual del robot.
     * Indica que el robot esta suspendido.
     */
    @Override
    public void imprimirEstado() {
        System.out.println("El robot se encuentra actualmente suspendido.");
    }
    
}
