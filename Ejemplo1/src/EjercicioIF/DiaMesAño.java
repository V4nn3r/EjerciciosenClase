/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioIF;

import java.util.Scanner;

public class DiaMesAño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Introduce el año: ");
        int anio = scanner.nextInt();

        boolean fechaValida = false;

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                fechaValida = dia >= 1 && dia <= 28; // Sin años bisiestos
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                fechaValida = dia >= 1 && dia <= 30;
            } else {
                fechaValida = dia >= 1 && dia <= 31;
            }
        }

        if (fechaValida) {
            System.out.println("La fecha es válida.");
        } else {
            System.out.println("La fecha no es válida.");
        }
    }
}
