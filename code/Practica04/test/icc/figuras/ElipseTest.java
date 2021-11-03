
package icc.figuras;

import java.util.Iterator;

import org.junit.Test;
import static org.junit.Assert.*;

import icc.puntos.Punto;
import icc.Calificador;
import icc.RandomStringGenerator;

/**
 * Clase que agrega pruebas unitarias generales para el elipse.
 *
 * @author mindahrelfen
 */
public class ElipseTest extends Calificador {

    private static final double LIMIT_RANGE = 0.001;

    public static boolean almostEquals(double d1, double d2) {
        if (d2 > d1) {      // d1 = 5, d2 = 7
            d1 = d1 + d2;   // d1 = 12
            d2 = d1 - d2;   // d2 = 5
            d1 = d1 - d2;   // d1 = 7
        }

        return 0 <= (d1 - d2) && (d1 - d2) <= LIMIT_RANGE;
    }

    @Test
    public void elipsePerfectTest() {
        Elipse e;
        Circulo c;
        double m, M;

        startTest("Revisa que el circulo encaje perfectamente en un elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        c = new Circulo(m / 2);
        assertTrue(e.encaja(c));
        addUp(0.5);

        c = new Circulo((m / 2) - (LIMIT_RANGE / 3.0));
        assertTrue(e.encaja(c));
        addUp(0.25);

        c = new Circulo((m / 2) + (LIMIT_RANGE / 3.0));
        assertTrue(e.encaja(c));
        addUp(0.25);

        passed();
    }

    @Test
    public void elipseLessTest() {
        Elipse e;
        Circulo c;
        double m, M, r;

        startTest("Revisa que el circulo mas chicos que el elipse no encajen en el elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        r = 0.0;
        while (m - (2 * LIMIT_RANGE) > r) {
            c = new Circulo(r / 2);
            assertFalse(e.encaja(c));
            r += LIMIT_RANGE;
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipseMoreTest() {
        Elipse e;
        Circulo c;
        double m, M, r;

        startTest("Revisa que el circulo mas grandes que el elipse no encajen en el elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        r = m + (2 * LIMIT_RANGE);
        while (M > r) {
            c = new Circulo(r / 2);
            assertFalse(e.encaja(c));
            r += LIMIT_RANGE;
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipsePointTest() {
        Elipse e;
        Punto p;
        double m, M, r;

        startTest("Revisa que puntos en el elipse encajen en el elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        M /= 2.0;
        m /= 2.0;
        r = 0.0;
        while (Math.PI * 2 > r) {
            p = new Punto(M * Math.cos(r), m * Math.sin(r));
            assertTrue(e.encaja(p));
            r += (Math.PI * 2.0 / 360.0);
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipsePointLessTest() {
        Elipse e;
        Punto p;
        double m, M, r;

        startTest("Revisa que puntos dentro del elipse no encajen en el elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        M = (M / 2.0) - (2.0 * LIMIT_RANGE);
        m = (m / 2.0) - (2.0 * LIMIT_RANGE);
        r = 0.0;
        while (Math.PI * 2 > r) {
            p = new Punto(M * Math.cos(r), m * Math.sin(r));
            assertFalse(e.encaja(p));
            r += (Math.PI * 2.0 / 360.0);
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipsePointMoreTest() {
        Elipse e;
        Punto p;
        double m, M, r;

        startTest("Revisa que puntos fuera del elipse no encajen en el elipse.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        M = (M / 2.0) + (2.0 * LIMIT_RANGE);
        m = (m / 2.0) + (2.0 * LIMIT_RANGE);
        r = 0.0;
        while (Math.PI * 2 > r) {
            p = new Punto(M * Math.cos(r), m * Math.sin(r));
            assertFalse(e.encaja(p));
            r += (Math.PI * 2.0 / 360.0);
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipsePointBelongTest() {
        Elipse e;
        Punto p;
        double m, M, r;

        startTest("Revisa que puntos en el borde del elipse no esten dentro del elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        M /= 2.0;
        m /= 2.0;
        r = 0.0;
        while (Math.PI * 2 > r) {
            p = new Punto(M * Math.cos(r), m * Math.sin(r));
            assertFalse(e.pertenece(p));
            r += (Math.PI * 2.0 / 360.0);
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipsePointBelongLessTest() {
        Elipse e;
        Punto p;
        double m, M, r;

        startTest("Revisa que puntos dentro del elipse esten dentro del elipse.", 1.0);

        M = (rdm.nextDouble() + 1) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        M = (M / 2.0) - (2.0 * LIMIT_RANGE);
        m = (m / 2.0) - (2.0 * LIMIT_RANGE);
        r = 0.0;
        while (Math.PI * 2 > r) {
            p = new Punto(M * Math.cos(r), m * Math.sin(r));
            assertTrue(e.pertenece(p));
            r += (Math.PI * 2.0 / 360.0);
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipsePointBelongMoreTest() {
        Elipse e;
        Punto p;
        double m, M, r;

        startTest("Revisa que puntos fuera del elipse no esten en el elipse.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);

        M = (M / 2.0) + (2.0 * LIMIT_RANGE);
        m = (m / 2.0) + (2.0 * LIMIT_RANGE);
        r = 0.0;
        while (Math.PI * 2 > r) {
            p = new Punto(M * Math.cos(r), m * Math.sin(r));
            assertFalse(e.pertenece(p));
            r += (Math.PI * 2.0 / 360.0);
        }
        addUp(1.0);

        passed();
    }

    @Test
    public void elipseMayorTest() {
        Elipse e;
        double m, M;

        startTest("Revisa que el eje mayor del elipse encaje con el que se envio como parametro sin importar el orden.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);
        assertTrue(almostEquals(e.ejeMayor(), M));
        addUp(0.5);

        e = new Elipse(m, M);
        assertTrue(almostEquals(e.ejeMayor(), M));
        addUp(0.5);

        passed();
    }

    @Test
    public void elipseMenorTest() {
        Elipse e;
        double m, M;

        startTest("Revisa que el eje menor del elipse encaje con el que se envio como parametro sin importar el orden.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);
        assertTrue(almostEquals(e.ejeMenor(), m));
        addUp(0.5);

        e = new Elipse(m, M);
        assertTrue(almostEquals(e.ejeMenor(), m));
        addUp(0.5);

        passed();
    }

    @Test
    public void elipseAreaTest() {
        Elipse e;
        double m, M, a;

        startTest("Revisa que area del elipse encaje con el area esperada.", 1.0);

        M = (rdm.nextDouble() + 2) * Calificador.LARGE_RANGE;
        m = ((rdm.nextDouble() / 3.0) + 0.25) * M;

        e = new Elipse(M, m);
        a = Math.PI * M * m;
        assertTrue(almostEquals(e.area(), a));
        addUp(1.0);

        passed();
    }
}
