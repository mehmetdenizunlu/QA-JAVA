package Gün09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi , pozitif mi olduğunu yazdırınız.
        // Sıfır ise sıfır yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz");
        int sayi = scan.nextInt();

        if (sayi>0) {
            System.out.println("Sayı pozitif");
        }  if (sayi<0) {
            System.out.println("Sayı negatif");
        }if(sayi==0) {
            System.out.println("Sayı sıfırdır.");
        }

    }
}
