/**
 * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria
 * FileName: Vista
 * Author:   Fabian Juarez , Sara Echeverria
 * Date:     30/01/2022
 * @author Fabian Juarez y Sara Echeverria
 */

public class Carro implements Radio{ // Clase que implementa la interfaz radio
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

    /**
     * Este metodo se encarga de encender y apagar la radio.
     * @return void
    */
    @Override
    public void encenderApagar() {
        if(encendido == false){
            encendido = true;
        }
        else{
            encendido = false;
        }
    }

    /**
     * Este metodo se encarga de comprobar que la radio
     * se encuentre encenedida para usar las funciones respectivas.
     * @return boolean
    */
    @Override
    public boolean comprobarEncendida() {
        return encendido;
    }

    /**
     * Este metodo permite subir la emisora de 10 en caso de ser AM
     * y de 0.2 en caso de ser FM.
     * @return void
    */
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

    /**
     * Este metodo permite bajar la emisora de 10 en caso de ser AM
     * y de 0.2 en caso de ser FM.
     * @return void
    */
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

    /**
     * Este metodo permite cambiar el tipo de senal de AM a FM
     * y viceversa.
     * @return String
    */
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

    /**
     * Este metodo permite obtener
     * la emisora que se sintoniza en el momento.
     * @return float
    */
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

    /**
     * Este metodo permite obtener
     * el tipo de senal que se esta sintonizando.
     * @return Boolean
    */
    @Override
    public Boolean getTipoSenal() {
        return tipoSenal;
    }

    /**
     * Este metodo permite guardar la emisora que se sintoniza
     * en dicho instante.
     * @return String
    */
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

    /**
     * Este metodo permite seleccionar una emisora
     * guardada.
     * @return String
    */
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
