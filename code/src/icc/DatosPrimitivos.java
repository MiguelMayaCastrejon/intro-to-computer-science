
package icc;

public class DatosPrimitivos {

    public static void main(String args[]) {
        double iva = 0.16;
        char percent = '%';
        char pesos = '$';
        int precio = 45;

        /**
         * El iva es del: 0.16%, si un producto cuesta: 45$ sin iva, entonces,
         *con iva cuesta: <precio mas IVA>$
         */
        System.out.println("iva = " + iva);
        System.out.println("percent = " + percent);
        System.out.println("pesos = " + pesos);
        System.out.println("precio = " + precio);
        System.out.print("El iva es del: " + iva + percent);
        System.out.print(", si un producto cuesta: " + precio);
        System.out.print(pesos + " sin iva, entonces, con iva");
        System.out.println(" cuesta: " + (precio * (1 + iva)) + pesos);

        /**
         * 1. Imprimir en la terminal el nombre de la variable, seguido de su
         * valor, de todas las variables que se usen, esto debe suceder antes
         * de la realizacion de cada ejercicio.
         *
         * 2. Imprimir en la terminal el mensaje de cada ejercicio,
         * tomando en cuenta que los numeros y caracteres deben ser asignados
         * a una variable, esto tambien aplica a operaciones sobre dichas variables.
         * Ademas, si se les da escoger alguna palabra, tambien deberan asignarla
         * como variable.
        */

        /**
         * a) El numero de lados de la figura geometrica <escojan una figura> es de <numero de lados de esa misma figura>.
        */

        /**
         * b) En  Mexico una persona es considerada adulto mayor a los 60 años, y en 2010 eran 9.1% de la poblacion.
        */

        /**
         * c) El numero PI es <pi a 5 digitos de presicion>.
        */

        /**
         * d) El salario minimo general en Mexico es de 123.22$ diarios, entre 2464.4$ y 3819.82$ mensuales. Una familia de clase media de 3.6 integrantes tiene un ingreso mensual de 10772$, lo cual representa <salario medio por persona>$ por persona mensual.
        */
    }
}
