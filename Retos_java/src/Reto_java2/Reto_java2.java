package Reto_java2;

public class Reto_java2 {
    public static void main(String[] args) {

        String[] meses = {
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
        };
        String[] meses_30_dias = {
                "abril",
                "junio",
                "septiembre",
                "noviembre"
        };
        String[] meses_31_dias = {
                "enero",
                "marzo",
                "mayo",
                "julio",
                "agosto",
                "octubre",
                "diciembre"
        };


        for (int i= 0;i < 12; i++){
            System.out.println(meses[i]);
            if (meses[i].equals("febrero")) {
                for (int j = 1; j <= 28; j++) {
                    System.out.print(j + "\t" );
                    if (j%7 == 0 && j != 28){
                        System.out.println();
                    }
                }
            }
            for (int mes = 0; mes<meses_30_dias.length; mes++){
                if (meses_30_dias[mes].equals(meses[i])) {
                    for (int j = 1; j <= 30; j++) {
                        System.out.print(j + "\t" );
                        if (j%7 == 0){
                            System.out.println();
                        }
                    }
                }
            }
            for (int mes = 0; mes<meses_31_dias.length; mes++){
                if (meses_31_dias[mes].equals(meses[i])) {
                    for (int j = 1; j <= 31; j++) {
                        System.out.print(j + "\t" );
                        if (j%7 == 0){
                            System.out.println();
                        }
                    }
                }
            }
            System.out.println("\n");
        }
    }
}
