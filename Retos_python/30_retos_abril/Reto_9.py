'''
Los alumnos de Prometeo que cursan DAM/DAW + Master andan muy liados y no tienen claro cuando tienen clase y cuando no.

Haz un programa que les indique si tienen clase de FP, de Máster, o de las dos en un conjunto de fechas dado.
El usuario introduce un número N, que indica el número de días que quiere ver, se deberá imprimir el número del día,
si no tienen nada en esa fecha, FP si tiene clase de un módulo de DAM/DAW o Máster si ese día tiene clase de máster.
Los días múltiplos de 3 tienen clase de FP.
Los días múltiplos de 5, de máster.
Los días que son múltiplos de 3 y 5 tienen clase de las dos.

Ejemplo de entrada:
---------------------------------
15

Ejemplo de salida:
---------------------------------
1
2
FP
4
Máster
FP
7
8
FP
Máster
11
FP
13
14
FP + Máster
'''

validador = False

while not validador:
        try:
                dias = int(input("¿Cuántos días quieres ver?"))
                if dias > 0:
                        print(f"Estos son tus {dias} próximos días:")
                        for i in range(1,dias+1):
                                if i%3 == 0 and i%5 == 0:
                                        print("FP + Máster")
                                elif i%3 == 0:
                                        print("FP")
                                elif i%5 == 0:
                                        print("Máster")
                                else:
                                        print(i)
                        validador = True
                else:
                        print("Número introducido no válido, debe ser un número entero positivo.")
        except (ValueError):
                print("Valor introducido no válido, debe ser un número entero positivo.")