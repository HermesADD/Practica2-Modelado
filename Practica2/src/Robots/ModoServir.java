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
    public void llamar() {
        
        throw new UnsupportedOperationException("Unimplemented method 'activar'");
    }

    @Override
    public void suspender() {
        
        throw new UnsupportedOperationException("Unimplemented method 'suspender'");
    }

    @Override
    public void caminar() {
        
        throw new UnsupportedOperationException("Unimplemented method 'caminar'");
    }

    @Override
    public void tomarOrden(Menu[] listaMenus) {
        
        throw new UnsupportedOperationException("Unimplemented method 'tomarOrden'");
    }

    @Override
    public void cocinar() {
        
        throw new UnsupportedOperationException("Unimplemented method 'cocinar'");
    }

    @Override
    public void servir() {
        
        throw new UnsupportedOperationException("Unimplemented method 'servir'");
    }

    @Override
    public void imprimirEstado() {
        
        throw new UnsupportedOperationException("Unimplemented method 'imprimirEstado'");
    }
    
}
