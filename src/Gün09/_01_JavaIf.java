package Gün09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük diye yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : " );
        int sayi = scan.nextInt();

        if (sayi>10) {
            System.out.println("Sayı 10 dan büyük");
        }else {
            System.out.println("Sayı 10 dan küçük");
        }
    }
}
