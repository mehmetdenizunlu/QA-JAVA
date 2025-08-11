package Gün20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int s1 = scanner.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int s2 = scanner.nextInt();

        int enBüyük = enBuyuk(s1, s2);
        System.out.println("En büyük sayı: " + enBüyük);
    }

    // Sadece karşılaştırma yapan metod
    public static int enBuyuk(int a, int b) {
        return Math.max(a, b);
    }
}
