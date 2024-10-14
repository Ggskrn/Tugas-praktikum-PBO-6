/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N (N max 10): ");
        int n = scanner.nextInt();
        if (n > 10) {
            System.out.println("Nilai N ga boleh < 10");
            return;
        }
        
        System.out.print("\n");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d ", i);
        }
        
        System.out.println();
        System.out.print(" ");
        for (int i = 1; i <= n; i++) {
            System.out.print("----");
        }
        
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d |", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
 
