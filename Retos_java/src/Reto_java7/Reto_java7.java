package Reto_java7;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Reto_java7 {
    public static void main(String[] args) throws InterruptedException{
        /*
        Imagina una emocionante carrera entre caracoles cibernéticos.
        Cada caracol tiene una velocidad aleatoria entre 1 y 5 (¡qué emoción!).

        Escribe un programa que simule una carrera de 20 "pasos" entre dos caracoles.
        En cada paso, la posición de cada caracol aumenta según su velocidad.
        Al final, ¡declara al caracol ganador (o si hay un emocionante empate)!

        Pista: usar java.util.Random
        */

        Scanner sc = new Scanner(System.in);
        int caracol = 0;

        boolean validador = false;

        while (!validador) {
            try {
                System.out.println("¿Qué caracol crees que va a ganar la 'Snail Cup'?");
                System.out.println("1. Shellvester Stallone");
                System.out.println("2. Gary B. Quick");
                System.out.println("3. The Flash-y (casi)");
                System.out.println("4. Speedy McSluggish");

                caracol = sc.nextInt();
                switch (caracol) {
                    case 1:
                        System.out.println("¡Has elegido Shellvester Stallone!");
                        validador = true;
                        break;
                    case 2:
                        System.out.println("¡Has elegido a Gary B. Quick!");
                        validador = true;
                        break;
                    case 3:
                        System.out.println("¡Has elegido a The Flash-y!");
                        validador = true;
                        break;
                    case 4:
                        System.out.println("¡Has elegido a Speedy McSluggish!");
                        validador = true;
                        break;
                    default:
                        System.out.println("¡No existe ningún caracol con ese número!");}
                        Thread.sleep(1000);
            } catch (InputMismatchException e) {
                System.out.println("Esa no es una opción válida");
                sc.nextLine();
                Thread.sleep(1000);
            }
        }

        sc.close();

        System.out.println("\n");
        System.out.println("¡Que empiece la carrera!");

        boolean ganador = false;
        int posicion_1 = 0;
        int posicion_2 = 0;
        int posicion_3 = 0;
        int posicion_4 = 0;

        System.out.println("(1) (@)_´o´" + "_".repeat(50) + "|| Shellvester Stallone");
        System.out.println("(2) (@)_´o´" + "_".repeat(50) + "|| Gary B. Quick");
        System.out.println("(3) (@)_´o´" + "_".repeat(50) + "|| The Flash-y");
        System.out.println("(4) (@)_´o´" + "_".repeat(50) + "|| Speedy McSluggish");
        System.out.println("\n");
        Thread.sleep(1000);

        Random avance = new Random();

        while (!ganador) {

            posicion_1 = posicion_1 + avance.nextInt(1,6);
            posicion_2 = posicion_2 + avance.nextInt(1,6);
            posicion_3 = posicion_3 + avance.nextInt(1,6);
            posicion_4 = posicion_4 + avance.nextInt(1,6);

            if (posicion_1 >= 50 || posicion_2 >= 50 || posicion_3 >= 50 || posicion_4 >= 50) {
                ganador = true;
            }

            try {
                System.out.println("(1) " + "~".repeat(posicion_1) + "(@)_´o´" + "_".repeat(50 - posicion_1) + "|| Shellvester Stallone");
            } catch (IllegalArgumentException e_1) {
                posicion_1 = 50;
                System.out.println("(1) " + "~".repeat(posicion_1) + "(@)_´o´" + "_".repeat(50 - posicion_1) + "|| Shellvester Stallone");
            }
            try {
                System.out.println("(2) " + "~".repeat(posicion_2) + "(@)_´o´" + "_".repeat(50 - posicion_2) + "|| Gary B. Quick");
            } catch (IllegalArgumentException e_2) {
                posicion_2 = 50;
                System.out.println("(2) " + "~".repeat(posicion_2) + "(@)_´o´" + "_".repeat(50 - posicion_2) + "|| Gary B. Quick");
            }
            try {
                System.out.println("(3) " + "~".repeat(posicion_3) + "(@)_´o´" + "_".repeat(50 - posicion_3) + "|| The Flash-y");
            } catch (IllegalArgumentException e_3) {
                posicion_3 = 50;
                System.out.println("(3) " + "~".repeat(posicion_3) + "(@)_´o´" + "_".repeat(50 - posicion_3) + "|| The Flash-y");
            }
            try {
                System.out.println("(4) " + "~".repeat(posicion_4) + "(@)_´o´" + "_".repeat(50 - posicion_4) + "|| Speedy McSluggish");
            } catch (IllegalArgumentException e_4) {
                posicion_4 = 50;
                System.out.println("(4) " + "~".repeat(posicion_4) + "(@)_´o´" + "_".repeat(50 - posicion_4) + "|| Speedy McSluggish");
            }
            System.out.println("\n\n");
            Thread.sleep(1000);
        }

        List<String> listaCampeones = new ArrayList<>();

        int ganadores = 0;
        if (posicion_1 == 50) {
            ganadores ++;
            listaCampeones.add("Shellvester Stallone");
        }
        if (posicion_2 == 50) {
            ganadores ++;
            listaCampeones.add("Gary B. Quick");
        }
        if (posicion_3 == 50) {
            ganadores ++;
            listaCampeones.add("The Flash-y");
        }
        if (posicion_4 == 50) {
            ganadores ++;
            listaCampeones.add("Speedy McSluggish");
        }

        if (ganadores == 1) {
            System.out.println("¡El ganador de la 'Snail Cup' es " + listaCampeones.get(0) + "!");
        } else if (ganadores > 1) {
            System.out.println("¡Tenemos un empate! Los ganadores son: ");
            for (int i = 0; i < listaCampeones.size(); i++) {
                System.out.println(listaCampeones.get(i));
            }
        }

        String [] listaCaracoles = {
                "Shellvester Stallone",
                "Gary B. Quick",
                "The Flash-y",
                "Speedy McSluggish"
        };

        String caracolEscogido = listaCaracoles[caracol-1];
        if (listaCampeones.contains(caracolEscogido)) {
            System.out.println("\n¡Felicidades! " + caracolEscogido + " es el vencedor y tu has ganado la apuesta.");
        } else {
            System.out.println("\nLo siento, " + caracolEscogido + " no ha ganado la carrera...");
        }
    }
}