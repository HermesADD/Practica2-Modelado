package Robots;
import Hamburguesa.*;
import Menu.*;

public class ModoCocinar implements EstadoRobot{

    /**
    * Robot referencia
    */
    private Robot robot;
        
    /**
     * Constructor Estado
     */
    public ModoCocinar(Robot robot){
        this.robot = robot;
    }

    @Override
    public void llamar(){
        System.out.println("Estoy cocinando, no me llames");
    }

    @Override
    public void caminar(){
        System.out.println("Estoy cocinando, no puedo caminar");
    }

    @Override
    public void tomarOrden(Menu[] listaMenus){
        System.out.println("Estoy cocinando, no puedo tomar orden");
    }

    @Override
    public void cocinar(){
        System.out.println("Es hora de cocinar.");
        robot.prepararHamburguesa();
        System.out.println("Cambiando a modo SERVIR.");
        robot.asignarEstado(robot.getModoServir());
    }

    @Override
    public void suspender(){
        System.out.println("Estoy cocinando, no me puedo suspender");
    }

    @Override
    public void servir(){
        System.out.println("Estoy cocinando, no puedo servir.");
    }

    @Override
    public void imprimirEstado(){
        System.out.println(AnsiColors.ORANGE + " # MODO COCINAR # " + AnsiColors.RESET);
    }
    
}
