import java.util.Scanner;
public class Vista{
    private Scanner scan;

    public void bienvenida() {
        System.out.println("-------------Bienvenido a su radio---------------- ");
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
            System.out.println("\n************************* Que desea realizar ************************************\n");
            System.out.println("1. Encender/apagar el radio");
            System.out.println("2. Cambiar de AM a FM / FM a AM");
            System.out.println("3. Avanzar la emisora");
            System.out.println("4. Guardar Emisora");
            System.out.println("5. Seleccionar Emisora de algun boton");
            System.out.println("6. Apagar radio");
            System.out.println("7. Salir");
            System.out.println("\n************ Porfavor eliga la opcion que desea ejecutar **********\n");
            tmpTexto = scan.nextLine();
            //Se verifica que el número que dio el usuario fue valido
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            if (isNumeric && !tmpTexto.isEmpty()){
                numMenu = Integer.parseInt(tmpTexto);
                salir = "si";
            }
            while (tmpTexto.isEmpty()||!isNumeric || numMenu < 1 || numMenu > 7) {
                System.out.println("  * Debe ingresar una opcion de menu mayor que 0" + " o menor que 7");
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
        System.out.println(" ------------ Gracias por utilizar nuestro programa ------------ ");
        System.exit(0);
        scan.close();
    }
    public void errorMenu(){
        System.out.println("  * Debe ingresar una opcion de menu mayor que 0" + " o menor que 7");
    }
    public void encenderApagar(){
    }
}
