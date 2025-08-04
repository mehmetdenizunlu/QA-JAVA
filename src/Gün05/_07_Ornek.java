package Gün05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan ağırlığını double, boyunu int olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        Scanner scanInt = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz : ");
        int boy = scanInt.nextInt();

        Scanner scanDouble  =new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz : ");
        double kilo = scanDouble.nextDouble();

        System.out.println("Boyunuz : " + boy);
        System.out.println("Kilonuz : " + kilo);

        double vucutKitleIndex = kilo/(boy*boy);
        System.out.println("Vucut Kitle Indexiniz : " +  vucutKitleIndex);

    }
}
