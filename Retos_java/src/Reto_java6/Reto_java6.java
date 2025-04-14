package Reto_java6;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto_java6 {
    public static void main(String[] args) {
        /*
        Juan está trabajando en un Mercadona en el que no hay cajero automático,
        él siempre calcula el cambio de los clientes de cabeza.
        ¿Se te ocurre alguna forma de hacerle la vida más sencilla al pobre chaval?

        Crea un programa que:
        Reciba la cantidad de dinero (double) que el usuario ha entregado para pagar.
                Compare la cantidad entregada con el precio del producto y calcule la diferencia.
        Súmale el IVA porque esto es España, redondeado a dos décimas (+21%)
        Devuelva el valor utilizando la menor cantidad de billetes y monedas posibles siendo estos billetes de 500 €,
        billete de 200 €, billete de 100 €, billete de 50 €, billete de 20 €, billete de 10 €, billete de 5 €,
        moneda de 2 €, moneda de 1 €, moneda de 50 cnts, moneda de 20 cnts, moneda de 10 cnts, moneda de 2 cnts
        y moneda de 1 cnt.

        Pero cuidado, si un cliente intenta pagar con menos dinero del necesario… ¡tendrás que avisarle antes de que se lleve el producto gratis!

        Ejemplo:
        El producto cuesta 17 €.
                El cliente te da 20 pavos.
                El cambio es de 1 moneda de 1 euro y 1 moneda de 2 euros.
            */

        Scanner sc = new Scanner(System.in);

        boolean valores_correctos = false;
        double valor = 0;
        double dinero = 0;

        while (!valores_correctos) {
            try {
                System.out.println("¿Qué valor tiene tu compra? (IVA no incluido)");
                valor = sc.nextDouble();

                System.out.println("¿Con cuánto dinero quieres pagar?");
                dinero = sc.nextDouble();

                valores_correctos = true;

            } catch (InputMismatchException e) {
                System.out.println("No has introducido un valor admitido.");
            }
            sc.nextLine();
        }

        double valor_IVA = valor * 1.21;
        double cambio = dinero - valor_IVA;

        if (cambio > 0) {
            System.out.println("El valor de tu compra con el IVA incluido es de " + String.format("%.2f", valor_IVA) + "€, si pagas con "
                    + String.format("%.2f", dinero) + "€ tu cambio es de " + String.format("%.2f", cambio) + "€.");
            System.out.println("El cambio será con los siguientes billetes o monedas:");
        } else if (cambio == 0) {
            System.out.println("El valor de tu compra con el IVA incluido es de " + String.format("%.2f", valor_IVA) + "€, perfecto, eso es todo.");
        }else {
            System.out.println("¡Ese dinero no es suficiente para pagar tu compra!");
        }

        int billete_500e = 0;
        int billete_200e = 0;
        int billete_100e = 0;
        int billete_50e = 0;
        int billete_20e = 0;
        int billete_10e = 0;
        int billete_5e = 0;
        int moneda_2e = 0;
        int moneda_1e = 0;
        int moneda_50c = 0;
        int moneda_20c = 0;
        int moneda_10c = 0;
        int moneda_5c = 0;
        int moneda_2c = 0;
        int moneda_1c = 0;

        while (cambio > 0.0) {
            if (cambio >= 500) {
                cambio = cambio - 500;
                billete_500e = billete_500e + 1;
            } else if (cambio >= 200) {
                cambio = cambio - 200;
                billete_200e = billete_200e + 1;
            } else if (cambio >= 100) {
                cambio = cambio - 100;
                billete_100e = billete_100e + 1;
            } else if (cambio >= 50) {
                cambio = cambio - 50;
                billete_50e = billete_50e + 1;
            } else if (cambio >= 20) {
                cambio = cambio - 20;
                billete_20e = billete_20e + 1;
            } else if (cambio >= 10) {
                cambio = cambio - 10;
                billete_10e = billete_10e + 1;
            } else if (cambio >= 5) {
                cambio = cambio - 5;
                billete_5e = billete_5e + 1;
            } else if (cambio >= 2) {
                cambio = cambio - 2;
                moneda_2e = moneda_2e + 1;
            } else if (cambio >= 1) {
                cambio = cambio - 1;
                moneda_1e = moneda_1e + 1;
            } else if (cambio >= 0.5) {
                cambio = cambio - 0.5;
                moneda_50c = moneda_50c + 1;
            } else if (cambio >= 0.2) {
                cambio = cambio - 0.2;
                moneda_20c = moneda_20c + 1;
            } else if (cambio >= 0.1) {
                cambio = cambio - 0.1;
                moneda_10c = moneda_10c + 1;
            } else if (cambio >= 0.05) {
                cambio = cambio - 0.05;
                moneda_5c = moneda_5c + 1;
            } else if (cambio >= 0.02) {
                cambio = cambio - 0.02;
                moneda_2c = moneda_2c + 1;
            } else if (cambio >= 0.01) {
                cambio = cambio - 0.01;
                moneda_1c = moneda_1c + 1;
            } else {
                break;
            }
        }

        if (billete_500e > 0) {
            System.out.println(billete_500e + " billete/s de 500€.");
        }
        if (billete_200e > 0) {
            System.out.println(billete_200e + " billete/s de 200€.");
        }
        if (billete_100e > 0) {
            System.out.println(billete_100e + " billete/s de 100€.");
        }
        if (billete_50e > 0) {
            System.out.println(billete_50e + " billete/s de 50€.");
        }
        if (billete_20e > 0) {
            System.out.println(billete_20e + " billete/s de 20€.");
        }
        if (billete_10e > 0) {
            System.out.println(billete_10e + " billete/s de 10€.");
        }
        if (billete_5e > 0) {
            System.out.println(billete_5e + " billete/s de 5€.");
        }
        if (moneda_2e > 0) {
            System.out.println(moneda_2e + " moneda/s de 2€.");
        }
        if (moneda_1e > 0) {
            System.out.println(moneda_1e + " moneda/s de 1€.");
        }
        if (moneda_50c > 0) {
            System.out.println(moneda_50c + " moneda/s de 50 céntimos.");
        }
        if (moneda_20c > 0) {
            System.out.println(moneda_20c + " moneda/s de 20 céntimos.");
        }
        if (moneda_10c > 0) {
            System.out.println(moneda_10c + " moneda/s de 10 céntimos.");
        }
        if (moneda_5c > 0) {
            System.out.println(moneda_5c + " moneda/s de 5 céntimos.");
        }
        if (moneda_2c > 0) {
            System.out.println(moneda_2c + " moneda/s de 2 céntimos.");
        }
        if (moneda_1c > 0) {
            System.out.println(moneda_1c + " moneda/s de 1 céntimo.");
        }

        sc.close();
    }
}
