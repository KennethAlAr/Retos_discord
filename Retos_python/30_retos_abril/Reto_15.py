'''
Resulta que nos piden que programemos un validador de contraseñas. Algo fácil para los alumnos de Prometeo.
Solo tenemos que decir si una contraseña introducida por terminal es válida o no.
Para que una contraseña sea válida debe:
Tener al menos 8 caracteres.
Tener al menos una letra minúscula.
Tener al menos una letra mayúscula.
Tener al menos un número.
Tener al menos un símbolo especial de entre los siguientes *, ?, !, ^, “, $.
No contener la palabra GIT, en ningún formato (ni GIT, ni git, ni gIt, ni giT, ni Git, ni GIt, ni gIT, ni GiT). Odiamos Git.
'''

activador = False

while not activador:
    password = input("Introduce tu contraseña y verificaremos que sea segura y 'GitFree'")
    contador_mayusculas = 0
    contador_minusculas = 0
    contador_numeros = 0
    contador_simbolos = 0
    contador_git = 0
    if len(password) < 8:
        print("La contraseña no es válida, debe contener al menos 8 caracteres")
    else:
        lista_numeros = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "0"]
        lista_simbolos = ["*", "?", "!", "^", "\"", "$"]

        contador = 0
        for i in range(contador, len(password)):
            if password[i] == password[i].upper() and password[i].isalpha():
                contador_mayusculas += 1
            elif password[i] == password[i].lower() and password[i].isalpha():
                contador_minusculas += 1
            elif password[i] in lista_numeros:
                contador_numeros += 1
            elif password[i] in lista_simbolos:
                contador_simbolos += 1
            if "git" in password.lower():
                contador_git += 1

        if contador_mayusculas == 0:
            print("Tu contraseña debe tener al menos una letra mayúscula.")
        if contador_minusculas == 0:
            print("Tu contraseña debe tener al menos una letra minúscula.")
        if contador_numeros == 0:
            print("Tu contraseña debe tener al menos un número.")
        if contador_simbolos == 0:
            print("Tu contraseña debe tener al menos un símbolo entre los siguientes: '*', '?', '!', '^', '\"', '$'")
        if contador_git != 0:
            print("¡Tu contraseña no puede llevar git de ninguna manera!")

    if (contador_mayusculas != 0
            and contador_minusculas != 0
            and contador_numeros != 0
            and contador_simbolos != 0
            and contador_git == 0):
        activador = True
        print("¡Genial! Tu contraseña es segura y, lo mas importante, no contiene git.")