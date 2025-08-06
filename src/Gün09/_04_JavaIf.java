package Gün09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0) {
            System.out.println("sayı çiftir");
        }if (sayi%2!=0) {
            System.out.println("sayi tektir");
        }
    }
}
