package Gün13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //Girilen  20 sayının toplamının sonucunu yazdırınız
        int sayac=0;
        int toplam=0;
        Scanner scan =new Scanner(System.in);

        while (sayac<20) {
            System.out.println("Bir sayı giriniz");
            int sayi = scan.nextInt();
            toplam = toplam+sayi;
            sayac++;

        }
        System.out.println("Toplam sayı :" + toplam);
    }
}
