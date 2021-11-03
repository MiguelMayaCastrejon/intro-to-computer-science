
package icc.figuras;

import java.text.DecimalFormat;

import icc.colors.Colors;
import icc.puntos.Punto;

/**
 * Clase que simula el funcionamiento de un elipse.
 *
 * @author Mindahrelfen
 */
public class Elipse {

    /**
     * Constructor que crea un elipse con ambos ejes dados.
     *
     * @param ejeMayor Valor del eje mayor.
     * @param ejeMenor Valor del eje menor.
     */
    public Elipse(double ejeMayor, double ejeMenor) {

    }

    /**
     * Metodo de acceso al eje mayor de este elipse.
     *
     * @return double Eje mayor de este elipse.
     */
    public double ejeMayor() {
    }

    /**
     * Metodo de acceso al eje menor de este elipse.
     *
     * @return double Eje menor de este elipse.
     */
    public double ejeMenor() {
    }

    /**
     * Metodo que calcula el perimetro del elipse.
     *
     * @return double Perimetro de este elipse.
     */
    public double perimetro() {
    }

    /**
     * Metodo que calcula el area del elipse.
     *
     * @return double Area de este elipse.
     */
    public double area() {
    }

    /**
     * Metodo que revisa si el circulo dado encaja exactamente con este elipse.
     *
     * @param c Circulo con quien hacer la comparacion.
     * @return boolean true Si el circulo dado encaja exactamente con este elipse.
     */
    public boolean encaja(Circulo c) {
    }

    /**
     * Metodo que revisa si el punto dado encaja exactamente con este elipse.
     *
     * @param p Punto con quien hacer la comparacion.
     * @return boolean true Si el punto dado encaja exactamente con este elipse.
     */
    public boolean encaja(Punto p) {
    }

    /**
     * Metodo que revisa si el punto se encuentra estrictamente dentro este elipse.
     *
     * @param p Punto con quien hacer la comparacion.
     * @return boolean true Si el punto dado se encuentra dentro de este elipse.
     */
    public boolean pertenece(Punto p) {
    }


    /**
     * Metodo que revisa si dos valores flotantes son casi iguales.
     *
     * @param d1 Primer valor a revisar.
     * @param d2 Segundo valor a revisar.
     *
     * @return boolean - true si d1 y d2 son casi iguales.
     */
    public static boolean almostEquals(double d1, double d2) {
        if (d2 > d1) {      // d1 = 5, d2 = 7
            d1 = d1 + d2;   // d1 = 12
            d2 = d1 - d2;   // d2 = 5
            d1 = d1 - d2;   // d1 = 7
        }

        return 0 <= (d1 - d2) && (d1 - d2) <= 0.001;
    }

    @Override
    public String toString() {
    }
}
