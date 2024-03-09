package Robots;

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
    public void atender() {
        
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
