package Robots;
/**
 * Clase que simula un cliente  
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */

public class Cliente {
  /**
   * Entero que indica la distancia entre el cliente y el robot
   */
  int distancia;

  /**
   * Constructor Cliente
   */
  public Cliente(){
    distancia = 2;
  }

  /**
   * Devuelve la distancia entre el cliente y el robot
   * @return Distancia entre el cliente y el robot
   */
  public int getDistancia(){
    return distancia;
  }

  /**
   * Actualiza la distancia por una nueva
   * @param distancia nueva distancia 
   */
  public void setDistancia(int distancia){
    this.distancia = distancia;
  }


  
}
