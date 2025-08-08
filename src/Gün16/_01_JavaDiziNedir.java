package Gün16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        int sayi = 1;
        int sayi1;
        int sayi2;
        int sayi3;

        /*
        ----------------
        ----------------
        ----------------
         */

        int ogrNot1;
        int ogrNot2;
        int ogrNot3; // gibi tek tek değişken tanıtıp değer atamaktansa dizi kullanılır.

        int [] notlar = new int[250]; // 250 kişinini notu saklanabilecek.
        notlar[0] = 90;
        notlar[1] = 85;
        // ----
        // ----
        notlar[249] = 65;

        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <=250 ; i++) {
            System.out.println(i+". öğrencinin notu : ");
            notlar[i] = scan.nextInt();
        }
    }
}
