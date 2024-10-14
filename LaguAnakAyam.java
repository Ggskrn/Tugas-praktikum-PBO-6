package AnakAyam;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class LaguAnakAyam {
        public static void nyanyikanLaguAnakAyam() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lagu 'Anak Ayam Turun N'");
        System.out.print("Inputkan jumlah anak ayam yang dipengen : ");
        int n = input.nextInt();
        
        do {
            if (n > 1) {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            } else {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal induknya.");
            }
            n--;
        } while (n > 0);
    }
}
