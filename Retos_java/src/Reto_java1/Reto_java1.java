package Reto_java1;

import java.util.Scanner;

public class Reto_java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuál es tu nota? (Recuerda que en java el separador de decimales es con ','");
        double nota_decimal = sc.nextDouble();
        double nota_truncada = Math.floor(nota_decimal);

        double decimal = nota_decimal - nota_truncada;
        int nota_final;

        if (decimal >= 0.5) {
            nota_final = (int)Math.ceil(nota_decimal);
        } else {
            nota_final = (int)Math.floor(nota_decimal);
        }

        System.out.println("Tu nota final es: " + nota_final);

        sc.close();
    }
}