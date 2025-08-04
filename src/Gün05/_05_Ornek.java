package Gün05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.

        Scanner scanInt = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        int sayi1 = scanInt.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int sayi2 = scanInt.nextInt();

        System.out.println("Girmiş Olduğunuz Sayıların Toplamı : " + (sayi1+sayi2));
    }
}
