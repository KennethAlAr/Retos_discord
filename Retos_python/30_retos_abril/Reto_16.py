'''
Crea una calculadora muy especial que a veces está de buen humor y otras no.
Pide al usuario que introduzca dos números y la operación (+, -, *, /).
Si la operación es división (/) y el segundo número es 0,
la calculadora se pondrá de mal humor y lanzará un error (simúlalo con un try-catch que imprima un
mensaje como "¡¿Dividir por cero?! ¡¿Acaso quieres destruir el universo?!").
Para las otras operaciones, realiza el cálculo normal y muestra el resultado con un mensaje alegre como
"¡Tadá! El resultado es...".
'''

import time

activador_1 = False
numero_1 = 0
numero_2 = 0

while not activador_1:
    try:
        numero_1 = int(input("Introduce dos números:"))
        numero_2 = int(input())
        activador_1 = True;
    except ValueError:
        print("No me vaciles, he dicho dos números, no otra cosa. Vamos otra vez...\n")

activador_2 = False

while not activador_2:
    try:
        print("¿Qué quieres hacer?")
        print("1. Sumar.\n" +
            "2. Restar.\n" +
            "3. Multiplicar.\n" +
            "4. Dividir.")

        operacion = int(input())

        match operacion:
            case 1:
                resultado_suma = numero_1 + numero_2
                print(f"¡Tadá! El resultado de sumar {numero_1} y {numero_2} es: {resultado_suma}")
                activador_2 = True
            case 2:
                resultado_resta = numero_1 - numero_2
                print(f"¡Tadá! El resultado de restar {numero_1} y {numero_2} es: {resultado_resta}")
                activador_2 = True
            case 3:
                resultado_multiplicacion = numero_1 * numero_2
                print(f"¡Tadá! El resultado de multiplicar {numero_1} y {numero_2} es: {resultado_multiplicacion}")
                activador_2 = True
            case 4:
                resultado_division = numero_1 / numero_2
                print(f"¡Tadá! El resultado de dividir {numero_1} entre {numero_2} es: {resultado_division}")
                activador_2 = True
            case _:
                print(f"¡Tadá! La transformada de Laplace del número {numero_1} y el número {numero_2} es:")
                time.sleep(1)
                print("...")
                time.sleep(1)
                print("...")
                time.sleep(1)
                print("...")
                time.sleep(1)
                print("¿¡Yo qué se!? ¡Esa no es una de las opciones que te he dado!\n")
    except (ValueError):
        print("En serio... no es tan difícil, solo tienes que elegir una operación y poner el número que tiene delante...\n")
    except ZeroDivisionError:
        print("...")
        time.sleep(1)
        print("...")
        time.sleep(1)
        print("...")
        time.sleep(1)
        print("¿Estás loco? ¿Dividir entre cero? ¿Quiéres destruir el universo?\n")
        activador_2 = True