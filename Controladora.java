
public class Controladora{
    public static void main(String[] args) {
        //Atributos
        boolean encendido = false; // Determina el estado de la radio, true (encendido) y false (apagado). 
        boolean tipoSenal = false; // (true: AM// false: FM)
        float AMactual;
        float FMactual;
        String[] emisorasGuardadas = new String[12];
        int numBoton;
        int numMenu;
        Vista miVista = new Vista();

        miVista.bienvenida();
        numMenu = miVista.menu();
        while (numMenu < 0 || numMenu > 7){
            miVista.errorMenu();
        }
        switch (numMenu) {
            case 1:
            miVista.encenderApagar();
            break;
            case 2:

            break;
            case 3:

            break;
            case 4:

            break;
            case 5:

            break;
            case 6:

            break;
        }

    }
}