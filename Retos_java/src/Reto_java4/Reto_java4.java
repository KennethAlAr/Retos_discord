package Reto_java4;

import java.util.Scanner;

public class Reto_java4 {
    public static void main(String[] args) {

        /*Un resplandor y hace ¡BOOM! y digo, ains ya está aquí la guerra.
        Como dice la señora del famoso meme (link), un día estalló la guerra.
        Haz un programa que, dado un número que se pasa por entrada, haga una cuenta atrás y acabe con un ¡BOOM!.

        Ejemplo de entrada:
        -----------------------------
                5

        Ejemplo de salida:
        -----------------------------
        5
        4
        3
        2
        1
        ¡BOOM!*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos centímetros le quedan a la mecha?");
        int temporizador = scanner.nextInt();

        for (int i = temporizador; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("¡PIMBA!");

        scanner.close();
    }
}
