package Robots;

import Menu.*;

public class ModoAtender implements EstadoRobot { 
    /**
    * Robot referencia
    */
    private Robot robot;
        
    /**
     * Constructor Estado
     */
    public ModoAtender(Robot robot){
        this.robot = robot;
    }
    
    @Override
    public void llamar(){
        System.out.println("No necesitas llamarme, ya te estoy atendiendo.");
    }

    @Override
    public void caminar(){
        System.out.println("Estoy atendiendo, no puedo caminar");
    }

    @Override
    public void tomarOrden(Menu[] listaMenus){
        System.out.println("Te leere nuestro menu:");
        robot.leerMenu(listaMenus);
        robot.tomarOrden(listaMenus);
        System.out.println(" Pasando al " + AnsiColors.ORANGE + "MODO COCINAR" + AnsiColors.RESET);
        robot.asignarEstado(robot.getModoCocinar());
    }

    @Override
    public void cocinar(){
        System.out.println("Estoy atendiendo, no puedo cocinar");
    }

    @Override
    public void suspender(){
        System.out.println("Estoy atendiendo, no me puedo suspender");
    }

    @Override
    public void servir(){
        System.out.println("Estoy atendiendo, no puedo servir");
    }

    @Override
    public void imprimirEstado(){
        System.out.println(AnsiColors.GREEN + " # MODO ATENCION # " + AnsiColors.RESET);
    }

}
