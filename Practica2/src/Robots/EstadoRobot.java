package Robots;

import Hamburguesa.*;
import Menu.*;

/**
 * La Interfaz EstadoRobot define los métodos que deben ser implementados por los 
 * diferentes estados de un robot. Estos métodos corresponden a las acciones que 
 * el robot puede realizar y los cambios de estado que puede experimentar.
 */
public interface EstadoRobot {
    
    /**
     * Activa el robot, continuando sus actividades.
     */
    public void llamar();

    /**
     * Suspende el robot, deteniendo sus actividades.
     */
    public void suspender();

    /**
     * Hace que el robot comience a caminar.
     */
    public void caminar();

    /**
     * Permite al robot tomar la orden de un cliente.
     */
    public void tomarOrden(Menu[] listaMenus);

    /**
     * Inicia el proceso de cocinar un platillo.
     */
    public void cocinar();

    /**
     * Permite al robot servir un platillo a un cliente.
     */
    public void servir();

    /**
     * Imprime el estado actual del robot, proporcionando información sobre su 
     * actividad o estado de reposo.
     */
    public void imprimirEstado();
    
}
