package Gün13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarının
        // toplamını bulunuz.

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayı Giriniz");
        int sayi = scan.nextInt();
        int sayac = 0;
        int toplam = 0;

        while (sayac<=sayi) {
            if (sayac%2==1) {
                toplam=toplam+sayac;
            }
            sayac++;
        }
        System.out.println("Toplam : " + toplam);
    }
}
