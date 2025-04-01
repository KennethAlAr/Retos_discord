package Reto_java1;

import java.util.Scanner;

public class Reto_java1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      1. Crea un programa en Java que calcule la calificación de un estudiante a partir de un número entero.
//      Solicita un número (x) al usuario y responde de la siguiente manera:
//
//      10 - Matrícula de honor
//      9 - Sobresaliente
//      7 u 8 - Notable
//      6 - Bien
//      5 - Aprobado
//      0 a 4 - Suspenso
//
//      Utiliza la instrucción switch con los casos break y default en Java.

        System.out.println("¿Cuál es tu nota?");
        int nota = scanner.nextInt();

        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Con un " + nota + " tienes un suspenso.");
                break;
            case 5:
                System.out.println("Con un " + nota + " tienes un aprobado.");
                break;
            case 6:
                System.out.println("Con un " + nota + " tienes un bien.");
                break;
            case 7, 8:
                System.out.println("Con un " + nota + " tienes un notable.");
                break;
            case 9:
                System.out.println("Con un " + nota + " tienes un sobresaliente.");
                break;
            case 10:
                System.out.println("Con un " + nota + " tienes una matrícula de honor.");
                break;
            default:
                System.out.println("Lo siento, no he entendido tu nota, vuelve a intentarlo");
                break;
        }
        System.out.println("\n");



//      2. Cree un programa en Java que solicite al usuario una letra (x) y compruebe si es una vocal o cualquier otro símbolo.
//      El programa debe mostrar por pantalla "Vocal" si la entrada es una vocal (a, e, i, o, u) y "Otro símbolo" si es cualquier otro carácter.

        scanner.nextLine();
        System.out.println("Ingresa un carácter para saber si es una vocal o otro símbolo");
        String caracter = scanner.nextLine();

        if (
                caracter.equals("a")
                || caracter.equals("e")
                || caracter.equals("i")
                || caracter.equals("o")
                || caracter.equals("u")
        ) {
            System.out.println("Tu carácter es una vocal.");
        } else {
            System.out.println("Tu carácter es otro símbolo.");
        }
        System.out.println("\n");


//      3. Escribe un programa en Java que solicite al usuario ingresar tres números (x, y, z) y determine cuál de ellos es el número más grande.
//      Luego, muestra ese número en la pantalla.

        System.out.println("Ingresa un número entero:");
        int x = scanner.nextInt();
        System.out.println("Ingresa otro número diferente:");
        int y = scanner.nextInt();
        System.out.println("Ingresa un último número diferente:");
        int z = scanner.nextInt();

        if (x > y && x > z) {
            System.out.println("El número mas grande es: " + x);
        } else if (y > x && y > z) {
            System.out.println("El número mas grande es: " + y);
        } else if (z > x && z > y) {
            System.out.println("El número mas grande es: " + z);
        }
        System.out.println("\n");

//      4. Escribe un programa en Java que actúe como una calculadora básica.
//      El programa solicitará al usuario ingresar dos números y una operación matemática (+, -, x, /).
//      Luego, calculará la operación seleccionada y mostrará el resultado en la pantalla.
//      Si el símbolo de la operación es diferente a los operadores permitidos (+, -, x, /), el programa indicará "Carácter no reconocido".

        System.out.println("Ingresa un número:");
        double primer_numero = scanner.nextDouble();

        System.out.println("Ingresa otro número:");
        double segundo_numero = scanner.nextDouble();

        System.out.println("**CALCULADORA**");
        System.out.println("+. Sumar.");
        System.out.println("-. Restar.");
        System.out.println("*. Multiplicar.");
        System.out.println("/. Dividir.");
        System.out.println("Ingresa el símbolo de la opción que deseas realizar:");

        scanner.nextLine();
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "+":
                System.out.println(primer_numero + " y " + segundo_numero + " suman: " + (primer_numero + segundo_numero));
                break;
            case "-":
                System.out.println(primer_numero + " menos " + segundo_numero + " es: " + (primer_numero - segundo_numero));
                break;
            case "*":
                System.out.println(primer_numero + " por " + segundo_numero + " es: " + (primer_numero * segundo_numero));
                break;
            case "/":
                System.out.println(primer_numero + " entre " + segundo_numero + " es: " + (primer_numero / segundo_numero));
                break;
            default:
                System.out.println("Carácter no reconocido.");
        }
        System.out.println("\n");

//      5. Escribe un programa en Java que pregunte al usuario por un número x y muestre el resultado de su tabla de multiplicar del 1 al 10.

        System.out.println("Ingresa un número entero:");
        int numero_tabla = scanner.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(numero_tabla + " x " + i + " = " + (numero_tabla * i));
        }
        System.out.println("\n");

//      6. Escribe un programa en Java que muestre los números impares desde x hasta y en orden descendente.

        System.out.println("Introduce un número:");
        int impares_x = scanner.nextInt();
        System.out.println("Introduce otro número mayor que el anterior:");
        int impares_y = scanner.nextInt();

        for (;impares_x <= impares_y; impares_y--) {
            if (impares_y % 2 == 1) {
                System.out.println(impares_y);
            }
        }

//      7. Crea un programa en Java que simule una caja registradora de supermercado para devolver el cambio de una compra.
//      Solicita la cantidad total de dinero que tienes en la caja registradora (x) y el valor de la compra (y) como un número entero.
//      Debes utilizar billetes de 100, 50, 20, 10, 5, 2 o 1 y devolver el cambio utilizando primero los billetes de mayor valor.

        System.out.println("¿Cuánto dinero hay en la caja registradora?");
        int caja_registradora = scanner.nextInt();
        System.out.println("¿Cuál es el valor de la compra?");
        int valor_compra = scanner.nextInt();

        int cambio = caja_registradora - valor_compra;

        System.out.println("Tu cambio es de " + cambio + " euros.");

        int billetes_100 = 0;
        while (cambio >= 100) {
            billetes_100 ++;
            cambio = cambio -100;
        }
        if (billetes_100 > 0) {
            System.out.println(billetes_100 + " billete(s) de 100€.");
        }

        int billetes_50 = 0;
        while (cambio >= 50) {
            billetes_50 ++;
            cambio = cambio -50;
        }
        if (billetes_50 > 0) {
            System.out.println(billetes_50 + " billete(s) de 50€.");
        }

        int billetes_20 = 0;
        while (cambio >= 20) {
            billetes_20 ++;
            cambio = cambio -20;
        }
        if (billetes_20 > 0) {
            System.out.println(billetes_20 + " billete(s) de 20€.");
        }

        int billetes_10 = 0;
        while (cambio >= 10) {
            billetes_10 ++;
            cambio = cambio -10;
        }
        if (billetes_10 > 0) {
            System.out.println(billetes_10 + " billete(s) de 10€.");
        }

        int billetes_5 = 0;
        while (cambio >= 5) {
            billetes_5 ++;
            cambio = cambio -5;
        }
        if (billetes_5 > 0) {
            System.out.println(billetes_5 + " billete(s) de 5€.");
        }

        int monedas_2 = 0;
        while (cambio >= 2) {
            monedas_2 ++;
            cambio = cambio -2;
        }
        if (monedas_2 > 0) {
            System.out.println(monedas_2 + " moneda(s) de 2€.");
        }

        int monedas_1 = 0;
        while (cambio >= 1) {
            monedas_1 ++;
            cambio = cambio -1;
        }
        if (monedas_1 > 0) {
            System.out.println(monedas_1 + " moneda(s) de 1€.");
        }

        scanner.close();

    }
}