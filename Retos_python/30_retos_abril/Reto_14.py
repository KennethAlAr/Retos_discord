'''
Hoy en clase, a Federico le han dicho que las flashcards son un buen método de estudio.
Pero Federico no tiene nada para escribir en su casa.
¿Se te ocurre alguna forma para que pueda estudiar con el método mencionado?

Pues claro que sí, vas a crear un programa que:
Almacene las flashcards en una lista (pregunta, respuesta).
Permita al usuario añadir nuevas flashcards.
Muestra una pregunta aleatoria de la lista.
Solicite una respuesta del usuario.
Compare la respuesta del usuario con la correcta.
Indique si la respuesta es correcta o incorrecta.
Permita continuar practicando o salir.

Ejemplo:
------------------------
Anverso: La programación es…
Reverso: Darle una serie de instrucciones a una máquina para que ejecute una acción específica.
'''

from random import randrange

tarjetas = [
    ["¿Qué es un lenguaje de programación?",
    "Es un conjunto de reglas y símbolos que permiten escribir instrucciones para que un ordenador las entienda y ejecute."],
    ["¿Qué es una variable en programación?",
    "Es un espacio de memoria donde se guarda un dato que puede cambiar durante la ejecución del programa."],
    ["¿Para qué se usa el comando print en Python?",
    "Se usa para mostrar información en la pantalla, como mensajes o resultados de operaciones."],
    ["¿Qué es un algoritmo?",
    "Es una serie de pasos ordenados y lógicos que se siguen para resolver un problema o realizar una tarea."]
]

activador = False

while not activador:
    try:
        print("¿Qué quieres hacer?")
        print("1. Añadir una tarjeta.\n"
              "2. Ver una tarjeta aleatoria.\n"
              "3. Salir.")
        opcion = int(input())

        match opcion:
            case 1:
                print("\nOpción 1")
                pregunta = input("¿Cuál es la pregunta que quieres añadir?")
                respuesta = input("¿Cuál es la respuesta?")
                nueva_pregunta = [pregunta, respuesta]
                tarjetas.append(nueva_pregunta)
                print("¡Pregunta y respuesta añadida!\n")
            case 2:
                print("\nOpción 2")
                numero_pregunta = randrange(0, len(tarjetas))
                print("Pregunta:")
                print(tarjetas[numero_pregunta][0])
                respuesta_usuario = input("\nResponde aquí:")
                if respuesta_usuario == tarjetas[numero_pregunta][1]:
                    print(f"¡Correcto! La respuesta es: \n{tarjetas[numero_pregunta][1]}\n")
                else:
                    print(f"¡Incorrecto! La respuesta es: \n{tarjetas[numero_pregunta][1]}\n")
            case 3:
                print("Cerrando programa")
                activador = True
            case _:
                print("Esa no es una opción válida.")
    except (ValueError):
        print("Esa no es una opción válida.")