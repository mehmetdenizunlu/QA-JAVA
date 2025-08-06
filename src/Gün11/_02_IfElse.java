package Gün11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayını pozitif, negatif veya sıfır olduğunu yazdırınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi>0) {
            System.out.println("Pozitif");
        }else if (sayi<0) {
            System.out.println("Negatif");
        }else {
            System.out.println("Sıfır");
        }

    }
}
