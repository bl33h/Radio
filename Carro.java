/**
 * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria
 * FileName: Vista
 * Author:   Fabián Juárez , Sara Echeverria
 * Date:     30/01/2022
 * @author Fabian Juarez y Sara Echeverria
 */
import java.util.ArrayList;

public class Carro implements Radio{
    private boolean encendido;
    private boolean tipoSenal;
    private float AMactual;
    private float FMactual;
    private String[] emisorasGuardadas=new String[12];
    private int numBoton;
    public Carro(){
        encendido = false;
        tipoSenal = false;

    }
    @Override
    public void encenderApagar() {
        if(encendido == false){
            encendido = true;
        }
        else{
            encendido = false;
        }
    }

    @Override
    public boolean comprobarEncendida() {
        return encendido;
    }

    @Override
    public void subirEmisora() {

    }

    @Override
    public void bajarEmisora() {
        // TODO Auto-generated method stub
    }

    @Override
    public String cambiarSenal(Boolean opcion) {
        String texto = "";
        if (opcion == true){
            texto = "Se encuentra en la FM";
            tipoSenal = false;
        }
        else{
            texto = "Se encuentra en la AM";
            tipoSenal = true;
        }
        return texto;
    }

    @Override
    public float getEmisoraActual() {
        return numBoton;
    }

    @Override
    public Boolean getTipoSenal() {
        return tipoSenal;
    }

    @Override
    public String guardarEmisoraActual(int numBoton) {
        String emisora = "";
        String senal = "";
        if(tipoSenal){
            emisora = String.valueOf(this.AMactual);
            senal = "AM";
        }
            else{
            emisora = String.valueOf(this.FMactual);
            senal = "FM";
        }
        emisorasGuardadas[numBoton] = emisora;
        return "Se ha guardado la emisora: " + emisora + senal + "en el boton " + numBoton;
    }

    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {

        return null;
    }
}