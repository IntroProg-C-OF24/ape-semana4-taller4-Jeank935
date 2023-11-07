package ape_semana4_soluciones;
import java.util.Scanner;
public class PagoPrestamo_6 {
    public static void main(String[] args) {
        double montoPrestamo, interesMensual, totalPagar;
        int numeroPagos = 12;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el monto del prestamo: ");
        montoPrestamo = teclado.nextDouble();
        System.out.println("Ingresa el interes mensual a cobrar: ");
        interesMensual = teclado.nextDouble();
        double var1= (1+interesMensual);
        totalPagar = (montoPrestamo * interesMensual * Math.pow(var1, numeroPagos))/((Math.pow(var1, interesMensual)-1));
        System.out.println("El pago mensual es: " + totalPagar );
    }
    }
    

