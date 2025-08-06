package Gün08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Bir Sayı Giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Bir Sayı Giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("Eşit mi : " + (sayi1==sayi2));

    }
}
