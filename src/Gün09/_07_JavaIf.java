package Gün09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçtiniz,
        // küçük ise kaldınız yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int not = scan.nextInt();

        if (not>50) {
            System.out.println("Sınavı geçtiniz, Tebrikler");

        } if (not<50) {
            System.out.println("Sınavdan Kaldınız Tekrar deneyiniz");
        }


    }
}
