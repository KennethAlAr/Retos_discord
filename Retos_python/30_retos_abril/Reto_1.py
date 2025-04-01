'''
En Grado Superior las notas se tienen que poner como un número entero,
así que un día podrás ser el profe de entornos y podrás disfrutar del placer de
poner un 7 a un estudiante con un 7,49 en el examen.

Desarrolla un algoritmo que, dado un número decimal, devuelve su resultado entero redondeado siguiendo estas normas:
Todos los números decimales por debajo de ,5 se redondean a la baja.
Los que tengan decimales desde ,5 a superior, se redondean al alza.

Ejemplo:
Si el usuario introduce 4,49, el programa debe devolver un 4
Si el usuario introduce 9,5 el programa debe devolver un 10
'''

# Primera aproximación:

# nota = float(input("¿Cuál es tu nota?"))
# nota_redondeada = round(nota,0)
# print(f"Tu nota final es: {nota_redondeada}")

# Mmmmm esto es demasiado aburrido y además es inconsistente cuando el decimal es X,5 (a veces da el número
# superior y a veces da el inferior)

# Vamos a probar otra cosa:

import math

nota_decimal = float(input("¿Cuál es tu nota?"))
nota_truncada = math.floor(nota_decimal)
decimal = nota_decimal - nota_truncada # Aquí obtenemos solo los decimales de la nota para hacer el cálculo
nota_final = 0

if (decimal >= 0.5):
    nota_final = math.ceil(nota_decimal)
else:
    nota_final = math.floor(nota_decimal)

print(f"Tu nota final es: {nota_final}")