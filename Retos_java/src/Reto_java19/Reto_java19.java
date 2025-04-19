package Reto_java19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto_java19 {
    public static void main(String[] args) {
        /*
        Simula un cajero automático con un saldo inicial. Permite al usuario realizar las siguientes acciones
        (usando un bucle for para un máximo de 3 intentos fallidos de PIN):
        Introducir PIN: Pide al usuario un PIN (establece uno secreto).
        Si lo introduce incorrectamente 3 veces, bloquea la cuenta (simula esto con un mensaje y terminal).
        Consultar Saldo: Muestra el saldo actual.
        Retirar Fondos: Pide la cantidad a retirar. Usa try-catch para manejar si el usuario introduce algo que no es un número.
        Si la cantidad es válida, verifica si hay suficiente saldo. Si no, informa del saldo insuficiente.
        Si todo va bien, resta la cantidad del saldo y muestra un mensaje de éxito.
        Salir: Termina la simulación.
        El programa debe mostrar un menú de opciones en cada paso hasta que el usuario elija salir o la cuenta se bloquee.
        */

        Scanner sc = new Scanner(System.in);

        int saldo = 5000;
        int pin = 1234;

        System.out.println("¡Bienvenido a JavaBank!");
        System.out.println("Introduzca el número PIN secreto:");

        int contador = 3;

        while (contador > 0) {
            try {
                int pinUsuario = sc.nextInt();
                if (pinUsuario == pin) {
                    System.out.println("Accediendo a su cuenta bancaria...");
                    sc.nextLine();
                    break;
                } else {
                    contador--;
                    System.out.println("PIN incorrecto, le quedan " + contador + " intento/s.");
                    sc.nextLine();
                }
            } catch (InputMismatchException errorPin) {
                contador--;
                System.out.println("PIN incorrecto, le quedan " + contador + " intento/s.");
                sc.nextLine();
            }
        }

        if (contador == 0) {
            System.out.println("No le quedan intentos, bloqueando cuenta.");
            System.exit(0);
        }

        int opcion =0;

        while (opcion != 4) {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Consultar su saldo.");
            System.out.println("2. Retirar fondos.");
            System.out.println("3. Ingresar dinero.");
            System.out.println("4. Salir\n");
            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Su saldo actual es de " + saldo + "€.\n");
                        break;
                    case 2:
                        System.out.println("¿Cuánto dinero quiere retirar?");
                        int dineroRetirado = sc.nextInt();
                        if (saldo >= dineroRetirado) {
                            saldo = saldo - dineroRetirado;
                            System.out.println("Retirado/s " + dineroRetirado + "€.");
                            System.out.println("Saldo restante: " + saldo + "€\n");
                        } else {
                            System.out.println("Saldo insuficiente.\n");
                        }
                        break;
                    case 3:
                        System.out.println("¿Cuánto dinero quiere ingresar?");
                        int dineroIngresado = sc.nextInt();
                        saldo = saldo + dineroIngresado;
                        System.out.println("Ingresado/s " + dineroIngresado + "€.");
                        System.out.println("Saldo total: " + saldo + "€\n");
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.println("Saliendo de su cuenta.");
                        break;
                    default:
                        sc.nextLine();
                        System.out.println("Opción no válida.\n");
                }
            } catch (InputMismatchException errorOpcion) {
                sc.nextLine();
                System.out.println("Opción no válida\n");
            }
        }

        sc.close();

    }
}
