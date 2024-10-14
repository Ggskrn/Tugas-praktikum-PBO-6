/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Angka;

/**
 *
 * @author USER
 */
public class AngkaPrima {
    public void hitungAngkaPrima() {
        System.out.println("Deretan angka bilangan prima & bukan prima dari 0 - 20");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.println(i + " itu bilangan prima");
            } else {
                System.out.println(i + " itu bukan bilangan prima");
            }
        }
    }
    private boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
