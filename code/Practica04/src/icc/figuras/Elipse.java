
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
     * Atributos
     */
    private double ejeMayor, ejeMenor, perimetro, area;

    /**
     * Constructor que crea un elipse con ambos ejes dados.
     *
     * @param ejeMayor Valor del eje mayor.
     * @param ejeMenor Valor del eje menor.
     */
    public Elipse(double ejeMayor, double ejeMenor) {
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    /**
     * Metodo de acceso al eje mayor de este elipse.
     *
     * @return double Eje mayor de este elipse.
     */
    public double ejeMayor() {
        if ( ejeMenor > ejeMayor) {
            ejeMayor = ejeMenor; 
        } 
        return ejeMayor;
    }

    public double semiEjeMayor(){
        double semiEjeMayor = ejeMayor/2;
        return semiEjeMayor;
    }

    /**
     * Metodo de acceso al eje menor de este elipse.
     *
     * @return double Eje menor de este elipse.
     */
    public double ejeMenor() {
        if ( ejeMenor > ejeMayor) {
            ejeMenor = ejeMayor; 
        } 
        return ejeMenor;
    }

    public double semiEjeMenor(){
        double semiEjeMenor = ejeMenor/2;
        return semiEjeMenor;
    }

    /**
     * Metodo que calcula el perimetro del elipse.
     *
     * @return double Perimetro de este elipse.
     */
    public double perimetro() {
        perimetro = Math.PI * semiEjeMayor() + semiEjeMenor();
        return perimetro;
    }

    /**
     * Metodo que calcula el area del elipse.
     *
     * @return double Area de este elipse.
     */
    public double area() {
        area = Math.PI * semiEjeMayor() * semiEjeMenor(); 
        return area;
    }

    /**
     * Metodo que revisa si el circulo dado encaja exactamente con este elipse.
     *
     * @param c Circulo con quien hacer la comparacion.
     * @return boolean true Si el circulo dado encaja exactamente con este elipse.
     */
    public boolean encaja(Circulo c) {
        return almostEquals(ejeMenor, c.diametro());
    }

    /**
     * Metodo que revisa si el punto dado encaja exactamente con este elipse.
     *
     * @param p Punto con quien hacer la comparacion.
     * @return boolean true Si el punto dado encaja exactamente con este elipse.
     */
    public boolean encaja(Punto p) {
        return almostEquals(semiEjeMayor() , p.distance(p) );
    }

    /**
     * Metodo que revisa si el punto se encuentra estrictamente dentro este elipse.
     *
     * @param p Punto con quien hacer la comparacion.
     * @return boolean true Si el punto dado se encuentra dentro de este elipse.
     */
    public boolean pertenece(Punto p) {
        if ( p.distance(p) < semiEjeMayor()) {
            return false;
        } 
        
        return true;
        
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

    // @Override
    // public String toString() {
    // }
}
