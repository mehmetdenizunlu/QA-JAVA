package Gün19;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve ortalamasını bulduktan sonra
        // bu dizinin bütün elemanlarının karelerini yeni bir diziye atınız
        // bu dizininde en küçük, en büyük elemanını ve ortalamasını bulunuz.

        Scanner scanInt = new Scanner(System.in);
        int [] dizi = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Bir sayı giriniz : ");
             dizi[i] = scanInt.nextInt();
        }


        System.out.println(Arrays.toString(dizi));

        enKucuk(dizi);
        enBuyuk(dizi);
        ortlamaBul(dizi);
    }

    public static void enKucuk (int [] dizi) {
        Arrays.sort(dizi);
        System.out.println("En küçük sayı : " + dizi[0]);
    }

    public static void enBuyuk (int [] dizi) {
        Arrays.sort(dizi);
        System.out.println("En küçük sayı : " + dizi[dizi.length-1]);
    }

    public  static  void ortlamaBul (int [] dizi) {
        Arrays.sort(dizi);
        int ortalama = (dizi[0]+dizi[dizi.length-1])/2;
        System.out.println("Sayıların ortalaması : " + ortalama);
    }

}
