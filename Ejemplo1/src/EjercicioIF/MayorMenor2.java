/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioIF;

import java.util.Scanner;

public class MayorMenor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = scanner.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            if (numero2 >= numero3) {
                System.out.println("Orden: " + numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println("Orden: " + numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            if (numero1 >= numero3) {
                System.out.println("Orden: " + numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println("Orden: " + numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 >= numero2) {
                System.out.println("Orden: " + numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println("Orden: " + numero3 + ", " + numero2 + ", " + numero1);
            }
        }
    }
}
