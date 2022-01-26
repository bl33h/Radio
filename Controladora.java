
public class Controladora {
    //Atributos
    private boolean encendido = false; // Determina el estado de la radio, true (encendido) y false (apagado). 
    private boolean tipoSenal = false; // (true: AM// false: FM)
    private float AMactual;
    private float FMactual;
    private String[] emisorasGuardadas = new String[12];
    private int numBoton;
}