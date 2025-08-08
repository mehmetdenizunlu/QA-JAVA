package Gün14;

import java.util.Scanner;

public class _04_ForLoop {
    public static void main(String[] args) {
        // kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();
        int toplam = 0;


        for (int i = 0; i <= sayi ; i++) {
            toplam = toplam+i;
        }

        System.out.println("Toplam : " + toplam);
    }
}
