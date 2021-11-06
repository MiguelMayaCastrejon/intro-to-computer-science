
package icc;

import java.util.Scanner;

import icc.colors.Colors;
import icc.figuras.Circulo;
import icc.figuras.Elipse;
import icc.puntos.Punto;

public class Prueba {

    public static void main(String args[]) {
        Elipse e = new Elipse(20, 10);
        System.out.println("Este es el eje mayor: " + e.ejeMayor());
        System.out.println("Este es el eje menor: " +  e.ejeMenor());
        System.out.println("Este es el semi eje mayor: " +  e.semiEjeMayor());
        System.out.println("Este es el semi eje menor: "+ e.semiEjeMenor());
        System.out.println("Este es el perimetro de la elipse: " +e.perimetro());
    }

}
