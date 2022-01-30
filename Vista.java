/**
 * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria
 * FileName: Vista
 * Author:   Fabián Juárez , Sara Echeverria
 * Date:     30/01/2022
 * @author Fabian Juarez y Sara Echeverria
 */
import java.util.Scanner;
public class Vista{
    private Scanner scan;

    public void bienvenida() {
        System.out.println("-------------Bienvenido/bienvenida a su radio---------------- ");
    }

    public Vista(){
        scan = new Scanner(System.in);
    }

    public int menu(){
        String salir = "";
        int numMenu = 0;
        String tmpTexto = "";
        boolean isNumeric = false;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un número del menú
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
            //Se verifica que el número que dio el usuario fue valido
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
        System.out.println(" ------------ Gracias por utilizar nuestro programa ------------ \n");
        System.exit(0);
        scan.close();
    }
    public void errorMenu(){
        System.out.println("ERROR, ingresar una opcion de menu mayor que 0" + " o menor que 7");
    }
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
    public int menu1(){
        String salir = "";
        int numMenu1 = 0;
        String tmpTexto = "";
        boolean isNumeric = false;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un número del menú
            System.out.println("\n************************* Que desea realizar ************************************\n");
            System.out.println("1. Boton 1");
            System.out.println("2. Boton 2");
            System.out.println("3. Boton 3");
            System.out.println("4. Boton 4");
            System.out.println("5. Boton 5");
            System.out.println("6. Boton 6");
            System.out.println("7. Boton 7");
            System.out.println("7. Boton 7");
            System.out.println("8. Boton 8");
            System.out.println("9. Boton 9");
            System.out.println("10. Boton 10");
            System.out.println("11. Boton 11");
            System.out.println("12. Boton 12");
            System.out.println("\n************ Porfavor eliga la opcion que desea ejecutar **********\n");
            tmpTexto = scan.nextLine();
            //Se verifica que el número que dio el usuario fue valido
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            if (isNumeric && !tmpTexto.isEmpty()){
                numMenu1 = Integer.parseInt(tmpTexto);
                salir = "si";
            }
            while (tmpTexto.isEmpty()||!isNumeric || numMenu1 < 1 || numMenu1 > 12) {
                System.out.println("Error, ingresar una opcion de menu mayor que 0" + " o menor que 12");
                tmpTexto = scan.nextLine();
                isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
                numMenu1 = 0;
                if (isNumeric&&!tmpTexto.isEmpty()){
                    numMenu1 = Integer.parseInt(tmpTexto);
                    salir = "si";
                    }
                }
            }
        return numMenu1;
    }
}
