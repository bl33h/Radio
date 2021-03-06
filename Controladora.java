/**
 * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria
 * FileName: Controladora
 * Author:   Fabián Juárez , Sara Echeverria
 * Date:     30/01/2022
 * @author Fabian Juarez y Sara Echeverria
 */
public class Controladora{
    public static void main(String[] args) {
        //Atributos
        boolean encendido; // Determina el estado de la radio, true (encendido) y false (apagado).
        boolean tipoSenal; // (true: AM// false: FM)
        float AMactual;
        float FMactual;
        String[] emisorasGuardadas = new String[12];
        int numBoton;
        int numMenu;
        int numBoton1;
        String salir;
        Vista miVista = new Vista();
        Carro miCarro = new Carro();

        miVista.bienvenida(); // Despliegue del menu principal
        numMenu = -1;
        while(numMenu != 7){
            numMenu = miVista.menu();
            switch (numMenu) {
                case 1: // Encender / apagar radio
                    miCarro.encenderApagar();
                    if(miCarro.comprobarEncendida() == true){
                        miVista.mensaje("Su radio se ha prendido con exito prendiendo");
                    }
                    else{
                        miVista.mensaje("Su radio se ha apagado con exito apagando");
                    }
                break;
                case 2:// Cambiar de AM a FM / FM a AM
                    if(miCarro.comprobarEncendida() == true){
                        miVista.mensaje(miCarro.cambiarSenal(miCarro.getTipoSenal()));
                    }
                    else{
                        miVista.mensaje("Su radio se encuentra apagada , por favor prenderla para usar esta opcion");
                    }
                break;
                case 3: // Avanzar la emisora
                    if(miCarro.comprobarEncendida() == true){
                        if(miCarro.getTipoSenal()==true){
                            miCarro.subirEmisora();
                            miVista.mensaje(miCarro.getEmisoraActual()+"AM");
                        }
                        else{
                            miCarro.subirEmisora();
                            miVista.mensaje(miCarro.getEmisoraActual()+"FM");
                        }
                    }
                    else{
                        miVista.mensaje("Su radio se encuentra apagada, por favor prenderla para usar esta opcion");
                    }
                break;
                case 4: // Retroceder la emisora
                    if(miCarro.comprobarEncendida() == true){
                        if(miCarro.getTipoSenal()==true){
                            miCarro.bajarEmisora();
                            miVista.mensaje(miCarro.getEmisoraActual()+"AM");
                        }
                        else{
                            miCarro.bajarEmisora();
                            miVista.mensaje(miCarro.getEmisoraActual()+"FM");
                        }
                    }
                    else{
                        miVista.mensaje("Su radio se encuentra apagada, por favor prenderla para usar esta opcion");
                    }
                break;
                case 5: // Guardar Emisora
                    if(miCarro.comprobarEncendida() == true){
                        numBoton = 0;
                        miVista.mensaje(miCarro.guardarEmisoraActual(numBoton));
                        numBoton++;
                    }
                    else{
                        miVista.mensaje("Su radio se encuentra apagada, por favor prenderla para usar esta opcion");
                    }
                break;
                case 6: // Seleccionar Emisora de algun boton
                    if(miCarro.comprobarEncendida() == true){
                        numBoton1 = 0;
                        miVista.mensaje(miCarro.seleccionarEmisoraGuardada(numBoton1));
                        numBoton1++;
                    }
                    else{
                        miVista.mensaje("Su radio se encuentra apagada, por favor prenderla para usar esta opcion");
                    }
                break;
                case 7:
                miVista.salir();
                break;

            }
        }

    }
}