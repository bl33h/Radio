import java.util.ArrayList;

public class Carro implements Radio{
    private boolean encendido;
    private boolean tipoSenal;
    private float AMactual;
    private float FMactual;
    private ArrayList<String> emisorasGuardadas = new ArrayList<String>();
    private int numBoton;
    @Override
    public void bajarEmisora() {
        // TODO Auto-generated method stub
    }
    @Override
    public String cambiarSenal(Boolean opcion) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public boolean comprobarEncendida() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void encenderApagar() {
        // TODO Auto-generated method stub
    }
    @Override
    public float getEmisoraActual() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public Boolean getTipoSenal() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String guardarEmisoraActual(int numBoton) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String seleccionarEmisoraGuardada(int numBoton) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void subirEmisora() {
        // TODO Auto-generated method stub
    }
}