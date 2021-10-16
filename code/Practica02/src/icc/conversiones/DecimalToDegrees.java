
package icc.conversiones;

public class DecimalToDegrees {

    //Variables
    private int degrees;
    private int minutes;
    private double seconds;

/**
	* Hace la conversión de un número decimal a grados, minutos y segundos.
	* @param decimal el numero decimal al que le queremos aplicar la conversión.
*/
    public void convert(double decimal) { 
        degrees = (int)decimal; //Calculamos los grados
        minutes = (int) ((decimal-degrees) * 60); //Calculamos los minutos
        seconds = (((decimal-degrees) * 60) % minutes)*60; //Calculamos los segundos

    }
/**
	* @return la conversion de los grados.
*/
    public int degrees() {
        return degrees;
    }
/**
	* @return la conversion de los minutos.
*/
    public double minutes(){
        return minutes;
    }
/**
	* @return la conversion de los segundos.
*/
    public double seconds(){
        return seconds;
    }
}
