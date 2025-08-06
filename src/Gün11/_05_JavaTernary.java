package Gün11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //Soru: Girilen sayı 50 den büyük ise 1 , değilse 0 değerini ekrana yazdırınız.
        // Ternary operatör ile yapınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi = scan.nextInt();

        System.out.println(sayi>=50 ? "1" : "0");


    }
}
