/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramaSaldos;

import java.util.Scanner;

public class ProgramaSaldos {
    public static void main(String[] args) {
        double saldoCuenta1 = 500.00;
        double saldoCuenta2 = 300.00;

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
          
            System.out.println("Saldo de la Cuenta No 1: " + saldoCuenta1);
            System.out.println("Saldo de la Cuenta No 2: " + saldoCuenta2);
            System.out.println("\nOpciones:");
            System.out.println("1. Abonar a la cuenta 1");
            System.out.println("2. Abonar a la cuenta 2");
            System.out.println("3. Debitar de la cuenta 1");
            System.out.println("4. Debitar de la cuenta 2");
            System.out.println("5. Consultar saldos");
            System.out.print("\nElige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                 
                    System.out.print("Ingrese un valor para abonar a la cuenta No 1: ");
                    double abono1 = scanner.nextDouble();
                    saldoCuenta1 += abono1;
                    System.out.println("Abono realizado correctamente.\n");
                    break;
                case 2:
                 
                    System.out.print("Ingrese un valor para abonar a la cuenta No 2: ");
                    double abono2 = scanner.nextDouble();
                    saldoCuenta2 += abono2;
                    System.out.println("Abono realizado correctamente.\n");
                    break;
                case 3:
                    
                    System.out.print("Ingrese un valor para debitar de la cuenta No 1: ");
                    double debito1 = scanner.nextDouble();
                    if (debito1 <= saldoCuenta1) {
                        saldoCuenta1 -= debito1;
                        System.out.println("Débito realizado correctamente.\n");
                    } else {
                        System.out.println("Saldo insuficiente en la cuenta No 1.\n");
                    }
                    break;
                case 4:
                    
                    System.out.print("Ingrese un valor para debitar de la cuenta No 2: ");
                    double debito2 = scanner.nextDouble();
                    if (debito2 <= saldoCuenta2) {
                        saldoCuenta2 -= debito2;
                        System.out.println("\nDébito realizado correctamente.\n");
                    } else {
                        System.out.println("Saldo insuficiente en la cuenta No 2.\n");
                    }
                    break;
                case 5:
                  
                    System.out.println("Saldo de la Cuenta No 1: " + saldoCuenta1);
                    System.out.println("Saldo de la Cuenta No 2: " + saldoCuenta2);
                    System.out.println();
                    break;
                case 6:
                  
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.\n");
                    break;
            }

        } while (opcion != 6);

        scanner.close();
    }
}
