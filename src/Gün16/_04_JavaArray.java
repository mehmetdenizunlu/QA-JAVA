package Gün16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        // 6 7 3 8 1 -> 25   25/5 -> ort=5     ortaladan büyük kaç eleman var 3

        int [] dizi = new int[100];
        Scanner scan =new Scanner(System.in);
        int toplam = 0;
        int ort ;
        int sayac = 0;

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println("Bir sayı giriniz");
            dizi[i] = scan.nextInt();
            toplam = toplam+dizi[i];

        }

        ort = toplam/ dizi.length;
        for (int i = 0; i < dizi.length ; i++) {

            if (dizi[i]>ort) {
                System.out.println(dizi[i]);
                sayac++;
            }

        }

        System.out.println(sayac);
    }
}
