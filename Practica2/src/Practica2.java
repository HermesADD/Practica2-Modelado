import java.util.Scanner;

import Menu.Menu;
import Menu.MenuDelDia;
import Menu.MenuEspecial;
import Menu.MenuGeneral;
import Robots.Robot;

public class Practica2 {

    /**
     * Operacion principal del programa.
     *
     * @param args Argumentos en la linea de comandos
     *
     */
    public static void main(String[] args) {

        Menu[] listaMenus = {new MenuGeneral(), new MenuDelDia(), new MenuEspecial()};

        Robot robot = new Robot();

        Scanner scn = new Scanner(System.in);
        int opcion;

        System.out.println("Bienvenido a McBurguesas, te presento a Robotsin,nuestro primer robot cocinero-mesero" +
                            "\nPor favor, indique que accion quiere que nuestro empleado estrella realice.");
        robot.imprimeEstado();

        do {
            System.out.println("\n1. Llamar al Robot\n" +
                                "2. Caminar\n" +
                                "3. Ordenar\n" +
                                "4. Cocinar\n" +
                                "5. Servir platillo\n" +
                                "6. Suspender\n" +
                                "0. Salir del restaurante\n");

            while (true) {
                try {
                    String opcionUsuario = scn.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                } catch(NumberFormatException e) {
                    System.out.println("\nOpcion invalida\n" +
                                        "1. Llamar al Robot\n" +
                                        "2. Caminar\n" +
                                        "3. Ordenar\n" +
                                        "4. Cocinar\n" +
                                        "5. Servir platillo\n" +
                                        "6. Suspender\n" +
                                        "0. Salir del restaurante\n");
                }
            }
            switch (opcion) {
                case 1:
                    robot.llamar();
                    break;
                case 2:
                    robot.caminar();
                    break;
                case 3:
                    robot.ordenar(listaMenus);
                    break;
                case 4:
                    robot.cocinar();
                    break;
                case 5:
                    robot.servir();
                    break;
                case 6:
                    robot.suspender();
                    break;
                case 0:
                    System.out.println("Vuelve pronto!!!");
                    break;
                default:
                    System.out.println("\nOpcion invalida");
            }
        } while (opcion != 0);

    }

}