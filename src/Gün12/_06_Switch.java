package Gün12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();

        int onlarBasamagi = (sayi/10)%10;

        switch (onlarBasamagi) {
            case 1 :
                System.out.println("Bir");break;
            case 2:
                System.out.println("İki");break;
            case 3:
                System.out.println("Üç");break;
            case 4:
                System.out.println("Dört");break;
            case 5:
                System.out.println("Beş");break;
            case 6:
                System.out.println("Altı");break;
            case 7 :
                System.out.println("Yedi");break;
            case 8:
                System.out.println("Sekiz");break;
            case 9:
                System.out.println("Dokuz");break;
            case 0 :
                System.out.println("Sıfır");break;

        }
    }
}
