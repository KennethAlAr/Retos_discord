# Jordi nunca se acuerda de abrir las exclamaciones.
# Él dice que es porque en catalán no se abren las exclamaciones, pero yo creo que simplemente no sabe escribir.
# Vamos a crear un programa que asegure que hay tantos abrir exclamación (¡) como cerrar exclamación (!) para flamearlo.
#
# Ejemplo de entrada:
# -------------------------
# ¡¡¡Caramba!!!
# Hola!
#
# Ejemplo de salida:
# -------------------------
# Si
# No

palabra = (input("Introduce una palabra entre exclamaciones (¡tantas como quieras!):"))

interruptor = True

for i in range(0,len(palabra)-1):
    if palabra[-1-i] == "!":
        if palabra[i] != "¡":
            interruptor = False
            i += 1
    elif palabra[i] == "¡":
        interruptor = False
    else:
        break

if interruptor == True:
    print("¡Perfecto! ¡Abres tantas exclamaciones como cierras!")
else:
    print("¡Jordi! Te has olvidado de abrir o cerrar una exclamación...")