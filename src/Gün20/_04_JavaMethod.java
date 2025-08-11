package Gün20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan öğrenci adı ve notlarınız (60 70 90 ... ) şeklinde
        // 3 öğrenci ve 3 ders notu alınız bunların otalamasını
        // bir metotda bulduktan sonra sonucu ekrana ismet 75 şeklinde
        // yazdırınız main içerisinde.


        Scanner oku = new Scanner(System.in);


        for (int i = 0; i <3 ; i++) {
            System.out.println("Öğrencinin adını giriniz : " );
            String names = oku.nextLine();

            System.out.println("Öğrencinin Notunu giriniz : ");
            String notlar = oku.nextLine();

            ortalamaBul(notlar);

            System.out.println(names+" adlı öğrencinini ortalaması : " + ortalamaBul(notlar) + " dır.");
        }




    }

    public  static int ortalamaBul(String notlar) {
        String [] not = notlar.split(" ");
        int toplam = 0;
        for (int i = 0; i < not.length ; i++) {

            toplam = toplam+Integer.parseInt(not[i]);

        }

        int ortalama = toplam/not.length;

        return  ortalama;
    }

}
