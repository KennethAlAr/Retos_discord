'''
Imagina una emocionante carrera entre caracoles cibernéticos.
Cada caracol tiene una velocidad aleatoria entre 1 y 5 (¡qué emoción!).

Escribe un programa que simule una carrera de 20 "pasos" entre dos caracoles.
En cada paso, la posición de cada caracol aumenta según su velocidad.
Al final, ¡declara al caracol ganador (o si hay un emocionante empate)!

Pista: usar java.util.Random
'''
import time
from random import Random, randrange

caracol = 0
validador = False

while not validador:
    try:
        print("¿Qué caracol crees que va a ganar la 'Snail Cup'?")
        print("1. Shellvester Stallone")
        print("2. Gary B. Quick")
        print("3. The Flash-y (casi)")
        print("4. Speedy McSluggish")

        caracol = int(input())

        match caracol:
            case 1:
                print("¡Has elegido Shellvester Stallone!")
                validador = True
            case 2:
                print("¡Has elegido a Gary B. Quick!")
                validador = True
            case 3:
                print("¡Has elegido a The Flash-y!")
                validador = True
            case 4:
                print("¡Has elegido a Speedy McSluggish!")
                validador = True
            case _:
                print("¡No existe ningún caracol con ese número!\n")
                time.sleep(1)

    except ValueError:
        print("Esa no es una opción válida\n")
        time.sleep(1)

time.sleep(1)
print("\n¡Que empiece la carrera!")
time.sleep(0.5)

ganador = False
posicion_1 = 0
posicion_2 = 0
posicion_3 = 0
posicion_4 = 0

print("(1)  (@)_´o´", 50 * " ", "|| Shelvester Stallone")
print("(2)  (@)_´o´", 50 * " ", "|| Gary B. Quick")
print("(3)  (@)_´o´", 50 * " ", "|| The Flash-y")
print("(4)  (@)_´o´", 50 * " ", "|| Speedy McSluggish")
print("\n")
time.sleep(1)

while not ganador:
    posicion_1 += randrange(1, 6)
    posicion_2 += randrange(1, 6)
    posicion_3 += randrange(1, 6)
    posicion_4 += randrange(1, 6)

    if posicion_1 >= 50 or posicion_2 >= 50 or posicion_3 >= 50 or posicion_4 >= 50:
        ganador = True

    if posicion_1 <= 50:
        print(f"(1) {"~" * posicion_1}(@)_´o´{" " * (50-posicion_1)}|| Shellvester Stallone")
    else:
        posicion_1 = 50
        print(f"(1) {"~" * posicion_1}(@)_´o´{" " * (50 - posicion_1)}|| Shellvester Stallone")
    if posicion_2 <= 50:
        print(f"(2) {"~" * posicion_2}(@)_´o´{" " * (50-posicion_2)}|| Gary B. Quick")
    else:
        posicion_2 = 50
        print(f"(2) {"~" * posicion_2}(@)_´o´{" " * (50 - posicion_2)}|| Gary B. Quick")
    if posicion_3 <= 50:
        print(f"(3) {"~" * posicion_3}(@)_´o´{" " * (50 - posicion_3)}|| The Flash-y")
    else:
        posicion_3 = 50
        print(f"(3) {"~" * posicion_3}(@)_´o´{" " * (50 - posicion_3)}|| The Flash-y")
    if posicion_4 <= 50:
        print(f"(4) {"~" * posicion_4}(@)_´o´{" " * (50 - posicion_4)}|| Speedy McSluggish")
    else:
        posicion_4 = 50
        print(f"(4) {"~" * posicion_4}(@)_´o´{" " * (50 - posicion_4)}|| Speedy McSluggish")

    print("\n")
    time.sleep(1)

lista_campeones = []
ganadores = 0

if posicion_1 >= 50:
    ganadores += 1
    lista_campeones.append("Shellvester Stallone")
if posicion_2 >= 50:
    ganadores += 1
    lista_campeones.append("Gary B. Quick")
if posicion_3 >= 50:
    ganadores += 1
    lista_campeones.append("The Flash-y")
if posicion_4 >= 50:
    ganadores += 1
    lista_campeones.append("Speedy McSluggish")

if ganadores == 1:
    print(f"El ganador de la 'Snail Cup' es {lista_campeones[0]}!")
elif ganadores > 1:
    print("¡Tenemos un empate! Los ganadores son:")
    i = 0
    while i < len(lista_campeones):
        print(lista_campeones[i])
        i += 1

lista_caracoles = [
    "Shellvester Stallone",
    "Gary B. Quick",
    "The Flash-y",
    "Speedy McSluggish"
]

caracol_escogido = lista_caracoles[caracol-1]
if caracol_escogido in lista_campeones:
    print(f"\n¡Felicidades! {caracol_escogido} es el vencedor y tu has ganado la apuesta.")
else:
    print(f"\nLo siento, {caracol_escogido} no ha ganado la carrera...")