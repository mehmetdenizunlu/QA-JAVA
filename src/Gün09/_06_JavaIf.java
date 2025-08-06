package Gün09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen 3 sayıdan en büyük olanını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi1 = scan.nextInt();
        System.out.println("Bir sayi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("Bir sayi giriniz");
        int sayi3 = scan.nextInt();

        int enb=sayi1;
        if (sayi2>enb) {
            enb=sayi2;
        } if (sayi3>enb) {
            enb=sayi3;
        }

        System.out.println("en büyük sayı : " + enb);
    }
}
