package Gün08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println("tek mi ? :" + (sayi%2 == 1));
    }
}
