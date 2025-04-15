'''
Una tienda de galletas artesanales vende al por mayor en su página web. Cada caja de galletas cuesta 6€.
Solicita la cantidad de cajas de galletas en cada venta y dependiendo de la cantidad introducida se realizan los siguientes pasos:

Si la cantidad de cajas de galletas vendidas es menor a 5: no se permiten compras inferiores a 5 cajas de galletas.
Si la cantidad de cajas de galletas es mayor o igual a 5, pero menor a 15: los gastos de envío son de 10€.
Si la cantidad de cajas de galletas es mayor a 15: El envío es gratuito.

Promociones:
Si el precio total es inferior a 120€ no hay promociones.
Si el precio total supera los 120€ pero es menor a 250€: Tiene un descuento del 5%.
Si el precio total supera los 250€: Tiene un descuento del 10%.

Muestra al cliente un mensaje por pantalla según la cantidad de cajas de galletas que quiera comprar:
Número total de cajas a comprar.
Total € de la compra.
Gastos de envío (si los tiene o si es gratuito)
Descuento por compra (Indicar al cliente cuántos € falta para entrar en una promoción si la compra es <100€ o el importe de descuento generado si es superior)
'''

activador = False
gastos_de_envio = 0
numero_cajas = 0
precio = 0
descuento_5 = False
descuento_10 = False

print("Vendemos galletas al por mayor, cada caja de galletas cuesta 6€.")

while not activador:
    try:
        numero_cajas = int(input("¿Cuántas cajas quieres?"))
        precio = numero_cajas * 6

        if numero_cajas < 5:
            print("Lo siento, nuestro pedido mínimo es de 5 cajas de galletas.")
        elif numero_cajas >= 5 and numero_cajas < 15:
            gastos_de_envio = 10
            activador = True
        else:
            gastos_de_envio = 0;
            activador = True
    except (ValueError):
        print("El número introducido no es válido.")

if precio >= 120 and precio < 250:
    descuento_5 = True
elif precio >= 250:
    descuento_10 = True

print(f"Tu compra es de {numero_cajas} cajas de galletas.")
print(f"El total de tu compra es de {round(precio * (1 - 0.05 * descuento_5 - 0.1 *descuento_10), 2)}€.")
if gastos_de_envio > 0:
    print(f"Los gastos de envío son {gastos_de_envio}€. Sumando un total de {round(precio * (1 - 0.05 * descuento_5 - 0.1 *descuento_10), 2)}€.")
else:
    print("El envío para este pedido es gratuito.")

if precio < 120:
    print(f"Te faltan {round(120-precio, 2)}€ para tener un descuento del 5% en tu compra.")
elif precio >= 120 and precio < 250:
    print(f"Se ha aplicado un descuento de {round(precio*0.05, 2)}€ a tu compra, el 5%.")
    print(f"Te faltan {round(250-precio, 2)}€ para tener un descuento del 10% en tu compra.")
else:
    print(f"Se ha aplicado un descuento de {round(precio * 0.1, 2)}€ a tu compra, el 10%.")