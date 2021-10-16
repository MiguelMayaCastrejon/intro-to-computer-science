
package icc;

/**
* Práctica 2 del curso de Introducción a Ciencias de la Computación.
* @author Joel Miguel Maya Castrejón 417112602 
* @version 15/Octubre/2021.
* @since Laboratorio de Introducción a Ciencias de la Computación 2022-1.
*/

import icc.conversiones.DecimalToDegrees;
import icc.conversiones.DegreesToDecimal;
import java.util.Scanner;

/**
 * Clase que implementa una aplicacion que convierte de metros y centimetros a
 * pies y pulgadas y viceversa.
 */
public class Prueba {

    /**
     * Metodo que hace la conversión de grados decimales a grados, 
     * minutos y segundos usando la terminal como flujo de datos.
     *      
     * @param int - Solo es una bandera de salida.
     */
    public static int decimalToDegrees() {
        DecimalToDegrees decimalToDegrees = new DecimalToDegrees(); 
        Scanner scn = new Scanner(System.in);

        double decimal; 

        System.out.println("Este es un programa para convertir " + 
        "de grados decimales a grados, minutos y segundos.");

        System.out.println("Ingresa el valor de los grados decimales:");
        decimal = scn.nextDouble();

        decimalToDegrees.convert(decimal);

        System.out.println("La conversion de " + decimal + "° " +
        "grados decimales a grados, minutos y segundos es de: ");
        System.out.println("Grados: " + decimalToDegrees.getDegrees() + "°");
        System.out.println("Minutos: " + (int) decimalToDegrees.getMinutes() + "'");
        System.out.println("Segundos: " + decimalToDegrees.getSeconds() + "''");

        scn.close(); 

        return 0;
    }
    

     /**
     * Metodo que hace la conversión de grados, minutos y segundos 
     * a grados decimales usando la terminal como flujo de datos.
     *      
     * @param int - Solo es una bandera de salida.
     */
    public static int degreesToDecimal() {
        DegreesToDecimal degreesToDecimal = new DegreesToDecimal();
        Scanner scn = new Scanner(System.in);

        int degrees; 
        double minutes; 
        double seconds;

        System.out.println("Este es un programa para convertir " + 
        "de grados, minutos y segundos a grados decimales.");

        System.out.println("Ingresa el valor de los grados en enteros:");
        degrees = scn.nextInt();

        System.out.println("Ingresa el valor de los minutos:");
        minutes = scn.nextDouble();

        System.out.println("Ingresa el valor de los segundos:");
        seconds = scn.nextDouble();

        degreesToDecimal.convert(degrees, minutes, seconds);

        System.out.println("La conversion de " + degrees + "° " + minutes + "' "+
        seconds + "'' a grados decimales es de:");
        System.out.println("Grados decimales: " + degreesToDecimal.getDecimal() + "°");

        scn.close();

        return 0;
    }

    public static void main(String args[]) {
        double opcion; //Lo cambie a double por si el usuario no mete enteros.
        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe 1 si quieres convertir de grados decimales a " + 
        "grados, minutos y segundos.");
        System.out.println("Escribe cualquier otro número si quieres convertir " +  
        "de grados, minutos y segundos a grados decimales.");

        opcion = scn.nextDouble();

        opcion = opcion == 1 ? decimalToDegrees() : degreesToDecimal();

        scn.close();
    }


}
