/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerEjemplo;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;

        System.out.println("El doble de " + numero + " es " + doble);
        System.out.println("El triple de " + numero + " es " + triple);
    }
}
