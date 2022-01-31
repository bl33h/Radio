/**
 * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria
 * FileName: Vista
 * Author:   Fabian Juarez , Sara Echeverria
 * Date:     30/01/2022
 * @author Fabian Juarez y Sara Echeverria
 */
import java.util.Scanner;
public class Vista{
    private Scanner scan;

    public void bienvenida() {
        System.out.println("------------- Bienvenido/bienvenida a su radio ---------------- "); // Titulo
    }

    public Vista(){
        scan = new Scanner(System.in); // Scanner
    }

    public int menu(){ //Menu principal para que el usuario eliga la opcion a realizar
        String salir = "";
        int numMenu = 0;
        String tmpTexto = "";
        boolean isNumeric = false;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un numero del menu
            System.out.println("\n************************* Funciones de su radio ************************************\n");
            System.out.println("1. Encender/apagar el radio");
            System.out.println("2. Cambiar de AM a FM/FM a AM");
            System.out.println("3. Avanzar la emisora");
            System.out.println("4. Retroceder la emisora");
            System.out.println("5. Guardar emisora");
            System.out.println("6. Seleccionar emisora de algun boton");
            System.out.println("7. Salir");
            System.out.println("\n************ Por, favor elija la opcion que desea ejecutar **********\n");
            tmpTexto = scan.nextLine();

            // Se verifica que el numero que dio el usuario fue valido
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            if (isNumeric && !tmpTexto.isEmpty()){
                numMenu = Integer.parseInt(tmpTexto);
                salir = "si";
            }
            while (tmpTexto.isEmpty()||!isNumeric || numMenu < 1 || numMenu > 7) {
                System.out.println("ERROR, ingresar una opcion de menu mayor que 0" + " o menor que 7");
                tmpTexto = scan.nextLine();
                isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
                numMenu = 0;
                if (isNumeric&&!tmpTexto.isEmpty()){
                    numMenu = Integer.parseInt(tmpTexto);
                    salir = "si";
                    }
                }
            }
        return numMenu;
    }
    public void salir(){
        System.out.println(" ------------ Gracias por utilizar nuestro programa ------------ \n"); // Mensaje que se mostrara al cerrar el programa
        System.exit(0);
        scan.close();
    }
    public void errorMenu(){
        System.out.println("ERROR, ingresar una opcion de menu mayor que 0" + " o menor que 7"); // Mensaje de error
    }
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
}
