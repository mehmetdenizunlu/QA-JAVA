package Gün12;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner scanStr = new Scanner(System.in);
        System.out.print("Ders İsmini Giriniz : ");
        String dersAdi = scanStr.nextLine();

        Scanner scanInt = new Scanner(System.in);
        System.out.print(dersAdi+" dersin notunu giriniz :" );
        int not = scanInt.nextInt();

        if (not>=90) {
            System.out.println(dersAdi+" dersin harf notu : A ");
        } else if (not>=80) {
            System.out.println(dersAdi+" dersin harf notu : B ");
        } else if (not>=70) {
            System.out.println(dersAdi+" dersin harf notu : C ");
        } else if (not>=60) {
            System.out.println(dersAdi+" dersin harf notu : D ");
        } else if (not>=40) {
            System.out.println(dersAdi+" dersin harf notu : E ");
        } else if (not<40) {
            System.out.println(dersAdi+" dersin harf notu : F ");
        }


    }
}
