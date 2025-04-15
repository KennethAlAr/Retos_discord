package Reto_java13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto_java13 {
    public static void main(String[] args) throws InterruptedException {
        /*
        ¿Alguna vez te has levantado con la necesidad de crear un cronómetro? Tranquilo, no eres el único.
        Hoy vas a poder hacer tu sueño realidad.
        Crea un programa que:
        Pida al usuario que ingrese el número de segundos que desea contar.
        Usa un bucle para contar desde el primer segundo hasta el número total de segundos indicado por el usuario.
        Cada vez que el cronómetro llegue a 60 segundos, debe reiniciar los segundos a 0 y sumar 1 minuto.
        Cuando los minutos lleguen a 60, debe reiniciar los minutos a 0 y sumar 1 hora.
        El cronómetro debe mostrar el tiempo en formato hh:mm:ss, donde hh son las horas, mm los minutos y ss los segundos.

        PISTA: Para que el cronómetro se actualice cada segundo, puedes utilizar la función time.sleep(1).
        Esto hará que el programa espere 1 segundo entre cada iteración del bucle, imitando el comportamiento de un cronómetro real.

        Ejemplo:
        -------------------------------
        00:00:01
        00:00:02
        00:00:03
        etc.
        */

        Scanner sc = new Scanner(System.in);

        boolean activador = false;
        int segundos = 0;
        int minutos = 0;
        int horas = 0;

        while (!activador) {
            try {
                System.out.println("¿Cuántos segundos quieres contar?");
                segundos = sc.nextInt();
                activador = true;
            } catch (InputMismatchException e) {
                System.out.println("Ese no es un número válido de segundos.");
                sc.nextLine();
            }
        }

        for (int i = 1; i <= segundos; i++) {
            if (i == 60) {
                minutos++;
                i = 0;
                segundos = segundos - 60;
            }
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }
            System.out.println(String.format("%02d", horas) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d", i));
            Thread.sleep(1000);
        }

        sc.close();

    }
}
