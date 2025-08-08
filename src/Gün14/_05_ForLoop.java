package Gün14;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();
        int carpim = 1;

        for (int i = 1; i <= sayi ; i++) {
            carpim=carpim*i;
        }

        System.out.println("Çarpım : " + carpim);

    }
}
