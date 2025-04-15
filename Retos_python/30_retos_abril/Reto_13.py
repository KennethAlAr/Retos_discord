'''
¿Alguna vez te has levantado con la necesidad de crear un cronómetro? Tranquilo, no eres el único.
Hoy vas a poder hacer tu sueño realidad.
Crea un programa que:
Pida al usuario que ingrese el número de segundos que desea contar.
Usa un bucle para contar desde el primer segundo hasta el número total de segundos indicado por el usuario.
Cada vez que el cronómetro llegue a 60 segundos, debe reiniciar los segundos a 0 y sumar 1 minuto.
Cuando los minutos lleguen a 60, debe reiniciar los minutos a 0 y sumar 1 hora.
El cronómetro debe mostrar el tiempo en formato hh:mm:ss, donde hh son las horas, mm los minutos y ss los segundos.

PISTA: Para que el cronómetro se actualice cada segundo, puedes utilizar la función time.sleep(1).
Esto hará que el programa espere 1 segundo entre cada iteración del bucle, imitando el comportamiento de un cronómetro real.

Ejemplo:
-------------------------------
00:00:01
00:00:02
00:00:03
etc.
'''

import time

activador = False
tiempo = 0
segundos = 0
minutos = 0
horas = 0

while not activador:
    try:
        tiempo = int(input("¿Cuántos segundos quieres contar?"))
        activador = True
    except (ValueError):
        print("Ese no es un número válido de segundos.")

for i in range (1, tiempo+1):
    segundos += 1
    if segundos == 60:
        minutos += 1
        segundos = 0
    if minutos == 60:
        horas += 1
        minutos = 0
    print("%02d" % horas, ":", "%02d" % minutos, ":","%02d" % segundos)
    time.sleep(1)