package Reto_java18;

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Reto_java18 {
    public static void main(String[] args) {
        /*
        Simula una votación simple para 3 candidatos ("Coder", "Debugger", "Tester").
        Pide a 5 votantes que introduzcan su voto (el nombre del candidato).
        Usa un bucle for para simular los 5 votantes.
        Usa un diccionario (o similar) para llevar el conteo de votos para cada candidato.
        Usa if/else para verificar si el voto introducido es para uno de los candidatos válidos.
        Si no lo es, incrementa un contador de "votos inválidos".
        Introduce la posibilidad de un "error de conteo" aleatorio (simula lanzar una excepción dentro del if/else de los votos válidos).
        Usa un try-catch alrededor del proceso de conteo. Si ocurre el error, muestra un mensaje de "¡Error en el conteo! ¡Se descarta este voto!".
        Al final, muestra el número de votos para cada candidato y el número total de votos inválidos.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("¡Ha llegado el momento de las votaciones! ¿A quién quieres votar?\n" +
                "Nuestros candidatos son Coder, Debugger y Tester");

        Map<String, Integer> dictCandidatos = new HashMap<String, Integer>();

        dictCandidatos.put("Coder", 0);
        dictCandidatos.put("Debugger", 0);
        dictCandidatos.put("Tester", 0);
        int votosNoValidos = 0;
        boolean activador = false;

        while (!activador) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Votante número " + (i + 1) + " ¿para quién es tu voto?");
                    String voto = sc.nextLine();
                    Random random = new Random();
                    int numero = random.nextInt(1, 6);
                    if (numero == 5) {
                        i = i / 0; // error de conteo
                    }
                    if (voto.equals("Coder")) {
                        int valorActual = dictCandidatos.get("Coder");
                        dictCandidatos.put("Coder", valorActual + 1);
                    } else if (voto.equals("Debugger")) {
                        int valorActual = dictCandidatos.get("Debugger");
                        dictCandidatos.put("Debugger", valorActual + 1);
                    } else if (voto.equals("Tester")) {
                        int valorActual = dictCandidatos.get("Tester");
                        dictCandidatos.put("Tester", valorActual + 1);
                    } else {
                        votosNoValidos++;
                    }
                    if (i == 4) {
                        activador = true;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("¡Error en el conteo! ¡Se descarta este voto!");
                    votosNoValidos++;
                }

            }
        }


        System.out.println("Coder obtiene " + dictCandidatos.get("Coder") + " votos.");
        System.out.println("Debugger obtiene " + dictCandidatos.get("Debugger") + " votos");
        System.out.println("Tester obtiene " + dictCandidatos.get("Tester") + " votos");
        System.out.println("Hay " + votosNoValidos + " voto/s no válidos.");
        
        sc.close();

    }
}
