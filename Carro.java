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
    private float AMactual = 500 ;
    private float FMactual = (float)80.7;
    private String[] emisorasGuardadas = new String[12];
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
        if(tipoSenal){
            if(AMactual!= 500){
                AMactual += 10;
            }
            else{
                AMactual = 1610;
            }
        }
        else{
            if(FMactual!= 80.7){
                FMactual += 0.2;
            }
            else{
                FMactual=(float)87.9;
            }
        }
    }

    @Override
    public void bajarEmisora() {
        if(tipoSenal){
            if(AMactual!= 500){
                AMactual -= 10;
            }
            else{
                AMactual = 1610;
            }
        }
        else{
            if(FMactual!= 80.7){
                FMactual -= 0.2;
            }
            else{
                FMactual=(float)87.9;
            }
        }
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
        float emisoraAct;
        if(tipoSenal){
            emisoraAct = AMactual;
        }
        else{
            emisoraAct = FMactual;
        }
        return emisoraAct;
    }

    @Override
    public Boolean getTipoSenal() {
        return tipoSenal;
    }

    @Override
    public String guardarEmisoraActual(int numBoton) {
        String emisora = "";
        String senal = "";
        String texto = "";
        if(tipoSenal){
            emisora = String.valueOf(this.AMactual);
            senal = "AM";
        }
            else{
            emisora = String.valueOf(this.FMactual);
            senal = "FM";
        }
        emisorasGuardadas[numBoton] = emisora;
        texto = "Se ha guardado la emisora: " + emisora + senal;
        return texto;
    }

    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {
        String senal = "";
        String texto = "";
        Float emisoraGuardada;
        emisoraGuardada =Float.valueOf(emisorasGuardadas[numBoton]);
        if(emisoraGuardada >=500){
            senal = "AM";
        }
            else{
            senal = "FM";
        }
         texto = "Se ha seleccionado la emisora: " + emisorasGuardadas[numBoton] + senal ;
         return texto;
    }
}
