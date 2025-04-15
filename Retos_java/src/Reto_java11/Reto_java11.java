package Reto_java11;

import java.util.Scanner;

public class Reto_java11 {
    public static void main(String[] args) {
        /*
        El programa elige una palabra secreta (por ejemplo, "programar").
        El usuario tiene 5 intentos para adivinar la palabra.
        En cada intento, el programa compara la palabra introducida por el usuario con la palabra secreta.
        Si son iguales, muestra un mensaje de felicitación y termina.
        Si no son iguales, indica cuántos intentos le quedan.
        Si se agotan los intentos sin adivinar, muestra la palabra secreta y un mensaje de "¡Game Over!".
        */

        Scanner sc = new Scanner(System.in);

        String palabraSecreta = "Aguacate";

        System.out.println("Adivina la palabra secreta, tienes 5 intentos:");
        int intentos = 5;

        while (true) {
            String intento = sc.nextLine();
            if (intento.equals(palabraSecreta)) {
                System.out.println("¡Felicidades, has acertado! La palabra secreta era Aguacate.");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Incorrecto, te quedan " + intentos + " intentos");
                } else {
                    System.out.println("Lo siento, no te quedan intentos =(");
                    System.out.println("La palabra secreta era Aguacate");
                    System.out.println("¡GAME OVER!");
                    break;
                }
            }
        }

        sc.close();

    }
}
