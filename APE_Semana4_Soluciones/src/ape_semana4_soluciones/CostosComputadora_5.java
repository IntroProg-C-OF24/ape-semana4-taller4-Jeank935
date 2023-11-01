package ape_semana4_soluciones;
import java.util.Scanner;
public class CostosComputadora_5 {
    public static void main(String[] args) {
        double cpu, teclado1, pantalla, raton, costoComputadora;
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingreses costo cpu: ");
                cpu = teclado.nextDouble();
                System.out.println("Ingrese costo teclado: ");
                teclado1 = teclado.nextDouble();
                System.out.println("Ingrese costo pantalla: ");
                pantalla = teclado.nextDouble();
                System.out.println("Ingrese costo raton: ");
                raton = teclado.nextDouble();
                costoComputadora = cpu + teclado1 + pantalla + raton;
                System.out.println("Costo total de la computadora: " + costoComputadora);
                
    }
}
