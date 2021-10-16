package icc.conversiones;

public class DegreesToDecimal {
    
    //variables
    private double decimal;

    /**
	* Hace la conversión de grados, minutos y segundos a grados decimales.
	* @param degrees el grado al que le aplicaremos la conversión.
    * @param minutes los minutos a los que les aplicaremos la conversión.
	* @param seconds los segundos a los que les aplicaremos la conversión.
    */
    public void convert(int degrees, double minutes, double seconds){

        decimal = degrees;
        decimal += (minutes / 60);
        decimal += (seconds / 3600);

    }

    /**
	* @return la conversion a los grados.
    */
    public double getDecimal(){
        return decimal;
    }

}
