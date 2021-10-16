
package icc.conversiones;

public class DecimalToDegrees {

    //Variables
    private int degrees;
    private int minutes;
    private double seconds;

/**
	* Hace la conversión de grados decimales a grados, minutos y segundos.
	* @param decimal el numero decimal al que le queremos aplicar la conversión.
*/
    public void convert(double decimal) { 
        degrees = (int)decimal; //Calculamos los grados
        minutes = (int) ((decimal-degrees) * 60); //Calculamos los minutos
        seconds = (((decimal-degrees) * 60) % minutes)*60; //Calculamos los segundos

    }
/**
	* @return la conversion a los grados.
*/
    public int degrees() {
        return degrees;
    }
/**
	* @return la conversion a los minutos.
*/
    public int minutes(){
        return minutes;
    }
/**
	* @return la conversion a los segundos.
*/
    public double seconds(){
        return seconds;
    }
}
