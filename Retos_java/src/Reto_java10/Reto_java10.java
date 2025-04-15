package Reto_java10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto_java10 {
    public static void main(String[] args) {
        /*
        Una tienda de galletas artesanales vende al por mayor en su página web. Cada caja de galletas cuesta 6€.
        Solicita la cantidad de cajas de galletas en cada venta y dependiendo de la cantidad introducida se realizan los siguientes pasos:

        Si la cantidad de cajas de galletas vendidas es menor a 5: no se permiten compras inferiores a 5 cajas de galletas.
        Si la cantidad de cajas de galletas es mayor o igual a 5, pero menor a 15: los gastos de envío son de 10€.
        Si la cantidad de cajas de galletas es mayor a 15: El envío es gratuito.

        Promociones:
        Si el precio total es inferior a 120€ no hay promociones.
        Si el precio total supera los 120€ pero es menor a 250€: Tiene un descuento del 5%.
        Si el precio total supera los 250€: Tiene un descuento del 10%.

        Muestra al cliente un mensaje por pantalla según la cantidad de cajas de galletas que quiera comprar:
        Número total de cajas a comprar.
        Total € de la compra.
        Gastos de envío (si los tiene o si es gratuito)
        Descuento por compra (Indicar al cliente cuántos € falta para entrar en una promoción si la compra es <100€ o el importe de descuento generado si es superior)
        */

        Scanner sc = new Scanner(System.in);
        boolean activador = false;
        int gastosDeEnvio = 0;
        int numeroCajas = 0;
        double precio = 0;
        int descuento5 = 0;
        int descuento10 = 0;

        System.out.println("Vendemos galletas al por mayor, cada caja de galletas cuesta 6€.");

        while (!activador) {
            try {
                System.out.println("¿Cuántas cajas quieres?");
                numeroCajas = sc.nextInt();
                precio = numeroCajas * 6;

                if (numeroCajas < 5) {
                    System.out.println("Lo siento, nuestro pedido mínimo es de 5 cajas de galletas.");
                } else if (numeroCajas >= 5 && numeroCajas < 15) {
                    gastosDeEnvio = 10;
                    activador = true;
                } else {
                    gastosDeEnvio = 0;
                    activador = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("El número introducido no es válido.");
                sc.nextLine();
            }
        }

        if (precio >= 120 && precio < 250) {
            descuento5 = 1;
        } else if (precio >= 250) {
            descuento10 = 1;
        }

        System.out.println("Tu compra es de " + numeroCajas + " cajas de galletas.");
        System.out.println("El total de tu compra es de " + String.format("%,.2f", (precio * (1 - 0.05 * descuento5 - 0.1 * descuento10))) + "€.");
        if (gastosDeEnvio > 0) {
            System.out.println("Los gastos de envío son " + gastosDeEnvio + "€. Sumando un total de " +
                    String.format("%,.2f", (precio * (1 - 0.05 * descuento5 - 0.1 * descuento10)) + gastosDeEnvio) + "€.");
        } else {
            System.out.println("El envío para este pedido es gratuito.");
        }

        if (precio < 120) {
            System.out.println("Te faltan " + String.format("%,.2f", (120 - precio)) + "€ para tener un descuento del 5% en tu compra.");
        } else if (precio >= 120 && precio < 250) {
            System.out.println("Se ha aplicado un descuento de " + String.format("%,.2f", (precio * 0.05)) + "€ a tu compra, el 5%.");
            System.out.println("Te  faltan " + String.format("%,.2f", (250 - precio)) + "€ para tener un descuento del 10% en tu compra.");
        } else {
            System.out.println("Se ha aplicado un descuento de " + String.format("%,.2f", (precio * 0.1)) + "€ a tu compra, el 10%.");
        }

        sc.close();

    }
}
