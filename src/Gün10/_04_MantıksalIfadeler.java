package Gün10;

import java.util.Scanner;

public class _04_MantıksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal (Lojik) İfadeler
        // && -> ve    || ->  veya

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = scan.nextInt();

        if (sayi>0 && sayi%2==1) {
            System.out.println("Uygun sayı girildi");
        }else {
            System.out.println("Uygun sayı girilmedi.");
        }



    }
}
