package Robots;
import Hamburguesa.*;
import Menu.*;

public class ModoSuspender implements EstadoRobot{

    /**
    * Robot referencia
    */
    private Robot robot;
        
    /**
     * Constructor Estado
     */
    public ModoSuspender(Robot robot){
        this.robot = robot;
    }

    @Override
    public void llamar() {
        robot.nuevoCliente();
        System.out.println("He sido activado!!"
            + "\n Entrando al " + AnsiColors.PURPLE + "MODO CAMINATA" + AnsiColors.RESET);
        robot.asignarEstado(robot.getModoCaminar());
    }

    @Override
    public void caminar() {
        System.out.println("Aun no puedo moverme, estoy suspendido");
    }

    @Override
    public void tomarOrden(Menu[] listaMenus) {
        System.out.println("Aun no puedo tomar la orden, estoy suspendido");
    }

    @Override
    public void cocinar() {
        System.out.println("Aun no puedo cocinar, estoy suspendido");
    }

    @Override
    public void suspender() {
        System.out.println("Ya estoy suspendido");
    }


    @Override
    public void servir() {
        System.out.println("Aun no puedo servir, estoy suspendido");
    }

    @Override
    public void imprimirEstado() {
        System.out.println(AnsiColors.RED + " # MODO SUSPENDIDO # " + AnsiColors.RESET);
    }
    
}
