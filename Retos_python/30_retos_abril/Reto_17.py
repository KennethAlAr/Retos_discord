'''
Pide al usuario que introduzca un poema de hasta 4 líneas. Lola la Crítica intentará analizar su "métrica" según reglas muy extrañas:
Línea 1: Debe tener exactamente 5 palabras.
Línea 2: Debe contener la letra 'z' al menos una vez.
Línea 3: Debe tener más vocales que consonantes.
Línea 4: Debe terminar con la misma palabra con la que empezó la primera línea (ignorando mayúsculas/minúsculas).

Para llevar a cabo el programa:
Usa un bucle for para leer cada línea del poema.
Usa if/else para verificar si cada línea cumple su regla. Si no, Lola da una crítica divertida
(ej., "¡Demasiadas palabras para mi gusto!", "¡Le falta un toque de 'z'!".).
Usa try-catch para manejar si el usuario introduce menos de 4 líneas (simulando un poema incompleto).
Al final, da una "puntuación poética" basada en cuántas reglas cumplió el poema.
'''

print("Escribe un poema y Lola la Crítica lo puntuará para ti.\n"
      "Separa cada estrofa con un 'ENTER' y si no quieres añadir ninguna estrofa mas presiona 'ENTER' otra vez.")

contador = 4
poema = []
while contador > 0:
    estrofa = input()
    if not estrofa == "":
        poema.append(estrofa)
        contador -= 1
    else:
        break

puntuacion = 0

try:
    for i in range(0, 4):
        estrofa = poema[i]
        if i == 0:
            palabras = estrofa.split(" ")
            numero_palabras = len(palabras)
            if numero_palabras < 5:
                print("La primera estrofa tiene pocas palabras para mi gusto...")
            elif numero_palabras > 5:
                print("Mmmmm... ¿No crees que a la primera estrofa le sobran palabras?")
            else:
                puntuacion += 1
        if i == 1:
            if "z" in estrofa.lower():
                puntuacion += 1
            else:
                print("¡A la segunda estrofa le falta un toque de 'z'!")
        if i == 2:
            vocales = ["a", "e", "i", "o", "u"]
            numero_vocales = 0
            numero_consonantes = 0
            for j in range(0, len(estrofa)):
                if estrofa[j].lower() in vocales and estrofa[j].isalpha():
                    numero_vocales += 1
                elif estrofa[j].isalpha():
                    numero_consonantes += 1
            if numero_consonantes < numero_vocales:
                puntuacion += 1
            else:
                print("Aixxx, demasiadas consonantes en la tercera estrofa... ¡Hay mas consonantes que vocales!")
        if i == 3:
            estrofa_1 = poema[0].split(" ")
            estrofa_4 = poema[i].split(" ")
            if estrofa_1[0].lower() == estrofa_4[-1].lower():
                puntuacion += 1
            else:
                print("¡No, no, no y no! ¡Un buen poema debe terminar con la misma palabra con la que empieza!")

    if puntuacion == 0:
        print("\nHe leído tu poema y te doy mi consejo sincero,\nmucho tienes que aprender y te doy un cero.")
    elif puntuacion == 1:
        print("\nDe mis criterios has dado con alguno...\nno es mucho, pero te doy un uno")
    elif puntuacion == 2:
        print("\nNo está mal para unos versos dejados de Diós,\nTendrás que esforzarte mas pero te llevas un dos")
    elif puntuacion == 3:
        print("\nAquí me hallo, a tus versos haciendo de juez\nno te asustes, tranquilo, porque te llevas un tres.")
    elif puntuacion == 4:
        print("\nEres un genio,\nde los poemas una persona recta,\nme gusta tanto tu poema,\n¡que le doy una puntuación perfecta!")

except (IndexError):
    print("\n...\nPero alma de cántaro... ¿Cómo quieres que puntúe un poema que no tiene cuatro estrofas?")