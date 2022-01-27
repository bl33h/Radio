
public class Controladora{
    public static void main(String[] args) {
        //Atributos
        boolean encendido = false; // Determina el estado de la radio, true (encendido) y false (apagado). 
        boolean tipoSenal = false; // (true: AM// false: FM)
        float AMactual;
        float FMactual;
        String[] emisorasGuardadas = new String[12];
        int numBoton;
        Vista miVista = new Vista();
    }
}