/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Angka;

/**
 *
 * @author USER
 */
public class AngkaGanjilGenap {
    public void hitungAngkaGanjilGenap() {
        System.out.println("Deretan bilangan ganjil & genap dari 0 - 20");
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i + " itu bilangan genap");
            } else {
                System.out.println(i + " itu bilangan ganjil");
            }
            i++;
        }
    }
}
