
import java.util.Scanner;
public class Vista{
    Scanner scan = new Scanner();

    public void bienvenida() {
        System.out.println("-------------Bienvenido a su radio---------------- ");
    }

    public int menu(){
        String tmpTexto = "";
        String salir = "";
        boolean isNumeric = false;
        int numMenu = 0;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un número del menú
            System.out.println("\n************************* Que desea realizar ************************************\n");
            System.out.println("1. Encender/apagar");
            System.out.println("2. Subir volumen");
            System.out.println("3. Bajar volumen");
            System.out.println("4. Modo Radio");
            System.out.println("5. Modo reproduccion");
            System.out.println("6. Modo telefono");
            System.out.println("7. Modo productividad");
            System.out.println("8. Salir");
                System.out.println("\n************ Porfavor eliga la opcion que desea ejecutar **********\n");
        }
        tmpTexto = scan.nextLine();
        //Se verifica que el número que dio el usuario fue valido
        isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
        if (isNumeric && !tmpTexto.isEmpty()){
            numMenu = Integer.parseInt(tmpTexto);
        }
        while (tmpTexto.isEmpty()||!isNumeric || numMenu < 0 || numMenu > 8) {
            System.out.println("  * Debe ingresar una opcion de menu mayor que 0" + " o menor que 8");
            tmpTexto = scan.nextLine();
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            numMenu = 0;
            if (isNumeric&&!tmpTexto.isEmpty()){
                numMenu = Integer.parseInt(tmpTexto);
            }
        }
        return numMenu;
    }

}
