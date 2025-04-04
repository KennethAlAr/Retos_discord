package Reto_java5;

import java.util.Scanner;

public class Reto_java5 {
    public static void main(String[] args) {

        /*
        Jordi nunca se acuerda de abrir las exclamaciones.
        Él dice que es porque en catalán no se abren las exclamaciones, pero yo creo que simplemente no sabe escribir.
        Vamos a crear un programa que asegure que hay tantos abrir exclamación (¡) como cerrar exclamación (!) para flamearlo.

        Ejemplo de entrada:
        -------------------------
        ¡¡¡Caramba!!!
        Hola!

        Ejemplo de salida:
        -------------------------
        Si
        No
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra entre exclamaciones (¡tantas como quieras!):");

        String palabra = scanner.nextLine();

        boolean interruptor = true;

        for (int i = 0; i<palabra.length(); i++) {
            if ((palabra.charAt(palabra.length()-1-i) == '!')) {
                if ((palabra.charAt(i)) != '¡') {
                    interruptor = false;
                }
            } else if (palabra.charAt(i) == '¡'){
                interruptor = false;
            } else {
                break;
            }
        }

        if (interruptor == true) {
            System.out.println("¡Perfecto! ¡Abres tantas exclamaciones como cierras!");
        } else {
            System.out.println("¡Jordi! Te has olvidado de abrir o cerrar una exclamación...");
        }

    }
}
