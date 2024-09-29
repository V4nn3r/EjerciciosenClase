/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerEjemplo;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    }
}
