'''
Simula una votación simple para 3 candidatos ("Coder", "Debugger", "Tester").
Pide a 5 votantes que introduzcan su voto (el nombre del candidato).
Usa un bucle for para simular los 5 votantes.
Usa un diccionario (o similar) para llevar el conteo de votos para cada candidato.
Usa if/else para verificar si el voto introducido es para uno de los candidatos válidos.
Si no lo es, incrementa un contador de "votos inválidos".
Introduce la posibilidad de un "error de conteo" aleatorio (simula lanzar una excepción dentro del if/else de los votos válidos).
Usa un try-catch alrededor del proceso de conteo. Si ocurre el error, muestra un mensaje de "¡Error en el conteo! ¡Se descarta este voto!".
Al final, muestra el número de votos para cada candidato y el número total de votos inválidos.
'''
from random import randint

print("¡Ha llegado el momento de las votaciones! ¿A quién quieres votar?\n"
      "Nuestros candidatos son Coder, Debugger y Tester")

dict_candidatos = {
    "Coder":0,
    "Debugger":0,
    "Tester":0
}

votos_no_validos = 0
activador = False

while not activador:
    for i in range(0,5):
        try:
            voto = input(f"Votante número {i + 1} ¿para quién es tu voto?")
            numero = randint(1,6)
            i += 1
            if numero == 5:
                i = i/0 # error de conteo
            if voto == "Coder":
                dict_candidatos["Coder"] += 1
            elif voto == "Debugger":
                dict_candidatos["Debugger"] += 1
            elif voto == "Tester":
                dict_candidatos["Tester"] += 1
            else:
                votos_no_validos += 1
            if i == 4:
                activador = True
        except (ZeroDivisionError):
            print("¡Error en el conteo! ¡Se descarta este voto!")
            votos_no_validos += 1

print(f"Coder obtiene {dict_candidatos["Coder"]} votos.")
print(f"Debugger obtiene {dict_candidatos["Debugger"]} votos.")
print(f"Tester obtiene {dict_candidatos["Tester"]} votos.")
print(f"Hay {votos_no_validos} voto/s no válido/s.")