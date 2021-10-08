
package icc;

/**
* Práctica 1 del curso de Introducion a las ciencias de la computación.
* @author Joel Miguel Maya Castrejón 417112602 
* @version 08 / Octubre / 2021 
*/

public class DatosPrimitivos {

    public static void main(String args[]) {
        double iva = 0.16;
        char percent = '%';
        char pesos = '$';
        int precio = 45;

        /**
         * El iva es del: 0.16%, si un producto cuesta: 45$ sin iva, entonces, con iva cuesta: <precio mas IVA>$
         */
        System.out.println("Ejemplo de salida\n");
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

        System.out.println("\nEjercicio a:\n");

        //Variables usadas
        String figuraGeometrica = "pentagono";
        int noLados = 5; 

        //Variables impresas
        System.out.println("figuraGeometrica = " + figuraGeometrica);
        System.out.println("noLados = " + noLados);

        //Impresion del mensaje
        System.out.println("El numero de lados de la figura geometrica " + figuraGeometrica + " es de " + noLados);

        /**
         * b) En  Mexico una persona es considerada adulto mayor a los 60 años, y en 2010 eran 9.1% de la poblacion.
        */

        System.out.println("\nEjercicio b:\n");

        //Variables usadas
        String pais = "Mexico";
        int edadAdultoMayor = 60;
        int year = 2010;
        double estadistica = 9.1; 
        percent = '%';

        //Variables impresas
        System.out.println("pais = " + pais);
        System.out.println("adultoMayor = " + edadAdultoMayor);
        System.out.println("year = " + year);
        System.out.println("porcentaje = " + estadistica);

        //Impresion del mensaje
        System.out.println("En " + pais + " una persona es considerada adulto mayor a los " + edadAdultoMayor + " años, " 
        + "y en " + year + " eran " + estadistica  + percent + " de la poblacion." );

        /**
         * c) El numero PI es <pi a 5 digitos de presicion>.
        */

        System.out.println("\nEjercicio c:\n");

        //Variables usadas
        double PI = 3.14159; 

        //Variables impresas
        System.out.println("PI = " + PI);

        //Impresion del mensaje
        System.out.println("El numero PI es " + PI);
        /**
         * d) El salario minimo general en Mexico es de 123.22$ diarios, entre 2464.4$ y 3819.82$ mensuales. 
         * Una familia de clase media de 3.6 integrantes tiene un ingreso mensual de 10772$, lo cual representa <salario medio por persona>$ por persona mensual.
        */

        System.out.println("\nEjercicio d:\n");

        //Variables usadas
        pais = "Mexico";
        double salarioMinimoDiario = 123.22; 
        pesos = '$';
        double salarioRangoMin = 2464.4;
        double salarioRangoMax = 3819.82;
        double familiaIntegrantes = 3.6;
        double ingresoMensualFam = 10772;

        //Variables impresas
        System.out.println("pais = " + pais);
        System.out.println("salarioMinimo = " + salarioMinimoDiario);
        System.out.println("salarioRangoMin = " + salarioRangoMin);
        System.out.println("salarioRangoMax = " + salarioRangoMax);
        System.out.println("familiaIntegrantes = " + familiaIntegrantes);
        System.out.println("ingresoMensual = " + ingresoMensualFam);

        //Impresion del mensaje
        System.out.println("El salario minimo general en " + pais + " es de " + salarioMinimoDiario + pesos + " diarios, entre "
        + salarioRangoMin + pesos + " y " +  salarioRangoMax + pesos + " mensuales.");
        System.out.print("Una familia de clase media de " + familiaIntegrantes + " integrantes tiene un ingreso mensual de " + ingresoMensualFam + pesos);
        System.out.print(", lo cual representa " + ingresoMensualFam/familiaIntegrantes + pesos + " por persona mensual.\n");
    }
}
