'''
Escribe un programa que le pregunte al usuario su nombre.
Si el nombre comienza con la letra "A" (mayúscula o minúscula),
el robot responderá con un saludo entusiasta como: ¡Hola, Asombroso/a "Nombre"!.
Si el nombre tiene más de 7 letras, el robot dirá: ¡Vaya, "Nombre", ¡qué nombre tan largo y sofisticado!.
Para cualquier otro nombre, el robot simplemente dirá: Saludos, "Nombre".

¡Prepara al robot para varios tipos de nombres!
Como un saludo especial a un nombre que empiece por A y tenga 7 letras, o que cuente un chiste si saluda a Jaimito...
'''

nombre = input("¿Cuál es tu nombre?")
nombre = nombre.capitalize()

if nombre[0] == 'A' and len(nombre) == 7:
        print(f"Aquí hago alarde, ando, aúllo, aplaudo, actúo, arraso por {nombre}")
elif nombre[0] == 'A':
        print(f"¡Hola, Asombroso/a {nombre}")
elif len(nombre) > 7:
        print(f"¡Vaya, {nombre}!¡Que nombre tan largo y sofisticado!")
elif nombre == "Jaimito":
        print("Jaimito! ¿Cómo se dice 'perro' en inglés?")
        print("Dog")
        print("¿Y cómo se dice veterinario?")
        print("¡Dogtor!")
        print("\nMe meo... xDDD")
else:
        print(f"Hola, {nombre}")