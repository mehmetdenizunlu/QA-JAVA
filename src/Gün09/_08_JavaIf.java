package Gün09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının birler ve onlar
        // basamağının eşit olup olmadığını yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz en az iki basamaklı olsun.");
        int sayi = scan.nextInt();

        int birlerBasamagi = sayi%10;
        int onlarBasamagi = (sayi/10)%10;

        if (birlerBasamagi==onlarBasamagi) {
            System.out.println("Eşit");
        } if (birlerBasamagi!=onlarBasamagi) {
            System.out.println("Eşit Değil.");
        }

    }
}
