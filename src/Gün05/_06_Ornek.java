package Gün05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Bir karenin kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz.
        // cevre=a+a+a+a    alan =a*a

        Scanner scanInt = new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunluğunu giriniz");
        int kenar = scanInt.nextInt();
        int cevre = kenar*4;
        int alan = kenar*kenar;

        System.out.println("Karenin Çevresi : " + cevre);
        System.out.println("Karenin Alanı : " + alan);
    }
}
