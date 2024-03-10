package Robots;
import Hamburguesa.*;
import Menu.*;

public class ModoCaminar implements EstadoRobot{

    /**
    * Robot referencia
    */
    private Robot robot;
        
    /**
     * Constructor Estado
     */
    public ModoCaminar(Robot robot){
        this.robot = robot;
    }

    @Override
    public void llamar(){
        System.out.println("Estoy caminando");
    }

    @Override
    public void caminar(){
        if (!robot.getMesaCliente()) {
            robot.reducirDistancia();
            System.out.println("Cada vez estoy mas cerca.");
        } else {
            System.out.println("He llegado.\n" +
                                "Cambiando a MODO ATENDER.");
            robot.asignarEstado(robot.getModoAtender());
        }
    }

    @Override
    public void tomarOrden(Menu[] listaMenus){
        System.out.println("Estoy caminando, no puedo tomar orden");
    }

    @Override
    public void cocinar(){
        System.out.println("Estoy caminando, no puedo cocinar");
    }

    @Override
    public void suspender(){
        System.out.println("Regresando a modo suspendido");
        robot.asignarEstado(robot.getModoSuspender());
    }

    @Override
    public void servir(){
        System.out.println("Estoy caminando, no puedo servir");
    }

    @Override
    public void imprimirEstado(){
        System.out.println("### MODO CAMINATA ###");
    }
    
}
