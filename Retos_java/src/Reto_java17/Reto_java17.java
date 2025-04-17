package Reto_java17;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Reto_java17 {
    public static void main(String[] args) {
        /*Pide al usuario que introduzca un poema de hasta 4 líneas. Lola la Crítica intentará analizar su "métrica" según reglas muy extrañas:
        Línea 1: Debe tener exactamente 5 palabras.
        Línea 2: Debe contener la letra 'z' al menos una vez.
        Línea 3: Debe tener más vocales que consonantes.
        Línea 4: Debe terminar con la misma palabra con la que empezó la primera línea (ignorando mayúsculas/minúsculas).

        Para llevar a cabo el programa:
        Usa un bucle for para leer cada línea del poema.
        Usa if/else para verificar si cada línea cumple su regla. Si no, Lola da una crítica divertida
        (ej., "¡Demasiadas palabras para mi gusto!", "¡Le falta un toque de 'z'!".).
        Usa try-catch para manejar si el usuario introduce menos de 4 líneas (simulando un poema incompleto).
        Al final, da una "puntuación poética" basada en cuántas reglas cumplió el poema.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un poema y Lola la Crítica lo puntuará para ti.\n" +
                "Separa cada estrofa con un 'ENTER' y si no quieres añadir ninguna estrofa mas presiona 'ENTER' otra vez.");

        int contador = 4;
        ArrayList<String> poema = new ArrayList<>();

        while (contador > 0) {
            String estrofa = sc.nextLine();
            if (!estrofa.equals("")) {
                poema.add(estrofa);
                contador --;
            } else {
                break;
            }
        }

        int puntuacion = 0;

        try {
            for (int i = 0; i < 4; i++) {
                String estrofa = poema.get(i);
                if (i == 0) {
                    String[] palabras = estrofa.split(" ");
                    int numeroPalabras = palabras.length;
                    if (numeroPalabras < 5) {
                        System.out.println("La primera estrofa tiene pocas palabras para mi gusto...");
                    } else if (numeroPalabras > 5) {
                        System.out.println("Mmmmm... ¿No crees que a la primera estrofa le sobran palabras?");
                    } else {
                        puntuacion++;
                    }
                }
                if (i == 1) {
                    if (estrofa.toLowerCase().contains("z")) {
                        puntuacion++;
                    } else {
                        System.out.println("¡A la segunda estrofa le falta un toque de 'z'!");
                    }
                }
                if (i == 2) {
                    List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u');
                    int numeroVocales = 0;
                    int numeroConsonantes = 0;
                    for (int j = 0; j < estrofa.length(); j++) {
                        if (vocales.contains(estrofa.charAt(j))) {
                            numeroVocales++;
                        } else {
                            numeroConsonantes++;
                        }
                    }
                    if (numeroConsonantes < numeroVocales) {
                        puntuacion++;
                    } else {
                        System.out.println("Aixxx, demasiadas consonantes en la tercera estrofa... ¡Hay mas consonantes que vocales!");
                    }
                }
                if (i == 3) {
                    String[] estrofa1 = poema.get(0).split(" ");
                    String[] estrofa4 = poema.get(i).split(" ");
                    if (estrofa1[0].toLowerCase().equals(estrofa4[estrofa4.length - 1].toLowerCase())) {
                        puntuacion++;
                    } else {
                        System.out.println("¡No, no, no y no! ¡Un buen poema debe terminar con la misma palabra con la que empieza!");
                    }
                }
            }

            if (puntuacion == 0) {
                System.out.println("\nHe leído tu poema y te doy mi consejo sincero,\nmucho tienes que aprender y te doy un cero.");
            } else if (puntuacion == 1) {
                System.out.println("\nDe mis criterios has dado con alguno...\nno es mucho, pero te doy un uno");
            } else if (puntuacion == 2) {
                System.out.println("\nNo está mal para unos versos dejados de Diós,\nTendrás que esforzarte mas pero te llevas un dos");
            } else if (puntuacion == 3) {
                System.out.println("\nAquí me hallo, a tus versos haciendo de juez\nno te asustes, tranquilo, porque te llevas un tres.");
            } else if (puntuacion == 4) {
                System.out.println("\nEres un genio,\nde los poemas una persona recta,\nme gusta tanto tu poema,\n¡que le doy una puntuación perfecta!");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("\n...\nPero alma de cántaro... ¿Cómo quieres que puntúe un poema que no tiene cuatro estrofas?");
        }

        sc.close();

    }
}
