package Reto_java16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto_java16 {
    public static void main(String[] args) throws Exception {
        /*
        Crea una calculadora muy especial que a veces está de buen humor y otras no.
        Pide al usuario que introduzca dos números y la operación (+, -, *, /).
        Si la operación es división (/) y el segundo número es 0,
        la calculadora se pondrá de mal humor y lanzará un error (simúlalo con un try-catch que imprima un
        mensaje como "¡¿Dividir por cero?! ¡¿Acaso quieres destruir el universo?!").
        Para las otras operaciones, realiza el cálculo normal y muestra el resultado con un mensaje alegre como
        "¡Tadá! El resultado es...".
        */

        Scanner sc = new Scanner(System.in);

        boolean activador1 = false;
        int numero1 = 0;
        int numero2 = 0;

        while (!activador1) {
            try {
                System.out.println("Introduce dos números:");
                numero1 = sc.nextInt();
                numero2 = sc.nextInt();
                activador1 = true;
            } catch (InputMismatchException error1) {
                System.out.println("No me vaciles, he dicho dos números, no otra cosa. Vamos otra vez...\n");
                sc.nextLine();
            }
        }

        boolean activador2 = false;

        while (!activador2) {
            try {
                sc.nextLine();
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1. Sumar.\n" +
                        "2. Restar.\n" +
                        "3. Multiplicar.\n" +
                        "4. Dividir.");

                int operacion = sc.nextInt();

                switch (operacion) {
                    case 1:
                        double resultadoSuma = numero1 + numero2;
                        System.out.println("¡Tadá! El resultado de sumar " + numero1 + " y " + numero2 + " es: " + resultadoSuma);
                        activador2 = true;
                        break;
                    case 2:
                        double resultadoResta = numero1 - numero2;
                        System.out.println("¡Tadá! El resultado de restar " + numero1 + " y " + numero2 + " es: " + resultadoResta);
                        activador2 = true;
                        break;
                    case 3:
                        double resultadoMultiplicacion = numero1 * numero2;
                        System.out.println("¡Tadá! El resultado de multiplicar " + numero1 + " y " + numero2 + " es: " + resultadoMultiplicacion);
                        activador2 = true;
                        break;
                    case 4:
                        double resultadoDivision = numero1 / numero2;
                        System.out.println("¡Tadá! El resultado de dividir " + numero1 + " entre " + numero2 + " es: " + resultadoDivision);
                        activador2 = true;
                        break;
                    default:
                        System.out.println("¡Tadá! La transformada de Laplace del número " + numero1 + " y el número " + numero2 + " es:" );
                        Thread.sleep(1000);
                        System.out.println("...");
                        Thread.sleep(1000);
                        System.out.println("...");
                        Thread.sleep(1000);
                        System.out.println("...");
                        Thread.sleep(1000);
                        System.out.println("¿¡Yo qué se!? ¡Esa no es una de las opciones que te he dado!\n");
                }
            } catch (InputMismatchException error2) {
                System.out.println("En serio... no es tan difícil, solo tienes que elegir una operación y poner el" +
                        "número que tiene delante...\n");
            } catch (ArithmeticException error3) {
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("¿Estás loco? ¿Dividir entre cero? ¿Quiéres destruir el universo?\n");
                activador2 = true;
            }
        }

        sc.close();

    }
}
