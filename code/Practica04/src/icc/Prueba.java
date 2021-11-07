
package icc;

import java.util.Scanner;

import icc.colors.Colors;
import icc.figuras.Circulo;
import icc.figuras.Elipse;
import icc.puntos.Punto;

public class Prueba {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int opcion =0;
        int x=0;
        int y=0;
        double ejeMayor = 0;
        double ejeMenor = 0;
        double radioCirculo = 0;

        

        do {

        System.out.println("Este programa realiza algunas aplicaciones entre una elipse, un circulo y puntos.");
        System.out.println("1.-Revisar si un circulo encaja en la elipse.");
        System.out.println("2.-Revisar si un punto se encuentra en el borde de la elipse.");
        System.out.println("3.-Revisar si un punto se encuentra en el interior de la elipse.");
        System.out.println("0.-Salir");
        System.out.println("Escoge una opción entre 0 y 3.");

        if (entrada.hasNextInt()) {
            opcion = entrada.nextInt();
            entrada.nextLine(); // eliminate newline from input buffer
         } else {
             
             System.out.println("No debes ingresar letras.\n");
             entrada.nextLine(); // trash non-numeric input
         }

         if (opcion < 0 || opcion > 3 ) {
            System.out.println("Solo puedes ingresar numeros entre 0 y 3\n");
        } 

        switch (opcion) {
            //No es necesario poner un case 0 en el switch, porque ya tenemos la condicion el while.
            
            case 1: 
            System.out.println("Ingresa el eje mayor del elipse: ");
            ejeMayor = entrada.nextDouble();

            System.out.println("Ingresa el eje menor del elipse: ");
            ejeMenor = entrada.nextDouble();

            System.out.println("Ingresa el radio del circulo: ");
            radioCirculo = entrada.nextDouble();

            Elipse elipse = new Elipse(ejeMayor, ejeMenor);

            Circulo circulo =  new Circulo(radioCirculo);

            Colors.println("Ciculo: ", Colors.GREEN);
            Colors.print("Radio: ", Colors.HIGH_INTENSITY ); Colors.print(circulo.radio()+"\n" , Colors.WHITE);
            Colors.print("Diametro : ", Colors.HIGH_INTENSITY ); Colors.print(circulo.diametro()+"\n" , Colors.WHITE);
            Colors.print("Perimetro : ", Colors.HIGH_INTENSITY ); Colors.print(circulo.perimetro()+"\n" , Colors.WHITE);
            Colors.print("Area : ", Colors.HIGH_INTENSITY ); Colors.print(circulo.area()+"\n" , Colors.WHITE);
            System.out.println();

            Colors.println("Elipse: ", Colors.GREEN);
            Colors.print("Eje Mayor: ", Colors.HIGH_INTENSITY ); Colors.print(elipse.ejeMayor()+"\n" , Colors.WHITE);
            Colors.print("Eje Menor: ", Colors.HIGH_INTENSITY ); Colors.print(elipse.ejeMenor()+"\n" , Colors.WHITE);
            Colors.print("Perimetro : ", Colors.HIGH_INTENSITY ); Colors.print(elipse.perimetro()+"\n" , Colors.WHITE);
            Colors.print("Area : ", Colors.HIGH_INTENSITY ); Colors.print(elipse.area()+"\n" , Colors.WHITE);
            System.out.println();

            if (elipse.encaja(circulo)) {
                Colors.println("El circulo encaja con el elipse.", Colors.GREEN);
            } else{
                Colors.println("El circulo no encaja con el elipse.", Colors.RED);
            }
            System.out.println();

                break;

            case 2:
            System.out.println("Ingresa el eje mayor del elipse: ");
            ejeMayor = entrada.nextDouble();

            System.out.println("Ingresa el eje menor del elipse: ");
            ejeMenor = entrada.nextDouble();

            System.out.println("Ingresa la coordenada x del punto: ");
            x =entrada.nextInt();

            System.out.println("Ingresa la coordenada y del punto: ");
            y =entrada.nextInt();

            Punto punto = new Punto(x, y);

            elipse = new Elipse(ejeMayor, ejeMenor);

            Colors.println("Punto: ", Colors.GREEN);
            Colors.print("Coordenadas: ", Colors.HIGH_INTENSITY ); Colors.print("("+ punto.getX()+","+punto.getY()+")" +"\n" , Colors.WHITE);
            System.out.println();

            Colors.println("Elipse: ", Colors.GREEN);
            Colors.print("Eje Mayor: ", Colors.HIGH_INTENSITY ); Colors.print(elipse.ejeMayor()+"\n" , Colors.WHITE);
            Colors.print("Eje Menor: ", Colors.HIGH_INTENSITY ); Colors.print(elipse.ejeMenor()+"\n" , Colors.WHITE);
            Colors.print("Perimetro : ", Colors.HIGH_INTENSITY ); Colors.print(elipse.perimetro()+"\n" , Colors.WHITE);
            Colors.print("Area : ", Colors.HIGH_INTENSITY ); Colors.print(elipse.area()+"\n" , Colors.WHITE);
            System.out.println();

            if (elipse.encaja(punto)) {
                Colors.println("El punto encaja con el elipse.", Colors.GREEN);
            } else{
                Colors.println("El punto no encaja con el elipse.", Colors.RED);
            }
            System.out.println();

                break;

            
            case 3:
            System.out.println("Ingresa el eje mayor del elipse: ");
            ejeMayor = entrada.nextDouble();
    
            System.out.println("Ingresa el eje menor del elipse: ");
             ejeMenor = entrada.nextDouble();
    
            System.out.println("Ingresa la coordenada x del punto: ");
            x =entrada.nextInt();
    
            System.out.println("Ingresa la coordenada y del punto: ");
            y =entrada.nextInt();
    
            punto = new Punto(x, y);
    
            elipse = new Elipse(ejeMayor, ejeMenor);
    
            Colors.println("Punto: ", Colors.GREEN);
            Colors.print("Coordenadas: ", Colors.HIGH_INTENSITY ); Colors.print("("+ punto.getX()+","+punto.getY()+")" +"\n" , Colors.WHITE);
            System.out.println();
    
            Colors.println("Elipse: ", Colors.GREEN);
            Colors.print("Eje Mayor: ", Colors.HIGH_INTENSITY ); Colors.print(elipse.ejeMayor()+"\n" , Colors.WHITE);
            Colors.print("Eje Menor: ", Colors.HIGH_INTENSITY ); Colors.print(elipse.ejeMenor()+"\n" , Colors.WHITE);
            Colors.print("Perimetro : ", Colors.HIGH_INTENSITY ); Colors.print(elipse.perimetro()+"\n" , Colors.WHITE);
            Colors.print("Area : ", Colors.HIGH_INTENSITY ); Colors.print(elipse.area()+"\n" , Colors.WHITE);
            System.out.println();
    
            if (elipse.pertenece(punto)) {
                Colors.println("El punto pertenece al elipse.", Colors.GREEN);
            } else{
                Colors.println("El punto no pertenece al elipse.", Colors.RED);
            }
            System.out.println();
    
                break;
            
        }
        
         
        } while (opcion !=0);
        if (opcion==0) {
            System.out.println("Gracias, vuelva pronto.");
        }

    }

}
