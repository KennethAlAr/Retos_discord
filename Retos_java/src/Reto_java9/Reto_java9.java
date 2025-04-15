package Reto_java9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto_java9 {
    public static void main(String[] args) {
        /*
        Los alumnos de Prometeo que cursan DAM/DAW + Master andan muy liados y no tienen claro cuando tienen clase y cuando no.

        Haz un programa que les indique si tienen clase de FP, de Máster, o de las dos en un conjunto de fechas dado.
        El usuario introduce un número N, que indica el número de días que quiere ver, se deberá imprimir el número del día,
        si no tienen nada en esa fecha, FP si tiene clase de un módulo de DAM/DAW o Máster si ese día tiene clase de máster.
        Los días múltiplos de 3 tienen clase de FP.
        Los días múltiplos de 5, de máster.
        Los días que son múltiplos de 3 y 5 tienen clase de las dos.

        Ejemplo de entrada:
        ---------------------------------
        15

        Ejemplo de salida:
        ---------------------------------
        1
        2
        FP
        4
        Máster
        FP
        7
        8
        FP
        Máster
        11
        FP
        13
        14
        FP + Máster*/

        Scanner sc = new Scanner(System.in);
        boolean validador = false;

        while (!validador) {
            try {
                System.out.println("¿Cuántos días quieres ver?");
                int dias = sc.nextInt();

                System.out.println("Estos son tus " + dias + " próximos días:");

                for (int i = 0; i <= dias; i++)
                    if (i%3 == 0 && i%5 == 0) {
                        System.out.println("FP + Máster");
                    } else if (i%3 == 0) {
                        System.out.println("FP");
                    } else if (i%5 == 0) {
                        System.out.println("Máster");
                    } else {
                        System.out.println(i);
                    }

                validador = true;
            } catch (InputMismatchException e) {
                System.out.println("Número introducido no válido, debe ser un número entero positivo.");
                sc.nextLine();
            }
        }

        sc.close();

    }
}
