package Gün09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını değerini ekrana yazdırınız,
        // eşit ise eşit yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz");
        int sayi1= scan.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int sayi2= scan.nextInt();

        if (sayi1>sayi2) {
            System.out.println("Büyük olan sayı : " + sayi1);
        } if (sayi1<sayi2) {
            System.out.println("Büyük olan sayı : " + sayi2);
        }if (sayi1==sayi2) {
            System.out.println("Sayılar Birbirine Eşittir.");
        }
    }
}
