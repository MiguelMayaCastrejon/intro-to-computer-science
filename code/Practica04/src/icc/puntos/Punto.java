
package icc.puntos;

import java.text.DecimalFormat;

/**
 * Clase que se encarga de simular el comportamiento de un
 * <strong>punto</strong> en dos dimensiones.
 *
 * @author Mindahrelfen
 */
public class Punto {

    /**
     * Define el patron de impresion para el punto.
     */
    private static DecimalFormat pattern = new DecimalFormat("0.0##");

    /**
     * Coordenada <code>x</code> del punto.
     */
    private double x;

    /**
     * Coordenada <code>y</code> del punto.
     */
    private double y;

    /**
     * Constructor por defecto del punto.
     */
    public Punto() {
        this(0.0, 0.0);
    }

    /**
     * Constructor de copia del punto.
     *
     * @param p Referencia al punto del cual se deben copiar las coordenadas.
     */
    public Punto(Punto p) {
        this(p.x, p.y);
    }

    /**
     * Constructor que crea un punto en base a las dos coordenadas pasadas
     * como parametro.
     *
     * @param x Valor de la coordenada <code>x</code>.
     * @param y Valor de la coordenada <code>y</code>.
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo de acceso a la coordenada <code>x</code>.
     *
     * @return double - Valor de la coordenada <code>x</code>.
     */
    public double getX() {
        return this.x;
    }

    /**
     * Metodo de acceso a la coordenada <code>y</code>.
     *
     * @return double - Valor de la coordenada <code>y</code>.
     */
    public double getY() {
        return this.y;
    }

    /**
     * Metodo de modificacion de la coordenada <code>x</code>.
     *
     * @param x Nuevo valor de la coordenada <code>x</code>.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Metodo de modificacion de la coordenada <code>y</code>.
     *
     * @param y Nuevo valor de la coordenada <code>y</code>.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Metodo que calcula la distancia entre este punto y el punto <code>p</code>.
     *
     * @param p Punto con el cual comparar el punto actual.
     *
     * @return double - Distancia entre <code>p</code> y este punto.
     */
    public double distance(Punto p) {
        double xD, yD;

        xD = this.x - p.x;
        yD = this.y - p.y;

        xD = Math.pow(xD, 2);
        yD = Math.pow(yD, 2);

        return Math.sqrt(xD + yD);
    }

    /**
     * Metodo que suma las coordenadas del punto <code>p</code> al punto actual.
     *
     * @param p Punto del cual obtener las coordenadas a sumar.
     */
    public void sum(Punto p) {
        this.x += p.x;
        this.y += p.y;
    }

    /**
     * Metodo que realiza el producto cruz sobre el actual punto, con el punto <code>p</code>.
     *
     * @param p Punto del cual obtener las coordenadas a multiplicar.
     *
     * @return double - Resultado del producto punto entre este punto y <code>p</code>.
     */
    public double crossProduct(Punto p) {
        return this.x * p.x + this.y * p.y;
    }

    /**
     * Metodo que realiza el producto escalar sobre el actual punto.
     *
     * @param d Escalar al que realizar el producto punto.
     */
    public void dotProduct(double d) {
        this.x *= d;
        this.y *= d;
    }


    /**
     * Metodo que calcula el area del triangulo delimitado por los tres puntos
     * parametro.
     * Usa el metodo del determinante.
     *
     * @param p1 Primer punto del triangulo.
     * @param p2 Segundo punto del triangulo.
     * @param p3 Tercer punto del triangulo.
     *
     * @return double - El area de dicho triangulo.
     */
    public static double area(Punto p1, Punto p2, Punto p3) {
        double d1, d2, d3;

        d1 = p1.x * (p2.y - p3.y);
        d2 = p2.x * (p3.y - p1.y);
        d3 = p3.x * (p1.y - p2.y);

        return Math.abs(d1 + d2 + d3) / 2.0;
    }

    /**
     * Metodo que revisa si el punto actual se encuentra dentro del triangulo
     * delimitado por los tres puntos parametro.
     *
     * @param p1 Primer punto del triangulo.
     * @param p2 Segundo punto del triangulo.
     * @param p3 Tercer punto del triangulo.
     *
     * @return boolean - true si el punto actual se encuentra dentro del triangulo parametro.
     */
    public boolean isInside(Punto p1, Punto p2, Punto p3) {
        double t, t1, t2, t3;

        t = area(p1, p2, p3);
        t1 = area(this, p2, p3);
        t2 = area(p1, this, p3);
        t3 = area(p1, p2, this);

        return almostEquals(t, (t1 + t2 + t3));
    }

    /**
     * Metodo que revisa si el punto actual pertenece a la circunferencia definida por los puntos diametro pasados como parametro.
     *
     * @param p1 Primer punto del diametro del circulo.
     * @param p2 Segundo punto del diametro del circulo.
     *
     * @return boolean - true si el punto actual se encuentra dentro de la circunferencia dada.
     */
    public boolean belongsToCircle(Punto p1, Punto p2) {
        Punto c = new Punto((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);

        return almostEquals(c.distance(p1), c.distance(this));
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

        return 0 <= (d1 - d2) && (d1 - d2) <= 0.01;
    }

    @Override
    public boolean equals(Object obj) {
        Punto p;

        if(obj == null) {
            return false;
        } else if (!(obj instanceof Punto)) {
            return false;
        } else {
            p = (Punto)obj;

            return almostEquals(this.x, p.x) && almostEquals(this.y, p.y);
        }
    }

    @Override
    public String toString() {
        return "(" + pattern.format(this.x) + ", " + pattern.format(this.y) + ")";
    }
}
