import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int numerollamadas = 0;
        int llamadalocal;
        int llamadalarga;
        int llamadacelular;
        int minutollamadalocal = 50;
        int minutollamadalarga = 350;
        int minutollamadacelular = 150;
        int reinicio;
        boolean inicio =false;
        boolean menu =false;
        do {


            do {

                System.out.println("            MENÚ");
                System.out.println("1. LLAMADA LOCAL (minuto: $50 pesos)");
                System.out.println("2. LLAMADA LARGA DISTANCIA (minuto: $350 pesos)");
                System.out.println("3. LLAMADA CELULAR (minuto: $150 pesos)");
                opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1 -> {
                            System.out.println("HA ELEGIDO: *LLAMADA LOCAL*");
                            System.out.println("INSERTE LA DURACION TOTAL DE LA LLAMADA EN MINUTOS");
                            llamadalocal = teclado.nextInt();
                            System.out.println();
                            System.out.println();
                            System.out.println("****INFORMACION DETALLADA****");
                            if (opcion==1){
                                numerollamadas= numerollamadas+1;
                                System.out.println("NUMERO DE LLAMADAS REALIZADAS: ");
                                System.out.println(numerollamadas);
                                System.out.println("DURACION DE LAS LLAMADAS REALIZADAS:");
                                System.out.println(llamadalocal*numerollamadas + " minutos");
                                System.out.println("COSTO DE LAS LLAMADAS: ");
                                System.out.println("$"+llamadalocal*minutollamadalocal*numerollamadas);
                            }

                        }
                        case 2 -> {
                            System.out.println("HA ELEGIDO: *LLAMADA LARGA*");
                            System.out.println("INSERTE LA DURACION TOTAL DE LA LLAMADA EN MINUTOS");
                            llamadalarga = teclado.nextInt();
                            System.out.println();
                            System.out.println();
                            System.out.println("****INFORMACION DETALLADA****");
                            if (opcion==2){
                                numerollamadas=numerollamadas + 1;
                                System.out.println("NUMERO DE LLAMADAS REALIZADAS: ");
                                System.out.println(numerollamadas);
                                System.out.println("DURACION DE LAS LLAMADAS REALIZADAS:");
                                System.out.println(llamadalarga*numerollamadas+ " minutos");
                                System.out.println("COSTO DE LAS LLAMADAS: ");
                                System.out.println("$"+llamadalarga*minutollamadalarga*numerollamadas);
                            }

                        }
                        case 3 -> {
                            System.out.println("HA ELEGIDO: *LLAMADA CELULAR*");
                            System.out.println("INSERTE LA DURACION TOTAL DE LA LLAMADA EN MINUTOS");
                            llamadacelular = teclado.nextInt();
                            System.out.println();
                            System.out.println();
                            System.out.println("****INFORMACION DETALLADA****");
                            if (opcion==3){
                                numerollamadas= numerollamadas + 1;
                                System.out.println("NUMERO DE LLAMADAS REALIZADAS: ");
                                System.out.println(numerollamadas);
                                System.out.println("DURACION DE LAS LLAMADAS REALIZADAS:");
                                System.out.println(llamadacelular*numerollamadas+ " minutos");
                                System.out.println("COSTO DE LAS LLAMADAS: ");
                                System.out.println("&"+llamadacelular*minutollamadacelular*numerollamadas);
                            }

                        }

                    }

                    System.out.println("  Desea reiniciar la aplicacion?");
                    System.out.println(" 1) SI");
                    System.out.println(" 2) NO");
                    reinicio = teclado.nextInt();
                    if (reinicio == 1) {
                        inicio = true;
                    } else {
                        menu = true;
                    }
            } while (menu);
        }while (inicio);
    }
}