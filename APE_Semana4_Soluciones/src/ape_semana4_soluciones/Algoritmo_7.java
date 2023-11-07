/*
Algoritmo-7
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla
de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios
consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class Algoritmo_7 {
    public static void main(String[] args) {
        double costoHora, consumidos, costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese costo kilobatios por hora: ");
        costoHora = teclado.nextDouble();
        System.out.println("Ingrese numero de kilovatios consumidos al es: ");
        consumidos = teclado.nextDouble();
        costoTotal = (costoHora * consumidos) ;
        System.out.println("Ingrese edad de la persona");
        int edad = teclado.nextInt();
        if ( 65< edad ){
            double descuento = costoTotal -(0.10 * costoTotal);
            costoTotal = descuento;
        }
        System.out.println("Costo total de planila de luz: " + costoTotal);
                
        
    }
    
}
