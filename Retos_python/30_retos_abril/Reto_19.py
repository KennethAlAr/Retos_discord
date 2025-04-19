'''
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
'''
import sys

saldo = 5000
pin = 1234

print("¡Bienvenido a PyBank")
print("Introduzca el número PIN secreto:")

contador = 3

while contador > 0:
    try:
        pinUsuario = int(input())
        if pinUsuario == pin:
            print("Accediendo a su cuenta bancaria...")
            break
        else:
            contador -= 1
            print(f"PIN incorrecto, le quedan {contador} intento/s.")
    except (ValueError):
        contador -= 1
        print(f"PIN incorrecto, le quedan {contador} intento/s.")

if contador == 0:
    print("No le quedan intentos, bloqueando cuenta.")
    sys.exit()

opcion = 0

while opcion != 4:
    print("\n¿Qué desea hacer?")
    print("1. Consultar su saldo.")
    print("2. Retirar fondos.")
    print("3. Ingresar dinero.")
    print("4. Salir\n")
    try:
        opcion = int(input())

        match (opcion):
            case 1:
                print(f"Su saldo actual es de {saldo}€.\n")
            case 2:
                dinero_retirado = int(input("¿Cuánto dinero quiere retirar?"))
                if saldo >= dinero_retirado:
                    saldo -= dinero_retirado
                    print(f"Retirado/s {dinero_retirado}€.")
                    print(f"Saldo restante: {saldo}€\n")
                else:
                    print("Saldo insuficiente.\n")
            case 3:
                dinero_ingresado = int(input("¿Cuánto dinero quiere ingresar?"))
                saldo += dinero_ingresado
                print(f"Ingresado/s {dinero_ingresado}€.")
                print(f"Saldo restante: {saldo}€\n")
            case 4:
                print("Saliendo de su cuenta.")
            case _:
                print("Opción no válida.\n")
    except (ValueError):
        print("Opción no válida.\n")