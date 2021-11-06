
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
        if ( ejeMenor > ejeMayor) {
            this.ejeMayor = ejeMenor; 
            this.ejeMenor = ejeMayor; 
        } else{
            this.ejeMayor = ejeMayor;
            this.ejeMenor = ejeMenor;
        }
    }

    /**
     * Metodo de acceso al eje mayor de este elipse.
     *
     * @return double Eje mayor de este elipse.
     */
    public double ejeMayor() {
        return this.ejeMayor;
    }

    public double semiEjeMayor(){
        return ejeMayor/2;
    }

    /**
     * Metodo de acceso al eje menor de este elipse.
     *
     * @return double Eje menor de este elipse.
     */
    public double ejeMenor() {
        
        return this.ejeMenor;
    }

    public double semiEjeMenor(){
        return ejeMenor/2;
    }

    /**
     * Metodo que calcula el perimetro del elipse.
     *
     * @return double Perimetro de este elipse.
     */
    public double perimetro() {
        perimetro = Math.PI * (3*(semiEjeMayor()+semiEjeMenor()) -
        Math.sqrt((3*semiEjeMayor()+semiEjeMenor())*(semiEjeMayor()+3*semiEjeMenor())));
        
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
    // public boolean encaja(Punto p) {
    //     // if (almostEquals(semiEjeMayor() , p.distance(p) )) {
    //     //     return true;
    //     // } else 
    //     // if (!almostEquals(semiEjeMayor() , p.distance(p) )){
    //     //     return false;
    //     // }
    //     return false ;
    // }

    /**
     * Metodo que revisa si el punto se encuentra estrictamente dentro este elipse.
     *
     * @param p Punto con quien hacer la comparacion.
     * @return boolean true Si el punto dado se encuentra dentro de este elipse.
     */
    // public boolean pertenece(Punto p) {
    //     if ( p.distance(p) < semiEjeMayor()) {
    //         return false;
    //     } else if(!almostEquals(p.distance(p), semiEjeMayor())){
    //         return false;
    //     }
        
    //     return true;
        
    // }


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
