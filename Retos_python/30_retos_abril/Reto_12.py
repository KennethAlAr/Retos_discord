'''
Pide al usuario que introduzca varios números enteros (uno por uno, y que indique "fin" para terminar).
El programa debe verificar si cada número introducido es un "número de la suerte".
Se considera un número de la suerte si es múltiplo de 7 (el resto de la división entre 7 es 0).
Por cada número de la suerte encontrado, el programa imprimirá "¡[número] es un número de la suerte!".
Al final, mostrará cuántos números de la suerte se encontraron en total.
Pista: No olvides usar el try/catch 🙂
'''

activador = False
contador = 0

while not activador:
    try:
        numero = input("Ingresa un número entero o escribe 'fin' para finalizar:")
        if numero == "fin":
            activador = True
        else:
            numero_int = int(numero)
            if numero_int%7 == 0:
                print(f"¡{numero_int} es un número de la suerte!")
                contador += 1
    except (ValueError):
        print("Eso no es un número válido, debe ser un entero.")

print(f"Se han encontrado {contador} números de la suerte.")