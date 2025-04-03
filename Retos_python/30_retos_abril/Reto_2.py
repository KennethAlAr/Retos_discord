meses = (
    "enero",
    "febrero",
    "marzo",
    "abril",
    "mayo",
    "junio",
    "julio",
    "agosto",
    "septiembre",
    "octubre",
    "noviembre",
    "diciembre"
)
meses_30_dias = (
    "abril",
    "junio",
    "septiembre",
    "noviembre"
)

for mes in meses:
    print(mes)
    if mes == "febrero":
        for i in range(1,28+1):
            print(f"{i}\t", end = "")
            if i%7 == 0:
                print()
    elif mes in meses_30_dias:
        for i in range(1,30+1):
            print(f"{i}\t", end="")
            if i % 7 == 0:
                print()
    else:
        for i in range(1,31+1):
            print(f"{i}\t", end="")
            if i % 7 == 0:
                print()
    print("\n\n")