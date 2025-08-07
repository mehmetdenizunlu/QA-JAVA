package Gün13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız.
        // girilen sayı dahil

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayı girniz.");
        int sayi = scan.nextInt();
        int sayac = 0;
        int toplam = 0;

       while (sayac<=sayi) {
           toplam=toplam+sayac;
           sayac++;
       }
        System.out.println("toplam sayı : " + toplam);
    }
}
