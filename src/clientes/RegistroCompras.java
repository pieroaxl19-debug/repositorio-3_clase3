/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes;

import java.util.Scanner;

public class RegistroCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.print("Primera compra: $");
        double compra1 = sc.nextDouble();
        
        System.out.print("Segunda compra: $");
        double compra2 = sc.nextDouble();
        
        System.out.print("Tercera compra: $");
        double compra3 = sc.nextDouble();
        
        double total = compra1 + compra2 + compra3;
        double promedio = total / 3;
        
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Empleado: " + nombre);
        System.out.println("Total: $" + total);
        System.out.printf("Promedio: $%.2f%n", promedio);
        
        sc.close();
    }
}