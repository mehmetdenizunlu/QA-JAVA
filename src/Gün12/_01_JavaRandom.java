package Gün12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 1- den 10 kadar ürettik,   5-10 arası desek nasıl yapabilirdik.
        //  5 ->    01234
        //  6-10->  6789  : aradaki fark kadar sayı ürettir ve min u ekle.

        Scanner scan = new Scanner(System.in);
        System.out.println("min = ");
        int min = scan.nextInt();
        System.out.println("max = ");
        int max = scan.nextInt();

        int numberInRange=(int)( Math.random() * ((max-min)+1) ) +min;
        System.out.println(numberInRange);
    }
}
