package ape_semana4_soluciones;
import java.util.Scanner;
public class AreaPoligono_9 {
    public static void main(String[] args) {
        double largTrian, altTrian, areaPol, areaCuad, areaTrian;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el largo del triangulo: ");
        largTrian = teclado.nextDouble();
        System.out.println("Ingresar la altura del triangulo: ");
        altTrian = teclado.nextDouble();
        areaCuad = Math.pow(largTrian, 2);
        areaTrian = (largTrian * altTrian)/2;
        areaPol = areaCuad + (areaTrian*5);
        System.out.println("El area del poligono es: " + areaPol);
    }
}
