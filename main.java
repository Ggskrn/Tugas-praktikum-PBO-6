package TugasPBO6_Gagas3F;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author USER
 */
import AnakAyam.LaguAnakAyam;
import Angka.AngkaGanjilGenap;
import Angka.AngkaPrima;
import Huruf.HurufZtoA;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n Welcome on Tugas 6_Gagas Cahya 3F Program ");
            System.out.println("\n========== Pilihan Programnya : ===========");
            System.out.println("1. Deret Bilangan Prima & Bukan Prima (0-20)");
            System.out.println("2. Deret Bilangan Ganjil & Genap (0-20)");
            System.out.println("3. Deret Huruf Z ke A");
            System.out.println("4. Lagu Anak Ayam Turun N");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihannya : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> {
                    AngkaPrima AngkaPrima = new AngkaPrima();
                    AngkaPrima.hitungAngkaPrima();
                }
                case 2 -> {
                    AngkaGanjilGenap angkaGanjilGenap = new AngkaGanjilGenap();
                    angkaGanjilGenap.hitungAngkaGanjilGenap();
                }
                case 3 -> {
                    HurufZtoA hurufZtoA = new HurufZtoA();
                    HurufZtoA.tampilHurufZtoA();
                }
                case 4 -> {
                    LaguAnakAyam laguAnakAyam = new LaguAnakAyam();
                    LaguAnakAyam.nyanyikanLaguAnakAyam();
                }
                case 5 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}
