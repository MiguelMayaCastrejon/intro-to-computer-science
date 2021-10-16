
package icc.conversiones;

import java.util.Iterator;

import org.junit.Test;
import static org.junit.Assert.*;

import icc.Calificador;
import icc.RandomStringGenerator;

/**
 * Clase que agrega pruebas unitarias de conversiones de unidades angulares.
 *
 * @author mindahrelfen
 */
public class DecimalToDegreesTest extends Calificador {

    @Override
    protected void init() {
        rsg = new RandomStringGenerator(range, false);
    }

    public static boolean almostEquals(double d1, double d2) {
        if (d2 > d1) {      // d1 = 5, d2 = 7
            d1 = d1 + d2;   // d1 = 12
            d2 = d1 - d2;   // d2 = 5
            d1 = d1 - d2;   // d1 = 7
        }

        return 0 <= (d1 - d2) && (d1 - d2) <= 0.01;
    }

    @Test
    public void checkConversion() {
        DecimalToDegrees Dtd;
        DegreesToDecimal dtD;
        int degrees, minutes;
        double seconds, decimal;

        startTest("Revisa que la conversion entre grados decimales y grados, minutos y segundos sea correcta mutuamente.", 1.0);

        Dtd = new DecimalToDegrees();
        dtD = new DegreesToDecimal();

        decimal = rdm.nextDouble() * 360.0;

        Dtd.convert(decimal);
        degrees = Dtd.degrees();
        minutes = Dtd.minutes();
        seconds = Dtd.seconds();
        dtD.convert(degrees, minutes, seconds);

        assertTrue(almostEquals(decimal, dtD.decimal()));
        addUp(1.0);

        passed();
    }
}
