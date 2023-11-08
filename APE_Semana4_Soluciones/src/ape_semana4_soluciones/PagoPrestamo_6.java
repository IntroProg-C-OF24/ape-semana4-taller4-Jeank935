package ape_semana4_soluciones;

import java.util.Scanner;

public class PagoPrestamo_6 {

    public static void main(String[] args) {
        double montoPrestamo, interesMensual, totalPagar;
        int plazoMeses = 12;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el monto del prestamo: ");
        montoPrestamo = teclado.nextDouble();
        System.out.println("Ingresa el interes mensual a cobrar: ");
        interesMensual = teclado.nextDouble();
        double interesMensualDecimal = interesMensual / 100;
        
        totalPagar = (montoPrestamo * interesMensualDecimal) / (1 - Math.pow(1 + interesMensualDecimal, -plazoMeses));
        System.out.println("El pago mensual es: " + totalPagar);
    }
}
