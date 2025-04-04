#         Un resplandor y hace ¡BOOM! y digo, ains ya está aquí la guerra.
#         Como dice la señora del famoso meme (link), un día estalló la guerra.
#         Haz un programa que, dado un número que se pasa por entrada, haga una cuenta atrás y acabe con un ¡BOOM!.
#
#         Ejemplo de entrada:
#         -----------------------------
#                 5
#
#         Ejemplo de salida:
#         -----------------------------
#         5
#         4
#         3
#         2
#         1
#         ¡BOOM!

import time

temporizador = int(input("¿Cuántos centímetros le quedan a la mecha?"))

while temporizador>0:

    print(temporizador)
    temporizador -=1
    time.sleep(1)

print("¡PIMBA!")