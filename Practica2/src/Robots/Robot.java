package Robots;

public class Robot {

    private EstadoRobot estadoActual;
    
    private EstadoRobot modoActivar;
    private EstadoRobot modoSuspender;
    private EstadoRobot modoCaminar;
    private EstadoRobot modoCocinar;
    private EstadoRobot modoServir;

    public EstadoRobot getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoRobot nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }
    
    public EstadoRobot getModoActivar() {
        return this.modoActivar;
    }

    public EstadoRobot getModoSuspender() {
        return this.modoSuspender;
    }

    public EstadoRobot getModoCaminar() {
        return this.modoCaminar;
    }

    public EstadoRobot getModoCocinar() {
        return this.modoCocinar;
    }

    public EstadoRobot getModoServir() {
        return this.modoServir;
    }

}
