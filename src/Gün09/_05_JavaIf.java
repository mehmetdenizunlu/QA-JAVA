package Gün09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının sadece, birler basamağını yazı ile yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi%10==1) {
            System.out.println("birler basamağı 1 dir.");
        }

        if (sayi%10==2) {
            System.out.println("birler basamağı 2 dir.");
        }

        if (sayi%10==3) {
            System.out.println("birler basamağı 3 dir.");
        }

        if (sayi%10==4) {
            System.out.println("birler basamağı 4 dir.");
        }

        if (sayi%10==5) {
            System.out.println("birler basamağı 5 dir.");
        }

        if (sayi%10==6) {
            System.out.println("birler basamağı 6 dir.");
        }

        if (sayi%10==7) {
            System.out.println("birler basamağı 7 dir.");
        }

        if (sayi%10==8) {
            System.out.println("birler basamağı 8 dir.");
        }

        if (sayi%10==9) {
            System.out.println("birler basamağı 9 dir.");
        }


    }
}
