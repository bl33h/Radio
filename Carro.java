import java.util.ArrayList;

public class Carro implements Radio{
    private boolean encendido;
    private boolean tipoSenal;
    private float AMactual;
    private float FMactual;
    private ArrayList<String> emisorasGuardadas = new ArrayList<String>();
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
        String texto = "";
        return texto;
    }
    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {

        return null;
    }
}