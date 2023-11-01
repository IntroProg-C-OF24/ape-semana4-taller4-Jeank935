package ape_semana4_soluciones;
import java.util.Scanner;
public class GastosHijos {
    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los gastos del hijo 1: ");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Ingresa los gastos del hijo 2: ");
        gastosHijo2 = teclado.nextDouble();
        System.out.println("Ingresa los gastos del hijo 3: ");
        gastosHijo3 = teclado.nextDouble();
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        System.out.println("LOS GASTOS TOTALES DE LOS 3 HIJOS SON:" + gastosTotales);
    }
}
