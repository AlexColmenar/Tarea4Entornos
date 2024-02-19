package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        eCesta cesta;

        cesta = new eCesta("Colmenar Arevalo", 100, "77599310R", 10.20);

        try {

            cesta.comprar(50);

        } catch (Exception e) {

            System.out.println("No se puede pagar  ");

        }

        try {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e) {

            System.out.println("Error al recargar");

        }

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  " + bonoactual);

        try {

            System.out.println(" Modificación 1");

            cesta.ActualizarBono(-50);

        } catch (Exception e) {

            System.out.print("Fallo…….");

        }
    }

}
