/**
 * Copyright (C), 2022-2023, FabianJuarez SaraEcheverria
 * FileName: Radio
 * Author:   Fabián Juárez , Sara Echeverria
 * Date:     30/01/2022
 * @author Fabian Juarez y Sara Echeverria
 */
public interface Radio {
    //Metodos
    public void encenderApagar(); // Cambia el estado encendido/apagado
    public String guardarEmisoraActual(int numBoton); // Guarda la emisora como favorita en el botón indicado (array de 12 espacios).
    public String seleccionarEmisoraGuardada(int numBoton); // Reproduce la emisora guardada en uno de los 12 botones.
    public String cambiarSenal(Boolean opcion); //true: AM // false:FM
    public Boolean getTipoSenal(); ////true: AM // false:FM
    public void subirEmisora(); // Aumenta la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM
    public void bajarEmisora(); // Disminuye la emisora actual en 0.2 si la señal actual es FM, o en 10 si es AM
    public float getEmisoraActual(); //
    public boolean comprobarEncendida(); //true: encendida, false: apagada
}
