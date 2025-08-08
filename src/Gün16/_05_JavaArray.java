package Gün16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int [] dizi = new  int[7];
        Scanner scan = new Scanner(System.in);
        int toplam =0;
        int ort;
        int adet = 0;


        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("Sayı Giriniz : ");
            dizi[i] = scan.nextInt();
            System.out.println();
            toplam+=dizi[i];
        }
        ort = toplam/ dizi.length;


        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i] > ort) {
                System.out.println("ortalamadan büyük olanlar : " +dizi[i]);
                adet++;
            }

        }

        System.out.println("ortalamadan büyük sayıların adeti : " + adet);
    }
}
