package Reto_java12;

import java.util.Scanner;

public class Reto_java12 {
    public static void main(String[] args) {
        /*
        Pide al usuario que introduzca varios números enteros (uno por uno, y que indique "fin" para terminar).
        El programa debe verificar si cada número introducido es un "número de la suerte".
        Se considera un número de la suerte si es múltiplo de 7 (el resto de la división entre 7 es 0).
        Por cada número de la suerte encontrado, el programa imprimirá "¡[número] es un número de la suerte!".
        Al final, mostrará cuántos números de la suerte se encontraron en total.
        Pista: No olvides usar el try/catch 🙂
        */

        Scanner sc = new Scanner(System.in);
        boolean activador = false;
        int contador = 0;

        while (!activador) {
            try {
                System.out.println("Ingresa un número entero o escribe 'fin' para finalizar:");
                String numero = sc.nextLine();
                if (numero.equals("fin")) {
                    activador = true;
                } else {
                    int numeroInt = Integer.valueOf(numero);
                    if (numeroInt%7 == 0) {
                        System.out.println("¡" + numeroInt + " es un número de la suerte!");
                        contador ++;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número válido, debe ser un entero.");
            }
        }

        System.out.println("Se han encontrado " + contador + " números de la suerte.");

        sc.close();

    }
}
