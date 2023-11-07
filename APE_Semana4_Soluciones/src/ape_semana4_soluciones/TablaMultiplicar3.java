package ape_semana4_soluciones;
import java.util.Scanner;
public class TablaMultiplicar3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número entre 2 y 6: ");
        double numero = teclado.nextDouble();

        if (numero >= 2 && numero <= 6) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (double multiplos = 1; multiplos <= 12; multiplos++) {
                double resultado = numero * multiplos;
                System.out.println(numero + " x " + multiplos + " = " + resultado);
            }
        } else {
            System.out.println("El número ingresado no está en el rango de 2 a 6.");

        }
}
}

