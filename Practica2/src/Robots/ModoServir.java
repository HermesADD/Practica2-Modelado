package Robots;
import Hamburguesa.*;
import Menu.*;

public class ModoServir implements EstadoRobot{

    /**
    * Robot referencia
    */
    private Robot robot;
        
    /**
     * Constructor Estado
     */
    public ModoServir(Robot robot){
        this.robot = robot;
    }

    @Override
    public void llamar(){
        System.out.println("Estoy sirviendo");
    }
    @Override
    public void caminar(){
        System.out.println("Estoy sirviendo");
    }

    @Override
    public void tomarOrden(Menu[] listaMenus){
        System.out.println("Estoy sirviendo");
    }

    @Override
    public void cocinar(){
        System.out.println("Estoy sirviendo");
    }

    @Override
    public void suspender(){
        System.out.println("Estoy sirviendo, no me puedo suspender");
    }

    @Override
    public void servir(){
        System.out.println("Aqui esta tu platillo. Buen provecho!" +
                            "\nEntrando en MODO SUSPENDIDO");
        robot.asignarEstado(robot.getModoSuspender());
    }

    @Override
    public void imprimirEstado(){
        System.out.println("### MODO SERVIR ###");
    }
    
}
