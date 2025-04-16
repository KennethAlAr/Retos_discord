package Reto_java14;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Reto_java14 {
    public static void main(String[] args) {
        /*
        Hoy en clase, a Federico le han dicho que las flashcards son un buen método de estudio.
        Pero Federico no tiene nada para escribir en su casa.
        ¿Se te ocurre alguna forma para que pueda estudiar con el método mencionado?

        Pues claro que sí, vas a crear un programa que:
        Almacene las flashcards en una lista (pregunta, respuesta).
        Permita al usuario añadir nuevas flashcards.
        Muestra una pregunta aleatoria de la lista.
        Solicite una respuesta del usuario.
        Compare la respuesta del usuario con la correcta.
        Indique si la respuesta es correcta o incorrecta.
        Permita continuar practicando o salir.

        Ejemplo:
        ------------------------
        Anverso: La programación es…
        Reverso: Darle una serie de instrucciones a una máquina para que ejecute una acción específica.
        */

        Scanner sc = new Scanner(System.in);

        ArrayList<String[]> tarjetas = new ArrayList<>();

        String [] pregunta_1 = {"¿Qué es un lenguaje de programación?",
                "Es un conjunto de reglas y símbolos que permiten escribir instrucciones para que un ordenador las entienda y ejecute."};
        String [] pregunta_2 = {"¿Qué es una variable en programación?",
                "Es un espacio de memoria donde se guarda un dato que puede cambiar durante la ejecución del programa."};
        String [] pregunta_3 = {"¿Para qué se usa el comando print en Python?",
                "Se usa para mostrar información en la pantalla, como mensajes o resultados de operaciones."};
        String [] pregunta_4 = {"¿Qué es un algoritmo?",
                "Es una serie de pasos ordenados y lógicos que se siguen para resolver un problema o realizar una tarea."};
        tarjetas.add(pregunta_1);
        tarjetas.add(pregunta_2);
        tarjetas.add(pregunta_3);
        tarjetas.add(pregunta_4);

//        System.out.println(tarjetas.get(0)[1]);
        boolean activador = false;

        while (!activador) {
            try {
                System.out.println("¿Qué quieres hacer?");
                System.out.println("1. Añadir una tarjeta.\n" +
                        "2. Ver una tarjeta aleatoria.\n" +
                        "3. Salir.");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        sc.nextLine();
                        System.out.println("\nOpción 1");
                        System.out.println("¿Cuál es la pregunta que quieres añadir?");
                        String pregunta = sc.nextLine();
                        System.out.println("¿Cuál es la respuesta?");
                        String respuesta = sc.nextLine();
                        String [] nuevaPregunta = {pregunta, respuesta};
                        tarjetas.add(nuevaPregunta);
                        System.out.println("¡Pregunta y respuesta añadida!\n");
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.println("\nOpción 2");
                        Random random = new Random();
                        int numeroPregunta = random.nextInt(0, tarjetas.size());
                        System.out.println("Pregunta:");
                        System.out.println(tarjetas.get(numeroPregunta)[0]);
                        System.out.println("\nResponde aquí:");
                        String respuestaUsuario = sc.nextLine();
                        if (respuestaUsuario.equals(tarjetas.get(numeroPregunta)[1])) {
                            System.out.println("¡Correcto! La respuesta es:\n" + tarjetas.get(numeroPregunta)[1] + "\n");
                        } else {
                            System.out.println("¡Incorrecto! La respuesta es:\n" + tarjetas.get(numeroPregunta)[1] + "\n");
                        }
                        break;
                    case 3:
                        System.out.println("\nCerrando programa");
                        activador = true;
                        break;
                    default:
                        System.out.println("Esa no es una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Esa no es una opción válida.");
                sc.nextLine();
            }
        }

        sc.close();

    }
}
