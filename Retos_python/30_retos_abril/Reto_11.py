'''
El programa elige una palabra secreta (por ejemplo, "programar").
El usuario tiene 5 intentos para adivinar la palabra.
En cada intento, el programa compara la palabra introducida por el usuario con la palabra secreta.
Si son iguales, muestra un mensaje de felicitación y termina.
Si no son iguales, indica cuántos intentos le quedan.
Si se agotan los intentos sin adivinar, muestra la palabra secreta y un mensaje de "¡Game Over!".
'''

palabra_secreta = "Aguacate"

print("Adivina la palabra secreta, tienes 5 intentos:")
intentos = 5

while True:
    intento = input().capitalize()
    if intento == palabra_secreta:
        print("¡Felicidades, has acertado! La palabra secreta era Aguacate.")
        break
    else:
        intentos -= 1
        if intentos > 0:
            print(f"Incorrecto, te quedan {intentos} intentos.")
        else:
            print("Lo siento, no te quedan intentos =(")
            print("La palabra secreta era Aguacate")
            print("¡GAME OVER!")
            break