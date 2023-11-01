package ape_semana4_soluciones;
import java.util.Scanner;
public class PlanillaTelefono_4 {
    public static void main(String[] args) {
        double costo, minutos, costoPlanilla;
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese costo de la planilla por minutos: ");
                costo = teclado.nextDouble();
                System.out.println("ingrese costo de minutos consumidos: ");
                minutos = teclado.nextDouble();
                costoPlanilla = costo * minutos;
                System.out.println("Costo total planilla: " +costoPlanilla);
    }
}
