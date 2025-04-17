package Reto_java15;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Reto_java15 {
    public static void main(String[] args) {
        /*
        Resulta que nos piden que programemos un validador de contraseñas. Algo fácil para los alumnos de Prometeo.
        Solo tenemos que decir si una contraseña introducida por terminal es válida o no.
        Para que una contraseña sea válida debe:
        Tener al menos 8 caracteres.
        Tener al menos una letra minúscula.
        Tener al menos una letra mayúscula.
        Tener al menos un número.
        Tener al menos un símbolo especial de entre los siguientes *, ?, !, ^, “, $.
        No contener la palabra GIT, en ningún formato (ni GIT, ni git, ni gIt, ni giT, ni Git, ni GIt, ni gIT, ni GiT). Odiamos Git.
        */

        Scanner sc = new Scanner(System.in);

        boolean activador = false;

        while (!activador) {
            System.out.println("Introduce tu contraseña y verificaremos que sea segura y 'GitFree'");
            String password = sc.nextLine();
            int contadorMayusculas = 0;
            int contadorMinusculas = 0;
            int contadorNumeros = 0;
            int contadorSimbolos = 0;
            int contadorGit = 0;
            if (password.length() < 8) {
                System.out.println("La contraseña no es válida, debe contener al menos 8 caracteres");
            } else {
                List<Character> listaNumeros = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
                List<Character> listaSimbolos = Arrays.asList('*', '?', '!', '^', '"', '$');

                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) == Character.toUpperCase(password.charAt(i))
                            && Character.isLetter(password.charAt(i))) {
                        contadorMayusculas++;
                    } else if (password.charAt(i) == Character.toLowerCase(password.charAt(i))
                            && Character.isLetter(password.charAt(i))) {
                        contadorMinusculas++;
                    } else if (listaNumeros.contains(password.charAt(i))) {
                        contadorNumeros++;
                    } else if (listaSimbolos.contains(password.charAt(i))) {
                        contadorSimbolos++;
                    }
                    if (password.toLowerCase().contains("git")) {
                        contadorGit++;
                    }
                }
                if (contadorMayusculas == 0) {
                    System.out.println("Tu contraseña debe tener al menos una letra mayúscula.");
                }
                if (contadorMinusculas == 0) {
                    System.out.println("Tu contraseña debe tener al menos una letra minúscula.");
                }
                if (contadorNumeros == 0) {
                    System.out.println("Tu contraseña debe tener al menos un número.");
                }
                if (contadorSimbolos == 0) {
                    System.out.println("Tu contraseña debe tener al menos un símbolo entre los siguientes: '*', '?', '!', '^', '\"', '$'");
                }
                if (contadorGit > 0) {
                    System.out.println("¡Tu contraseña no puede llevar git de ninguna manera!");
                }
            }
            if (contadorMayusculas != 0
                && contadorMinusculas != 0
                && contadorNumeros != 0
                && contadorSimbolos != 0
                && contadorGit == 0) {
                    activador = true;
                    System.out.println("¡Genial! Tu contraseña es segura y, lo mas importante, no contiene git.");
            }
        }

        sc.close();

    }
}
