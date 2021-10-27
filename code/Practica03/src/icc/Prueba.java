
import java.util.Random;
import java.util.Scanner;
import colors.Colors;


public class Prueba {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        String tiroUsuario;
        int aleatorio;
        String piedra = "Piedra";
        String papel = "Papel";
        String tijeras = "Tijera";
        int participante; // 456 players

        participante = random.nextInt(456)+1;

        Colors.println("Bienvenido a los juegos del calamar participante #" + participante, Colors.HIGH_INTENSITY);;
        System.out.println("Vas a jugar piedra papel o tijera contra la maquina.\nEscribe una de las tres opciones"
        + " y la maquina eligira la otra:");
        Colors.println("Piedra\nPapel\nTijera", Colors.UNDERLINE);

        tiroUsuario = entrada.nextLine();
        tiroUsuario = tiroUsuario.trim();
        System.out.println("Has escogido " + tiroUsuario + ".");


        aleatorio = random.nextInt(3)+1;
        
        switch (aleatorio) {
        case 1: //Casos de piedra para la maquina.
            System.out.println("La maquina escogio piedra.");
            if (piedra.equalsIgnoreCase(tiroUsuario)) {
                System.out.println("Empate, piedra vs piedra empata.");
            } else if (papel.equalsIgnoreCase(tiroUsuario)) {
                Colors.println("Haz ganado, papel vs piedra gana papel.", Colors.GREEN);
            } else if (tijeras.equalsIgnoreCase(tiroUsuario)) {
                Colors.println("Haz perdido, tijera vs piedra gana piedra.", Colors.RED);
            } else Colors.println("Solo puedes escribir piedra papel o tijera.", Colors.YELLOW);

            break;

        case 2: //Casos de papel para la maquina.
            System.out.println("La maquina escogio papel.");
            if (papel.equalsIgnoreCase(tiroUsuario)) {
                System.out.println("Empate, papel vs papel empata.");
            } else if (tijeras.equalsIgnoreCase(tiroUsuario)) {
                Colors.println("Haz ganado, tijera vs papel gana tijeras.", Colors.GREEN);
            } else if (piedra.equalsIgnoreCase(tiroUsuario)) {
                Colors.println("Haz perdido, piedra vs papel gana papel.", Colors.RED);
            } else Colors.println("Solo puedes escribir piedra papel o tijera.", Colors.YELLOW);

            break;

        case 3: //Casos de tijera para la maquina.
        System.out.println("La maquina escogio tijera.");
        if (tijeras.equalsIgnoreCase(tiroUsuario)) {
            System.out.println("Empate, tijera vs tijeras empata.");
        } else if (piedra.equalsIgnoreCase(tiroUsuario)) {
            Colors.println("Haz ganado, piedra vs tijera gana piedra.", Colors.GREEN);
        } else if (papel.equalsIgnoreCase(tiroUsuario)) {
            Colors.println("Haz perdido, papel vs tijera gana tijera.", Colors.RED);
        } else Colors.println("Solo puedes escribir piedra papel o tijera.", Colors.YELLOW);

            break;
        }

        entrada.close();

    }
}
