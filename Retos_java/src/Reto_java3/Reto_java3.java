package Reto_java3;

import java.time.*;

public class Reto_java3 {
    public static void main(String[] args) {

        /*Crear dos variables utilizando los objetos fecha
        En la primera se representa la fecha (día, mes, año) actual.
        En la segunda se representa la fecha de nacimiento.

        Calcular cuántos años han transcurrido entre ambas fechas y muestra su resultado de maneras diferentes:
        Día, mes y año.
        Hora, minuto y segundo.
        Día de año.
        Día de la semana.
        Nombre del mes.

        Pistas: buscar sobre el paquete java.time para fechas y horas.*/

        LocalDate fecha_actual = LocalDate.now();
        LocalDate fecha_nacimiento = LocalDate.of(1988, 12,13);

        LocalDateTime hora_actual = fecha_actual.atStartOfDay();
        LocalDateTime hora_nacimiento = fecha_nacimiento.atStartOfDay();

        Period tiempo_transcurrido_YMD = Period.between(fecha_nacimiento, fecha_actual);

        System.out.println("Han transcurrido " + tiempo_transcurrido_YMD.getYears() + " años, "
                + tiempo_transcurrido_YMD.getMonths() + " meses y " + tiempo_transcurrido_YMD.getDays()
                + " días desde tu nacimiento.\n");

        Duration tiempo_transcurrido_HMS = Duration.between(hora_nacimiento, hora_actual);

        System.out.println("Eso son " + tiempo_transcurrido_HMS.toHours() + " horas.");
        System.out.println("Que a su vez son " + tiempo_transcurrido_HMS.toMinutes() + " minutos.");
        System.out.println("O también " + tiempo_transcurrido_HMS.toSeconds() + " segundos.\n");

        System.out.println("El día que naciste era el dia número "+ fecha_nacimiento.getDayOfYear() + " del año.");
        System.out.println("Tu dia de nacimiento fue un: " + fecha_nacimiento.getDayOfWeek());
        System.out.println("Tu mes de nacimiento fue: " + fecha_nacimiento.getMonth());
    }
}
