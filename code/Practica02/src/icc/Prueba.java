
package icc;

/**
* Práctica 2 del curso de Introducción a Ciencias de la Computación.
* @author Joel Miguel Maya Castrejón 417112602 
* @version 15/Octubre/2021.
* @since Laboratorio de Introducción a Ciencias de la Computación 2022-1.
*/

import icc.conversiones.DecimalToDegrees;
import java.util.Scanner;

/**
 * Clase que implementa una aplicacion que convierte de metros y centimetros a
 * pies y pulgadas y viceversa.
 */
public class Prueba {

    /**
     * Metodo que convierte metros y centimetros a pies y pulgadas usando la
     * terminal como flujo de datos.
     *
     * @param int - Solo es una bandera de salida.
     */
    public static int metersToFeet() {
        MetersToFeets mF = new MetersToFeets();
        Scanner scn = new Scanner(System.in);

        int metros;
        double centimetros;

        System.out.println("Este es un programa para convertir de metros y centimetros a pies y pulgadas.");

        System.out.println("Ingresa el valor de metros en enteros:");
        metros = scn.nextInt();

        System.out.println("Ingresa el valor de centimetros (menor a 100):");
        centimetros = scn.nextDouble();

        mF.convert(metros, centimetros);

        System.out.print("La conversion de " + metros + " metros ");
        System.out.print("y " + centimetros + " centimetros a ");
        System.out.println("pies y pulgadas es de:");
        System.out.println("Pies: " + mF.feets());
        System.out.println("Pulgadas: " + mF.inches());

        return 0;
    }

    /**
     * Metodo que convierte pies y pulgadas a metros y centimetros usando la
     * terminal como flujo de datos.
     *
     * @param int - Solo es una bandera de salida.
     */
    public static int feetsToMeters() {
        FeetsToMeters fM = new FeetsToMeters();
        Scanner scn = new Scanner(System.in);

        int pies;
        double pulgadas;

        System.out.println("Este es un programa para convertir de pies y pulgadas a metros y centimetros.");

        System.out.println("Ingresa el valor de pies en enteros:");
        pies = scn.nextInt();

        System.out.println("Ingresa el valor de pulgadas (menor a 12):");
        pulgadas = scn.nextDouble();

        fM.convert(pies, pulgadas);

        System.out.print("La conversion de " + pies + " pies ");
        System.out.print("y " + pulgadas + " pulgadas a ");
        System.out.println("metros y centimetros es de:");
        System.out.println("Metros: " + fM.meters());
        System.out.println("Centimetros: " + fM.centimeters());

        return 0;
    }

    public static void main(String args[]) {
        int opcion;
        Scanner scn = new Scanner(System.in);

        System.out.println("Escribe 1 si quieres convertir de metros y centimetros a pies y pulgadas.");
        System.out.println("Escribe 2 si quieres lo contrario.");

        opcion = scn.nextInt();

        opcion = opcion == 1 ? metersToFeet() : feetsToMeters();
    }
}
