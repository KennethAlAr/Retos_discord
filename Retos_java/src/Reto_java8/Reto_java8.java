package Reto_java8;

import java.util.Scanner;

public class Reto_java8 {
    public static void main(String[] args) {
        /*
        Escribe un programa que le pregunte al usuario su nombre.
        Si el nombre comienza con la letra "A" (mayúscula o minúscula),
        el robot responderá con un saludo entusiasta como: ¡Hola, Asombroso/a "Nombre"!.
        Si el nombre tiene más de 7 letras, el robot dirá: ¡Vaya, "Nombre", ¡qué nombre tan largo y sofisticado!.
        Para cualquier otro nombre, el robot simplemente dirá: Saludos, "Nombre".

        ¡Prepara al robot para varios tipos de nombres!
        Como un saludo especial a un nombre que empiece por A y tenga 7 letras, o que cuente un chiste si saluda a Jaimito...
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = sc.nextLine();
        String nombre_fromateado = nombre.toLowerCase();
        nombre_fromateado = nombre_fromateado.toUpperCase().charAt(0) + nombre.substring(1).toLowerCase();

        if (nombre_fromateado.charAt(0) == 'A' && nombre_fromateado.length() == 7) {
            System.out.println("Aquí hago alarde, ando, aúllo, aplaudo, actúo, arraso por " + nombre_fromateado);
        } else if (nombre.charAt(0) == 'A') {
            System.out.println("¡Hola, Asombroso/a " + nombre_fromateado);
        } else if (nombre_fromateado.length() > 7) {
            System.out.println("¡Vaya, " + nombre_fromateado + "! ¡que nombre tan largo y sofisticado!");
        } else if (nombre_fromateado.equals("Jaimito")) {
            System.out.println("Jaimito! ¿Cómo se dice 'perro' en inglés?");
            System.out.println("Dog");
            System.out.println("¿Y cómo se dice veterinario?");
            System.out.println("¡Dogtor!");
            System.out.println("\nMe meo... xDDD");
        } else {
            System.out.println("Hola, " + nombre_fromateado);
        }

        sc.close();

    }
}
