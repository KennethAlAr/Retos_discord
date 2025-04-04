# Crear dos variables utilizando los objetos fecha
# En la primera se representa la fecha (día, mes, año) actual.
# En la segunda se representa la fecha de nacimiento.
#
# Calcular cuántos años han transcurrido entre ambas fechas y muestra su resultado de maneras diferentes
# Dia, mes y año.
# Hora, minuto y segundo.
# Día de año.
# Día de la semana.
# Nombre del mes.
#
# Pistas: buscar sobre el paquete java.time para para fechas y horas.

import datetime

fecha_nacimiento = datetime.datetime(1988,12,13,00,00,00)
fecha_actual = datetime.datetime.now()
tiempo_transcurrido = fecha_actual - fecha_nacimiento

dias_transcurridos = tiempo_transcurrido.days
anos_transcurridos = dias_transcurridos//365
dias_restantes_meses = dias_transcurridos - (anos_transcurridos*365)
meses_transcurridos = dias_restantes_meses//31
dias_restantes = dias_restantes_meses - (meses_transcurridos*31)
segundos_transcurridos = tiempo_transcurrido.seconds + (dias_transcurridos*24*60*60)
minutos_transcurridos = segundos_transcurridos / 60
horas_transcurridas = minutos_transcurridos / 60


print(f"Han transcurrido {anos_transcurridos} años, {meses_transcurridos} meses y {dias_restantes} "
      f"dias desde tu nacimiento\n")
print(f"Eso son {horas_transcurridas} horas.")
print(f"Que a su vez son {minutos_transcurridos} minutos.")
print(f"O también {segundos_transcurridos} segundos.\n")
print(f"El día que naciste era el día número {fecha_nacimiento.timetuple().tm_yday} del año.")
print(f"Tu dia de nacimiento fue un: {fecha_nacimiento.strftime("%A")}")
print(f"Tu mes de nacimiento fue: {fecha_nacimiento.strftime("%B")}")





